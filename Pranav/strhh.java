import java.io.*;
class strhh
{
    public static void main(String args[])throws IOException
    {
        DataInputStream in =new DataInputStream(System.in);
        int t=Integer.parseInt(in.readLine());
       for(int i=0;i<t;i++)
        {
            String na=in.readLine();
        char c[] = na.toCharArray();
    
        for(int j=0;j<c.length/2;j=j+2)
        {
            System.out.print(c[j]);
        }
            System.out.println();
        }
    }
}