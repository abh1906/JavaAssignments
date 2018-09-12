import java.util.*;
import java.io.*;
public class EmployeeClient{
    public static void main(String args[]){
       ArrayList <Employee> temporaryList=new ArrayList<>();
       ArrayList <Employee> permanentList=new ArrayList<>();
       ArrayList <Employee> totalList=new ArrayList<>();
       int choice;
       Scanner sc=new Scanner(System.in);
       while(true){
           System.out.println("type 1 to add new employee \n 2 to remove employee \n 3 to view permanent employee \n 4 to view temporary employee \n 5 to promote employee \n 6 to exit");
           choice=sc.nextInt();
           switch(choice){
               case 1:
               int empno;
               String ename;
               String dept;
               String type;
               System.out.println("enter employee no.");
               empno=sc.nextInt();
               System.out.println("enter employee name");
               ename=sc.next();
               System.out.println("enter type");
               dept=sc.next();
               System.out.println("enter department");
               type=sc.next();
               Employee emp=new Employee(empno,ename,type,dept);
               if(type.equalsIgnoreCase("temporary")){
                   temporaryList.add(emp);
               }
               else{
                   permanentList.add(emp);
               }
               totalList.add(emp);
               break;
            case 2:System.out.println("enter eno of employee you want to remove");
                  int eno=sc.nextInt();
                  for(Employee tmp:totalList){
                      if(tmp.getEmpno()==eno){
                          String typ=tmp.getType();
                          if(typ.equalsIgnoreCase("temporary")){
                              temporaryList.remove(tmp);
                          }
                          else{
                              permanentList.remove(tmp);
                          }
                          totalList.remove(tmp);
                          break;
                      }
                  }
                  break;
                case 3:
                       for(Employee tmp:permanentList){
                           System.out.println(" "+tmp.getEmpno()+" "+tmp.getEname()+" "+tmp.getType()+" "+tmp.getDept());
                       }
                    break;
                case 4:
                       for(Employee tmp:temporaryList){
                         System.out.println(" "+tmp.getEmpno()+" "+tmp.getEname()+" "+tmp.getType()+" "+tmp.getDept());
                       }
                       break;
                case 5:
                    System.out.println("Enter the eno whom u want to promote");
                    int en=sc.nextInt();
                    for(Employee tmp:totalList){
                        if(tmp.getEmpno()==en){
                            
                            tmp.setType("permanent");
                            permanentList.add(tmp);
                            for(Employee x:temporaryList){
                                if(x.getEmpno()==en){
                                    temporaryList.remove(x);
                                    break;
                                }
                            }
                            break;
                        }

                    }break;
                case 6:System.exit(0);

           }
       }
    }
}