import java.io.*;
class iterated_sum
{
    public static void main(String args[])throws IOException
    {
        DataInputStream in =new DataInputStream(System.in);
        int a,b,p,s;
        a=Integer.parseInt(in.readLine());
        b=Integer.parseInt(in.readLine());
        p=0;
        s=0;
        for(int i=a;i<=b;i++)
        {
           p=i*i;
           s=s+p;
        }
        System.out.println(s);
    }
}