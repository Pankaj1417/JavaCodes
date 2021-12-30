import java.util.Scanner;

public class Solution{
    public static void main(String [] args)
        {
            Scanner scnr=new Scanner(System.in);
            int n=scnr.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=scnr.nextInt();
            }
            int path=-1;
            int ans = 0;

            int j;
            for(int i=0;i<n;i++)
            {   j=i;
                int count=0;
                while(true)
                {
                    count++;
                    ans += a[j];
                    if(a[j]==-1)
                    {
                        break;
                    }
                    else if(i==a[j])
                    {
                        if(count>path)
                            path=count;
                        break;
                    }
                    else
                    {   int temp=j;
                        j=a[j];
                        a[temp]=-1;
                    }
                }
            }
            System.out.println("my path: "+path);
            System.out.println(ans);
        }
    }

