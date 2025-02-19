/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.asiainfo.crm.cm.batch.xsd.commoninfo;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Enumeration;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.exolab.castor.xml.*;
import org.xml.sax.ContentHandler;

/**
 * Comment describing your root element
 * 
 * @version $Revision$ $Date$
**/
public class Commoninfo implements java.io.Serializable {

	private static final Log log = LogFactory.getLog(Commoninfo.class);
      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    private java.util.ArrayList _xmlMapList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Commoninfo() {
        super();
        _xmlMapList = new ArrayList();
    } //-- com.asiainfo.crm.cm.batch.xsd.commoninfo.Commoninfo()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vXmlMap
    **/
    public void addXmlMap(XmlMap vXmlMap)
        throws java.lang.IndexOutOfBoundsException
    {
        _xmlMapList.add(vXmlMap);
    } //-- void addXmlMap(XmlMap) 

    /**
     * 
     * 
     * @param index
     * @param vXmlMap
    **/
    public void addXmlMap(int index, XmlMap vXmlMap)
        throws java.lang.IndexOutOfBoundsException
    {
        _xmlMapList.add(index, vXmlMap);
    } //-- void addXmlMap(int, XmlMap) 

    /**
    **/
    public void clearXmlMap()
    {
        _xmlMapList.clear();
    } //-- void clearXmlMap() 

    /**
    **/
    public java.util.Enumeration enumerateXmlMap()
    {
        return new org.exolab.castor.util.IteratorEnumeration(_xmlMapList.iterator());
    } //-- java.util.Enumeration enumerateXmlMap() 

    /**
     * 
     * 
     * @param index
    **/
    public XmlMap getXmlMap(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _xmlMapList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (XmlMap) _xmlMapList.get(index);
    } //-- XmlMap getXmlMap(int) 

    /**
    **/
    public XmlMap[] getXmlMap()
    {
        int size = _xmlMapList.size();
        XmlMap[] mArray = new XmlMap[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (XmlMap) _xmlMapList.get(index);
        }
        return mArray;
    } //-- XmlMap[] getXmlMap() 

    /**
    **/
    public int getXmlMapCount()
    {
        return _xmlMapList.size();
    } //-- int getXmlMapCount() 

    /**
    **/
    public boolean isValid()
    {
        try {
            validate();
        }
        catch (org.exolab.castor.xml.ValidationException vex) {
        	log.info(vex.getMessage(), vex);
            return false;
        }
        return true;
    } //-- boolean isValid() 

    /**
     * 
     * 
     * @param out
    **/
    public void marshal(java.io.Writer out)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, out);
    } //-- void marshal(java.io.Writer) 

    /**
     * 
     * 
     * @param handler
    **/
    public void marshal(org.xml.sax.ContentHandler handler)
        throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, handler);
    } //-- void marshal(org.xml.sax.ContentHandler) 

    /**
     * 
     * 
     * @param vXmlMap
    **/
    public boolean removeXmlMap(XmlMap vXmlMap)
    {
        boolean removed = _xmlMapList.remove(vXmlMap);
        return removed;
    } //-- boolean removeXmlMap(XmlMap) 

    /**
     * 
     * 
     * @param index
     * @param vXmlMap
    **/
    public void setXmlMap(int index, XmlMap vXmlMap)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _xmlMapList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _xmlMapList.set(index, vXmlMap);
    } //-- void setXmlMap(int, XmlMap) 

    /**
     * 
     * 
     * @param xmlMapArray
    **/
    public void setXmlMap(XmlMap[] xmlMapArray)
    {
        //-- copy array
        _xmlMapList.clear();
        for (int i = 0; i < xmlMapArray.length; i++) {
            _xmlMapList.add(xmlMapArray[i]);
        }
    } //-- void setXmlMap(XmlMap) 

    /**
     * 
     * 
     * @param reader
    **/
    public static com.asiainfo.crm.cm.batch.xsd.commoninfo.Commoninfo unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.asiainfo.crm.cm.batch.xsd.commoninfo.Commoninfo) Unmarshaller.unmarshal(com.asiainfo.crm.cm.batch.xsd.commoninfo.Commoninfo.class, reader);
    } //-- com.asiainfo.crm.cm.batch.xsd.commoninfo.Commoninfo unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
