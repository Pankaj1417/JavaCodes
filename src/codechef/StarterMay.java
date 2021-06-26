package codechef;

import java.util.Scanner;

public class StarterMay {
}

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception{
        try{

            Scanner s = new Scanner(System.in);
            int t = s.nextInt();
            while(t>0){
                int n = s.nextInt();
                String[] arr = new String[n];
                for(int i=0;i<n;i++){
                    arr[i] = s.next();
                }
                boolean l1 = false;
                boolean l2 = false;
                int count = 0;
                for(String word : arr){
                    for(int i=0;i<word.length();i++){
                        if(word.charAt(i) >='a' && word.charAt(i)<= 'm'){
                            l1 = true;
                        }
                        if(word.charAt(i) >='N' && word.charAt(i)<= 'Z'){
                            l2 = true;
                        }

                    }
                    if(!l1 && !l2){
                        System.out.println("No");
                        count++;
                        break;
                    }
                    if(l1 && l2){
                        System.out.println("No");
                        count++;
                        break;
                    }
                    l1 = false;
                    l2 = false;

                }
                if(count ==0){
                    System.out.println("Yes");
                }

                t--;
            }

        }catch(Exception ignored){

        }
    }
}

/* Name of the class has to be "Main" only if the class is public. */
class Codechef1
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner scn = new Scanner(System.in);
        int tin = scn.nextInt();
        for(int l = 0;l < tin; l++)
        {
            int k = scn.nextInt();
            String str[] = new String[k];
            for(int r = 0; r < k ;r++)
            {
                str[r] = scn.next();
            }
            int counter[] = new int[k];
            for(int i = 0; i < k ;i++)
            {
                String s = str[i];
                int c1 = 0;
                int c2 = 0;
                for(int j = 0; j < s.length(); j++)
                {
                    char ch = s.charAt(j);
                    if(ch >= 'a' && ch <= 'm' )
                    {
                        c1++;
                    }
                    else if(ch >= 'N' && ch <= 'Z')
                    {
                        c2++;
                    }

                }
                if(c1 == s.length() || c2 == s.length())
                {
                    counter[i] = 1;
                }
            }
            int sum = 0;
            for(int i = 0; i < k ;i++)
            {
                sum = sum + counter[i];
            }
            if(sum == k)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}

