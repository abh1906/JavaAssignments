import java.io.*;
public class CopyData{

    public static void main(String args[]) throws IOException{
        String filename=args[0];
        String filename2=args[1];
        File f=new File(filename);
        FileInputStream fin=new FileInputStream(f);
        FileOutputStream fos=new FileOutputStream(filename2);
        int n;
        if(f.exists()==false){
            System.out.println("file doesnot exists");
        }
        while((n=fin.read())!=-1)
           fos.write(n);
    
    fin.close();
    fos.close();

}
}