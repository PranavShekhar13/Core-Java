import java.io.*;
class rev
{
    int r1,c=0;
    int rev(int i)
    {   r1=0;
        while(i!=0)
        {   
            c=i%10;
            r1=(r1*10)+c;
            i=i/10;
        }
 return r1;
    }
    
    
    public static void main(String args[])throws IOException
    {
        try
        {
        DataInputStream in =new DataInputStream(System.in);
        int n=Integer.parseInt(in.readLine());
        for(int j=1;j<=n;j++)
        {
           int a=Integer.parseInt(in.readLine());
           int b=Integer.parseInt(in.readLine());
           rev r = new rev();
           int p=r.rev(a);
           int q=r.rev(b);
           int z=r.rev(p+q);
           System.out.println(z);
           
        }
    }
        catch(Exception e)
        {
            return;
        }
    }
}
   