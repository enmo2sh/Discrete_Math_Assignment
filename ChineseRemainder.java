package discreteA2;

public class ChineseRemainder {
    private static Long inv(Long a, Long m){
        Long m0=m,t,q;
        Long x0=(long)0,x1=(long)1;
        if(m==1)
            return (long)0;
        while(a>1){
            q=a/m;
            t=m;
            m=a%m;
            a=t;
            t=x0;
            x0=x1-q*x0;
            x1=t;
        }
        if(x1<0)
            x1+=m0;

        return x1;
    }
    private static Long findMinx(Long[] num,Long[]rem){
        Long prod=(long)1;
        for(int i=0;i<num.length;i++)
            prod=prod*num[i];
        Long result=(long)0;
        for(int i=0;i<num.length;i++) {
            Long p=prod/num[i];
            result+=rem[i]*inv(p,num[i])*p;
        }
        return result%prod;
    }

    public static Long ADD(Long [] num, Long a, Long b){
        Long []rem = new Long[num.length];
        for(int i=0; i<num.length; i++){
            Long r=num[i];
            rem[i]= a % r + b % r;
        }
        Long res = findMinx(num, rem);
        return res;
    }

    public static Long Muliply(Long [] num, Long a, Long b){
        Long []rem = new Long[num.length];
        for(int i=0; i<num.length; i++){
            Long r=num[i];
            rem[i]= (a % r) * (b % r);
        }
        Long res = findMinx(num, rem);
        return res;
    }

}