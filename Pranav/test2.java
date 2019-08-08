import java.io.*;
class test2
{
int check(int a ,int n)
{
   
    while(n%2!=0)
    {
        a=a-1;
        break;
        
    }
   
    return a;
}
int reverse(int r)
{
    int x=0,y=0;
    while(r!=0)
    {
        x=r%10;
        y=y*10+x;
        r=r/10;
    }
    return y;
}
    

    public static void main(String args[])throws IOException
    {
        DataInputStream in =new DataInputStream(System.in);
        int t=Integer.parseInt(in.readLine());
        for(int i=1;i<=t;i++)
        {
        int n= Integer.parseInt(in.readLine());
        int k=n,a=0,r=0,d=0,p=0;
        test2 z= new test2();
        while(n!=0)
        {
            a=n%10;
            int c=z.check(a);
            r=r*10+c;
            n=n/10;
            d=z.reverse(r);
            p=k-d;
            
            
        }
        System.out.println("Case#"+t+":"+p);
    
    }
}
}

