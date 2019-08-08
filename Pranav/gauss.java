import java.io.*;

public class gauss /** class gauss defined **/
{
        
    public void solve(double[][] a, double[] x) /** Function declaration **/
    {
        int n=x.length;
        for(int k=0;k<n;k++)
        {
           int max=k;
           for(int i=k+1;i<n;i++)
           {
             if(Math.abs(a[i][k])>Math.abs(a[max][k]))
             max=i;      /** to find key row **/
            
          
             
            double[] store= a[k];
            a[k]= a[max];
            a[max]=store; /** To swap rows in coefficient matrix a[][]**/ 
    
            
            double t= x[k];
            x[k]= x[max];
            x[max] =t; /** To swap corresponding values in constant matrix x[]**/
        }
            for(int i=k+1;i<n;i++)
            {
                double fact=a[i][k]/a[k][k];
                x[i]-=fact*x[k];
                for(int j=k;j<n;j++)
                {
                    a[i][j]-=fact*a[k][j];
                }
            }
        } /** To perform Gauss Elimination using Formula **/
        
        
        
         printMatrix(a,x); /** Function being called to print Augmented Matrix after Gauss Elimination **/
         
         
         double[] sol = new double[n];
         for(int i=n-1;i>=0;i--)
         {
             double sum=0.0;
             for(int j=i+1;j<n;j++)
              sum+= a[i][j]*sol[j]; 
              sol[i]=(x[i]- sum)/a[i][i];     /** Algorithm for Back Substitution **/ 
        }
        
        printsolution(sol); /** Function being called to print the required Solutions **/
        
    }                    
    
    
    public void printMatrix(double[][] a, double[] x) /** Function Declared to print Augmented Matrix **/
    {
       int n=x.length; 
       System.out.println("The Augmented Matrix after Gauss Substitution:-");
       for(int i=0;i<n;i++)
       {
           for(int j=0;j<n;j++)
               System.out.printf("%.3f ",a[i][j]);
               System.out.printf("| %.3f\n",x[i]);  /** Rounds off all the values to nearest 3 Decimal Places **/
            }
            System.out.println();
    }
    
    public void printsolution(double [] Solution) /** Function Declared to print Required Solutions **/
    {
        int n=Solution.length;
        System.out.println("The Required Solutions are:-");
        for(int i=0;i<n;i++)
        {
           System.out.printf("%.3f ",Solution[i]);
        }
        System.out.println();
    }
            
       
 public static void main(String args[])throws IOException /** main function begins here **/
    {
        DataInputStream in =new DataInputStream(System.in);
        System.out.println("Gauss Elimination Algorithm Test");
        gauss ge =new gauss(); /** Object 'ge' defined to call 'solve' function **/
        System.out.println();
        System.out.println();
        System.out.println("Enter the Number of Variables");
        int n=Integer.parseInt(in.readLine()); /** n Variable Scanned for the number of Variables in the System **/
        
        double[][] a= new double[n][n];
        double[] x= new double[n];   /** Coefficient Matrix a[][] and Constant Matrix x[] being Declared **/
        
        System.out.println("Enter "+n+" Equation Coefficients of the Matrix Row Wise");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=Double.parseDouble(in.readLine()); /** Values of the Coefficient Matrix being Scanned **/
            }
        }
        System.out.println("Enter "+n+" Values of the Constant Matrix in the System");
        for(int i=0;i<n;i++)
        {
            x[i]=Double.parseDouble(in.readLine()); /** Values of the Constant Matrix being Scanned **/
        }
        ge.solve(a,x); /** 'solve' Function being called with the help of the object 'ge'**/
        
    }
}