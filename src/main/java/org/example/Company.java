package org.example;

public class Company {
   private long id;
   private String name;
   private double giro;
   private String[] developerNames;

   public Company(long id, String name,double giro,String[]developerNames) {
   this.id=id;
   this.name=name;
   this.giro=giro;
   this.developerNames=developerNames;
   checkAndSetGiro(this.giro);
   }
   public void checkAndSetGiro(double giro){
      if(giro<0){
         this.giro=0;
      }

   }
   public void setSize(int size){
      String[] developerNames=new String[size];
   }
   public void addEmployee(int index,String name){
   if(index<0||index>=developerNames.length){
      System.out.println("Index is out of bound.");
   }
   if(developerNames[index]==null){
      developerNames[index]=name;
      System.out.println("Developer "+name+"has joined the list");
   }else {
      System.out.println("Index " + index +"already has had a value ");
   }
   }




}