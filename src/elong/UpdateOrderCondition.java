//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.11 at 04:02:01 PM CST 
//


package elong;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement; 
import java.util.List; 
import com.alibaba.fastjson.annotation.JSONField;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import java.util.Date;


/**
 * <p>Java class for UpdateOrderCondition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateOrderCondition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="RoomTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RatePlanId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ArrivalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DepartureDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="NumberOfRooms" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NumberOfCustomers" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TotalPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="EarliestArrivalTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="LatestArrivalTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Contact" type="{}Contact" minOccurs="0"/>
 *         &lt;element name="IsGuaranteeOrCharged" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CreditCard" type="{}CreditCard" minOccurs="0"/>
 *         &lt;element name="OrderRooms" type="{}ArrayOfCreateOrderRoom" minOccurs="0"/>
 *         &lt;element name="IsForceGuarantee" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="NoteToHotel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateOrderCondition", propOrder = {
    "orderId",
    "roomTypeId",
    "ratePlanId",
    "arrivalDate",
    "departureDate",
    "numberOfRooms",
    "numberOfCustomers",
    "totalPrice",
    "earliestArrivalTime",
    "latestArrivalTime",
    "contact",
    "isGuaranteeOrCharged",
    "creditCard",
    "orderRooms",
    "isForceGuarantee",
    "noteToHotel"
})
public class UpdateOrderCondition {

    @JSONField(name = "OrderId")
    protected long orderId;
    @JSONField(name = "RoomTypeId")
    protected String roomTypeId;
    @JSONField(name = "RatePlanId")
    protected int ratePlanId;
    @JSONField(name = "ArrivalDate")
    @XmlSchemaType(name = "dateTime")
    protected java.util.Date arrivalDate;
    @JSONField(name = "DepartureDate")
    @XmlSchemaType(name = "dateTime")
    protected java.util.Date departureDate;
    @JSONField(name = "NumberOfRooms")
    protected int numberOfRooms;
    @JSONField(name = "NumberOfCustomers")
    protected int numberOfCustomers;
    @JSONField(name = "TotalPrice")
    protected BigDecimal totalPrice;
    @JSONField(name = "EarliestArrivalTime")
    @XmlSchemaType(name = "dateTime")
    protected java.util.Date earliestArrivalTime;
    @JSONField(name = "LatestArrivalTime")
    @XmlSchemaType(name = "dateTime")
    protected java.util.Date latestArrivalTime;
    @JSONField(name = "Contact")
    protected Contact contact;
    @JSONField(name = "IsGuaranteeOrCharged")
    protected boolean isGuaranteeOrCharged;
    @JSONField(name = "CreditCard")
    protected CreditCard creditCard;
    @JSONField(name = "OrderRooms")
    protected List<CreateOrderRoom> orderRooms;
    @JSONField(name = "IsForceGuarantee")
    protected Boolean isForceGuarantee;
    @JSONField(name = "NoteToHotel")
    protected String noteToHotel;

    /**
     * Gets the value of the orderId property.
     * 
     */
    public long getOrderId() {
        return orderId;
    }

    /**
     * Sets the value of the orderId property.
     * 
     */
    public void setOrderId(long value) {
        this.orderId = value;
    }

    /**
     * Gets the value of the roomTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomTypeId() {
        return roomTypeId;
    }

    /**
     * Sets the value of the roomTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomTypeId(String value) {
        this.roomTypeId = value;
    }

    /**
     * Gets the value of the ratePlanId property.
     * 
     */
    public int getRatePlanId() {
        return ratePlanId;
    }

    /**
     * Sets the value of the ratePlanId property.
     * 
     */
    public void setRatePlanId(int value) {
        this.ratePlanId = value;
    }

    /**
     * Gets the value of the arrivalDate property.
     * 
     * @return
     *     possible object is
     *     {@link java.util.Date }
     *     
     */
    public java.util.Date getArrivalDate() {
        return arrivalDate;
    }

    /**
     * Sets the value of the arrivalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.util.Date }
     *     
     */
    public void setArrivalDate(java.util.Date value) {
        this.arrivalDate = value;
    }

    /**
     * Gets the value of the departureDate property.
     * 
     * @return
     *     possible object is
     *     {@link java.util.Date }
     *     
     */
    public java.util.Date getDepartureDate() {
        return departureDate;
    }

    /**
     * Sets the value of the departureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.util.Date }
     *     
     */
    public void setDepartureDate(java.util.Date value) {
        this.departureDate = value;
    }

    /**
     * Gets the value of the numberOfRooms property.
     * 
     */
    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    /**
     * Sets the value of the numberOfRooms property.
     * 
     */
    public void setNumberOfRooms(int value) {
        this.numberOfRooms = value;
    }

    /**
     * Gets the value of the numberOfCustomers property.
     * 
     */
    public int getNumberOfCustomers() {
        return numberOfCustomers;
    }

    /**
     * Sets the value of the numberOfCustomers property.
     * 
     */
    public void setNumberOfCustomers(int value) {
        this.numberOfCustomers = value;
    }

    /**
     * Gets the value of the totalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    /**
     * Sets the value of the totalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalPrice(BigDecimal value) {
        this.totalPrice = value;
    }

    /**
     * Gets the value of the earliestArrivalTime property.
     * 
     * @return
     *     possible object is
     *     {@link java.util.Date }
     *     
     */
    public java.util.Date getEarliestArrivalTime() {
        return earliestArrivalTime;
    }

    /**
     * Sets the value of the earliestArrivalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.util.Date }
     *     
     */
    public void setEarliestArrivalTime(java.util.Date value) {
        this.earliestArrivalTime = value;
    }

    /**
     * Gets the value of the latestArrivalTime property.
     * 
     * @return
     *     possible object is
     *     {@link java.util.Date }
     *     
     */
    public java.util.Date getLatestArrivalTime() {
        return latestArrivalTime;
    }

    /**
     * Sets the value of the latestArrivalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.util.Date }
     *     
     */
    public void setLatestArrivalTime(java.util.Date value) {
        this.latestArrivalTime = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link Contact }
     *     
     */
    public Contact getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact }
     *     
     */
    public void setContact(Contact value) {
        this.contact = value;
    }

    /**
     * Gets the value of the isGuaranteeOrCharged property.
     * 
     */
    public boolean isIsGuaranteeOrCharged() {
        return isGuaranteeOrCharged;
    }

    /**
     * Sets the value of the isGuaranteeOrCharged property.
     * 
     */
    public void setIsGuaranteeOrCharged(boolean value) {
        this.isGuaranteeOrCharged = value;
    }

    /**
     * Gets the value of the creditCard property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCard }
     *     
     */
    public CreditCard getCreditCard() {
        return creditCard;
    }

    /**
     * Sets the value of the creditCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCard }
     *     
     */
    public void setCreditCard(CreditCard value) {
        this.creditCard = value;
    }

    /**
     * Gets the value of the orderRooms property.
     * 
     * @return
     *     possible object is
     *     {@link List<CreateOrderRoom> }
     *     
     */
    public List<CreateOrderRoom> getOrderRooms() {
        return orderRooms;
    }

    /**
     * Sets the value of the orderRooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link List<CreateOrderRoom> }
     *     
     */
    public void setOrderRooms(List<CreateOrderRoom> value) {
        this.orderRooms = value;
    }

    /**
     * Gets the value of the isForceGuarantee property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsForceGuarantee() {
        return isForceGuarantee;
    }

    /**
     * Sets the value of the isForceGuarantee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsForceGuarantee(Boolean value) {
        this.isForceGuarantee = value;
    }

    /**
     * Gets the value of the noteToHotel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteToHotel() {
        return noteToHotel;
    }

    /**
     * Sets the value of the noteToHotel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteToHotel(String value) {
        this.noteToHotel = value;
    }

}
