public class Split3{
    public static void main(String args[]){
        String ar[]=args[0].split(",");
        int index;
        for(int i=0;i<ar.length;i++){
            index=ar[i].lastIndexOf('.');
            System.out.println(ar[i].substring(index+1));
        }
    }
}