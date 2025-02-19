package com.asiainfo.crm.cm.common;

import com.ai.appframe2.complex.util.e.K;
import com.ai.appframe2.complex.util.e.RC2;

public class Test {
	 private static byte[] key = { 97, 105, 95, 110, 106, 95, 114, 100 };

	  public static String j(String plain)
	    throws Exception
	  {
	    RC2 rc2 = new RC2();
	    return rc2.encrypt_rc2_array_base64(plain.getBytes(), key);
	  }

	  public static String k(String cipher)
	    throws Exception
	  {
	    RC2 rc2 = new RC2();
	    return rc2.decrypt_rc2_array_base64(cipher.getBytes(), key);
	  }

	  public static String k_s(String cipher)
	    throws Exception
	  {
	    String rtn = null;
	    if ((cipher != null) && (cipher.lastIndexOf("{RC2}") != -1)) {
	      rtn = k(cipher.substring(5));
	    }
	    else {
	      rtn = cipher;
	    }
	    return rtn;
	  }

	  public static void main2(String[] args) throws Exception
	  {
	    String a = k_s("{RC2}RcAeFXsjJHfGNA==");
	    System.out.println(a);
	  }

	  public static void main(String[] args) throws Exception
	  {
//	    String a = k_s("111111");
//	    System.out.println(a);
//	    String b = k(a);
//	    System.out.println(b);
//
//	    System.out.println(j("base"));
		  
		System.out.println(K.j("123456"));
		System.out.println(K.k("52F7Bnpr"));
		
	  }

}
