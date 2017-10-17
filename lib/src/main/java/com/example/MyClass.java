package com.example;


import java.util.Calendar;

public class MyClass {
    public static void main(String[] s){
        Calendar ca=Calendar.getInstance();
        ca.setTimeInMillis(1476326441183L);
        System.out.println("cur,HOUR="+ca.get(Calendar.HOUR_OF_DAY)+"  MIN="+ca.get(Calendar.MINUTE)+"year="+ca.get(Calendar.YEAR));
        Calendar ca2=Calendar.getInstance();
        ca2.setTimeInMillis(1507862400000L);
        System.out.println("time,HOUR="+ca2.get(Calendar.HOUR_OF_DAY)+"  MIN="+ca2.get(Calendar.MINUTE)+"year="+ca2.get(Calendar.YEAR));
        Calendar ca3=Calendar.getInstance();
        System.out.println("time,HOUR="+ca3.get(Calendar.HOUR_OF_DAY)+"  MIN="+ca3.get(Calendar.MINUTE)+"year="+ca3.get(Calendar.YEAR));
    }
}
