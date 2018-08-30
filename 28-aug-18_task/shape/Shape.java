
public class Shape {
    public static void main(String[] args) {
        Circle c=new Circle();
        Square s=new Square();
        if(args[0].equals("1"))
            {
            System.out.println("The area of circle is :"+c.calArea(Integer.parseInt(args[1])));
        }
        else{
            
          System.out.println("The area of square is :"+s.calArea(Integer.parseInt(args[1])));  
        }
       
        
    }
    
}
