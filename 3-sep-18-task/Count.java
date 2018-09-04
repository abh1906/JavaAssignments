public class Count{
    public static void main(String args[]){
       byte bt[]=args[0].getBytes();
       int countDigits=0;
       int countLower=0;
       int countUpper=0;
       for(int i=0;i<bt.length;i++)
        {
            if(bt[i]>=65 && bt[i] <=90 )
             countUpper++;
             if(bt[i]>=97 && bt[i]<=122)
             countLower++;
             if(bt[i]>=43 && bt[i]<=52)
             countDigits++;
        }
        System.out.println("UpperCase letter:"+" "+countUpper+" "+"lowercase letters:"+" "+countLower+" "+" Digits:"+" "+countDigits);
    }
}