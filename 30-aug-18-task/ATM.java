public class ATM {
 private ATMCard at;
 public ATM(ATMCard obj){
     at=obj;
 }
 public void insertCard(){
     at.insertCard();
 }
 public void withDrawMoney(int money){
     at.withDrawMoney(money);

 }
public void depositMoney(int money){
    at.depositMoney(money);
}

public void checkBalance(){
    at.checkBalance();
}

public static void main(String args[]){
    ATM ob=new ATM(new ICICIBank("visa","Abhinav Jain",2345,2000));
    ATM ob2=new ATM(new SBI("Master","Madhukar",2223,20000));

    ob.insertCard();
    ob.withDrawMoney(20);
    ob.checkBalance();
    ob.depositMoney(20);
    ob.checkBalance();

    ob2.insertCard();
    ob2.withDrawMoney(20);
    ob2.checkBalance();
    ob2.depositMoney(20);
    ob2.checkBalance();
}

}