package com.digma.arik;

import net.spy.memcached.internal.OperationFuture;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;

public class MemcachedTest {

    @Test
    public void test_OperationFuture() {
        System.out.println("start");
        OperationFuture<Boolean> mockedFuture = mock(OperationFuture.class);

        System.out.println("end");
    }

}
