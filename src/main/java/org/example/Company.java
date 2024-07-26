package org.example;

import java.util.Arrays;

public class Company {
   private long id;
   private String name;
   private double giro;
   private String[] developerNames;

   public Company( long id,String name,double giro,String[]developerNames) {
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
   public String getName(){
      return this.name;
   }

   public long getId() {
      return id;
   }

   public double getGiro() {
      return giro;
   }

   public String[] getDeveloperNames() {
      return developerNames;
   }

   public void setName(String name) {
      this.name = name;
   }

   public void setId(long id) {
      this.id = id;
   }

   public void setDeveloperNames(String[] developerNames) {
      this.developerNames=developerNames;
   }


   public void setSize(int size){
      String[] developerNames=new String[size];
   }
   public void addEmployee(int index,String name){
   if(index<0){
      System.out.println("Index is not reachable.");
   }else if((index>=developerNames.length)){
      developerNames[index]=null;
      System.out.println("Index is out of bound.");
   }else {
      if (developerNames[index] == null) {
         developerNames[index] = name;
         System.out.println("Developer " + name + " has joined the list");
      } else {
         System.out.println("Index " + index + " already has had a value ");
      }
   }

   }


   @Override
   public String toString() {
      return "Company{" +
              "id=" + id +
              ", name='" + name + '\'' +
              ", giro=" + giro +
              ", developerNames=" + Arrays.toString(developerNames) +
              '}';
   }
}