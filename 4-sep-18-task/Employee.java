import java.io.Serializable;

public class Employee implements Serializable{
    private String name;
    private int eno;
    private int sal;
    private String desg;
    private int deptno;
    public Employee(String name,int eno,int sal,String desg,int deptno){
        this.name=name;
        this.eno=eno;
        this.sal=sal;
        this.desg=desg;
        this.deptno=deptno;
    }
    public void setEno(int eno){
        this.eno=eno;

    }
    public void setName(String name){
        this.name=name;}
    public void setSal(int sal){
        this.sal=sal;
    }
    public void setDesg(String desg){
        this.desg=desg;
    }
    public void setDeptNo(int deptno){
        this.deptno=deptno;
    }

    public int getSal(){
        return sal;
    }
    public String getName(){
        return name;
    }
    public String getDesg(){
        return desg;
    }
    public int getEno(){
        return eno;
    }
    public int getDeptno(){
        return deptno;
    }
}