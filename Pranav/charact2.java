import java.io.*;
class charact2
{
    public static void main(String args[])throws IOException
    {
        try
        {
        DataInputStream in =new DataInputStream(System.in);
        
        int t=Integer.parseInt(in.readLine());
        
        for(int i=0;i<t;i++)
        {
            int lin=Integer.parseInt(in.readLine());
            int coul=Integer.parseInt(in.readLine());
            
            for(int j=0;j<lin;j++)
            {
            String na=" ";
            for(int k=0;k<coul;k++)
            {
                if(k==0||j==0||k==coul-1||j==lin-1)
                {
                    na+="*";
                }
                else
                {
                na+=".";
            }
        }
             System.out.println(na);
            }
             System.out.println();
            }
        }
            catch(Exception e){
                return;
            }
                
        }
    }   