import java.io.*;
class wow
{
    public static void main(String args[])throws IOException
    {
        DataInputStream in =new DataInputStream(System.in);
        int x= Integer.parseInt(in.readLine());
        
       String na="W";
        for(int i=1;i<=x;i++)
        {
           na+="o";
        }
        na+="w";
        System.out.println(na);
    }
}