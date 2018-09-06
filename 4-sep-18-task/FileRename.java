import java.io.*;
public class FileRename{



    public static void main(String args[]){

        
        File f1=new File(args[0]);
        File f2=new File(args[1]);
        if(f1.exists()==false || f1.isDirectory())
         System.out.println("File doesnot exist or it is a directory");
         else if(f1.length()<500)
           System.out.println("file size shoulod be greater than 500");
         else if(f2.exists())
           System.out.println("sorry u cannot rename the file");
        else{
            f1.renameTo(f2);
            System.out.println("file"+" "+args[0]+"to "+args[1]);
    }
}
}