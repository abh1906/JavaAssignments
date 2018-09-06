import java.io.*;
public class DisplayFile{
    public static void main(String args[]) throws IOException{
     String filename=args[0];
     File f=new File(filename);
     FileInputStream fin= new FileInputStream( filename);
     int n;
     while((n=fin.read())!=-1){
         System.out.print((char)n);
     }

     fin.close();
     f.delete();
    }
}