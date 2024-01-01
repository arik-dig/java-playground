package com.digma.arik.servicek;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class JamminTest {

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
