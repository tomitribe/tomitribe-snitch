/*
 * Tomitribe Confidential
 *
 * Copyright Tomitribe Corporation. 2023
 *
 * The source code for this program is not published or otherwise divested
 * of its trade secrets, irrespective of what has been deposited with the
 * U.S. Copyright Office.
 */
package com.tomitribe.snitch.annotate.gen;


public class GreenClassBefore {

    private final String string;

    public GreenClassBefore(final String string) {
        this.string = string;
    }

    public static void foo() {
        System.out.println();
    }

}
