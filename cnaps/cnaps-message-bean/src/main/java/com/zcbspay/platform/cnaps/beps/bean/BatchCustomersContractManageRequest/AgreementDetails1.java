//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.01 at 10:07:19 AM CST 
//


package com.zcbspay.platform.cnaps.beps.bean.BatchCustomersContractManageRequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgreementDetails1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgreementDetails1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChngTpCd" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.392.001.01}ChangeCode1" minOccurs="0"/>
 *         &lt;element name="AgrmtNb" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.392.001.01}Max60Text" minOccurs="0"/>
 *         &lt;element name="Dbtr" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.392.001.01}Debtor1"/>
 *         &lt;element name="DbtrAcct" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.392.001.01}DebtorAccount1"/>
 *         &lt;element name="DbtrAgt" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.392.001.01}DebtorAgent1"/>
 *         &lt;element name="Cdtr" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.392.001.01}Creditor1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgreementDetails1", propOrder = {
    "chngTpCd",
    "agrmtNb",
    "dbtr",
    "dbtrAcct",
    "dbtrAgt",
    "cdtr"
})
public class AgreementDetails1 {

    @XmlElement(name = "ChngTpCd")
    protected ChangeCode1 chngTpCd;
    @XmlElement(name = "AgrmtNb")
    protected String agrmtNb;
    @XmlElement(name = "Dbtr", required = true)
    protected Debtor1 dbtr;
    @XmlElement(name = "DbtrAcct", required = true)
    protected DebtorAccount1 dbtrAcct;
    @XmlElement(name = "DbtrAgt", required = true)
    protected DebtorAgent1 dbtrAgt;
    @XmlElement(name = "Cdtr")
    protected Creditor1 cdtr;

    /**
     * Gets the value of the chngTpCd property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeCode1 }
     *     
     */
    public ChangeCode1 getChngTpCd() {
        return chngTpCd;
    }

    /**
     * Sets the value of the chngTpCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeCode1 }
     *     
     */
    public void setChngTpCd(ChangeCode1 value) {
        this.chngTpCd = value;
    }

    /**
     * Gets the value of the agrmtNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgrmtNb() {
        return agrmtNb;
    }

    /**
     * Sets the value of the agrmtNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgrmtNb(String value) {
        this.agrmtNb = value;
    }

    /**
     * Gets the value of the dbtr property.
     * 
     * @return
     *     possible object is
     *     {@link Debtor1 }
     *     
     */
    public Debtor1 getDbtr() {
        return dbtr;
    }

    /**
     * Sets the value of the dbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Debtor1 }
     *     
     */
    public void setDbtr(Debtor1 value) {
        this.dbtr = value;
    }

    /**
     * Gets the value of the dbtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link DebtorAccount1 }
     *     
     */
    public DebtorAccount1 getDbtrAcct() {
        return dbtrAcct;
    }

    /**
     * Sets the value of the dbtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebtorAccount1 }
     *     
     */
    public void setDbtrAcct(DebtorAccount1 value) {
        this.dbtrAcct = value;
    }

    /**
     * Gets the value of the dbtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link DebtorAgent1 }
     *     
     */
    public DebtorAgent1 getDbtrAgt() {
        return dbtrAgt;
    }

    /**
     * Sets the value of the dbtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebtorAgent1 }
     *     
     */
    public void setDbtrAgt(DebtorAgent1 value) {
        this.dbtrAgt = value;
    }

    /**
     * Gets the value of the cdtr property.
     * 
     * @return
     *     possible object is
     *     {@link Creditor1 }
     *     
     */
    public Creditor1 getCdtr() {
        return cdtr;
    }

    /**
     * Sets the value of the cdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Creditor1 }
     *     
     */
    public void setCdtr(Creditor1 value) {
        this.cdtr = value;
    }

}
