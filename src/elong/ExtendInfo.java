//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.29 at 04:46:48 PM CST 
//


package elong;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement; 
import java.util.List; 
import com.alibaba.fastjson.annotation.JSONField;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExtendInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtendInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="String1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="String2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="String3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Int1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Int2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Int3" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PartnerParameter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtendInfo", propOrder = {
    "string1",
    "string2",
    "string3",
    "int1",
    "int2",
    "int3",
    "partnerParameter"
})
public class ExtendInfo {

    @JSONField(name = "String1")
    protected String string1;
    @JSONField(name = "String2")
    protected String string2;
    @JSONField(name = "String3")
    protected String string3;
    @JSONField(name = "Int1")
    protected int int1;
    @JSONField(name = "Int2")
    protected int int2;
    @JSONField(name = "Int3")
    protected int int3;
    @JSONField(name = "PartnerParameter")
    protected String partnerParameter;

    /**
     * Gets the value of the string1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getString1() {
        return string1;
    }

    /**
     * Sets the value of the string1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setString1(String value) {
        this.string1 = value;
    }

    /**
     * Gets the value of the string2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getString2() {
        return string2;
    }

    /**
     * Sets the value of the string2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setString2(String value) {
        this.string2 = value;
    }

    /**
     * Gets the value of the string3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getString3() {
        return string3;
    }

    /**
     * Sets the value of the string3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setString3(String value) {
        this.string3 = value;
    }

    /**
     * Gets the value of the int1 property.
     * 
     */
    public int getInt1() {
        return int1;
    }

    /**
     * Sets the value of the int1 property.
     * 
     */
    public void setInt1(int value) {
        this.int1 = value;
    }

    /**
     * Gets the value of the int2 property.
     * 
     */
    public int getInt2() {
        return int2;
    }

    /**
     * Sets the value of the int2 property.
     * 
     */
    public void setInt2(int value) {
        this.int2 = value;
    }

    /**
     * Gets the value of the int3 property.
     * 
     */
    public int getInt3() {
        return int3;
    }

    /**
     * Sets the value of the int3 property.
     * 
     */
    public void setInt3(int value) {
        this.int3 = value;
    }

    /**
     * Gets the value of the partnerParameter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerParameter() {
        return partnerParameter;
    }

    /**
     * Sets the value of the partnerParameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerParameter(String value) {
        this.partnerParameter = value;
    }

}
