/**
 * AdresseData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.rki;

public class AdresseData  extends com.asiainfo.crm.inter.exe.webservice.client.rki.XmlData  implements java.io.Serializable {
    private com.asiainfo.crm.inter.exe.webservice.client.rki.NavnData coNavn;

    private com.asiainfo.crm.inter.exe.webservice.client.rki.PostDistriktData postDistrikt;

    private com.asiainfo.crm.inter.exe.webservice.client.rki.KommuneData kommune;

    private com.asiainfo.crm.inter.exe.webservice.client.rki.HusNrData husNr;

    private com.asiainfo.crm.inter.exe.webservice.client.rki.LandData land;

    private java.lang.String bynavn;

    private java.lang.String vej;

    private java.lang.String bygningNr;

    private java.lang.String etage;

    private java.lang.String sideDoer;

    private java.lang.String postBox;

    private java.lang.String[] udenlandsk;

    private java.lang.String[] adresseLinier;

    private java.lang.String dato;

    private java.lang.String reklameBeskyttet;

    private java.lang.String reklameBeskyttetFra;

    private java.lang.String udenlandsk2;  // attribute

    private java.lang.String beskyttetFra;  // attribute

    private java.lang.String beskyttet;  // attribute

    private java.lang.String vejNr;  // attribute

    private java.lang.String sogeVejNr;  // attribute

    public AdresseData() {
    }

    public AdresseData(
           com.asiainfo.crm.inter.exe.webservice.client.rki.XmlError error,
           java.lang.String udenlandsk2,
           java.lang.String beskyttetFra,
           java.lang.String beskyttet,
           java.lang.String vejNr,
           java.lang.String sogeVejNr,
           com.asiainfo.crm.inter.exe.webservice.client.rki.NavnData coNavn,
           com.asiainfo.crm.inter.exe.webservice.client.rki.PostDistriktData postDistrikt,
           com.asiainfo.crm.inter.exe.webservice.client.rki.KommuneData kommune,
           com.asiainfo.crm.inter.exe.webservice.client.rki.HusNrData husNr,
           com.asiainfo.crm.inter.exe.webservice.client.rki.LandData land,
           java.lang.String bynavn,
           java.lang.String vej,
           java.lang.String bygningNr,
           java.lang.String etage,
           java.lang.String sideDoer,
           java.lang.String postBox,
           java.lang.String[] udenlandsk,
           java.lang.String[] adresseLinier,
           java.lang.String dato,
           java.lang.String reklameBeskyttet,
           java.lang.String reklameBeskyttetFra) {
        super(
            error);
        this.udenlandsk2 = udenlandsk2;
        this.beskyttetFra = beskyttetFra;
        this.beskyttet = beskyttet;
        this.vejNr = vejNr;
        this.sogeVejNr = sogeVejNr;
        this.coNavn = coNavn;
        this.postDistrikt = postDistrikt;
        this.kommune = kommune;
        this.husNr = husNr;
        this.land = land;
        this.bynavn = bynavn;
        this.vej = vej;
        this.bygningNr = bygningNr;
        this.etage = etage;
        this.sideDoer = sideDoer;
        this.postBox = postBox;
        this.udenlandsk = udenlandsk;
        this.adresseLinier = adresseLinier;
        this.dato = dato;
        this.reklameBeskyttet = reklameBeskyttet;
        this.reklameBeskyttetFra = reklameBeskyttetFra;
    }


    /**
     * Gets the coNavn value for this AdresseData.
     * 
     * @return coNavn
     */
    public com.asiainfo.crm.inter.exe.webservice.client.rki.NavnData getCoNavn() {
        return coNavn;
    }


    /**
     * Sets the coNavn value for this AdresseData.
     * 
     * @param coNavn
     */
    public void setCoNavn(com.asiainfo.crm.inter.exe.webservice.client.rki.NavnData coNavn) {
        this.coNavn = coNavn;
    }


    /**
     * Gets the postDistrikt value for this AdresseData.
     * 
     * @return postDistrikt
     */
    public com.asiainfo.crm.inter.exe.webservice.client.rki.PostDistriktData getPostDistrikt() {
        return postDistrikt;
    }


    /**
     * Sets the postDistrikt value for this AdresseData.
     * 
     * @param postDistrikt
     */
    public void setPostDistrikt(com.asiainfo.crm.inter.exe.webservice.client.rki.PostDistriktData postDistrikt) {
        this.postDistrikt = postDistrikt;
    }


    /**
     * Gets the kommune value for this AdresseData.
     * 
     * @return kommune
     */
    public com.asiainfo.crm.inter.exe.webservice.client.rki.KommuneData getKommune() {
        return kommune;
    }


    /**
     * Sets the kommune value for this AdresseData.
     * 
     * @param kommune
     */
    public void setKommune(com.asiainfo.crm.inter.exe.webservice.client.rki.KommuneData kommune) {
        this.kommune = kommune;
    }


    /**
     * Gets the husNr value for this AdresseData.
     * 
     * @return husNr
     */
    public com.asiainfo.crm.inter.exe.webservice.client.rki.HusNrData getHusNr() {
        return husNr;
    }


    /**
     * Sets the husNr value for this AdresseData.
     * 
     * @param husNr
     */
    public void setHusNr(com.asiainfo.crm.inter.exe.webservice.client.rki.HusNrData husNr) {
        this.husNr = husNr;
    }


    /**
     * Gets the land value for this AdresseData.
     * 
     * @return land
     */
    public com.asiainfo.crm.inter.exe.webservice.client.rki.LandData getLand() {
        return land;
    }


    /**
     * Sets the land value for this AdresseData.
     * 
     * @param land
     */
    public void setLand(com.asiainfo.crm.inter.exe.webservice.client.rki.LandData land) {
        this.land = land;
    }


    /**
     * Gets the bynavn value for this AdresseData.
     * 
     * @return bynavn
     */
    public java.lang.String getBynavn() {
        return bynavn;
    }


    /**
     * Sets the bynavn value for this AdresseData.
     * 
     * @param bynavn
     */
    public void setBynavn(java.lang.String bynavn) {
        this.bynavn = bynavn;
    }


    /**
     * Gets the vej value for this AdresseData.
     * 
     * @return vej
     */
    public java.lang.String getVej() {
        return vej;
    }


    /**
     * Sets the vej value for this AdresseData.
     * 
     * @param vej
     */
    public void setVej(java.lang.String vej) {
        this.vej = vej;
    }


    /**
     * Gets the bygningNr value for this AdresseData.
     * 
     * @return bygningNr
     */
    public java.lang.String getBygningNr() {
        return bygningNr;
    }


    /**
     * Sets the bygningNr value for this AdresseData.
     * 
     * @param bygningNr
     */
    public void setBygningNr(java.lang.String bygningNr) {
        this.bygningNr = bygningNr;
    }


    /**
     * Gets the etage value for this AdresseData.
     * 
     * @return etage
     */
    public java.lang.String getEtage() {
        return etage;
    }


    /**
     * Sets the etage value for this AdresseData.
     * 
     * @param etage
     */
    public void setEtage(java.lang.String etage) {
        this.etage = etage;
    }


    /**
     * Gets the sideDoer value for this AdresseData.
     * 
     * @return sideDoer
     */
    public java.lang.String getSideDoer() {
        return sideDoer;
    }


    /**
     * Sets the sideDoer value for this AdresseData.
     * 
     * @param sideDoer
     */
    public void setSideDoer(java.lang.String sideDoer) {
        this.sideDoer = sideDoer;
    }


    /**
     * Gets the postBox value for this AdresseData.
     * 
     * @return postBox
     */
    public java.lang.String getPostBox() {
        return postBox;
    }


    /**
     * Sets the postBox value for this AdresseData.
     * 
     * @param postBox
     */
    public void setPostBox(java.lang.String postBox) {
        this.postBox = postBox;
    }


    /**
     * Gets the udenlandsk value for this AdresseData.
     * 
     * @return udenlandsk
     */
    public java.lang.String[] getUdenlandsk() {
        return udenlandsk;
    }


    /**
     * Sets the udenlandsk value for this AdresseData.
     * 
     * @param udenlandsk
     */
    public void setUdenlandsk(java.lang.String[] udenlandsk) {
        this.udenlandsk = udenlandsk;
    }


    /**
     * Gets the adresseLinier value for this AdresseData.
     * 
     * @return adresseLinier
     */
    public java.lang.String[] getAdresseLinier() {
        return adresseLinier;
    }


    /**
     * Sets the adresseLinier value for this AdresseData.
     * 
     * @param adresseLinier
     */
    public void setAdresseLinier(java.lang.String[] adresseLinier) {
        this.adresseLinier = adresseLinier;
    }


    /**
     * Gets the dato value for this AdresseData.
     * 
     * @return dato
     */
    public java.lang.String getDato() {
        return dato;
    }


    /**
     * Sets the dato value for this AdresseData.
     * 
     * @param dato
     */
    public void setDato(java.lang.String dato) {
        this.dato = dato;
    }


    /**
     * Gets the reklameBeskyttet value for this AdresseData.
     * 
     * @return reklameBeskyttet
     */
    public java.lang.String getReklameBeskyttet() {
        return reklameBeskyttet;
    }


    /**
     * Sets the reklameBeskyttet value for this AdresseData.
     * 
     * @param reklameBeskyttet
     */
    public void setReklameBeskyttet(java.lang.String reklameBeskyttet) {
        this.reklameBeskyttet = reklameBeskyttet;
    }


    /**
     * Gets the reklameBeskyttetFra value for this AdresseData.
     * 
     * @return reklameBeskyttetFra
     */
    public java.lang.String getReklameBeskyttetFra() {
        return reklameBeskyttetFra;
    }


    /**
     * Sets the reklameBeskyttetFra value for this AdresseData.
     * 
     * @param reklameBeskyttetFra
     */
    public void setReklameBeskyttetFra(java.lang.String reklameBeskyttetFra) {
        this.reklameBeskyttetFra = reklameBeskyttetFra;
    }


    /**
     * Gets the udenlandsk2 value for this AdresseData.
     * 
     * @return udenlandsk2
     */
    public java.lang.String getUdenlandsk2() {
        return udenlandsk2;
    }


    /**
     * Sets the udenlandsk2 value for this AdresseData.
     * 
     * @param udenlandsk2
     */
    public void setUdenlandsk2(java.lang.String udenlandsk2) {
        this.udenlandsk2 = udenlandsk2;
    }


    /**
     * Gets the beskyttetFra value for this AdresseData.
     * 
     * @return beskyttetFra
     */
    public java.lang.String getBeskyttetFra() {
        return beskyttetFra;
    }


    /**
     * Sets the beskyttetFra value for this AdresseData.
     * 
     * @param beskyttetFra
     */
    public void setBeskyttetFra(java.lang.String beskyttetFra) {
        this.beskyttetFra = beskyttetFra;
    }


    /**
     * Gets the beskyttet value for this AdresseData.
     * 
     * @return beskyttet
     */
    public java.lang.String getBeskyttet() {
        return beskyttet;
    }


    /**
     * Sets the beskyttet value for this AdresseData.
     * 
     * @param beskyttet
     */
    public void setBeskyttet(java.lang.String beskyttet) {
        this.beskyttet = beskyttet;
    }


    /**
     * Gets the vejNr value for this AdresseData.
     * 
     * @return vejNr
     */
    public java.lang.String getVejNr() {
        return vejNr;
    }


    /**
     * Sets the vejNr value for this AdresseData.
     * 
     * @param vejNr
     */
    public void setVejNr(java.lang.String vejNr) {
        this.vejNr = vejNr;
    }


    /**
     * Gets the sogeVejNr value for this AdresseData.
     * 
     * @return sogeVejNr
     */
    public java.lang.String getSogeVejNr() {
        return sogeVejNr;
    }


    /**
     * Sets the sogeVejNr value for this AdresseData.
     * 
     * @param sogeVejNr
     */
    public void setSogeVejNr(java.lang.String sogeVejNr) {
        this.sogeVejNr = sogeVejNr;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdresseData)) return false;
        AdresseData other = (AdresseData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.coNavn==null && other.getCoNavn()==null) || 
             (this.coNavn!=null &&
              this.coNavn.equals(other.getCoNavn()))) &&
            ((this.postDistrikt==null && other.getPostDistrikt()==null) || 
             (this.postDistrikt!=null &&
              this.postDistrikt.equals(other.getPostDistrikt()))) &&
            ((this.kommune==null && other.getKommune()==null) || 
             (this.kommune!=null &&
              this.kommune.equals(other.getKommune()))) &&
            ((this.husNr==null && other.getHusNr()==null) || 
             (this.husNr!=null &&
              this.husNr.equals(other.getHusNr()))) &&
            ((this.land==null && other.getLand()==null) || 
             (this.land!=null &&
              this.land.equals(other.getLand()))) &&
            ((this.bynavn==null && other.getBynavn()==null) || 
             (this.bynavn!=null &&
              this.bynavn.equals(other.getBynavn()))) &&
            ((this.vej==null && other.getVej()==null) || 
             (this.vej!=null &&
              this.vej.equals(other.getVej()))) &&
            ((this.bygningNr==null && other.getBygningNr()==null) || 
             (this.bygningNr!=null &&
              this.bygningNr.equals(other.getBygningNr()))) &&
            ((this.etage==null && other.getEtage()==null) || 
             (this.etage!=null &&
              this.etage.equals(other.getEtage()))) &&
            ((this.sideDoer==null && other.getSideDoer()==null) || 
             (this.sideDoer!=null &&
              this.sideDoer.equals(other.getSideDoer()))) &&
            ((this.postBox==null && other.getPostBox()==null) || 
             (this.postBox!=null &&
              this.postBox.equals(other.getPostBox()))) &&
            ((this.udenlandsk==null && other.getUdenlandsk()==null) || 
             (this.udenlandsk!=null &&
              java.util.Arrays.equals(this.udenlandsk, other.getUdenlandsk()))) &&
            ((this.adresseLinier==null && other.getAdresseLinier()==null) || 
             (this.adresseLinier!=null &&
              java.util.Arrays.equals(this.adresseLinier, other.getAdresseLinier()))) &&
            ((this.dato==null && other.getDato()==null) || 
             (this.dato!=null &&
              this.dato.equals(other.getDato()))) &&
            ((this.reklameBeskyttet==null && other.getReklameBeskyttet()==null) || 
             (this.reklameBeskyttet!=null &&
              this.reklameBeskyttet.equals(other.getReklameBeskyttet()))) &&
            ((this.reklameBeskyttetFra==null && other.getReklameBeskyttetFra()==null) || 
             (this.reklameBeskyttetFra!=null &&
              this.reklameBeskyttetFra.equals(other.getReklameBeskyttetFra()))) &&
            ((this.udenlandsk2==null && other.getUdenlandsk2()==null) ||
             (this.udenlandsk2!=null &&
              this.udenlandsk2.equals(other.getUdenlandsk2()))) &&
            ((this.beskyttetFra==null && other.getBeskyttetFra()==null) || 
             (this.beskyttetFra!=null &&
              this.beskyttetFra.equals(other.getBeskyttetFra()))) &&
            ((this.beskyttet==null && other.getBeskyttet()==null) || 
             (this.beskyttet!=null &&
              this.beskyttet.equals(other.getBeskyttet()))) &&
            ((this.vejNr==null && other.getVejNr()==null) || 
             (this.vejNr!=null &&
              this.vejNr.equals(other.getVejNr()))) &&
            ((this.sogeVejNr==null && other.getSogeVejNr()==null) || 
             (this.sogeVejNr!=null &&
              this.sogeVejNr.equals(other.getSogeVejNr())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getCoNavn() != null) {
            _hashCode += getCoNavn().hashCode();
        }
        if (getPostDistrikt() != null) {
            _hashCode += getPostDistrikt().hashCode();
        }
        if (getKommune() != null) {
            _hashCode += getKommune().hashCode();
        }
        if (getHusNr() != null) {
            _hashCode += getHusNr().hashCode();
        }
        if (getLand() != null) {
            _hashCode += getLand().hashCode();
        }
        if (getBynavn() != null) {
            _hashCode += getBynavn().hashCode();
        }
        if (getVej() != null) {
            _hashCode += getVej().hashCode();
        }
        if (getBygningNr() != null) {
            _hashCode += getBygningNr().hashCode();
        }
        if (getEtage() != null) {
            _hashCode += getEtage().hashCode();
        }
        if (getSideDoer() != null) {
            _hashCode += getSideDoer().hashCode();
        }
        if (getPostBox() != null) {
            _hashCode += getPostBox().hashCode();
        }
        if (getUdenlandsk() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUdenlandsk());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUdenlandsk(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAdresseLinier() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdresseLinier());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdresseLinier(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDato() != null) {
            _hashCode += getDato().hashCode();
        }
        if (getReklameBeskyttet() != null) {
            _hashCode += getReklameBeskyttet().hashCode();
        }
        if (getReklameBeskyttetFra() != null) {
            _hashCode += getReklameBeskyttetFra().hashCode();
        }
        if (getUdenlandsk2() != null) {
            _hashCode += getUdenlandsk2().hashCode();
        }
        if (getBeskyttetFra() != null) {
            _hashCode += getBeskyttetFra().hashCode();
        }
        if (getBeskyttet() != null) {
            _hashCode += getBeskyttet().hashCode();
        }
        if (getVejNr() != null) {
            _hashCode += getVejNr().hashCode();
        }
        if (getSogeVejNr() != null) {
            _hashCode += getSogeVejNr().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdresseData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "AdresseData"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("udenlandsk2");
        attrField.setXmlName(new javax.xml.namespace.QName("", "udenlandsk"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("beskyttetFra");
        attrField.setXmlName(new javax.xml.namespace.QName("", "beskyttetFra"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("beskyttet");
        attrField.setXmlName(new javax.xml.namespace.QName("", "beskyttet"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("vejNr");
        attrField.setXmlName(new javax.xml.namespace.QName("", "VejNr"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("sogeVejNr");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SogeVejNr"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coNavn");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "CoNavn"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "NavnData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postDistrikt");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "PostDistrikt"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "PostDistriktData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kommune");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "Kommune"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "KommuneData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("husNr");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "HusNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "HusNrData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("land");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "Land"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "LandData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bynavn");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "Bynavn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vej");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "Vej"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bygningNr");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "BygningNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("etage");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "Etage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sideDoer");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "SideDoer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postBox");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "PostBox"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("udenlandsk");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "Udenlandsk"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://ws.rki.dk", "AdresseLinie"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adresseLinier");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "AdresseLinier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://ws.rki.dk", "AdresseLinie"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dato");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "Dato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reklameBeskyttet");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "ReklameBeskyttet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reklameBeskyttetFra");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "ReklameBeskyttetFra"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
