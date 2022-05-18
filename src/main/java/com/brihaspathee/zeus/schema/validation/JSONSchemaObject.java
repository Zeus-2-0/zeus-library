package com.brihaspathee.zeus.schema.validation;

import lombok.*;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 21, February 2022
 * Time: 2:10 PM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.schema.validation
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class JSONSchemaObject<E> {

    private E schemaObject;

    @Override
    public String toString() {
        return "JSONSchemaObject{" +
                "schemaObject=" + schemaObject +
                '}';
    }
}
