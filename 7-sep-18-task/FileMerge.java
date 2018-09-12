

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;



public class FileMerge {
    public static void main(String args[]) throws FileNotFoundException, IOException{
        Vector<FileInputStream> list=new Vector<>();
        for(int i=0;i<args.length;i++){
            list.add(new FileInputStream(new File(args[i])));
            }
        Enumeration en=list.elements();
        SequenceInputStream sin=new SequenceInputStream(en);
        int n=sin.available();
        byte bt[]=new byte[n];
        sin.read(bt);
        FileOutputStream fos=new FileOutputStream("merged.txt");
        fos.write(bt);
        sin.close();
        fos.close();
        
        
    }
    
}
