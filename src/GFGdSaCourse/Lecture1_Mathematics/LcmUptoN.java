package GFGdSaCourse.Lecture1_Mathematics;

public class LcmUptoN {
    public static void main(String[] args){
        int n = 9;
       long ans = getSmallestDivNum(n);
    }

        public static long getSmallestDivNum(int n){
            long lcm = 1;
            for(int i=2;i<=n;i++){
                long minLcm = getLcm((int)lcm,i);
                lcm = minLcm;

            }
            return lcm;
        }
        static long getLcm(int a, int b){
            int hcf =  getHcf(a,b);
            long lcm = (long)((a*b)/hcf);
            return lcm;
        }

        static int getHcf (int a ,int b){
            if(b==0){
                return a;
            }
            else{
                return getHcf(b%a,a);
            }
        }
    }
