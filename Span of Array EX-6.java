import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[]args)throws Exception{
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        int []arr=new int [a];
        for(int i=0;i<a;i++){
            arr[i]=scn.nextInt();
        }
        int answer=aoo(arr);
        System.out.println(answer);
        
    }
    public static int aoo(int []arr){
        int maax=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            int currentvalue=arr[i];
            if(currentvalue>maax){
                maax=currentvalue;
            }
            else if(currentvalue<min){
                min=currentvalue;
            }
        }
        return maax-min;
        
    }
}