public class Split2{
    public static void main(String args[]){
        String ar=args[0];
        String str[]=ar.split(";");
        String cities[]=str[0].split(",");
        String countries[]=str[1].split(",");
        System.out.println("cities");
        for(int i=0 ;i<cities.length;i++)
          System.out.println(cities[i]);
        System.out.println("Countries");
        for(int i=0 ;i<countries.length;i++)
          System.out.println(countries[i]);


    }
}