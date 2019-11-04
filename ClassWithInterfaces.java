package com.practice.general;

interface Interface1 {
    int var = 100;
    Object someMethod(double a);
}

interface Interface2 {
    Object someMethod(double a);
}

class ClassWithInterfaces implements Interface1, Interface2{
    public int var = 900;
    public Integer someMethod (double a) {
        System.out.println("Takes a double");
        return 100;
    }

    public String someMethod (float a) {
        System.out.println("Takes a float");
        return "100";
    }

    public String someMethod (int a) {
        System.out.println("Takes an int");
        return "100";
    }

    public void printItems() {
        System.out.println("This is good: " + var);
    }



    public static void main(String[] args) {
        ClassWithInterfaces ref = new ClassWithInterfaces();
        ref.someMethod(5.0);
        ref.someMethod(3f);
        ref.someMethod(5);
        ref.printItems();
        System.out.println("This is good: " + Interface1.var + Math.PI);

    }

}
