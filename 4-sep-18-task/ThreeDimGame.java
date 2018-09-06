import java.io.Serializable;

public class ThreeDimGame implements Serializable{
    private int xPos;
    private int yPos;
    private int zPos;
    public ThreeDimGame(int xPos,int yPos,int zPos){
        this.xPos=xPos;
        this.yPos=yPos;
        this.zPos=zPos;
    }
    void setX(int val){
             xPos+=val;

    }
    void setY(int val){
        yPos+=val;
        
}
    void setZ(int val){
        zPos+=val;
    
}
    void disp(){
        System.out.println("XPOS:"+xPos+" "+"YPOS:"+yPos+" "+"ZPOS:"+zPos);
    }
}