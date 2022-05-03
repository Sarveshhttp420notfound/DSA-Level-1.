import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[]args)throws Exception{
        Scanner scn=new Scanner(System.in);
        int g=scn.nextInt();
        int []arr=new int[g];
        for(int i=0;i<g;i++){
            arr[i]=scn.nextInt();
        }
        int quot=scn.nextInt();
        int answer=question(arr,quot);
        System.out.println(answer);
        
    }
    public static int question(int []arr, int quot){
        int idx=-1;
        for(int i=0;i<arr.length;i++){
            if(quot==arr[i]){
                idx=i;
                break;
            }
        }
        return idx;
        
    }
}