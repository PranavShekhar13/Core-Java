import java.io.*;
class compet1
{
    public static void main(String args[])throws IOException
    {
        DataInputStream in =new DataInputStream(System.in);
        int t,a=0,b=0;
        t=Integer.parseInt(in.readLine());
        String na,s="";
        for(int i=1;i<=t;i++)
        {
            na=in.readLine();
        a=na.length();
   
        if(a%2==0)
        b=a/2;
        for(int j=0;j<=b;j=j+2)
        {
          char c=na.charAt(j);
       s=s+c;
    }

        System.out.println(s);
    }
}
}