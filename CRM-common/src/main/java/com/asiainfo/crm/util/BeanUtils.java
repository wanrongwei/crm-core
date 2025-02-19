package com.asiainfo.crm.util;

import java.io.File;
import java.lang.reflect.*;
import java.net.URL;
import java.net.URLClassLoader;
import java.net.URLDecoder;
import java.util.*;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;


/**
 * 
 * @author Frank
 * 
 */
public final class BeanUtils {

	// ԭʼ���б?string��Ҳ������ԭʼ�࣬��ΪstringҲ�ǳ�������ԭʼ����ʹ�õ�
	private static List primitiveTypes = new ArrayList();

	static {
		primitiveTypes.add(byte.class);
		primitiveTypes.add(int.class);
		primitiveTypes.add(float.class);
		primitiveTypes.add(double.class);
		primitiveTypes.add(long.class);
		primitiveTypes.add(char.class);
		primitiveTypes.add(short.class);
		primitiveTypes.add(boolean.class);
		primitiveTypes.add(String.class);
	}
		
	public static Object setProperties(Class clazz, Map map) throws Exception {

		Object instance = clazz.newInstance();
		Field[] fields = clazz.getDeclaredFields();
		
		for (Field field : fields) {
			
			// ��ȡ�ֶ����η�
			int modifier = field.getModifiers();
			if (!Modifier.isStatic(modifier) && Modifier.isPrivate(modifier)) {
				
				// ��ȡset����
				String fieldName = field.getName();
				String name = fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
				String methodName = "set" + name;
				
				if (primitiveTypes.contains(field.getType())) {
					Method method = clazz.getMethod(methodName, field.getType());
					method.invoke(instance, map.get(name));
				}
				
				if (field.getType().isArray()) {

					List list = (List) map.get(name);
					int size = null == list ? 0 : list.size();
					Object array = Array.newInstance(field.getType()
							.getComponentType(), size);

					for (int i = 0; i < size; i++) {

						if (primitiveTypes.contains(field.getType().getComponentType())) {
							Array.set(array, i, list.get(i));
						} else {
							Object obj = setProperties(field.getType().getComponentType(), (Map) list.get(i));
							Array.set(array, i, obj);
						}
					}
					Method method = clazz.getMethod(methodName, field.getType());
					method.invoke(instance, array);

				}
				
				if (!primitiveTypes.contains(field.getType()) && !field.getType().isArray()) {
					Method method = clazz.getMethod(methodName, field.getType());
					Object obj = setProperties(field.getType(), (Map)map.get(name));
					method.invoke(instance, obj);
				} 
			}
		}

		return instance;
	}


	public static Map getProperties(Object instance) throws Exception {

		if (null == instance) {
			return null;
		}
		Map map = new HashMap();
		List fieldList = new ArrayList();
		Class clazz = instance.getClass();	
		Class superClass = clazz.getSuperclass();
		while (superClass != null && !superClass.isAssignableFrom(Object.class)) {
			Field[] fields = superClass.getDeclaredFields();
			fieldList.addAll(Arrays.asList(fields));
			superClass = superClass.getSuperclass();
		}
		Field[] fields = clazz.getDeclaredFields();
		fieldList.addAll(Arrays.asList(fields));
		for (Object object : fieldList) {
			Field field = (Field)object;
			int modifier = field.getModifiers();
			if (!Modifier.isStatic(modifier) && Modifier.isPrivate(modifier)) {
				String fieldName = field.getName();
				if(fieldName.startsWith("__")){
					continue;
				}
					
				StringBuilder str = new StringBuilder(fieldName);
				str.setCharAt(0, Character.toUpperCase(str.charAt(0)));
				fieldName = str.toString();
				String getMethod = "get"+ fieldName;
				Method method = clazz.getMethod(getMethod, null);
				Object obj = method.invoke(instance, null);
				if (primitiveTypes.contains(field.getType())) {
					map.put(fieldName, obj);
				}

				if (field.getType().isArray()
					&& primitiveTypes.contains(field.getType().getComponentType())) {
					int length = null == obj ? 0 : Array.getLength(obj);
					List list = new ArrayList();
					for (int i = 0; i < length; i++) {
						list.add(Array.get(obj, i));
					}
					map.put(fieldName, list);
				}

				if (field.getType().isArray()
					&& !primitiveTypes.contains(field.getType().getComponentType())
					&& !field.getType().getComponentType().isArray()) {
					int length = null == obj ? 0 : Array.getLength(obj);
					List list = new ArrayList();
					for (int i = 0; i < length; i++) {
						Map sub = getProperties(Array.get(obj, i));
						list.add(sub);
					}
					map.put(fieldName, list);
				}
				
				if (field.getType().isArray() && field.getType().getComponentType().isArray()) {
					map.put(fieldName, obj);
				}

				if (!primitiveTypes.contains(field.getType())
					&& !field.getType().isArray()) {
					Map sub = getProperties(obj);
					map.put(fieldName, sub);
				}
			}
		}

		return map;
	}
	
	
	public static String getClassPath(Class clazz) throws Exception {

		if (null == clazz) {
			return null;
		}

		ClassLoader classLoader = clazz.getClassLoader();
		String className = clazz.getName() + ".class";
		Package pkg = clazz.getPackage();
		String path = "";
		if (pkg != null) {
			String packageName = pkg.getName();
			className = className.substring(packageName.length() + 1);
			packageName = packageName.replace(".", "/");
			packageName = packageName + "/";
			path = packageName;
		}

		URL url = classLoader.getResource(path + className);
		String realPath = url.getPath();
		int pos = realPath.indexOf("file:");
		if (pos > -1) {
			realPath = realPath.substring(pos + 5);
		}
		pos = realPath.indexOf(className);
		realPath = realPath.substring(0, pos - 1);

		if (realPath.contains("!")) {
			realPath = realPath.substring(0, realPath.indexOf("!"));
		}

		realPath = URLDecoder.decode(realPath, "UTF-8");

		return realPath;
	}
	
