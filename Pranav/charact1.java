import java.io.*;
class charact1
{
    public static void main(String args[])throws IOException
    {
        try
        {
        DataInputStream in =new DataInputStream(System.in);
        
        int p=Integer.parseInt(in.readLine());
        for(int i=0;i<p;i++)
        {
            int lin=Integer.parseInt(in.readLine());
            int coul=Integer.parseInt(in.readLine());
            for(int j=0;j<lin;j++)
            {
                String a="";
              for(int k=0;k<coul;k++)
              {
                  if(j%2==0)
                  {
                   if(k%2==0)
                   {
                       a+="*";
                    }
                    else
                    {
                        a+=".";
                    }
                }
                else
                {
                    if(k%2==0)
                    {
                     a+=".";
                    }
                    else
                    {
                        a+="*";
                    }
                }
            }
            System.out.println(a);
        }
        System.out.println();
    }
}
catch(Exception e)
{
    return;
}
}
}
        
                    
                        
                   