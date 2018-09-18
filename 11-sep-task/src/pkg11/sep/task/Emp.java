/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11.sep.task;

/**
 *
 * @author Abhinav
 */
public class Emp {
    private int eno;
    private String ename;
    private int sal;
    private int deptno;
    

public Emp(int eno,String ename,int sal,int deptno){
    this.eno=eno;
    this.ename=ename;
    this.sal=sal;
    this.deptno=deptno;
}

    public int getEno() {
        return eno;
    }

    public void setEno(int eno) {
        this.eno = eno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

}