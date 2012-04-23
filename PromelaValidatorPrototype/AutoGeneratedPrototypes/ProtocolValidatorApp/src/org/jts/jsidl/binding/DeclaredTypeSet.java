//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.04 at 04:33:14 PM EST 
//


package org.jts.jsidl.binding;

import java.util.ArrayList;
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
 *         &lt;element ref="{urn:jaus:jsidl:1.0}declared_const_set_ref" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:jaus:jsidl:1.0}declared_type_set_ref" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{urn:jaus:jsidl:1.0}message_def"/>
 *           &lt;element ref="{urn:jaus:jsidl:1.0}header"/>
 *           &lt;element ref="{urn:jaus:jsidl:1.0}body"/>
 *           &lt;element ref="{urn:jaus:jsidl:1.0}footer"/>
 *           &lt;element ref="{urn:jaus:jsidl:1.0}array"/>
 *           &lt;element ref="{urn:jaus:jsidl:1.0}record"/>
 *           &lt;element ref="{urn:jaus:jsidl:1.0}list"/>
 *           &lt;element ref="{urn:jaus:jsidl:1.0}variant"/>
 *           &lt;element ref="{urn:jaus:jsidl:1.0}sequence"/>
 *           &lt;element ref="{urn:jaus:jsidl:1.0}fixed_field"/>
 *           &lt;element ref="{urn:jaus:jsidl:1.0}variable_field"/>
 *           &lt;element ref="{urn:jaus:jsidl:1.0}bit_field"/>
 *           &lt;element ref="{urn:jaus:jsidl:1.0}fixed_length_string"/>
 *           &lt;element ref="{urn:jaus:jsidl:1.0}variable_length_string"/>
 *           &lt;element ref="{urn:jaus:jsidl:1.0}variable_length_field"/>
 *           &lt;element ref="{urn:jaus:jsidl:1.0}variable_format_field"/>
 *           &lt;element ref="{urn:jaus:jsidl:1.0}declared_message_def"/>
 *           &lt;element ref="{urn:jaus:jsidl:1.0}declared_event_def"/>
 *           &lt;element ref="{urn:jaus:jsidl:1.0}declared_header"/>
 *           &lt;element ref="{urn:jaus:jsidl:1.0}declared_body"/>
 *           &lt;element ref="{urn:jaus:jsidl:1.0}declared_footer"/>
 *           &lt;element ref="{urn:jaus:jsidl:1.0}declared_list"/>
 *           &lt;element ref="{urn:jaus:jsidl:1.0}declared_sequence"/>
 *           &lt;element ref="{urn:jaus:jsidl:1.0}declared_variant"/>
 *           &lt;element ref="{urn:jaus:jsidl:1.0}declared_record"/>
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
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="version" type="{urn:jaus:jsidl:1.0}version_num" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "declaredConstSetRef",
    "declaredTypeSetRef",
    "messageDefOrHeaderOrBody"
})
@XmlRootElement(name = "declared_type_set")
public class DeclaredTypeSet {

