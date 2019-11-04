package com.practice.general;
public class VarArgsDemo {

    public static void main(String ... args) {
        int day = 1;
        String month = "March";
        int year = 2009;
        Object[] dateInfo = {day, month, year};
        //System.out.println("data: " + args + "\nlength: " + args.length);
        flexiPrint();
        flexiPrint(day);
        flexiPrint(month);
        flexiPrint(day, month, year);
        flexiPrint(dateInfo);
        flexiPrint((Object)dateInfo); //makes sense
        flexiPrint(new Object[] {dateInfo}); //makes sense
        //System.out.println("Type: " + args.getClass().getName());
        //System.out.println("Length: " + args.length);

        flexiPrint(args);


    }
    private static void flexiPrint(Object ... data) {
        System.out.println("Type: " + data.getClass().getName());
        System.out.println("Length: " + data.length);
        System.out.println("Printing data type of individual elements:");
        for(Object o: data)
            System.out.println(o.getClass().getName());
        System.out.println("------");

    }
}
