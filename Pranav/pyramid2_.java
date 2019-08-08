import java.io.*;
class pyramid2_
{
    public static void main(String args[])throws IOException
    {
        DataInputStream in =new DataInputStream(System.in);
        
        int n;
        System.out.println("Enter the number of Lines");
        n=Integer.parseInt(in.readLine());
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print(" ");
            }
            
            for(int k=1;k<=i;k++)
            {
                System.out.print(i);
            }
            for(int l=(n/2);l<=i;l++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
}

}