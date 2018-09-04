public class Palindrome1{
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder(args[0]);
        StringBuilder sb1=new StringBuilder(args[0]);
        sb=sb.reverse();
        if(sb.toString().equals(sb1.toString()))
         System.out.println("It is a palindrome");
        else
         System.out.println("It is not a palindrome");
    }
}