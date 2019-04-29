/*
 *  Copyright 2007-2008, Plutext Pty Ltd.
 *   
 *  This file is part of docx4j.

    docx4j is licensed under the Apache License, Version 2.0 (the "License"); 
    you may not use this file except in compliance with the License. 

    You may obtain a copy of the License at 

        http://www.apache.org/licenses/LICENSE-2.0 

    Unless required by applicable law or agreed to in writing, software 
    distributed under the License is distributed on an "AS IS" BASIS, 
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
    See the License for the specific language governing permissions and 
    limitations under the License.

 */


package org.docx4j.dml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_TextCapsType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_TextCapsType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="none"/&gt;
 *     &lt;enumeration value="small"/&gt;
 *     &lt;enumeration value="all"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_TextCapsType")
@XmlEnum
public enum STTextCapsType {


    /**
     * 
     * 						Text Caps Enum ( None )
     * 					
     * 
     */
    @XmlEnumValue("none")
    NONE("none"),

    /**
     * 
     * 						Text Caps Enum ( Small )
     * 					
     * 
     */
    @XmlEnumValue("small")
    SMALL("small"),

    /**
     * 
     * 						Text Caps Enum ( All )
     * 					
     * 
     */
    @XmlEnumValue("all")
    ALL("all");
    private final String value;

    STTextCapsType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STTextCapsType fromValue(String v) {
        for (STTextCapsType c: STTextCapsType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
