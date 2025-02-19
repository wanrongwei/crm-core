/**
 * Adgangsadresse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.dawa;

public class Adgangsadresse  implements java.io.Serializable {
    private java.lang.String href;

    private java.lang.String id;

    private java.lang.String kvh;

    private java.lang.String status;

    private com.asiainfo.crm.inter.exe.webservice.client.dawa.Vejstykke vejstykke;

    private java.lang.String husnr;

    private com.asiainfo.crm.inter.exe.webservice.client.dawa.Navngivenvej navngivenvej;

    private java.lang.String supplerendebynavn;

    private java.lang.String supplerendebynavn2;

    private com.asiainfo.crm.inter.exe.webservice.client.dawa.Postnummer postnummer;

    private java.lang.String stormodtagerpostnummer;

    private com.asiainfo.crm.inter.exe.webservice.client.dawa.Kommune kommune;

    private com.asiainfo.crm.inter.exe.webservice.client.dawa.Ejerlav ejerlav;

    private java.lang.String esrejendomsnr;

    private java.lang.String matrikelnr;

    private com.asiainfo.crm.inter.exe.webservice.client.dawa.Historik historik;

    private com.asiainfo.crm.inter.exe.webservice.client.dawa.Adgangspunkt adgangspunkt;

    private com.asiainfo.crm.inter.exe.webservice.client.dawa.Vejpunkt vejpunkt;

    private com.asiainfo.crm.inter.exe.webservice.client.dawa.DDKN DDKN;

    private com.asiainfo.crm.inter.exe.webservice.client.dawa.Sogn sogn;

    private com.asiainfo.crm.inter.exe.webservice.client.dawa.Region region;

    private com.asiainfo.crm.inter.exe.webservice.client.dawa.Region retskreds;

    private com.asiainfo.crm.inter.exe.webservice.client.dawa.Region politikreds;

    private com.asiainfo.crm.inter.exe.webservice.client.dawa.Region opstillingskreds;

    private com.asiainfo.crm.inter.exe.webservice.client.dawa.Region afstemningsområde;

    private java.lang.String zone;

    private com.asiainfo.crm.inter.exe.webservice.client.dawa.Jordstykke jordstykke;

    private com.asiainfo.crm.inter.exe.webservice.client.dawa.Bebyggelser bebyggelser;

    private java.lang.String brofast;

    public Adgangsadresse() {
    }

    public Adgangsadresse(
           java.lang.String href,
           java.lang.String id,
           java.lang.String kvh,
           java.lang.String status,
           com.asiainfo.crm.inter.exe.webservice.client.dawa.Vejstykke vejstykke,
           java.lang.String husnr,
           com.asiainfo.crm.inter.exe.webservice.client.dawa.Navngivenvej navngivenvej,
           java.lang.String supplerendebynavn,
           java.lang.String supplerendebynavn2,
           com.asiainfo.crm.inter.exe.webservice.client.dawa.Postnummer postnummer,
           java.lang.String stormodtagerpostnummer,
           com.asiainfo.crm.inter.exe.webservice.client.dawa.Kommune kommune,
           com.asiainfo.crm.inter.exe.webservice.client.dawa.Ejerlav ejerlav,
           java.lang.String esrejendomsnr,
           java.lang.String matrikelnr,
           com.asiainfo.crm.inter.exe.webservice.client.dawa.Historik historik,
           com.asiainfo.crm.inter.exe.webservice.client.dawa.Adgangspunkt adgangspunkt,
           com.asiainfo.crm.inter.exe.webservice.client.dawa.Vejpunkt vejpunkt,
           com.asiainfo.crm.inter.exe.webservice.client.dawa.DDKN DDKN,
           com.asiainfo.crm.inter.exe.webservice.client.dawa.Sogn sogn,
           com.asiainfo.crm.inter.exe.webservice.client.dawa.Region region,
           com.asiainfo.crm.inter.exe.webservice.client.dawa.Region retskreds,
           com.asiainfo.crm.inter.exe.webservice.client.dawa.Region politikreds,
           com.asiainfo.crm.inter.exe.webservice.client.dawa.Region opstillingskreds,
           com.asiainfo.crm.inter.exe.webservice.client.dawa.Region afstemningsområde,
           java.lang.String zone,
           com.asiainfo.crm.inter.exe.webservice.client.dawa.Jordstykke jordstykke,
           com.asiainfo.crm.inter.exe.webservice.client.dawa.Bebyggelser bebyggelser,
           java.lang.String brofast) {
           this.href = href;
           this.id = id;
           this.kvh = kvh;
           this.status = status;
           this.vejstykke = vejstykke;
           this.husnr = husnr;
           this.navngivenvej = navngivenvej;
           this.supplerendebynavn = supplerendebynavn;
           this.supplerendebynavn2 = supplerendebynavn2;
           this.postnummer = postnummer;
           this.stormodtagerpostnummer = stormodtagerpostnummer;
           this.kommune = kommune;
           this.ejerlav = ejerlav;
           this.esrejendomsnr = esrejendomsnr;
           this.matrikelnr = matrikelnr;
           this.historik = historik;
           this.adgangspunkt = adgangspunkt;
           this.vejpunkt = vejpunkt;
           this.DDKN = DDKN;
           this.sogn = sogn;
           this.region = region;
           this.retskreds = retskreds;
           this.politikreds = politikreds;
           this.opstillingskreds = opstillingskreds;
           this.afstemningsområde = afstemningsområde;
           this.zone = zone;
           this.jordstykke = jordstykke;
           this.bebyggelser = bebyggelser;
           this.brofast = brofast;
    }


    /**
     * Gets the href value for this Adgangsadresse.
     * 
     * @return href
     */
    public java.lang.String getHref() {
        return href;
    }


    /**
     * Sets the href value for this Adgangsadresse.
     * 
     * @param href
     */
    public void setHref(java.lang.String href) {
        this.href = href;
    }


    /**
     * Gets the id value for this Adgangsadresse.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this Adgangsadresse.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the kvh value for this Adgangsadresse.
     * 
     * @return kvh
     */
    public java.lang.String getKvh() {
        return kvh;
    }


    /**
     * Sets the kvh value for this Adgangsadresse.
     * 
     * @param kvh
     */
    public void setKvh(java.lang.String kvh) {
        this.kvh = kvh;
    }


    /**
     * Gets the status value for this Adgangsadresse.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Adgangsadresse.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the vejstykke value for this Adgangsadresse.
     * 
     * @return vejstykke
     */
    public com.asiainfo.crm.inter.exe.webservice.client.dawa.Vejstykke getVejstykke() {
        return vejstykke;
    }


    /**
     * Sets the vejstykke value for this Adgangsadresse.
     * 
     * @param vejstykke
     */
    public void setVejstykke(com.asiainfo.crm.inter.exe.webservice.client.dawa.Vejstykke vejstykke) {
        this.vejstykke = vejstykke;
    }


    /**
     * Gets the husnr value for this Adgangsadresse.
     * 
     * @return husnr
     */
    public java.lang.String getHusnr() {
        return husnr;
    }


    /**
     * Sets the husnr value for this Adgangsadresse.
     * 
     * @param husnr
     */
    public void setHusnr(java.lang.String husnr) {
        this.husnr = husnr;
    }


    /**
     * Gets the navngivenvej value for this Adgangsadresse.
     * 
     * @return navngivenvej
     */
    public com.asiainfo.crm.inter.exe.webservice.client.dawa.Navngivenvej getNavngivenvej() {
        return navngivenvej;
    }


    /**
     * Sets the navngivenvej value for this Adgangsadresse.
     * 
     * @param navngivenvej
     */
    public void setNavngivenvej(com.asiainfo.crm.inter.exe.webservice.client.dawa.Navngivenvej navngivenvej) {
        this.navngivenvej = navngivenvej;
    }


    /**
     * Gets the supplerendebynavn value for this Adgangsadresse.
     * 
     * @return supplerendebynavn
     */
    public java.lang.String getSupplerendebynavn() {
        return supplerendebynavn;
    }


    /**
     * Sets the supplerendebynavn value for this Adgangsadresse.
     * 
     * @param supplerendebynavn
     */
    public void setSupplerendebynavn(java.lang.String supplerendebynavn) {
        this.supplerendebynavn = supplerendebynavn;
    }


    /**
     * Gets the supplerendebynavn2 value for this Adgangsadresse.
     * 
     * @return supplerendebynavn2
     */
    public java.lang.String getSupplerendebynavn2() {
        return supplerendebynavn2;
    }


    /**
     * Sets the supplerendebynavn2 value for this Adgangsadresse.
     * 
     * @param supplerendebynavn2
     */
    public void setSupplerendebynavn2(java.lang.String supplerendebynavn2) {
        this.supplerendebynavn2 = supplerendebynavn2;
    }


    /**
     * Gets the postnummer value for this Adgangsadresse.
     * 
     * @return postnummer
     */
    public com.asiainfo.crm.inter.exe.webservice.client.dawa.Postnummer getPostnummer() {
        return postnummer;
    }


    /**
     * Sets the postnummer value for this Adgangsadresse.
     * 
     * @param postnummer
     */
    public void setPostnummer(com.asiainfo.crm.inter.exe.webservice.client.dawa.Postnummer postnummer) {
        this.postnummer = postnummer;
    }


    /**
     * Gets the stormodtagerpostnummer value for this Adgangsadresse.
     * 
     * @return stormodtagerpostnummer
     */
    public java.lang.String getStormodtagerpostnummer() {
        return stormodtagerpostnummer;
    }


    /**
     * Sets the stormodtagerpostnummer value for this Adgangsadresse.
     * 
     * @param stormodtagerpostnummer
     */
    public void setStormodtagerpostnummer(java.lang.String stormodtagerpostnummer) {
        this.stormodtagerpostnummer = stormodtagerpostnummer;
    }


    /**
     * Gets the kommune value for this Adgangsadresse.
     * 
     * @return kommune
     */
    public com.asiainfo.crm.inter.exe.webservice.client.dawa.Kommune getKommune() {
        return kommune;
    }


    /**
     * Sets the kommune value for this Adgangsadresse.
     * 
     * @param kommune
     */
    public void setKommune(com.asiainfo.crm.inter.exe.webservice.client.dawa.Kommune kommune) {
        this.kommune = kommune;
    }


    /**
     * Gets the ejerlav value for this Adgangsadresse.
     * 
     * @return ejerlav
     */
    public com.asiainfo.crm.inter.exe.webservice.client.dawa.Ejerlav getEjerlav() {
        return ejerlav;
    }


    /**
     * Sets the ejerlav value for this Adgangsadresse.
     * 
     * @param ejerlav
     */
    public void setEjerlav(com.asiainfo.crm.inter.exe.webservice.client.dawa.Ejerlav ejerlav) {
        this.ejerlav = ejerlav;
    }


    /**
     * Gets the esrejendomsnr value for this Adgangsadresse.
     * 
     * @return esrejendomsnr
     */
    public java.lang.String getEsrejendomsnr() {
        return esrejendomsnr;
    }


    /**
     * Sets the esrejendomsnr value for this Adgangsadresse.
     * 
     * @param esrejendomsnr
     */
    public void setEsrejendomsnr(java.lang.String esrejendomsnr) {
        this.esrejendomsnr = esrejendomsnr;
    }


    /**
     * Gets the matrikelnr value for this Adgangsadresse.
     * 
     * @return matrikelnr
     */
    public java.lang.String getMatrikelnr() {
        return matrikelnr;
    }


    /**
     * Sets the matrikelnr value for this Adgangsadresse.
     * 
     * @param matrikelnr
     */
    public void setMatrikelnr(java.lang.String matrikelnr) {
        this.matrikelnr = matrikelnr;
    }


    /**
     * Gets the historik value for this Adgangsadresse.
     * 
     * @return historik
     */
    public com.asiainfo.crm.inter.exe.webservice.client.dawa.Historik getHistorik() {
        return historik;
    }


    /**
     * Sets the historik value for this Adgangsadresse.
     * 
     * @param historik
     */
    public void setHistorik(com.asiainfo.crm.inter.exe.webservice.client.dawa.Historik historik) {
        this.historik = historik;
    }


    /**
     * Gets the adgangspunkt value for this Adgangsadresse.
     * 
     * @return adgangspunkt
     */
    public com.asiainfo.crm.inter.exe.webservice.client.dawa.Adgangspunkt getAdgangspunkt() {
        return adgangspunkt;
    }


    /**
     * Sets the adgangspunkt value for this Adgangsadresse.
     * 
     * @param adgangspunkt
     */
    public void setAdgangspunkt(com.asiainfo.crm.inter.exe.webservice.client.dawa.Adgangspunkt adgangspunkt) {
        this.adgangspunkt = adgangspunkt;
    }


    /**
     * Gets the vejpunkt value for this Adgangsadresse.
     * 
     * @return vejpunkt
     */
    public com.asiainfo.crm.inter.exe.webservice.client.dawa.Vejpunkt getVejpunkt() {
        return vejpunkt;
    }


    /**
     * Sets the vejpunkt value for this Adgangsadresse.
     * 
     * @param vejpunkt
     */
    public void setVejpunkt(com.asiainfo.crm.inter.exe.webservice.client.dawa.Vejpunkt vejpunkt) {
        this.vejpunkt = vejpunkt;
    }


    /**
     * Gets the DDKN value for this Adgangsadresse.
     * 
     * @return DDKN
     */
    public com.asiainfo.crm.inter.exe.webservice.client.dawa.DDKN getDDKN() {
        return DDKN;
    }


    /**
     * Sets the DDKN value for this Adgangsadresse.
     * 
     * @param DDKN
     */
    public void setDDKN(com.asiainfo.crm.inter.exe.webservice.client.dawa.DDKN DDKN) {
        this.DDKN = DDKN;
    }


    /**
     * Gets the sogn value for this Adgangsadresse.
     * 
     * @return sogn
     */
    public com.asiainfo.crm.inter.exe.webservice.client.dawa.Sogn getSogn() {
        return sogn;
    }


    /**
     * Sets the sogn value for this Adgangsadresse.
     * 
     * @param sogn
     */
    public void setSogn(com.asiainfo.crm.inter.exe.webservice.client.dawa.Sogn sogn) {
        this.sogn = sogn;
    }


    /**
     * Gets the region value for this Adgangsadresse.
     * 
     * @return region
     */
    public com.asiainfo.crm.inter.exe.webservice.client.dawa.Region getRegion() {
        return region;
    }


    /**
     * Sets the region value for this Adgangsadresse.
     * 
     * @param region
     */
    public void setRegion(com.asiainfo.crm.inter.exe.webservice.client.dawa.Region region) {
        this.region = region;
    }


    /**
     * Gets the retskreds value for this Adgangsadresse.
     * 
     * @return retskreds
     */
    public com.asiainfo.crm.inter.exe.webservice.client.dawa.Region getRetskreds() {
        return retskreds;
    }


    /**
     * Sets the retskreds value for this Adgangsadresse.
     * 
     * @param retskreds
     */
    public void setRetskreds(com.asiainfo.crm.inter.exe.webservice.client.dawa.Region retskreds) {
        this.retskreds = retskreds;
    }


    /**
     * Gets the politikreds value for this Adgangsadresse.
     * 
     * @return politikreds
     */
    public com.asiainfo.crm.inter.exe.webservice.client.dawa.Region getPolitikreds() {
        return politikreds;
    }


    /**
     * Sets the politikreds value for this Adgangsadresse.
     * 
     * @param politikreds
     */
    public void setPolitikreds(com.asiainfo.crm.inter.exe.webservice.client.dawa.Region politikreds) {
        this.politikreds = politikreds;
    }


    /**
     * Gets the opstillingskreds value for this Adgangsadresse.
     * 
     * @return opstillingskreds
     */
    public com.asiainfo.crm.inter.exe.webservice.client.dawa.Region getOpstillingskreds() {
        return opstillingskreds;
    }


    /**
     * Sets the opstillingskreds value for this Adgangsadresse.
     * 
     * @param opstillingskreds
     */
    public void setOpstillingskreds(com.asiainfo.crm.inter.exe.webservice.client.dawa.Region opstillingskreds) {
        this.opstillingskreds = opstillingskreds;
    }


    /**
     * Gets the afstemningsområde value for this Adgangsadresse.
     * 
     * @return afstemningsområde
     */
    public com.asiainfo.crm.inter.exe.webservice.client.dawa.Region getAfstemningsområde() {
        return afstemningsområde;
    }


    /**
     * Sets the afstemningsområde value for this Adgangsadresse.
     * 
     * @param afstemningsområde
     */
    public void setAfstemningsområde(com.asiainfo.crm.inter.exe.webservice.client.dawa.Region afstemningsområde) {
        this.afstemningsområde = afstemningsområde;
    }


    /**
     * Gets the zone value for this Adgangsadresse.
     * 
     * @return zone
     */
    public java.lang.String getZone() {
        return zone;
    }


    /**
     * Sets the zone value for this Adgangsadresse.
     * 
     * @param zone
     */
    public void setZone(java.lang.String zone) {
        this.zone = zone;
    }


    /**
     * Gets the jordstykke value for this Adgangsadresse.
     * 
     * @return jordstykke
     */
    public com.asiainfo.crm.inter.exe.webservice.client.dawa.Jordstykke getJordstykke() {
        return jordstykke;
    }


    /**
     * Sets the jordstykke value for this Adgangsadresse.
     * 
     * @param jordstykke
     */
    public void setJordstykke(com.asiainfo.crm.inter.exe.webservice.client.dawa.Jordstykke jordstykke) {
        this.jordstykke = jordstykke;
    }


    /**
     * Gets the bebyggelser value for this Adgangsadresse.
     * 
     * @return bebyggelser
     */
    public com.asiainfo.crm.inter.exe.webservice.client.dawa.Bebyggelser getBebyggelser() {
        return bebyggelser;
    }


    /**
     * Sets the bebyggelser value for this Adgangsadresse.
     * 
     * @param bebyggelser
     */
    public void setBebyggelser(com.asiainfo.crm.inter.exe.webservice.client.dawa.Bebyggelser bebyggelser) {
        this.bebyggelser = bebyggelser;
    }


    /**
     * Gets the brofast value for this Adgangsadresse.
     * 
     * @return brofast
     */
    public java.lang.String getBrofast() {
        return brofast;
    }


    /**
     * Sets the brofast value for this Adgangsadresse.
     * 
     * @param brofast
     */
    public void setBrofast(java.lang.String brofast) {
        this.brofast = brofast;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Adgangsadresse)) return false;
        Adgangsadresse other = (Adgangsadresse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.href==null && other.getHref()==null) || 
             (this.href!=null &&
              this.href.equals(other.getHref()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.kvh==null && other.getKvh()==null) || 
             (this.kvh!=null &&
              this.kvh.equals(other.getKvh()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.vejstykke==null && other.getVejstykke()==null) || 
             (this.vejstykke!=null &&
              this.vejstykke.equals(other.getVejstykke()))) &&
            ((this.husnr==null && other.getHusnr()==null) || 
             (this.husnr!=null &&
              this.husnr.equals(other.getHusnr()))) &&
            ((this.navngivenvej==null && other.getNavngivenvej()==null) || 
             (this.navngivenvej!=null &&
              this.navngivenvej.equals(other.getNavngivenvej()))) &&
            ((this.supplerendebynavn==null && other.getSupplerendebynavn()==null) || 
             (this.supplerendebynavn!=null &&
              this.supplerendebynavn.equals(other.getSupplerendebynavn()))) &&
            ((this.supplerendebynavn2==null && other.getSupplerendebynavn2()==null) || 
             (this.supplerendebynavn2!=null &&
              this.supplerendebynavn2.equals(other.getSupplerendebynavn2()))) &&
            ((this.postnummer==null && other.getPostnummer()==null) || 
             (this.postnummer!=null &&
              this.postnummer.equals(other.getPostnummer()))) &&
            ((this.stormodtagerpostnummer==null && other.getStormodtagerpostnummer()==null) || 
             (this.stormodtagerpostnummer!=null &&
              this.stormodtagerpostnummer.equals(other.getStormodtagerpostnummer()))) &&
            ((this.kommune==null && other.getKommune()==null) || 
             (this.kommune!=null &&
              this.kommune.equals(other.getKommune()))) &&
            ((this.ejerlav==null && other.getEjerlav()==null) || 
             (this.ejerlav!=null &&
              this.ejerlav.equals(other.getEjerlav()))) &&
            ((this.esrejendomsnr==null && other.getEsrejendomsnr()==null) || 
             (this.esrejendomsnr!=null &&
              this.esrejendomsnr.equals(other.getEsrejendomsnr()))) &&
            ((this.matrikelnr==null && other.getMatrikelnr()==null) || 
             (this.matrikelnr!=null &&
              this.matrikelnr.equals(other.getMatrikelnr()))) &&
            ((this.historik==null && other.getHistorik()==null) || 
             (this.historik!=null &&
              this.historik.equals(other.getHistorik()))) &&
            ((this.adgangspunkt==null && other.getAdgangspunkt()==null) || 
             (this.adgangspunkt!=null &&
              this.adgangspunkt.equals(other.getAdgangspunkt()))) &&
            ((this.vejpunkt==null && other.getVejpunkt()==null) || 
             (this.vejpunkt!=null &&
              this.vejpunkt.equals(other.getVejpunkt()))) &&
            ((this.DDKN==null && other.getDDKN()==null) || 
             (this.DDKN!=null &&
              this.DDKN.equals(other.getDDKN()))) &&
            ((this.sogn==null && other.getSogn()==null) || 
             (this.sogn!=null &&
              this.sogn.equals(other.getSogn()))) &&
            ((this.region==null && other.getRegion()==null) || 
             (this.region!=null &&
              this.region.equals(other.getRegion()))) &&
            ((this.retskreds==null && other.getRetskreds()==null) || 
             (this.retskreds!=null &&
              this.retskreds.equals(other.getRetskreds()))) &&
            ((this.politikreds==null && other.getPolitikreds()==null) || 
             (this.politikreds!=null &&
              this.politikreds.equals(other.getPolitikreds()))) &&
            ((this.opstillingskreds==null && other.getOpstillingskreds()==null) || 
             (this.opstillingskreds!=null &&
              this.opstillingskreds.equals(other.getOpstillingskreds()))) &&
            ((this.afstemningsområde==null && other.getAfstemningsområde()==null) || 
             (this.afstemningsområde!=null &&
              this.afstemningsområde.equals(other.getAfstemningsområde()))) &&
            ((this.zone==null && other.getZone()==null) || 
             (this.zone!=null &&
              this.zone.equals(other.getZone()))) &&
            ((this.jordstykke==null && other.getJordstykke()==null) || 
             (this.jordstykke!=null &&
              this.jordstykke.equals(other.getJordstykke()))) &&
            ((this.bebyggelser==null && other.getBebyggelser()==null) || 
             (this.bebyggelser!=null &&
              this.bebyggelser.equals(other.getBebyggelser()))) &&
            ((this.brofast==null && other.getBrofast()==null) || 
             (this.brofast!=null &&
              this.brofast.equals(other.getBrofast())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getHref() != null) {
            _hashCode += getHref().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getKvh() != null) {
            _hashCode += getKvh().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getVejstykke() != null) {
            _hashCode += getVejstykke().hashCode();
        }
        if (getHusnr() != null) {
            _hashCode += getHusnr().hashCode();
        }
        if (getNavngivenvej() != null) {
            _hashCode += getNavngivenvej().hashCode();
        }
        if (getSupplerendebynavn() != null) {
            _hashCode += getSupplerendebynavn().hashCode();
        }
        if (getSupplerendebynavn2() != null) {
            _hashCode += getSupplerendebynavn2().hashCode();
        }
        if (getPostnummer() != null) {
            _hashCode += getPostnummer().hashCode();
        }
        if (getStormodtagerpostnummer() != null) {
            _hashCode += getStormodtagerpostnummer().hashCode();
        }
        if (getKommune() != null) {
            _hashCode += getKommune().hashCode();
        }
        if (getEjerlav() != null) {
            _hashCode += getEjerlav().hashCode();
        }
        if (getEsrejendomsnr() != null) {
            _hashCode += getEsrejendomsnr().hashCode();
        }
        if (getMatrikelnr() != null) {
            _hashCode += getMatrikelnr().hashCode();
        }
        if (getHistorik() != null) {
            _hashCode += getHistorik().hashCode();
        }
        if (getAdgangspunkt() != null) {
            _hashCode += getAdgangspunkt().hashCode();
        }
        if (getVejpunkt() != null) {
            _hashCode += getVejpunkt().hashCode();
        }
        if (getDDKN() != null) {
            _hashCode += getDDKN().hashCode();
        }
        if (getSogn() != null) {
            _hashCode += getSogn().hashCode();
        }
        if (getRegion() != null) {
            _hashCode += getRegion().hashCode();
        }
        if (getRetskreds() != null) {
            _hashCode += getRetskreds().hashCode();
        }
        if (getPolitikreds() != null) {
            _hashCode += getPolitikreds().hashCode();
        }
        if (getOpstillingskreds() != null) {
            _hashCode += getOpstillingskreds().hashCode();
        }
        if (getAfstemningsområde() != null) {
            _hashCode += getAfstemningsområde().hashCode();
        }
        if (getZone() != null) {
            _hashCode += getZone().hashCode();
        }
        if (getJordstykke() != null) {
            _hashCode += getJordstykke().hashCode();
        }
        if (getBebyggelser() != null) {
            _hashCode += getBebyggelser().hashCode();
        }
        if (getBrofast() != null) {
            _hashCode += getBrofast().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Adgangsadresse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "adgangsadresse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("href");
        elemField.setXmlName(new javax.xml.namespace.QName("", "href"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kvh");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kvh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vejstykke");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vejstykke"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "vejstykke"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("husnr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "husnr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("navngivenvej");
        elemField.setXmlName(new javax.xml.namespace.QName("", "navngivenvej"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "navngivenvej"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supplerendebynavn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "supplerendebynavn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supplerendebynavn2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "supplerendebynavn2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postnummer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "postnummer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "postnummer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stormodtagerpostnummer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stormodtagerpostnummer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kommune");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kommune"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "kommune"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ejerlav");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ejerlav"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "ejerlav"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("esrejendomsnr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "esrejendomsnr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matrikelnr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "matrikelnr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("historik");
        elemField.setXmlName(new javax.xml.namespace.QName("", "historik"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "historik"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adgangspunkt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adgangspunkt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "adgangspunkt"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vejpunkt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vejpunkt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "vejpunkt"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DDKN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DDKN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "DDKN"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sogn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sogn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "sogn"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("region");
        elemField.setXmlName(new javax.xml.namespace.QName("", "region"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "region"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retskreds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "retskreds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "region"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("politikreds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "politikreds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "region"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opstillingskreds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "opstillingskreds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "region"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("afstemningsområde");
        elemField.setXmlName(new javax.xml.namespace.QName("", "afstemningsområde"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "region"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jordstykke");
        elemField.setXmlName(new javax.xml.namespace.QName("", "jordstykke"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "jordstykke"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bebyggelser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bebyggelser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "bebyggelser"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("brofast");
        elemField.setXmlName(new javax.xml.namespace.QName("", "brofast"));
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
