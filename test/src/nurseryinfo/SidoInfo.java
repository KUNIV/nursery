//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.23 at 02:24:39 PM KST 
//


package nurseryinfo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="sidoname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="sigunname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="arcode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "item"
})
@XmlRootElement(name = "response")
public class SidoInfo {

    protected List<SidoInfo.Item> item;

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SidoInfo.Item }
     * 
     * 
     */
    public List<SidoInfo.Item> getItem() {
        if (item == null) {
            item = new ArrayList<SidoInfo.Item>();
        }
        return this.item;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="sidoname" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="sigunname" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="arcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "sidoname",
        "sigunname",
        "arcode"
    })
    public static class Item {

        @XmlElement(required = true)
        protected String sidoname;
        @XmlElement(required = true)
        protected String sigunname;
        protected String arcode;

        /**
         * Gets the value of the sidoname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSidoname() {
            return sidoname;
        }

        /**
         * Sets the value of the sidoname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSidoname(String value) {
            this.sidoname = value;
        }

        /**
         * Gets the value of the sigunname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSigunname() {
            return sigunname;
        }

        /**
         * Sets the value of the sigunname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSigunname(String value) {
            this.sigunname = value;
        }

        /**
         * Gets the value of the arcode property.
         * 
         */
        public String getArcode() {
            return arcode;
        }

        /**
         * Sets the value of the arcode property.
         * 
         */
        public void setArcode(String value) {
            this.arcode = value;
        }

    }

}
