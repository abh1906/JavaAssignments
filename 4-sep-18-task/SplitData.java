import java.io.*;
public class SplitData{
    public static void main(String args[])throws IOException{
      String filename=args[0];
      int n=Integer.parseInt(args[1]);
      File f=new File(filename);
      long len=f.length();
      long remainder =len%n;
      long num=len/n;
      int i;
      
      byte bt[]=new byte[(int)num];
      File dir=new File("datasplit");
      dir.mkdir();
      if(f.exists()==false)
       System.out.println("file doesnot exists");
       else{
      FileInputStream fin=new FileInputStream(f);
      for( i=0;i<n;i++){
          FileOutputStream fout =new FileOutputStream("datasplit/"+"data"+i+".txt");
          fin.read(bt);
          fout.write(bt);
          fout.close();
      }
      if(fin.available()>0){
        FileOutputStream fout =new FileOutputStream("datasplit/"+"data"+i+".txt");
       
        byte b[]=new byte[(int)remainder];
        fin.read(b);
        fout.write(b);
      }
      fin.close();



    }
}}