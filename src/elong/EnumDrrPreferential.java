//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.29 at 04:46:48 PM CST 
//


package elong;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumDrrPreferential.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumDrrPreferential">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Cash"/>
 *     &lt;enumeration value="Scale"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumDrrPreferential")
@XmlEnum
public enum EnumDrrPreferential {

    @XmlEnumValue("Cash")
    Cash("Cash"),
    @XmlEnumValue("Scale")
    Scale("Scale");
    private final String value;

    EnumDrrPreferential(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumDrrPreferential fromValue(String v) {
        for (EnumDrrPreferential c: EnumDrrPreferential.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
