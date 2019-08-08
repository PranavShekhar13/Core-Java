import java.io.*;
class pyramid2
{
    public static void main(String args[])throws IOException
    {
        DataInputStream in =new DataInputStream(System.in);
        
        int n;
        System.out.println("Enter the number of Lines");
        n=Integer.parseInt(in.readLine());
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print(" ");
            }
            
            for(int k=1;k<(i*2);k++)
            {
                System.out.print(k);
            }
            
            System.out.println();
        }
}

}