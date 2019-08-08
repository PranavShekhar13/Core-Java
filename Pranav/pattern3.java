import java.io.*;
class pattern3
{
    public static void main(String args[])throws IOException
    {
        DataInputStream in =new DataInputStream(System.in);
        for(int i=6;i>=1;i--)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(j);
            }
            for(int k=6;k>=i;k--)
            {
                System.out.print("&");
            }
            System.out.println();
        }
    }
}