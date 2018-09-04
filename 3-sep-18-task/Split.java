public class Split{
    public static void main(String args[]){
        String str=args[0];
        int start=0;
        int end=str.length();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==','){
                System.out.println(str.substring(start,i));
                start=i+1;
            }
        }
        System.out.println(str.substring(start));
    }
}