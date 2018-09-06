import java.io.*;
public class MergeData{
    public static void main(String args[])throws IOException{
     File dir=new File("datasplit/");
     File files[]=dir.listFiles();
     FileOutputStream fos=new FileOutputStream("mergedfile",true);
     int len;
     for(int i=0;i<files.length;i++){
      FileInputStream fin=new FileInputStream(files[i]);
      len=fin.available();
      byte bt[]=new byte[len];
      fin.read(bt);
      fos.write(bt);
      fin.close();
         
     }

    }
}