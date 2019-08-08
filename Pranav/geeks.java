import java.io.*;
class geeks
{
    static int r,c,j,k;
    static void interchange(int a[][],int r, int c){
        
        int x=a[j][0];
        a[j][0]=a[j][c-1];
        a[j][c-1]=x;
        
        for(int j=0;j<r;j++){
            for(int k=0;j<c;j++){
                System.out.print(a[j][k] + " ");
            }
            System.out.println();
        } 
    }
    public static void main(String args[])throws IOException
    {
         
        DataInputStream in =new DataInputStream(System.in);
        geeks ob =new geeks();
         int t=Integer.parseInt(in.readLine());
        for(int i=1;i<=t;i++)
        {
             r=Integer.parseInt(in.readLine());
             c=Integer.parseInt(in.readLine());
            int a[][]=new int[r][c];
            for(j=0;j<r;j++)
            {
                for(k=0;k<c;k++)
                {
                    a[j][k]=Integer.parseInt(in.readLine());
                }
                 
            }
             
            ob.interchange(a,r,c);  
          
        }
       
}
}