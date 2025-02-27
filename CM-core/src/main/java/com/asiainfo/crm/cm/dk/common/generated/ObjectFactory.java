//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.15 at 10:45:24 ���� CST 
//


package com.asiainfo.crm.cm.dk.common.generated;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _StreetBuildingIdentifier_QNAME = new QName("", "StreetBuildingIdentifier");
    private final static QName _MovementChangeIndicator_QNAME = new QName("", "MovementChangeIndicator");
    private final static QName _StreetCode_QNAME = new QName("", "StreetCode");
    private final static QName _SubscriptionListCompleteIndicator_QNAME = new QName("", "SubscriptionListCompleteIndicator");
    private final static QName _DanishTelephoneNumberIdentifier_QNAME = new QName("", "DanishTelephoneNumberIdentifier");
    private final static QName _TelephoneServiceTypeCode_QNAME = new QName("", "TelephoneServiceTypeCode");
    private final static QName _OrganizationName_QNAME = new QName("", "OrganizationName");
    private final static QName _StreetNameForAddressingName_QNAME = new QName("", "StreetNameForAddressingName");
    private final static QName _SubscriptionListOfficialOnlyIndicator_QNAME = new QName("", "SubscriptionListOfficialOnlyIndicator");
    private final static QName _LookupDateTime_QNAME = new QName("", "LookupDateTime");
    private final static QName _MovementTypeCode_QNAME = new QName("", "MovementTypeCode");
    private final static QName _SerialNumberIdentifier_QNAME = new QName("", "SerialNumberIdentifier");
    private final static QName _MunicipalityCode_QNAME = new QName("", "MunicipalityCode");
    private final static QName _PostCodeIdentifier_QNAME = new QName("", "PostCodeIdentifier");
    private final static QName _PersonSurnameName_QNAME = new QName("", "PersonSurnameName");
    private final static QName _StreetName_QNAME = new QName("", "StreetName");
    private final static QName _DistrictSubdivisionIdentifier_QNAME = new QName("", "DistrictSubdivisionIdentifier");
    private final static QName _DistrictName_QNAME = new QName("", "DistrictName");
    private final static QName _PersonGivenName_QNAME = new QName("", "PersonGivenName");
    private final static QName _AnonymousPrepaidIndicator_QNAME = new QName("", "AnonymousPrepaidIndicator");
    private final static QName _TelephoneSpecificUsageCode_QNAME = new QName("", "TelephoneSpecificUsageCode");
    private final static QName _MovementDate_QNAME = new QName("", "MovementDate");
    private final static QName _TelephoneSubscriberProtectionCode_QNAME = new QName("", "TelephoneSubscriberProtectionCode");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TelephoneSubscription }
     * 
     */
    public TelephoneSubscription createTelephoneSubscription() {
        return new TelephoneSubscription();
    }

    /**
     * Create an instance of {@link TelePhoneSubscriptionList }
     * 
     */
    public TelePhoneSubscriptionList createTelePhoneSubscriptionList() {
        return new TelePhoneSubscriptionList();
    }

    /**
     * Create an instance of {@link AddressComplete }
     * 
     */
    public AddressComplete createAddressComplete() {
        return new AddressComplete();
    }

    /**
     * Create an instance of {@link TransactionInfo }
     * 
     */
    public TransactionInfo createTransactionInfo() {
        return new TransactionInfo();
    }

    /**
     * Create an instance of {@link PersonNameStructure }
     * 
     */
    public PersonNameStructure createPersonNameStructure() {
        return new PersonNameStructure();
    }

    /**
     * Create an instance of {@link AddressPostal }
     * 
     */
    public AddressPostal createAddressPostal() {
        return new AddressPostal();
    }

    /**
     * Create an instance of {@link TelephoneSubscriptionAddress }
     * 
     */
    public TelephoneSubscriptionAddress createTelephoneSubscriptionAddress() {
        return new TelephoneSubscriptionAddress();
    }

    /**
     * Create an instance of {@link TelephoneSubscriber }
     * 
     */
    public TelephoneSubscriber createTelephoneSubscriber() {
        return new TelephoneSubscriber();
    }

    /**
     * Create an instance of {@link Specification }
     * 
     */
    public Specification createSpecification() {
        return new Specification();
    }

    /**
     * Create an instance of {@link SecondaryPostalLabel }
     * 
     */
    public SecondaryPostalLabel createSecondaryPostalLabel() {
        return new SecondaryPostalLabel();
    }

    /**
     * Create an instance of {@link TelephoneSubscriptionCollection }
     * 
     */
    public TelephoneSubscriptionCollection createTelephoneSubscriptionCollection() {
        return new TelephoneSubscriptionCollection();
    }

    /**
     * Create an instance of {@link AddressAccess }
     * 
     */
    public AddressAccess createAddressAccess() {
        return new AddressAccess();
    }

    /**
     * Create an instance of {@link SpecialInfo }
     * 
     */
    public SpecialInfo createSpecialInfo() {
        return new SpecialInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "StreetBuildingIdentifier")
    public JAXBElement<BigInteger> createStreetBuildingIdentifier(BigInteger value) {
        return new JAXBElement<BigInteger>(_StreetBuildingIdentifier_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MovementChangeIndicator")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createMovementChangeIndicator(String value) {
        return new JAXBElement<String>(_MovementChangeIndicator_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "StreetCode")
    public JAXBElement<BigInteger> createStreetCode(BigInteger value) {
        return new JAXBElement<BigInteger>(_StreetCode_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SubscriptionListCompleteIndicator")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSubscriptionListCompleteIndicator(String value) {
        return new JAXBElement<String>(_SubscriptionListCompleteIndicator_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DanishTelephoneNumberIdentifier")
    public JAXBElement<BigInteger> createDanishTelephoneNumberIdentifier(BigInteger value) {
        return new JAXBElement<BigInteger>(_DanishTelephoneNumberIdentifier_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TelephoneServiceTypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTelephoneServiceTypeCode(String value) {
        return new JAXBElement<String>(_TelephoneServiceTypeCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "OrganizationName")
    public JAXBElement<String> createOrganizationName(String value) {
        return new JAXBElement<String>(_OrganizationName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "StreetNameForAddressingName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createStreetNameForAddressingName(String value) {
        return new JAXBElement<String>(_StreetNameForAddressingName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SubscriptionListOfficialOnlyIndicator")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSubscriptionListOfficialOnlyIndicator(String value) {
        return new JAXBElement<String>(_SubscriptionListOfficialOnlyIndicator_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LookupDateTime")
    public JAXBElement<String> createLookupDateTime(String value) {
        return new JAXBElement<String>(_LookupDateTime_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MovementTypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createMovementTypeCode(String value) {
        return new JAXBElement<String>(_MovementTypeCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SerialNumberIdentifier")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSerialNumberIdentifier(String value) {
        return new JAXBElement<String>(_SerialNumberIdentifier_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MunicipalityCode")
    public JAXBElement<BigInteger> createMunicipalityCode(BigInteger value) {
        return new JAXBElement<BigInteger>(_MunicipalityCode_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PostCodeIdentifier")
    public JAXBElement<BigInteger> createPostCodeIdentifier(BigInteger value) {
        return new JAXBElement<BigInteger>(_PostCodeIdentifier_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PersonSurnameName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPersonSurnameName(String value) {
        return new JAXBElement<String>(_PersonSurnameName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "StreetName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createStreetName(String value) {
        return new JAXBElement<String>(_StreetName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DistrictSubdivisionIdentifier")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDistrictSubdivisionIdentifier(String value) {
        return new JAXBElement<String>(_DistrictSubdivisionIdentifier_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DistrictName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDistrictName(String value) {
        return new JAXBElement<String>(_DistrictName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PersonGivenName")
    public JAXBElement<String> createPersonGivenName(String value) {
        return new JAXBElement<String>(_PersonGivenName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AnonymousPrepaidIndicator")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAnonymousPrepaidIndicator(String value) {
        return new JAXBElement<String>(_AnonymousPrepaidIndicator_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TelephoneSpecificUsageCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTelephoneSpecificUsageCode(String value) {
        return new JAXBElement<String>(_TelephoneSpecificUsageCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MovementDate")
    public JAXBElement<BigInteger> createMovementDate(BigInteger value) {
        return new JAXBElement<BigInteger>(_MovementDate_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TelephoneSubscriberProtectionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTelephoneSubscriberProtectionCode(String value) {
        return new JAXBElement<String>(_TelephoneSubscriberProtectionCode_QNAME, String.class, null, value);
    }

}
