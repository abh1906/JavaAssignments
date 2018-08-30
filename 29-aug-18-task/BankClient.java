import java.util.*;

public class BankClient{
	

public static void main(String args[]){
	
BankAccount  c1=new BankAccount(101,"abhinav_jain",100000);
c1.setData(101,"abhinav_jain",1);
BankAccount.setData(c1,101,"abhinav_jain",100000);
c1.deposit(10000);
c1.withdraw(2000);

BankAccount  c2=new BankAccount(102,"madhukar",100000);

System.out.println(BankAccount.calAverage(c1,c2));



}




}