	public static Class[] getJarClasses(String jarPath, String pkg) throws Exception {
		List classes = new ArrayList();
		JarFile jarFile = null;
		try {
			jarFile = new JarFile(new File(jarPath));  
			URL url = new URL("file:" + jarPath);  
			ClassLoader loader = new URLClassLoader(new URL[]{url});
			Enumeration entitys = jarFile.entries();
			while (entitys.hasMoreElements()) {
				JarEntry jarEntry = (JarEntry) entitys.nextElement();
				String name = jarEntry.getName();
				if (name != null && name.endsWith(".class") && name.contains(pkg)) {
					name = name.replace("/", ".");
					int index = name.indexOf(".class");
					name = name.substring(0, index);
					Class clazz = loader.loadClass(name);
					classes.add(clazz);
				}

			}
		} catch (Exception e) {
			throw e;
		}finally{
			if(jarFile != null){
				jarFile.close();
			}
		}
		return (Class[]) classes.toArray(new Class[0]);
	}
	
	
	public static void makeAccessible(Constructor ctor) {
		if (!Modifier.isPublic(ctor.getModifiers()) || 
			!Modifier.isPublic(ctor.getDeclaringClass().getModifiers())) {
			ctor.setAccessible(true);
		}
	}
	
	public static Object initialClass(Class clazz, Object[] args) throws Exception{
		
		try {
			int len = null == args ? 0 : args.length;
			Class[] argClasses = new Class[len];
			for (int i = 0; i < argClasses.length; i++) {
				argClasses[i] = args[i].getClass();
			}
			Constructor ctor = clazz.getDeclaredConstructor(argClasses);
			makeAccessible(ctor);
			return ctor.newInstance(args);
		} catch (InstantiationException e) {
			throw new Exception("Is it an abstract class?", e);
		} catch (IllegalAccessException e) {
			throw new Exception("Has the class definition changed? Is the constructor accessible?", e);
		} catch (IllegalArgumentException e) {
			throw new Exception ("Illegal arguments for constructor", e);
		} catch (InvocationTargetException e) {
			throw new Exception("Constructor threw exception", e);
		}
	}
	
	public static Object valueMappingBean(Class clazz, Map map) throws Exception {

		Object instance = clazz.newInstance();
		Field[] fields = clazz.getDeclaredFields();
		Map fieldTypes = getFieldType(clazz);
		Object params =null;
		Method method =null;
		for (Field field : fields) {
			
			int modifier = field.getModifiers();
			if (Modifier.isStatic(modifier) && Modifier.isPublic(modifier)) {
				
				String fieldName = field.getName();
				int indexOf = fieldName.indexOf("_");
				String name = fieldName.substring(indexOf+1, indexOf+2)+fieldName.substring(indexOf+2);
				String methodName = "set" + name;
				if (map.get(field.getName())!=null&&(!((String)map.get(field.getName())).isEmpty())&&primitiveTypes.contains(field.getType())) {
					method = clazz.getMethod(methodName, (Class[])fieldTypes.get(methodName));
					params = DataTypeTransfer.getValueByClass(map.get(field.getName()), ((Class[])fieldTypes.get(methodName))[0]);
					method.invoke(instance, params);
				}
			}
		}
		return instance;
	}
	
	
	public static Map getFieldType(Class clazz){
		Method[] methods = clazz.getMethods();
		Map attrMap=new HashMap<String, Class[]>();
		for (Method method : methods) {
			attrMap.put(method.getName(),method.getParameterTypes());
		}
		return attrMap;
	}
	
	
	public static void main(String[] args) throws Exception {
		//String path = getClassPath(BeanUtils.class);
	}
	
}
