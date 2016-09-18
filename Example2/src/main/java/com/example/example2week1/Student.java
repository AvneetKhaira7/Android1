package com.example.example2week1;
import java.io.Serializable;
/**
 * Created by Avneet Kaur(300858244) on 2016-09-16
 */
public class Student implements Serializable {

    private String name, program, course;
    private int sem;

    public Student (String name, String program, String course, int sem){
            this.name = name;
            this.program = program;
            this.course = course;
            this.sem = sem;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getSem() {
        return sem;
    }

    public void setSem(int sem) {
        this.sem = sem;
    }

}
