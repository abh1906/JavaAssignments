import java.io.*;

public class MergeData2{
    public static void main(String args[])throws IOException{
        String filename1=args[0];
        String filename2=args[1];
        FileOutputStream fos=new FileOutputStream("merged.txt");
        FileInputStream fin1=new FileInputStream(filename1);
        FileInputStream fin2=new FileInputStream(filename2);
        SequenceInputStream sq=new SequenceInputStream(fin1,fin2);
        int n;
        while((n=sq.read())!=-1){
            fos.write(n);
        }
        sq.close();
        fos.close();
    }
}