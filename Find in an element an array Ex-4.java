import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[]args)throws Exception{
        Scanner scn=new Scanner(System.in);
        int h=scn.nextInt();
        int []arr=new int[h];
        for(int i=0;i<h;i++){
            arr[i]=scn.nextInt();
        }
        int a=scn.nextInt();
        int b=c(arr,a,h);
        System.out.println(b);
    
    }
    public static int c(int []arr,int a,int h){
        int idx=-1;
        for(int i=0;i<arr.length;i++){
            if(a==arr[i]){
                idx=i;
            }
        }
        return idx;
    }
    }