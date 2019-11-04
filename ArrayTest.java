package com.practice.general;

class StackImpl {

}

class SafeStackImpl extends StackImpl {

}
public class ArrayTest {
    public static void main(String[] args) {
        StackImpl[] stackImplArray = new SafeStackImpl[2];
        stackImplArray[0] = new SafeStackImpl();
        //stackImplArray[1] = new StackImpl();
        //Object obj = new Object();
        //String s = (String)obj;
        Integer iRef = null;
        int i = iRef;

    }
}
