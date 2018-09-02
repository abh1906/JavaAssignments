public class Insurance{

protected int pCode;
protected String pName;

public Insurance(int pCode,String pName){
   this.pCode=pCode;
   this.pName=pName;

}

public void disp(){
System.out.println("pcode:"+" "+pCode+" "+"pname:"+" "+pName);

}

public void renew(){

    System.out.println("hello from Insurance renew");
}

}