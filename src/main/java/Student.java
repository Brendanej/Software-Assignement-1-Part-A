/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brend
 */
public class Student {
    //Initializing Variables and Strings
    private String name;
    private String DOB;
    private int age;
    private String username;
    private int ID;
  
    //Constructor
    public Student(String name, int age,String DOB, int ID) {
        this.name = name;
        this.DOB = DOB;
        this.age = age;
        this.ID = ID;
    }

    //Getters
    public String getName() {
        return name;
    }

    public String getDOB() {
        return DOB;
    }

    public int getAge() {
        return age;
    }
    
    public String getUsername() {
        //Making and assigning String Username
        this.username = name + age;
        return username;
    }

    public int getID() {
        return ID;
    }

}



