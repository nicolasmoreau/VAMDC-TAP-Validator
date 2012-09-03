//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.03.29 at 03:46:39 PM CEST 
//


package org.vamdc.validator.report.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for blockType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="blockType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="atom"/>
 *     &lt;enumeration value="atomState"/>
 *     &lt;enumeration value="molecule"/>
 *     &lt;enumeration value="moleculeState"/>
 *     &lt;enumeration value="particle"/>
 *     &lt;enumeration value="solid"/>
 *     &lt;enumeration value="collision"/>
 *     &lt;enumeration value="radiative"/>
 *     &lt;enumeration value="nonradiative"/>
 *     &lt;enumeration value="source"/>
 *     &lt;enumeration value="method"/>
 *     &lt;enumeration value="function"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "blockType")
@XmlEnum
public enum BlockType {

    @XmlEnumValue("atom")
    ATOM("atom"),
    @XmlEnumValue("atomState")
    ATOM_STATE("atomState"),
    @XmlEnumValue("molecule")
    MOLECULE("molecule"),
    @XmlEnumValue("moleculeState")
    MOLECULE_STATE("moleculeState"),
    @XmlEnumValue("particle")
    PARTICLE("particle"),
    @XmlEnumValue("solid")
    SOLID("solid"),
    @XmlEnumValue("collision")
    COLLISION("collision"),
    @XmlEnumValue("radiative")
    RADIATIVE("radiative"),
    @XmlEnumValue("nonradiative")
    NONRADIATIVE("nonradiative"),
    @XmlEnumValue("source")
    SOURCE("source"),
    @XmlEnumValue("method")
    METHOD("method"),
    @XmlEnumValue("function")
    FUNCTION("function");
    private final String value;

    BlockType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BlockType fromValue(String v) {
        for (BlockType c: BlockType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}