package org.example;

import org.example.enums.Plan;

public class Employee {
   private int id;
   private String fullName;
   private String email;
   private String password;
   private String[] healthPlans;

   public Employee(int id,String fullName,String email,String password,String[] healthplans){
       this.id=id;
       this.fullName=fullName;
       this.email=email;
       this.password=password;
       this.healthPlans=healthplans;

   }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }
    public String getPassword(){
        return password;
    }

    public String[] getHealthPlans() {
        return this.healthPlans;
    }



   public void addHealthPlan(int index, String name) {
    // String[] healthplans=new String[4];
     //Plan[] healthplans={Plan.BASIC,Plan.PREMIUM,Plan.GOLD,Plan.PLATINIUM};
      // for(int=0;i<Pla)

       if(( index<0 )|| (index>healthPlans.length)){
         System.out.println("Index is out of bound!!!");

     }else {

         if (healthPlans[index] == null) {
             healthPlans[index] = name;
             System.out.println("Name " + name + " has been added to the list");

         } else {
             System.out.println("The index " + " is already occupied!");

         }

     }
       //return name;
   }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", healthplans=" + healthPlans +
                '}';
    }
}
