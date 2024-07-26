package org.example;

import org.example.enums.Plan;

public class Healthplan {
    private String name;
    private int id;
    private Plan plan;

    public Healthplan(int id,String name,Plan plan){
        this.name=name;
        this.id=id;
        this.plan=plan;
    }

    public Plan getPlan(){
        return this.plan;
    }

    public String getName() {
        return name;
    }
    public int getId(){
        return id;
    }
    public Plan getHealthPlans(){
        return this.plan;
    }

    @Override
    public String toString() {
        return "Healthplan{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", plan=" + plan +
                '}';
    }
}
