public class ICICIBank implements ATMCard{
    private String schemeName;
    private String customerName;
    private int pin;
    private int availableBalance;

    public ICICIBank(String schemeName,String customerName,int pin,int availableBalance){
        this.schemeName=schemeName;
        this.customerName=customerName;
        this.pin=pin;
        this.availableBalance=availableBalance;
    }
    public void insertCard(){
        System.out.println("Your ICICI CARD IS INSERTED"+" "+"MR/Ms"+" "+customerName);
    }
    public void depositMoney(int money){
        System.out.println("The amount :"+ " "+money+" "+"is credited in your account");
        availableBalance+=money;

    }
    public void withDrawMoney(int money){
        if(money<=availableBalance)
         {
             System.out.println("The amount :"+" "+money+" is credited from your account");
             availableBalance-=money;
         }
         else{
             System.out.println("Sorry Insufficient funds");

         }
    }
    public void checkBalance(){
        System.out.println("Available balanace in account is :"+availableBalance);
    }

}