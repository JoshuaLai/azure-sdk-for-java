/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.compute.implementation.api;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for ForceUpdateTagTypes.
 */
public enum ForceUpdateTagTypes {
    /** Enum value RerunExtension. */
    RERUN_EXTENSION("RerunExtension");

    /** The actual serialized value for a ForceUpdateTagTypes instance. */
    private String value;

    ForceUpdateTagTypes(String value) {
        this.value = value;
    }

    /**
     * Gets the serialized value for a ForceUpdateTagTypes instance.
     *
     * @return the serialized value.
     */
    @JsonValue
    public String toValue() {
        return this.value;
    }

    /**
     * Parses a serialized value to a ForceUpdateTagTypes instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ForceUpdateTagTypes object, or null if unable to parse.
     */
    @JsonCreator
    public static ForceUpdateTagTypes fromValue(String value) {
        ForceUpdateTagTypes[] items = ForceUpdateTagTypes.values();
        for (ForceUpdateTagTypes item : items) {
            if (item.toValue().equals(value)) {
                return item;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return toValue();
    }
}
