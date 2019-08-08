import java.io.*;
class prime
{
    public static void main(String args[])throws IOException
    {
        DataInputStream in =new DataInputStream(System.in);
        int n,count=0;
       System.out.println("Enter a number");
       n=Integer.parseInt(in.readLine());
       for(int i=2;i<n;i++)
       {
           if(n%i==0)
           {
               count=count+1;
               break;
           }
        }
        if(count==0)
        {
            System.out.println("Prime Number");
        }
        else
        {
            System.out.println("Not a Prime Number");
        }
    }
}