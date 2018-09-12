/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7.sep.pkg18.task;

/**
 *
 * @author Abhinav
 */
public class ArraySort {
    public static int  sumTotal(int ar[][][][]){
        int sum=0;
        for(int tmp[][][]:ar){
            for(int tmp1[][]:tmp){
                for(int tmp2[]:tmp1){
                    for(int tmp3:tmp2){
                        sum+=tmp3;
                    }
                }
            }
        }
        
        return sum;
        
    }
    public static void yearwiseSale(int ar[][][][],int p,int q,int r){
        
        int prod1=0;
        int prod2=0;
        for(int i=0;i<p;i++){
            for(int j=0;j<q;j++){
                for(int k=0;k<r;k++){
                    prod1=prod1+ar[i][0][j][k];
                }
            }
        }
         for(int i=0;i<p;i++){
            for(int j=0;j<q;j++){
                for(int k=0;k<r;k++){
                    prod2=prod2+ar[i][1][j][k];
                }
            }
        }
        System.out.println("P1 sales:"+prod1);
        System.out.println("p2 sales:"+prod2);
        
        
    }
    public static void regionwiseSale(int ar[][][][],int p,int q,int r){
        int north=0;
        int east=0;
        int west=0;
        int south=0;
        for(int i=0;i<p;i++){
            for(int j=0;j<q;j++){
                for(int k=0;k<r;k++){
                    north+=ar[i][j][k][0];
                }
            }
        }
         for(int i=0;i<p;i++){
            for(int j=0;j<q;j++){
                for(int k=0;k<r;k++){
                    south+=ar[i][j][k][1];
                }
            }
        }
          for(int i=0;i<p;i++){
            for(int j=0;j<q;j++){
                for(int k=0;k<r;k++){
                    east+=ar[i][j][k][2];
                }
            }
        }
           for(int i=0;i<p;i++){
            for(int j=0;j<q;j++){
                for(int k=0;k<r;k++){
                    west+=ar[i][j][k][3];
                }
            }
        }
        
        System.out.println("north region sales:"+north);
         System.out.println("south region sales:"+south);
          System.out.println("east region sales:"+east);
           System.out.println("west region sales:"+west);
        
        
    }
    public static void domesExport(int ar[][][][],int p,int q,int r){
        int domestic=0;
        int export=0;
        
        for(int i=0;i<p;i++){
            for(int j=0;j<q;j++){
                for(int k=0;k<r;k++){
                    domestic+=ar[i][j][0][k];
                }
            }
        }
           for(int i=0;i<p;i++){
            for(int j=0;j<q;j++){
                for(int k=0;k<r;k++){
                    export+=ar[i][j][1][k];
                }
            }
        }
        System.out.println("Domestic sales:"+domestic);
        System.out.println("Export sales:"+export);
    }
    public static void main(String args[])
    {
        int ar[][][][]=new int [2][2][2][4];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                for(int p=0;p<2;p++){
                    for(int q=0;q<4;q++){
                        ar[i][j][p][q]=i+j+p+q;
                    }
                }
            }
        }
        int total=sumTotal(ar);
        System.out.println("total sales: "+total);
     yearwiseSale(ar,2,2,4);
     regionwiseSale(ar,2,2,2);
     domesExport(ar,2,2,4);
    }    
}
