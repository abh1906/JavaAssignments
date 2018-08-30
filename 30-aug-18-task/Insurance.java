public class Insurance{

private int pCode;
private String pName;

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