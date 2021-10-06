package com.company;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListTest {
    Methods<String> strings = new ArrayList< >();

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        for(int i=0;i<10;i++){
            String str=Integer.toString(i);
            strings.add(str);
        }
    }

    @org.junit.jupiter.api.Test
    void add() {
        strings.add("abc");
        strings.add("abcfas");
    }

    @org.junit.jupiter.api.Test
    void delete() {
        strings.delete(5);
    }

    @org.junit.jupiter.api.Test
    void get() {
        System.out.println(strings.get(3));
    }

}