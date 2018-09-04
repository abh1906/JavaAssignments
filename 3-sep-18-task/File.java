public class File{
    public static void main(String args[]){
        StringBuffer str=new StringBuffer(args[0]);
        int index=str.lastIndexOf(".");
        String ar=str.substring(0,index);
         ar=ar+".enc";
         System.out.println(ar);
        
    }
}