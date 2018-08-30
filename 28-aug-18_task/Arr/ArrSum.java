public class  ArrSum{

public static int calSum(int ar1[],int ar2[],int n){
int sum=0;
for(int i=0;i<n;i++)
sum+=sum+ar1[i]+ar2[i];
return sum;
}
public static void main(String args[]){
int ar1[]={1,2,3,4,5};
int ar2[]={10,20,30,40,50};
System.out.println("The sum is :"+" "+ArrSum.calSum(ar1,ar2,5));
}

}