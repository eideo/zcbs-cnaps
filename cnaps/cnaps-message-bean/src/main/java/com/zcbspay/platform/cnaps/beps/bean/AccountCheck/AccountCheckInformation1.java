//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.01 at 10:08:45 AM CST 
//


package com.zcbspay.platform.cnaps.beps.bean.AccountCheck;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AccountCheckInformation1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountCheckInformation1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChckDt" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.726.001.01}ISODate"/>
 *         &lt;element name="NbOfChckInf1" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.726.001.01}Max8NumericText"/>
 *         &lt;element name="ChckInfDtls1" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.726.001.01}CheckInformationDetails1" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NbOfChckInf2" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.726.001.01}Max8NumericText"/>
 *         &lt;element name="ChckInfDtls2" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.726.001.01}CheckInformationDetails2" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountCheckInformation1", propOrder = {
    "chckDt",
    "nbOfChckInf1",
    "chckInfDtls1",
    "nbOfChckInf2",
    "chckInfDtls2"
})
public class AccountCheckInformation1 {

    @XmlElement(name = "ChckDt", required = true)
    protected XMLGregorianCalendar chckDt;
    @XmlElement(name = "NbOfChckInf1", required = true)
    protected String nbOfChckInf1;
    @XmlElement(name = "ChckInfDtls1")
    protected List<CheckInformationDetails1> chckInfDtls1;
    @XmlElement(name = "NbOfChckInf2", required = true)
    protected String nbOfChckInf2;
    @XmlElement(name = "ChckInfDtls2")
    protected List<CheckInformationDetails2> chckInfDtls2;

    /**
     * Gets the value of the chckDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getChckDt() {
        return chckDt;
    }

    /**
     * Sets the value of the chckDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setChckDt(XMLGregorianCalendar value) {
        this.chckDt = value;
    }

    /**
     * Gets the value of the nbOfChckInf1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNbOfChckInf1() {
        return nbOfChckInf1;
    }

    /**
     * Sets the value of the nbOfChckInf1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNbOfChckInf1(String value) {
        this.nbOfChckInf1 = value;
    }

    /**
     * Gets the value of the chckInfDtls1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chckInfDtls1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChckInfDtls1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CheckInformationDetails1 }
     * 
     * 
     */
    public List<CheckInformationDetails1> getChckInfDtls1() {
        if (chckInfDtls1 == null) {
            chckInfDtls1 = new ArrayList<CheckInformationDetails1>();
        }
        return this.chckInfDtls1;
    }

    /**
     * Gets the value of the nbOfChckInf2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNbOfChckInf2() {
        return nbOfChckInf2;
    }

    /**
     * Sets the value of the nbOfChckInf2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNbOfChckInf2(String value) {
        this.nbOfChckInf2 = value;
    }

    /**
     * Gets the value of the chckInfDtls2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chckInfDtls2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChckInfDtls2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CheckInformationDetails2 }
     * 
     * 
     */
    public List<CheckInformationDetails2> getChckInfDtls2() {
        if (chckInfDtls2 == null) {
            chckInfDtls2 = new ArrayList<CheckInformationDetails2>();
        }
        return this.chckInfDtls2;
    }

}
