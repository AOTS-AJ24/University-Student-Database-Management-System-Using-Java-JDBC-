package com.studnt.manage;

public class Student_info_1 {
    private int student_id;
    private String student_name;
    private String student_Phone;
    private String student_City;

    //...>These are private fields, which means
    // other classes cannot directly see or change them.

    // Our getter and settters ---------------------------------//
    //why we need -> If fields are public, anyone can change
    // them to anything, even wrong values,
    // e.g., negative ID or empty name.

    //Getters and setters protect the data and allow you to
    // control how values are read or written.







    public String getStudent_City() {
        return student_City;
    }

    public void setStudent_City(String student_City) {
        this.student_City = student_City;
    }

    //getter and setter for student id return type int
    public int getStudent_id(){
        return student_id;
    }

    public void setStudent_id(int student_id){
        this.student_id=student_id;
    }


    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getStudent_Phone() {
        return student_Phone;
    }

    public void setStudent_Phone(String student_Phone) {
        this.student_Phone = student_Phone;
    }

    //Our Parameterised constructor

    public Student_info_1(int student_id, String student_name, String student_Phone, String student_City) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.student_Phone = student_Phone;
        this.student_City = student_City;
    }


    public Student_info_1(String student_name, String student_Phone ,String student_City ){
        this.student_name = student_name;
        this.student_Phone = student_Phone;
//        this.student_name = student_name;
        this.student_City = student_City;
    }


    public Student_info_1() {
//        super(); // write dont write no difference -- what it does
        //super() calls the constructor of the parent class (the class that Student_info_1 extends).
        //If Student_info_1 does not explicitly extend another class, it automatically extends Object (the default parent in Java), so super() calls Object’s constructor.
        // So basically, super(); is checking the parent first, then doing your own work.++

        //It must be the first statement in the constructor if used.
    }

    @Override
    public String toString() {
        return "Student_info_1{" + '\n' +
                "student_id= " + student_id + '\n' +
                "student_name= " + student_name + '\n' +
                "student_Phone= " + student_Phone + '\n' +
                "student_City= " + student_City + '\n' +
                '}';
    }
    //. What is toString()?
    /*In Java, every class is a child of the Object class (even if you don’t write extends Object).
      The Object class has a method called toString().
      By default, it returns something like: com.studnt.manage.Student_info_1@5e91993f
      This is just the class name + memory address (hash code), not very useful.

      So we @Override : We override it to make the output human-readable.

Instead of a memory address, we return meaningful details about the object.

    */
}


