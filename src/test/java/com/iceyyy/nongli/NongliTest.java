package com.iceyyy.nongli;

import org.junit.Test;

/**
 * 农历测试
 */
public class NongliTest {
    @Test
    public void nongli() {
        String date = "20170101";
        String str = NongLi.getDate(date);
        System.out.println(str);
    }
}
