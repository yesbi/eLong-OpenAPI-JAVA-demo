//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.11 at 04:02:01 PM CST 
//


package elong;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement; 
import java.util.List; 
import com.alibaba.fastjson.annotation.JSONField;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GuaranteeRule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GuaranteeRule">
 *   &lt;complexContent>
 *     &lt;extension base="{}BaseGuaranteeRule">
 *       &lt;sequence>
 *         &lt;element name="GuranteeRuleId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuaranteeRule", propOrder = {
    "guranteeRuleId"
})
public class GuaranteeRule
    extends BaseGuaranteeRule
{

    @JSONField(name = "GuranteeRuleId")
    protected int guranteeRuleId;

    /**
     * Gets the value of the guranteeRuleId property.
     * 
     */
    public int getGuranteeRuleId() {
        return guranteeRuleId;
    }

    /**
     * Sets the value of the guranteeRuleId property.
     * 
     */
    public void setGuranteeRuleId(int value) {
        this.guranteeRuleId = value;
    }

}
