package org.lightjune.closewiki.prototype.helloworld.dataservice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class HelloRepositoryTest {

    @Mock
    private HelloRepository helloRepository;

    @Test
    public void simpleTest() {
        HelloVO helloVO = new HelloVO();

        when(helloRepository.getHello()).thenReturn(helloVO);

        HelloVO returnHelloVO = helloRepository.getHello();

        assertEquals(returnHelloVO, helloVO);
    }
}