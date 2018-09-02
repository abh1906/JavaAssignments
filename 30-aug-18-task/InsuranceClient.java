public class InsuranceClient{
 public static void main(String args []){
     HealthInsurance hoj=new HealthInsurance(100, "accidental", 100000, 200, 1000,1000);
     HomeInsurance hmj=new HomeInsurance(200, "GHARdhanYojana", 200000, 50000,200,"palasia");
     MotorInsurance moj=new MotorInsurance(300,"vahansaharati", 100000, 13229, 13221);
     LifeInsurance loj=new LifeInsurance(400, "jeevan sarthi", 10000, 20000, "cod", 5, "Abhinav jain");
     hoj.renew();
     hoj.disp();
     hmj.renew();
     hmj.disp();
     moj.renew();
     moj.disp();
     loj.renew();
     loj.disp();
 }

}