package com.college.College_Batch.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Student_Batch")

public class Student_Batch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Roll_no")
    private int Roll_no;

    @Column(name = "Name")
    private String Name;

    @Column(name = "Age")
    private int Age;

    @Column(name = "Stream")
    private String Stream;

    @Column(name = "Marks")
    private int Marks;

    public Student_Batch (){

    }

    public Student_Batch(int roll_no, String name, int age, String stream, int marks) {
        Roll_no = roll_no;
        Name = name;
        Age = age;
        Stream = stream;
        Marks = marks;
    }

    public int getRoll_no() {
        return Roll_no;
    }

    public void setRoll_no(int roll_no) {
        Roll_no = roll_no;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getStream() {
        return Stream;
    }

    public void setStream(String stream) {
        Stream = stream;
    }

    public int getMarks() {
        return Marks;
    }

    public void setMarks(int marks) {
        Marks = marks;
    }

    @Override
    public String toString() {
        return "Student_Batch{" +
                "Roll_no=" + Roll_no +
                ", Name='" + Name + '\'' +
                ", Age=" + Age +
                ", Stream='" + Stream + '\'' +
                ", Marks=" + Marks +
                '}';
    }
}
