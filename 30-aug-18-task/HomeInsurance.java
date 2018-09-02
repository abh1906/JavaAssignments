public class HomeInsurance extends Insurance{
    private int buildingCost;
    private int applianceCost;
    private String address;
    private int sumAssured;

    public HomeInsurance(int pCode,String pName,int sumAssured,int buildingCost,int applianceCost,String address){
        super(pCode,pName);
        this.sumAssured=sumAssured;
        this.buildingCost=buildingCost;
        this.applianceCost=applianceCost;
        this.address=address;

    }
    public void disp(){

        System.out.println("I am calling from HomeInsurance");

    }
    public void renew(){

        System.out.println("Home Insurance is renewed");
    }



}