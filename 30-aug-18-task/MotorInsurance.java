public class MotorInsurance extends Insurance{
    private int regNo;
    private int engNo;
    private int sumAssured;
    public MotorInsurance(int pCode,String pName,int sumAssured,int regNo,int engNo){
        super(pCode,pName);
        this.engNo=engNo;
        this.regNo=regNo;
        this.sumAssured=sumAssured;
    }
    public void disp(){

        System.out.println("I am Motor Insurance");

    }
    public void renew(){
        System.out.println(" motor insurance renewed");

    }

}







