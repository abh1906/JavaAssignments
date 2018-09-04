public class Replace{
    public static void main(String args[]){
        char ar[]=args[0].toCharArray();
        for(int i=0;i<ar.length;i++){
            if(ar[i]=='0'|| ar[i]=='1'|| ar[i]=='2'|| ar[i]=='3'|| ar[i]=='4'|| ar[i]=='5'|| ar[i]=='6'|| ar[i]=='7'|| ar[i]=='8'|| ar[i]=='9')
              ar[i]='#';
        }
        String s=new String(ar);
         System.out.println(s);
    }
}