import java.io.*;
class def
{
    public static void main(String args[])throws IOException
    {
    DataInputStream in =new DataInputStream(System.in);
          int i,j,k,l;
        for(i=1;i<=4;i++)
        {
            for(j=4;j>=i;j--)
            
            System.out.print(" ");
            for(k=1;k<=i;k++)
            System.out.print(k);
            for(l=k-2;l>0;l--)
            System.out.print(l);
            System.out.println();
        }
    }
}