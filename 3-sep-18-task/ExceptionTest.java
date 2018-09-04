public class ExceptionTest{
    public static void main(String args[]){
        MyException obj=new MyException();
        MyException2 obj1=new MyException2();
        try{
            if(args.length==1)
             throw obj;
            else 
             throw obj1;
              
        }
        catch(MyException e){
            e.showerr();
        }
        catch(MyException2 e){
            e.showerr();
        }
    }
}