    @XmlElement(name = "declared_const_set_ref")
    protected java.util.List<DeclaredConstSetRef> declaredConstSetRef;
    @XmlElement(name = "declared_type_set_ref")
    protected java.util.List<DeclaredTypeSetRef> declaredTypeSetRef;
    @XmlElements({
        @XmlElement(name = "footer", type = Footer.class),
        @XmlElement(name = "declared_array", type = DeclaredArray.class),
        @XmlElement(name = "declared_message_def", type = DeclaredMessageDef.class),
        @XmlElement(name = "sequence", type = Sequence.class),
        @XmlElement(name = "declared_variable_length_string", type = DeclaredVariableLengthString.class),
        @XmlElement(name = "record", type = Record.class),
        @XmlElement(name = "array", type = Array.class),
        @XmlElement(name = "list", type = org.jts.jsidl.binding.List.class),
        @XmlElement(name = "message_def", type = MessageDef.class),
        @XmlElement(name = "variable_length_field", type = VariableLengthField.class),
        @XmlElement(name = "declared_event_def", type = DeclaredEventDef.class),
        @XmlElement(name = "declared_variable_field", type = DeclaredVariableField.class),
        @XmlElement(name = "variant", type = Variant.class),
        @XmlElement(name = "declared_body", type = DeclaredBody.class),
        @XmlElement(name = "fixed_length_string", type = FixedLengthString.class),
        @XmlElement(name = "declared_footer", type = DeclaredFooter.class),
        @XmlElement(name = "variable_field", type = VariableField.class),
        @XmlElement(name = "declared_sequence", type = DeclaredSequence.class),
        @XmlElement(name = "declared_variable_format_field", type = DeclaredVariableFormatField.class),
        @XmlElement(name = "declared_bit_field", type = DeclaredBitField.class),
        @XmlElement(name = "bit_field", type = BitField.class),
        @XmlElement(name = "declared_header", type = DeclaredHeader.class),
        @XmlElement(name = "declared_list", type = DeclaredList.class),
        @XmlElement(name = "fixed_field", type = FixedField.class),
        @XmlElement(name = "declared_fixed_length_string", type = DeclaredFixedLengthString.class),
        @XmlElement(name = "declared_fixed_field", type = DeclaredFixedField.class),
        @XmlElement(name = "declared_variant", type = DeclaredVariant.class),
        @XmlElement(name = "variable_length_string", type = VariableLengthString.class),
        @XmlElement(name = "declared_record", type = DeclaredRecord.class),
        @XmlElement(name = "header", type = Header.class),
        @XmlElement(name = "declared_variable_length_field", type = DeclaredVariableLengthField.class),
        @XmlElement(name = "body", type = Body.class),
        @XmlElement(name = "variable_format_field", type = VariableFormatField.class)
    })
    protected java.util.List<Object> messageDefOrHeaderOrBody;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "id")
    @XmlSchemaType(name = "anyURI")
    protected String id;
    @XmlAttribute(name = "version")
    protected String version;

    /**
     * Gets the value of the declaredConstSetRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the declaredConstSetRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeclaredConstSetRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeclaredConstSetRef }
     * 
     * 
     */
    public java.util.List<DeclaredConstSetRef> getDeclaredConstSetRef() {
        if (declaredConstSetRef == null) {
            declaredConstSetRef = new ArrayList<DeclaredConstSetRef>();
        }
        return this.declaredConstSetRef;
    }

    /**
     * Gets the value of the declaredTypeSetRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the declaredTypeSetRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeclaredTypeSetRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeclaredTypeSetRef }
     * 
     * 
     */
    public java.util.List<DeclaredTypeSetRef> getDeclaredTypeSetRef() {
        if (declaredTypeSetRef == null) {
            declaredTypeSetRef = new ArrayList<DeclaredTypeSetRef>();
        }
        return this.declaredTypeSetRef;
    }

    /**
     * Gets the value of the messageDefOrHeaderOrBody property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messageDefOrHeaderOrBody property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessageDefOrHeaderOrBody().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Footer }
     * {@link DeclaredArray }
     * {@link DeclaredMessageDef }
     * {@link Sequence }
     * {@link DeclaredVariableLengthString }
     * {@link Record }
     * {@link Array }
     * {@link org.jts.jsidl.binding.List }
     * {@link MessageDef }
     * {@link VariableLengthField }
     * {@link DeclaredEventDef }
     * {@link DeclaredVariableField }
     * {@link Variant }
     * {@link DeclaredBody }
     * {@link FixedLengthString }
     * {@link DeclaredFooter }
     * {@link VariableField }
     * {@link DeclaredSequence }
     * {@link DeclaredVariableFormatField }
     * {@link DeclaredBitField }
     * {@link BitField }
     * {@link DeclaredHeader }
     * {@link DeclaredList }
     * {@link FixedField }
     * {@link DeclaredFixedLengthString }
     * {@link DeclaredFixedField }
     * {@link DeclaredVariant }
     * {@link VariableLengthString }
     * {@link DeclaredRecord }
     * {@link Header }
     * {@link DeclaredVariableLengthField }
     * {@link Body }
     * {@link VariableFormatField }
     * 
     * 
     */
    public java.util.List<Object> getMessageDefOrHeaderOrBody() {
        if (messageDefOrHeaderOrBody == null) {
            messageDefOrHeaderOrBody = new ArrayList<Object>();
        }
        return this.messageDefOrHeaderOrBody;
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
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
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
