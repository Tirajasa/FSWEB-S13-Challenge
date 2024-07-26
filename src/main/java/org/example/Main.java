package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        Company idea=new Company(5 ,"ekin",1200000,new String[]{"JavaScript","Java"});
        //System.out.println(idea.addEmployee(2,"adem"));
        System.out.println("Hello world!");
        Employee Computer=new Employee(189803,"Umut Ekin","uekineraydin@gmail.com","asdfghjk",new String[5]);
       // System.out.println(Computer.addHealthplans(3,"Gamze"));

        Plan basicPlan=Plan.BASIC;
        System.out.println(basicPlan.getName());

        Plan goldPlan=Plan.GOLD;
        System.out.println( goldPlan.getPrice());


    }

}