public class Singleton{
    private static Singleton obj;
    private int data;
   private Singleton(int data){
       this.data=data;
   }
   public  static Singleton instantiate(int data){
       if(obj==null){
           obj=new Singleton(data);

       }
       return obj;
   }

}