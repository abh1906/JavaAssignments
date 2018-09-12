public class Employee{
    private int empno;
    private String ename;
    private String type;
    private String dept;
    public Employee(int empno,String ename,String type,String dept){
        this.empno=empno;
        this.ename=ename;
        this.type=type;
        this.dept=dept;
    }
    public void setEmpno(int empno){
        this.empno=empno;
    }
    public void setEname(String ename){
        this.ename=ename;
    }
    public void setDept(String dept){
        this.dept=dept;
    }
    public void setType(String type){
        this.type=type;
    }
    public int getEmpno(){
        return empno;
    }
    public String getEname(){
        return ename;
    }
    public String getDept(){
        return dept;
    }
    public String getType(){
        return type;
    }
    public boolean equals(Object obj) {      
         Employee ob=(Employee)obj;
         if(this==ob)
         return true;
         else
         return false;
    }

}