import java.io.*;
import java.io.FileOutputStream;

public class StoreCities{
    public static void main(String args[]) throws IOException{
     byte ar[]=args[0].getBytes();
     String filename=args[1];
     FileOutputStream fos=new FileOutputStream(filename,true);
     fos.write(ar);
     fos.close();
    }
}