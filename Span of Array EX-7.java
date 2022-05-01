import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[]args)throws Exception{
        Scanner scn=new Scanner(System.in);
        int d=scn.nextInt();
        int []arr=new int[d];
        for(int j=0;j<d;j++){
            arr[j]=scn.nextInt();
        }
        int seom=asto(arr);
        System.out.println(seom);
    }
    public static int asto(int []arr){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int s=0;s<arr.length;s++){
            int cv=arr[s];
            if(cv>max){
                max=cv;
            }
            else if(cv<min){
                min=cv;
            }
        }
        return max-min;
    }
}