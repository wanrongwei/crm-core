/**
 * AKSopenSoap_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.rki;

public interface AKSopenSoap_PortType extends java.rmi.Remote {

    /**
     * Udfører tilmelding af enhed og returnerer persondata samt evt.
     * registreringer.
     */
    public com.asiainfo.crm.inter.exe.webservice.client.rki.TilmeldData tilmeldPerson(java.lang.String aksnoegle, java.lang.String akskode, java.lang.String brugernavn, java.lang.String password, java.lang.String referenceNummer, java.lang.String navn, java.lang.String adresse, java.lang.String postnummer, java.lang.String koen, java.lang.String foedselsdato, java.lang.String CPRnummer) throws java.rmi.RemoteException;

    /**
     * Udfører tilmelding af person på id nummer.
     */
    public com.asiainfo.crm.inter.exe.webservice.client.rki.TilmeldData tilmeldPersonId(java.lang.String aksnoegle, java.lang.String akskode, java.lang.String brugernavn, java.lang.String password, java.lang.String referencenummer, java.lang.String stamkortnummer) throws java.rmi.RemoteException;

    /**
     * Udfører tilmelding af enhed og returnerer firmadata samt evt.
     * registreringer.
     */
    public com.asiainfo.crm.inter.exe.webservice.client.rki.TilmeldData tilmeldFirma(java.lang.String aksnoegle, java.lang.String akskode, java.lang.String brugernavn, java.lang.String password, java.lang.String referenceNummer, java.lang.String navn, java.lang.String adresse, java.lang.String postnummer, java.lang.String CVRnummer) throws java.rmi.RemoteException;

    /**
     * Udfører tilmelding af en enhed og returnerer firmadata samt
     * evt. registreringer.
     */
    public com.asiainfo.crm.inter.exe.webservice.client.rki.TilmeldData tilmeldFirmaKob(java.lang.String aksnoegle, java.lang.String akskode, java.lang.String brugernavn, java.lang.String password, java.lang.String referenceNummer, java.lang.String KOBnummer) throws java.rmi.RemoteException;

    /**
     * Udfører tilmelding af en enhed og returnerer firmadata samt
     * evt. registreringer.
     */
    public com.asiainfo.crm.inter.exe.webservice.client.rki.TilmeldData tilmeldFirmaCVR(java.lang.String aksnoegle, java.lang.String akskode, java.lang.String brugernavn, java.lang.String password, java.lang.String referenceNummer, java.lang.String CVRnummer) throws java.rmi.RemoteException;

    /**
     * Udfører tilmelding af person- eller firma og returnerer persondata
     * eller firmadata samt evt. registreringer.
     */
    public com.asiainfo.crm.inter.exe.webservice.client.rki.TilmeldData tilmeldUbestemt(java.lang.String aksnoegle, java.lang.String akskode, java.lang.String brugernavn, java.lang.String password, java.lang.String referenceNummer, java.lang.String navn, java.lang.String adresse, java.lang.String postnummer) throws java.rmi.RemoteException;

    /**
     * Udfører tjek for ændringer på tilmeldte enheder.
     */
    public com.asiainfo.crm.inter.exe.webservice.client.rki.TjekListe tjek(java.lang.String aksnoegle, java.lang.String akskode, java.lang.String brugernavn, java.lang.String password) throws java.rmi.RemoteException;

    /**
     * Henter supplerende oplysninger på en enhed.
     */
    public com.asiainfo.crm.inter.exe.webservice.client.rki.HentData hent(java.lang.String aksnoegle, java.lang.String akskode, java.lang.String brugernavn, java.lang.String password, java.lang.String referencenummer) throws java.rmi.RemoteException;

    /**
     * Henter statistik på monitorering.
     */
    public com.asiainfo.crm.inter.exe.webservice.client.rki.StatistikData statistik(java.lang.String aksnoegle, java.lang.String akskode, java.lang.String brugernavn, java.lang.String password) throws java.rmi.RemoteException;

    /**
     * Udfører afmelding af en enhed.
     */
    public com.asiainfo.crm.inter.exe.webservice.client.rki.AfmeldData afmeld(java.lang.String akskode, java.lang.String brugernavn, java.lang.String password, java.lang.String referencenummer) throws java.rmi.RemoteException;

    /**
     * Kvitterer for ændringer modtaget og behandlet af kunden.
     */
    public com.asiainfo.crm.inter.exe.webservice.client.rki.EffektueretData effektueret(java.lang.String aksnoegle, java.lang.String akskode, java.lang.String brugernavn, java.lang.String password, java.lang.String referencenummer, java.lang.String beskedId) throws java.rmi.RemoteException;
}
