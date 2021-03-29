package com.lanyou;

import org.junit.Test;

import java.util.UUID;

public class TestBase {
    @Test
    public void testUUId() {
        UUID uuid = UUID.randomUUID();
        System.out.println(uuid.toString());

    }
}
