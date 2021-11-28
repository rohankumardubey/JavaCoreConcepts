package com.company.JUnit;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit {
    @Test
    public void sampleTest(){
        String a = "rohan";
        assertEquals(a,"rohan");
    }

    @Test
    public void sampleTest2(){
        String b = "ron";
        assertEquals(b,"ron");
    }
}
