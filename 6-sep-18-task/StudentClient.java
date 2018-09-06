
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class StudentClient {

   
    
    
    public static void main(String args[]){
        ArrayList <Student> st=new ArrayList<>();
        Student s1=new Student(101,"abhinav",8,100);
        Student s2=new Student(102,"ashish",8,100);
        Student s3=new Student(103,"anand",8,100);
        Student s4=new Student(104,"vashistha",8,100);
        Student s5=new Student(105,"rahul",8,100);
        Student s6=new Student(106,"vijay",8,100);
        Student s7=new Student(107,"akshay",8,100);
        Student s8=new Student(108,"anmol",8,100);
        Student s9=new Student(109,"abhishek",8,100);
        Student s10=new Student(110,"akash",8,100);
        st.add(s1);st.add(s2);
        st.add(s3);st.add(s4);st.add(s5);
        st.add(s6);st.add(s7);st.add(s8);st.add(s9);
        st.add(s10);
        System.out.println(st);
        
    }
    
}
