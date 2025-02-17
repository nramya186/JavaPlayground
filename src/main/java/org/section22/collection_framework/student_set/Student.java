package org.section22.collection_framework.student_set;

import java.util.Objects;

public class Student {
    private int stid;
    private String name;
    private int age;

    public Student (int stid,String name, int age){
        this.stid = stid;
        this.name= name;
        this.age = age;
    }

    public int getstid() {
        return stid;
    }

    public Student setStid(int stid) {
        this.stid = stid;
        return this;
    }

    public String getname() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public int getage() {
        return age;
    }

    public Student setAge(int age) {
        this.age = age;
        return this;
    }

    //toString
    @Override
    public String toString(){
        return "Student Id :"+getname() +" Student name: "+ getname() + "age :"+ getage();
    }
    @Override
    public boolean equals(Object o){
        if(this == o)return true;
        if(o == null|| getClass() != o.getClass()) return false;
        Student student =(Student) o;
        return  stid == student.stid;
    }
    //hashcode
    @Override
    public int hashCode(){
        return Objects.hash(getstid());
    }
}
