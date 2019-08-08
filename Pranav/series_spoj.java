import java.io.*;
class series_spoj
{
    public static void main(String args[])throws IOException
    {
        DataInputStream in =new DataInputStream(System.in);
        int t=Integer.parseInt(in.readLine());
        int s;
        for(int i=1;i<=t;i++)
        {
          int a=Integer.parseInt(in.readLine());
          for(int j=1;j<=a;j++)
          {
              s=0;
            for(int k=2;k<=j;k++)
            {
               if(k%j==0)
               {
                   