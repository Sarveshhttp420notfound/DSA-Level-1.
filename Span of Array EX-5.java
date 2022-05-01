import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[]args)throws Exception{
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int span=ans(arr);
        System.out.println(span);
        
    }
    public static int ans(int []arr){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            int cv=arr[i];
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