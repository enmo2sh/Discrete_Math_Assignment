package discreteA2;

import java.util.Scanner;

public class Main {
    public static  void main(String args[]){
        Boolean x=true;
        while (x){
            Scanner n=new Scanner(System.in);
            System.out.println("choose the question you want to solve");
            System.out.println("1.Fast Exponentiation");
            System.out.println("2.Extended Euclidean Algorithm");
            System.out.println("3.Chinese Remainder Theorem");
            System.out.println("4.Prime Number Generation");
            System.out.println("5.to exit");
            int z=n.nextInt();
            if(z==1){
                System.out.println("enter the base:");
                Long a=n.nextLong();
                System.out.println("enter the expo:");
                Long b=n.nextLong();
                System.out.println("enter the mod.:");
                Long m=n.nextLong();
                FastExpo q= new FastExpo();
                Long res3=q.Native1(a,b,m);
                System.out.println("from Native1:"+res3);
                Long res4=q.Native2(a,b,m);
                System.out.println("from Native2:"+res4);
                Long res=q.Native3(a,b,m);
                System.out.println("from Native3:"+res);
                Long res2=q.Native4(a,b,m);
                System.out.println("from Native4:"+res2);
                System.out.println("------------------------------------------------------------------");
            }
            else if(z==2){
                System.out.println("enter the first number:");
                int a=n.nextInt();
                System.out.println("enter the second number:");
                int b=n.nextInt();
                Eclidean q= new Eclidean();
                int []arr=q.GCD(a,b);
                for(int i=0;i<arr.length;i++)
                    System.out.print(" "+arr[i]);
                System.out.println();
                System.out.println("------------------------------------------------------------------");

            }
            else if(z==3){
                System.out.print("enter the no of mods:");
                int p=n.nextInt();
                Long[] num = new Long[p];
                for (int i = 0; i < p; i++)
                        num[i] = (long)n.nextInt();
                System.out.println("enter the first number:");
                Long a = n.nextLong();
                System.out.println("enter the second number:");
                Long b = n.nextLong();
                ChineseRemainder q = new ChineseRemainder();
                System.out.println("A + B = " + q.ADD(num, a, b));
                System.out.println("A * B = " + q.Muliply(num, a, b));
            }
            else if(z==4){
                System.out.println("enter the number:");
                int a=n.nextInt();
                Prime l= new Prime();
                int []arr2=l.PrimeNo(a);
                for(int i=0;i<arr2.length;i++){
                    if(arr2[i]==1)
                        System.out.print(" "+i);
                }
                System.out.println();
                System.out.println("------------------------------------------------------------------");
            }
            else if(z==5){
                x=false;
            }




        }


    }
}
