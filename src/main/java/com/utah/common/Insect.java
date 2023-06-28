package com.utah.common;

/**
 * @author zhuyin
 * @title Insect
 * @description TODO
 * @date 2022/5/30 14:31
 */
public class Insect {
    int i = 9;
    int j;

    Insect() {
        prt("i = " + i + ", j = " + j);
        j = 39;
    }

    static int x1 =
            prt("static Insect.x1 initialized");

    static int prt(String s) {
        System.out.println(s);
        return 47;
    }
}
