public class BankAccount{
	
private int accountNumber;
private  String accountName;
private int accountBalance;
private static int totalBalance;

public BankAccount(int accountNumber,String accountName){
	
this.accountNumber=accountNumber;
this.accountName=accountName;

}


public BankAccount(int accountNumber,String accountName,int accountBalance){
	
this(accountNumber,accountName);
this.accountBalance=accountBalance;
totalBalance+=totalBalance+this.accountBalance;

}

public void setData(int anumber,String aname,int abal){
	accountNumber=anumber;
	accountName=aname;
	accountBalance=abal;
}


public  static  void setData(BankAccount obj,int anumber,String aname,int abal){
	obj.accountNumber=anumber;
	obj.accountName=aname;
	obj.accountBalance=abal;
}


public void getData(){
	System.out.println("accountNumber:"+accountNumber+" "+"accoutName:"+" "+accountName+"MyBalance:"+" "+accountBalance);
}


public static int calAverage(BankAccount...v){
	int sum=0;
	int count=0;
	int avg=0;
	for(BankAccount tmp:v){
		sum=sum+tmp.accountBalance;
		count++;
	}
avg=sum/count;
return avg;
}

public  void deposit(int money){
	accountBalance+=money;
	totalBalance+=money;
}

public  void withdraw(int money){
	if(accountBalance>=money){
	accountBalance-=money;
	totalBalance-=money;}

	else{
		System.out.println("YOU DONT HAVE SUFFICIENT BALANCE");

	}
}

public boolean compare(BankAccount o1,BankAccount o2){
	boolean flag=true;
	if(o1.accountName!=o2.accountName  || o1.accountNumber!=o2.accountNumber || o1.accountBalance!=o2.accountBalance)
flag=false;
return flag;

}

}