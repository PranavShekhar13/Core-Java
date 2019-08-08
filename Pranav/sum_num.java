import java.io.*;
class sum_num
{
    public static void main(String args[])throws IOException
    {
        DataInputStream in =new DataInputStream(System.in);
        int n=Integer.parseInt(in.readLine());
        for(int i=1;i<=n;i++)
        {
            String a=in.readLine();
            String b=in.readLine();
            double x=Double.parseDouble(a.trim());
            double y=Double.parseDouble(b.trim());
            System.out.println(x+y);
        }
    }
}