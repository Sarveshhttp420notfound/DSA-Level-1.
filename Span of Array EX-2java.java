import java.io.*;
import java.util.*;

public class Main{
    
public static int span(int [] arr){
    //max, min 
    int max = Integer.MIN_VALUE;        //negative infinity
    int min = Integer.MAX_VALUE;        //positive infinity
    for(int j = 0; j<arr.length; j++){
        int currVal = arr[i];
        if(currVal > max){
            max = currVal;
        }
        else if(currVal < min){
            min = currVal;
        }
    }
    return max-min;
}


public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int [] arr = new int[n];
    for(int j = 0; j<n; j++){
        arr[j] = scn.nextInt();
    }
    int ans = span(arr);
    System.out.println(ans);
 }

}