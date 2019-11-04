package com.practice.general;

public class SuperClass {
    private int var;
    public SuperClass(int var) {

        this.var = var;
    }

    public int getVar(){

        return this.var;
    }

}

class SubClass extends SuperClass {

    SubClass() {
        super(55);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass();
        System.out.println("This is from SuperClass: " + obj.getVar());
    }


}