package org.example;

import org.example.enums.Plan;

public class Healthplan {
    private String name;
    private long id;
    private Plan plan;

    public Healthplan(String name,long id,Plan plan){
        this.name=name;
        this.id=id;
        this.plan=plan;
    }

    public Plan getPlan(){
        return this.plan;
    }

}
