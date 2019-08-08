import java.io.*;
class Supervin
{
    int check(int a)
    {
    
        if(a==1)
        a=a-1;
        else if(a==3)
        a=a-1;
        else if(a==5)
        a=a-1;
        else if(a==7)
        a=a-1;
        else if(a==9)
        a=a-1;
   
        return a;
   }
   int f,m=0;
   int reverse(int r)
   {
       f=r%10;
       m=m*10+f;
       r=r/10;
       
       return r;
    }
    public static void main(String args[])throws IOException
    {
        DataInputStream in =new DataInputStream(System.in);
        int t=Integer.parseInt(in.readLine());
        if(t<=100)
        for(int i =1;i<=t;i++)
        {
            int n=Integer.parseInt(in.readLine());
            int d=n,a=0,p=0,r=0;
            while(n!=0)
            {
                a=n%10;
                if(a%2==0)
                {
                p=0;
                }
                else
                {
                Supervin z=new Supervin();
                int x= z.check(a);
                r=r*10+a;
                int c=z.reverse(r);
                p=d-c;
                }
                
                n=n/10;
            
            }
            
         System.out.println("Case#"+t+":"+p);
        
    }
    
    
      ;
    
}
}