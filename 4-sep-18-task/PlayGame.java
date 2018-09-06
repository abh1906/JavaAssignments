import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class PlayGame{
    public static void main(String args[])throws IOException,ClassNotFoundException{
        int choice =Integer.parseInt(args[0]);
        int x=Integer.parseInt(args[1]);
        int y=Integer.parseInt(args[2]);
        int z=Integer.parseInt(args[3]);
        ThreeDimGame game=null;
        switch(choice){
            case 1:
               FileInputStream fin=new FileInputStream("objects.txt");
               ObjectInputStream oin=new ObjectInputStream(fin);
               game=(ThreeDimGame)oin.readObject();
               game.setX(x);
               game.setY(y);
               game.setZ(z);
               game.disp();
               oin.close();
               fin.close();
               break;
            case 2:
               game=new ThreeDimGame(x,y,z);
               break;
        }
        FileOutputStream fos=new FileOutputStream("objects.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(game);
        fos.close();
        oos.close();
        game.disp();
        
    }
}