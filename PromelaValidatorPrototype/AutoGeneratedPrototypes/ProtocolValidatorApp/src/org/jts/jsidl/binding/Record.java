//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.04 at 04:33:14 PM EST 
//


package org.jts.jsidl.binding;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;


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
 *         &lt;element ref="{urn:jaus:jsidl:1.0}presence_vector" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element ref="{urn:jaus:jsidl:1.0}array"/>
 *           &lt;element ref="{urn:jaus:jsidl:1.0}fixed_field"/>
 *           &lt;element ref="{urn:jaus:jsidl:1.0}variable_field"/>
 *           &lt;element ref="{urn:jaus:jsidl:1.0}bit_field"/>
 *           &lt;element ref="{urn:jaus:jsidl:1.0}fixed_length_string"/>
 *           &lt;element ref="{urn:jaus:jsidl:1.0}variable_length_string"/>
 *           &lt;element ref="{urn:jaus:jsidl:1.0}variable_length_field"/>
 *           &lt;element ref="{urn:jaus:jsidl:1.0}variable_format_field"/>
 *           &lt;element ref="{urn:jaus:jsidl:1.0}declared_array"/>
 *           &lt;element ref="{urn:jaus:jsidl:1.0}declared_fixed_field"/>
 *           &lt;element ref="{urn:jaus:jsidl:1.0}declared_variable_field"/>
 *           &lt;element ref="{urn:jaus:jsidl:1.0}declared_bit_field"/>
 *           &lt;element ref="{urn:jaus:jsidl:1.0}declared_fixed_length_string"/>
 *           &lt;element ref="{urn:jaus:jsidl:1.0}declared_variable_length_string"/>
 *           &lt;element ref="{urn:jaus:jsidl:1.0}declared_variable_length_field"/>
 *           &lt;element ref="{urn:jaus:jsidl:1.0}declared_variable_format_field"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{urn:jaus:jsidl:1.0}identifier" />
 *       &lt;attribute name="optional" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="interpretation" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "presenceVector",
    "arrayOrFixedFieldOrVariableField"
})
@XmlRootElement(name = "record")
public class Record {

    @XmlElement(name = "presence_vector")
    protected PresenceVector presenceVector;
    @XmlElements({
        @XmlElement(name = "declared_variable_field", type = DeclaredVariableField.class),
        @XmlElement(name = "declared_variable_length_field", type = DeclaredVariableLengthField.class),
        @XmlElement(name = "declared_variable_length_string", type = DeclaredVariableLengthString.class),
        @XmlElement(name = "declared_fixed_length_string", type = DeclaredFixedLengthString.class),
        @XmlElement(name = "variable_format_field", type = VariableFormatField.class),
        @XmlElement(name = "variable_field", type = VariableField.class),
        @XmlElement(name = "fixed_field", type = FixedField.class),
        @XmlElement(name = "declared_array", type = DeclaredArray.class),
        @XmlElement(name = "declared_variable_format_field", type = DeclaredVariableFormatField.class),
        @XmlElement(name = "declared_fixed_field", type = DeclaredFixedField.class),
        @XmlElement(name = "bit_field", type = BitField.class),
        @XmlElement(name = "variable_length_string", type = VariableLengthString.class),
        @XmlElement(name = "array", type = Array.class),
        @XmlElement(name = "declared_bit_field", type = DeclaredBitField.class),
        @XmlElement(name = "fixed_length_string", type = FixedLengthString.class),
        @XmlElement(name = "variable_length_field", type = VariableLengthField.class)
    })
    protected List<Object> arrayOrFixedFieldOrVariableField;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "optional", required = true)
    protected boolean optional;
    @XmlAttribute(name = "interpretation")
    @XmlSchemaType(name = "anySimpleType")
    protected String interpretation;

    /**
     * Gets the value of the presenceVector property.
     * 
     * @return
     *     possible object is
     *     {@link PresenceVector }
     *     
     */
    public PresenceVector getPresenceVector() {
        return presenceVector;
    }

    /**
     * Sets the value of the presenceVector property.
     * 
     * @param value
     *     allowed object is
     *     {@link PresenceVector }
     *     
     */
    public void setPresenceVector(PresenceVector value) {
        this.presenceVector = value;
    }

    /**
     * Gets the value of the arrayOrFixedFieldOrVariableField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arrayOrFixedFieldOrVariableField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrayOrFixedFieldOrVariableField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeclaredVariableField }
     * {@link DeclaredVariableLengthField }
     * {@link DeclaredVariableLengthString }
     * {@link DeclaredFixedLengthString }
     * {@link VariableFormatField }
     * {@link VariableField }
     * {@link FixedField }
     * {@link DeclaredArray }
     * {@link DeclaredVariableFormatField }
     * {@link DeclaredFixedField }
     * {@link BitField }
     * {@link VariableLengthString }
     * {@link Array }
     * {@link DeclaredBitField }
     * {@link FixedLengthString }
     * {@link VariableLengthField }
     * 
     * 
     */
    public List<Object> getArrayOrFixedFieldOrVariableField() {
        if (arrayOrFixedFieldOrVariableField == null) {
            arrayOrFixedFieldOrVariableField = new ArrayList<Object>();
        }
        return this.arrayOrFixedFieldOrVariableField;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the optional property.
     * 
     */
    public boolean isOptional() {
        return optional;
    }

    /**
     * Sets the value of the optional property.
     * 
     */
    public void setOptional(boolean value) {
        this.optional = value;
    }

    /**
     * Gets the value of the interpretation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterpretation() {
        return interpretation;
    }

    /**
     * Sets the value of the interpretation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterpretation(String value) {
        this.interpretation = value;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        String[] ignore={"interpretation"};
		return EqualsBuilder.reflectionEquals(this, that, ignore);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

}
