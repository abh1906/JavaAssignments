
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class StudentSort2 {
    
    public static void main(String args[]){
         ArrayList <Student> st=new ArrayList<>();
        Student s1=new Student(101,"abhinav",8,10);
        Student s2=new Student(102,"ashish",8,100);
        Student s3=new Student(103,"anand",8,1);
        Student s4=new Student(104,"vashistha",8,59);
        Student s5=new Student(105,"rahul",8,59);
        st.add(s1);st.add(s2);
        st.add(s3);st.add(s4);st.add(s5);
        Collections.sort(st, new Comparator<Student>(){
             @Override
             public int compare(Student o1, Student o2) {
                 //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                 return o1.getName().compareTo(o2.getName());
             }
            
        }
        );
    }
    
}
