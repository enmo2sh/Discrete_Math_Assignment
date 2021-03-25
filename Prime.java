package discreteA2;

import java.util.LinkedList;

public class Prime {
    public int[]PrimeNo(int n){
        int[] primes=new int[n+1];
        for(int i=0;i<n+1;i++)
            primes[i]=1;
        primes[0]=0;
        primes[1]=0;
        for(int i=2; i<=Math.sqrt((double)n); i++){
            if(primes[i]==1){
                for(int j=2;i*j<n+1;j++)
                    primes[i*j]=0;
            }
        }
        return primes;
    }
}

