//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.01 at 10:07:45 AM CST 
//


package com.zcbspay.platform.cnaps.beps.bean.BatchCustomersAccountQueryResponse;

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
 *         &lt;element name="BtchCstmrsAcctQryRspn" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.395.001.01}BatchCustomersAccountQueryResponse"/>
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
    "btchCstmrsAcctQryRspn"
})
public class Document {

    @XmlElement(name = "BtchCstmrsAcctQryRspn", required = true)
    protected BatchCustomersAccountQueryResponse btchCstmrsAcctQryRspn;

    /**
     * Gets the value of the btchCstmrsAcctQryRspn property.
     * 
     * @return
     *     possible object is
     *     {@link BatchCustomersAccountQueryResponse }
     *     
     */
    public BatchCustomersAccountQueryResponse getBtchCstmrsAcctQryRspn() {
        return btchCstmrsAcctQryRspn;
    }

    /**
     * Sets the value of the btchCstmrsAcctQryRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchCustomersAccountQueryResponse }
     *     
     */
    public void setBtchCstmrsAcctQryRspn(BatchCustomersAccountQueryResponse value) {
        this.btchCstmrsAcctQryRspn = value;
    }

}
