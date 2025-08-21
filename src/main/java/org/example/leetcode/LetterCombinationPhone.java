package org.example.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LetterCombinationPhone {
    public static void main(String arg[])
    {
        char ch[]= {'2','3','4','5','6','7','8','9'};
        String str[]= {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"
        };
        Map<Character,String> map= new HashMap<>();

        for(int i=0;i<ch.length;i++)
        {
            map.put(ch[i],str[i]);
        }
        Scanner sc= new Scanner(System.in);
        System.out.println("eneter the c");
        String s= sc.nextLine();
        char c[]= s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
           // System.out.println(c.length);
            if(s.length()<0||c.length==1)
            {
              System.out.println( map.get(c[i]));
            }
            else {
//                System.out.println(map.get(c[i]));
                String temp= map.get(c[i]);
                char t[]= temp.toCharArray();
                for(int n=0;n<t.length-3;n++)
                {
                    System.out.println(t[n]+"=="+t[n]);
                }
            }

        }





    }

}
