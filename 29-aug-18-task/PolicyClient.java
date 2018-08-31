public class PolicyClient{
  public static void main(String args[]){
    Policy p1=new Policy(101,"BirlaSunLife","LifeInsurance",1000,100000,10,60);
    Policy p2=new Policy(102,"NewIndiaInsurance","Motor",1000,100000,10,60);
    Policy.printPolicy(p1,p2);
   

}

}