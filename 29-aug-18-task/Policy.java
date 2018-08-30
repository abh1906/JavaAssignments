public class Policy{
private int pCode;
private String pName;
private String pType;
 private int minAmount;
 private  int maxAmount;
 private int  lAge;
private int hAge;

public 	Policy(int pCode,String pName,String pType,int minAmount,int maxAmount,int lAge,int hAge ){
	
this.pCode=pCode;
this.pName=pName;
this.pType=pType;
this.minAmount=minAmount;
this.maxAmount=minAmount;
this.lAge=lAge;
this.hAge=hAge;

}

public void printPolicy(Policy ...v){
	
Policy tmp;
for(tmp:v){
	
System.out.println("POLICY_CODE"+" "+tmp.pCode+"POLICY_NAME:"+" "+tmp.pName+"PTYPE:"+"  "+tmp.pType+"MIN_AMOUNT"+" "+tmp.minAccount+"MAX_ACOUNT"+" "+tmp.maxAccount+"LOWER_AGE"+" "+tmp.lAge+"HIGHER_VALUE"+" "+tmp.hAge);

}


public void setData(int pCode,String pName,String pType,int minAmount,int maxAmount,int lAge,int hAge ){
	this.pCode=pCode;
this.pName=pName;
this.pType=pType;
this.minAmount=minAmount;
this.maxAmount=minAmount;
this.lAge=lAge;
this.hAge=hAge;
}

}





