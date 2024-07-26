package org.example;

public class Employee {
   private long id;
   private String fullName;
   private String email;
   private String password;
   private String[] healthplans;

   public Employee(long id,String fullName,String email,String password,String[] healthplans){
       this.id=id;
       this.fullName=fullName;
       this.email=email;
       this.password=password;
       this.healthplans=healthplans;

   }
    public String[] developerNames=new String[4];

   public void  addHealthplans(int index,String name) {
     if( index<0||index>healthplans.length){
         System.out.println("Index is out of bound!!!");
     }

       if(healthplans[index]==null){
           healthplans[index]=name;
           System.out.println("Name "+ name+ "has been added to the list");

       }else {
           System.out.println("The index "+"is already occupied!");;
       }


   }













}
