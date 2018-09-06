import java.io.*;
import java.util.*;
public class EmployeeData{
    public static void main(String args[])throws IOException,ClassNotFoundException{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter 1 to display employee detaits, 2 to store employee details");
    int choice =sc.nextInt();
    switch(choice){
        case 1:
        String name;
        int eno;
        int sal;
        int deptno;
        String desg;
        System.out.println("Enter your Eno");
        eno=sc.nextInt();
        System.out.println("Enter your name");
        name=sc.next();
        System.out.println("Enter your sal");
        sal=sc.nextInt();
        System.out.println("Enter your deptno");
        deptno=sc.nextInt();
        System.out.println("Enter your Designation");
        desg=sc.next();
        Employee emp=new Employee(name,eno,sal,desg,deptno);
        FileOutputStream fos=new FileOutputStream("employees.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(emp);
        fos.close();
        oos.close();
        System.out.println("Details stored");
        break;
        case 2:
        FileInputStream fin=new FileInputStream("employees.txt");
        ObjectInputStream oin=new ObjectInputStream(fin);
        Employee employee=(Employee)oin.readObject();
        System.out.println("Employee details");
        System.out.println("Name:"+employee.getName()+" "+"Eno:"+employee.getEno()+" "+"Salary:"+employee.getSal()+" "+"Designation:"+employee.getDesg()+" "+"Departmentno:"+employee.getDeptno());
         fin.close();
         oin.close();
    }
    
    }
}