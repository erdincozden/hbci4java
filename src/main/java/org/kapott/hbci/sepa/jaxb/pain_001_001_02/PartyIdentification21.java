
package org.kapott.hbci.sepa.jaxb.pain_001_001_02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PartyIdentification21 complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PartyIdentification21">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Nm" type="{urn:sepade:xsd:pain.001.001.02}Max70Text"/>
 *         &lt;element name="PstlAdr" type="{urn:sepade:xsd:pain.001.001.02}PostalAddress5" minOccurs="0"/>
 *         &lt;element name="Id" type="{urn:sepade:xsd:pain.001.001.02}Party5Choice" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentification21", namespace = "urn:sepade:xsd:pain.001.001.02", propOrder = {
    "nm",
    "pstlAdr",
    "id"
})
public class PartyIdentification21 {

    @XmlElement(name = "Nm", namespace = "urn:sepade:xsd:pain.001.001.02", required = true)
    protected String nm;
    @XmlElement(name = "PstlAdr", namespace = "urn:sepade:xsd:pain.001.001.02")
    protected PostalAddress5 pstlAdr;
    @XmlElement(name = "Id", namespace = "urn:sepade:xsd:pain.001.001.02")
    protected Party5Choice id;

    /**
     * Ruft den Wert der nm-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Legt den Wert der nm-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNm(String value) {
        this.nm = value;
    }

    /**
     * Ruft den Wert der pstlAdr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress5 }
     *     
     */
    public PostalAddress5 getPstlAdr() {
        return pstlAdr;
    }

    /**
     * Legt den Wert der pstlAdr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress5 }
     *     
     */
    public void setPstlAdr(PostalAddress5 value) {
        this.pstlAdr = value;
    }

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Party5Choice }
     *     
     */
    public Party5Choice getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Party5Choice }
     *     
     */
    public void setId(Party5Choice value) {
        this.id = value;
    }

}