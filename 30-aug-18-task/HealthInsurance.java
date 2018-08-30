public class HealthInsurance extends Insurance{


    private int sumAssured;
    private int rentPerDay;
    private int preHosp;
    private int postHosp;

    public HealthInsurance(int pCode,String pName,int sumAssured,int rentPerDay,int preHosp,int postHosp){
       super(pCode,pName);
       this.sumAssured=sumAssured;
       this.rentPerDay=rentPerDay;
       this.preHosp=preHosp;
       this.postHosp=postHosp;
    }

    public void disp(){
       System.out.println("pcode:"+pCode+" "+"pName:"+pName+" "+"sumAssured:"+sumAssured+" "+"rentperday:"+rentPerDay+" "+"preHosp:"+preHosp+" "+"postHosp:"+postHosp);   
   }

public void renew(){

    System.out.println("renewing from health");
}



}