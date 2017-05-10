package com.duowan.domain;

/**
 * Created by zengjie on 17/5/10.
 */
public class User {

    private Integer id;

    private String name;

    private String age;


    public User(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getAge() {
        return age;
    }
}

