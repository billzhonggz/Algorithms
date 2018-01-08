/**
 * Created by ZHONG on 2016/9/25.
 */
public class BigInteger
{
    public BigInteger() {
        super();
    }
    /*
    *计算谁入的位数
    */
    public int num(long x)
    {
        int result=0;
        long temp=x;
        while(temp>0)
        {
            temp=temp/2;
            result++;
        }
        return result;
    }
    /*
    *递归计算
    */
    public long mut(long x,long y,int n)
    {
        if(n==1)
        {
            return x*y;
        }
        else
        {

            long a=x;//取左半部分
            a>>=n/2;
            long b=(long)(x%Math.pow(2,n/2));//取右半部分
            long c=y;
            c>>=n/2;
            long d=(long)(y%Math.pow(2,n/2));;
            long m1=mut(a,c,n/2);
            long m2=mut(a-b,d-c,n/2);
            long m3=mut(b,d,n/2);
            long s=(long)(m1*Math.pow(2,n))+(long)((m2+m1+m3)*Math.pow(2,n/2))+m3;
            return s;
        }
    }
    public static void main(String[] args) {
        BigInteger biginteger = new BigInteger();
        System.out.print( biginteger.mut(37,10,4));
    }
}
