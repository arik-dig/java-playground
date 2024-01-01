package com.digma.arik.servicey;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VarioTest {

    @Test
    public void xyzTest() {

    }

    @Test
    public void failOnPurpose() {
        assertEquals("a", "b");
    }

    @Test
    public void abcTest() {

    }

    @Test
    public void unexpectedErrorOnPurpose() {
        throw new RuntimeException("so called unexpected");
    }

}
