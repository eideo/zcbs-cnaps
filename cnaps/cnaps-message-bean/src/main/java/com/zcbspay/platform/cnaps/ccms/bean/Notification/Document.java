//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.01 at 03:52:55 PM CST 
//


package com.zcbspay.platform.cnaps.ccms.bean.Notification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Document complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Document">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TrblNtfctn" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.803.001.02}TrblNtfctnV01"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "trblNtfctn"
})
public class Document {

    @XmlElement(name = "TrblNtfctn", required = true)
    protected TrblNtfctnV01 trblNtfctn;

    /**
     * Gets the value of the trblNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link TrblNtfctnV01 }
     *     
     */
    public TrblNtfctnV01 getTrblNtfctn() {
        return trblNtfctn;
    }

    /**
     * Sets the value of the trblNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrblNtfctnV01 }
     *     
     */
    public void setTrblNtfctn(TrblNtfctnV01 value) {
        this.trblNtfctn = value;
    }

}