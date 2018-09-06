public class Occurence{
    public static void main(String args[]){
        String word=args[1];
        String str=args[0];
        int index;
        index=str.indexOf(word);
        int count=0;
        if(index<0){
            System.out.println("word not found");}
            else{count++;
                while(index>=0){
                    System.out.println("word found at:"+index);
                    index=str.indexOf(word,index+word.length());

                }
                System.out.println("No.of occurence:"+count);
            }
        }
    }

