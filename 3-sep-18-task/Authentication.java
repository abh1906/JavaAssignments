import javax.lang.model.util.ElementScanner6;

public class Authentication{
    public static void main(String args[]){
        String username=args[0];
        String password=args[1];
        if(username.equalsIgnoreCase("indore") && password.equals("india"))
          System.out.println("welcome user");
        else if(username.equalsIgnoreCase("indore") && password.equals("india")==false)
          System.out.println("password is incorrect");
        else if(username.equals("indore")==false && password.equals("india"))
        System.out.println("username is incorrect");
        else 
         System.out.println("invalid username and password");
         
    }
}