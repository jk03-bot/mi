import java.util.Scanner;

public class mulInverse {

    public static int modInverse(int n,int m)
    {
        int q,a=n,b=m,r;
        int b0=b;
        int t1=0,t2=1,t;
        if(b==1)
        {
            return 1;
        }
        while(a>1)
        {
            q=a/b;
            r=a%b;

            t=t1-(q*t2);
            a=b;
            b=r;
            t1=t2;
            t2=t;

        }
        if(t1<0)
        {
            t1=t1+b0;
        }
        return t1;
            
    }
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.print("enter num:");
        int n = obj.nextInt();
        System.out.print("enter modulo num:");
        int m = obj.nextInt();
        int inverse = modInverse(m,n);
        System.out.print("inverse:"+inverse);

    }

}
