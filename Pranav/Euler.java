import java.io.*;
class Euler
{ 
    double y,root;
    boolean flag=true;
    double func(double x,double y)
    {
        return(y-x);
    }

double euler(double x0,double y0,double h,double x)
{
    
        while(flag){
            root=x0+h;
            y=y0+h*func(x0, y0);
            
            if(root>=x)
            {
                flag=false;
            }
            x0=root;
            y0=y;
        }
    return y;
    
}
    
    public static void main(String args[])throws IOException
    {      
          DataInputStream in =new DataInputStream(System.in);
          double x0,y0,h,x;
          System.out.println("Enter the value of x0");
         x0=Double.parseDouble(in.readLine());
         System.out.println("Enter the value of y0");
         y0=Double.parseDouble(in.readLine());
         System.out.println("Enter the value of h");
         h=Double.parseDouble(in.readLine());
         System.out.println("Enter the value of x at which you need the solution");
         x=Double.parseDouble(in.readLine());
         Euler obj =new Euler();
         double a=obj.euler(x0,y0,h,x);
        System.out.println("The Solution="+a);
        double b=Math.round(a*100.0)/100.0;
        System.out.println("Rounded Off Solution="+b);
        }
    }
         