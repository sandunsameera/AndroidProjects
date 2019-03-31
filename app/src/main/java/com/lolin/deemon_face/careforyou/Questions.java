package com.lolin.deemon_face.careforyou;

public class Questions {

    public String name,details;

    public Questions(){

    }

    public Questions(String name,String details){
        this.name = name;
        this.details = details;
    }

    public String getName(){
        return name;
    }

    public String getDetails(){
        return details;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDetails(String details){
        this.details = details;
    }
}
