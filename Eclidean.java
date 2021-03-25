package discreteA2;

public class Eclidean {

    public int[] GCD(int a, int b){
        if(a > b)
            return ExtGCD(a,b);
        else
            return ExtGCD(b,a);

    }

    private int[] ExtGCD(int a, int b){
        int x=0, y=1, u=1,  v=0;
        int q, r, m, n;
        while (b!=0){
            q=a/b;
            r=a%b;
            m=x-u*q;
            n=y-v*q;
            a=b;
            b=r;
            x=u;
            y=v;
            u=m;
            v=n;
        }
        int arr[]={a, y, x};
        return arr;
    }
}

