package org.example;

import java.util.Scanner;

public class permutation {


        static String permute(String s,
                              String answer)
        {
            if (s.length() == 0)
            {
                System.out.print(answer + " ");
                return answer;
            }

            for(int i = 0 ;i < s.length(); i++)
            {
                char ch = s.charAt(i);
                String left_substr = s.substring(0, i);
                String right_substr = s.substring(i + 1);
                String rest = left_substr + right_substr;
                String ans=permute(rest, answer + ch);

            }
            return answer;

        }

        // Driver code
        public static void main(String args[])
        {
            Scanner scan = new Scanner(System.in);
            String s;
            String answer="";

            System.out.print(
                    "Enter the string : ");
            s = scan.next();

            System.out.print(
                    "\nAll possible strings are : ");
            permute(s, answer);
        }
    }
// This code is contributed by adityapande88


