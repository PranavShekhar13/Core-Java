 import java.io.*;
class semiprime
{  
    int flag,countp,a=0;
    
    int check(int n)
    {
    for(int i=2;i<=n;i++)
    {
        if(n%i==0)
        {
            countp=countp+1;
        }
    }
    a=(int) Math.sqrt(n);
    
    if((countp==2)&&(a*a==n))
    {
        flag =1;
    }
    else
    {
    flag=0;
    }
return flag;
}
          
    public static void main(String args[])throws IOException
    {
        DataInputStream in =new DataInputStream(System.in);
        int n,i,j,count,s=0;
        System.out.println("Enter the number");
        n=Integer.parseInt(in.readLine());
        for(i=1;i<=n;i++) 
        {
            if(n%i==0)
            {
                count=0;
              for(j=1;j<=i;j++)
               {
                if(i%j==0)
                {
                    count=count+1;
                }
                
               }
               if(count==2)
                 {
                s=s+1;
                 }
        }
 
       }
       semiprime z = new semiprime();
       int b=z.check(n);
       if((s==2)||(b==1))
       {
           System.out.println("Semiprime Number");
        }
        else
        {
            System.out.println("Not a Semiprime Number");
        }
}
}