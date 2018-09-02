public class LifeInsurance extends Insurance{

private int minSumAssured;
private int maxSumAssured;
private String paymentMode;
private int policyTerm;
private String nominee;

public LifeInsurance(int pCode,String pName,int minSumAssured,int maxSumAssured,String paymentMode,int policyTerm,String nominee){
    super(pCode,pName);
    this.minSumAssured=minSumAssured;
    this.maxSumAssured=maxSumAssured;
    this.paymentMode=paymentMode;
    this.policyTerm=policyTerm;
    this.nominee=nominee;
}

public void disp(){
System.out.println("pcode:"+" "+pCode+" "+"pname:"+" "+pName+" "+"minSumAssured:"+" "+minSumAssured+" "+"maxSumAssured:"+" "+maxSumAssured+" "+"policyTerm:"+


" " +policyTerm+" "+"nominee"+"  "+nominee);

}

public void renew(){
System.out.println("Renewing");
}

}