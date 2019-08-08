import java.io.*;
class universe
{
    int rev(int i)
    {
    while(i!=42)
    {
        System.out.println(i);
    }
    return i;
}
    
    
    
    
    public static void main(String args[])throws IOException
    {
        DataInputStream in =new DataInputStream(System.in);
        while(true)
        {
      int n=Integer.parseInt(in.readLine()); 
     rev r = new rev();
     r.rev(n);
    }
        }
    }