/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Student implements Comparable<Student> {
    
    private int rollno;
    private String name;
    private int marks;
    private int sem;

    public Student(int rollno, String name, int sem,int marks) {
        this.rollno = rollno;
        this.name = name;
        this.sem = sem;
        this.marks=marks;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getSem() {
        return sem;
    }

    public void setSem(int sem) {
        this.sem = sem;
    }

    @Override
    public String toString() {
        return "Student{" + "rollno=" + rollno + ", name=" + name + ", marks=" + marks + ", sem=" + sem + '}';
    }

   

    @Override
    public int compareTo(Student o) {
        if(rollno>o.rollno)
            return 1;
        else if(rollno<o.rollno)
            return -1;
        else
        {
            if(marks>o.marks)
                return 1;
            else
                return -1;
        }
    }
    
    
    
    
}
