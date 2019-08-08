import java.io.*;
class gauss_elim
{
    public static void main(String args[])throws IOException
    {
        DataInputStream in =new DataInputStream(System.in);
        int n,i,j,k;
        System.out.println("Enter the Number of Equations");
        n=Integer.parseInt(in.readLine());
        double a[][]= new double[n][n+1];
        double x[]= new double[n];
        System.out.println("Enter the Elements of the Augmented Matrix Row Wise");
        for(i=0;i<n;i++)
        {
            for(j=0;j<=n;j++)
            {
                a[i][j]=Double.parseDouble(in.readLine());
            }
        }
        for(i=0;i<n;i++)
        {
            for(k=i+1;k<n;k++)
            {
                if(Math.abs(a[i][i])<Math.abs(a[k][i]))
                for(j=0;j<=n;j++)
                {
                    double store =a[i][j];
                    a[i][j]= a[k][j];
                    a[k][j]= store;
                }
            }
        }
        for(i=0;i<n-1;i++)
        {
            for(k=i+1;k<n;k++)
            {
                double t= a[k][i]/a[i][i];
                for(j=0;j<=n;j++)
                {
                a[k][j]=a[k][j]-t*a[i][j];
            }
        }
    }
    System.out.println("The Matrix after Gauss Elimination:-");
    for(i=0;i<n;i++)
    {
        for(j=0;j<=n;j++)
        {
            System.out.print(" "+a[i][j]);
        }
        System.out.println();
    }
    
    double[]solution =new double[n];
    double sum=0.0;
    for(i=n-1;i>=0;i--)
    {
    for(j=i+1;j<n;j++)
    {
       sum+=a[i][j]*solution[j];
       solution[i]=(x[i]-sum)*a[i][i];
    }
}
System.out.println("The Values of the Variables are as follows:-");
for(i=0;i<n;i++)
{
    System.out.println(solution[i]);
}
}
}