public class Palindrome2{
    public static void  main(String args[]){
        int len=args[0].length();
        char ar[]=args[0].toCharArray();
        int start=0;
        int end=len;
        int flag=1;
        if(len%2==0){
            while(start<end){
                if(ar[start]!=ar[end])
                 {
                     flag=0;
                     break;
                 }
                start++;
                end--;
            }}
        else{
            while(start<=end){
                if(ar[start]!=ar[end]){
                    flag=0;
                    break;
                }
                start++;
                end--;
            }
        }
        if(flag==1)
         System.out.println("It is a palindrome");
        else
         System.out.println("It is not a palindrome");
        }
    }
