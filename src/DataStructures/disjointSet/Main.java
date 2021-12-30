package DataStructures.disjointSet;
import java.util.*;

   public class Main{
        public static void main(String[] args){
            Scanner sc=new Scanner (System.in);
            int t=sc.nextInt();
            while(t-->0){
                int n=sc.nextInt();
                int[] a=new int[n+1];
                for(int i=1;i<=n;i++)
                    a[i]=i;
                int k=sc.nextInt();
                Functions g=new Functions();
                System.out.println();
                for(int i=0;i<k;i++){
                    String s=sc.next();
                    if(s.equals("UNION")){
                        int x=sc.nextInt();
                        int z=sc.nextInt();
                        g.unionSet(a,x,z);
                    }
                    else{
                        int x=sc.nextInt();
                        int parent=g.find(a,x);
                        System.out.print(parent+" ");
                    }
                }
                System.out.println();
            }
        }
    }
    class Functions
    {
        int[] rank = new int[1000];

        int find(int a[],int x)
        {
            if(a[x] == x){
                return x;
            }
            return a[x] = find(a,a[x]);
        }
        void unionSet(int[] a, int x, int z)
        {
            int m = find(a,x);
            int n = find(a,z);
            a[m]=n;
        }

    }
