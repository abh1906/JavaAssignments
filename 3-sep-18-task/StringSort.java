public  class StringSort{
  static void sort(String arr[]){
      int len=arr.length;
      String temp;
      for(int i=0;i<len;i++){
          for(int j=0;j<len-i-1;j++){
              if(arr[j].compareTo(arr[j+1])>0){
                  temp=arr[j+1];
                  arr[j+1]=arr[j];
                  arr[j]=temp;
              }
          }
      }
      for(int i=0;i<len;i++)
      System.out.println(arr[i]);
  }

    public static void main(String args[]){
        StringSort.sort(args);
    }
}