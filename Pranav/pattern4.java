import java.io.*;
class pattern4
{
    public static void main(String args[])throws IOException
    {
        DataInputStream in =new DataInputStream(System.in);
        System.out.println("@");
        for(int i=5;i>=1;i--)
        {
            System.out.print("@");
            for(int j=5;j>=i;j--)
            {
                System.out.print(" ");
            }
            System.out.println("@");
        }
        for(int j=5;j>=1;j--)
        {
            System.out.print("@ ");
        }
    }
}