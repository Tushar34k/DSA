package org.example.array;

import java.util.HashMap;
import java.util.Map;

public class TargetCheck {
    public static void main(String arg[])
    {
        int arr[]= {0,5,8,4,9};
        int target= 9;

       for(int i=0;i<arr.length;i++)
       {
           for(int j=i+1;j<arr.length;j++)
           {
               if(arr[i]+arr[j]==target)
               {
                   System.out.println(i+" "+j);
                   break;
               }
           }
       }

    }

}
