package discreteA2;

import java.util.Stack;

public class FastExpo {

    public long  Native1(long a, long b, long m) {
        long c = a%m;
        while (b>1){
            c=c*a;
            c = c % m;
            b--;
        }
        return c;
    }

    public long Native2(long a, long b, long m) {
        long c = a%m;
        while (b>1){
            c=(c*a)%m;
            b--;
        }
        return c;
    }

    public long Native3(long a,long b,long m){
        long res=a;
        Stack<Integer> bin=new Stack<Integer>();
        while(b>0){
            bin.add((int) (b%2));
            b=b/2;
        }
        bin.pop();
        while(!bin.isEmpty()){
            int temp=bin.pop();
            if(temp==0)
                res=(res*res)%m;

            else {
                res=(res*res)%m;
                res=(res*a)%m;
            }
        }
        return res;
    }

    public long Native4(long a,long b,long m){
        if(b==0)
            return 1;
        else if (b%2==0){
            long y=Native4(a,b/2,m);
            return (y*y)%m;
        }
        else
            return ((a%m)*Native4(a,b-1,m))%m;
    }
}
