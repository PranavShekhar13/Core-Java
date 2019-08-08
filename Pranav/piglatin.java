import java.io.*;
class piglatin
{
    public static void main(String args[])throws IOException
     {
     DataInputStream in =new DataInputStream(System.in);
    String x,s="";
System.out.println("Enter the String");
    x=in.readLine();
    int flag=-1;
for(int i=0;i<x.length();i++)
{
    char c=x.charAt(i);
    if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u') 
    {
      flag=i;
      break;
    }

}
if(flag!=-1)
{
    String a=x.substring(flag);
    String b=x.substring(0,flag);
    s=a+b+"ay";
}
else
{
    s=x+"ay";
}
System.out.println(s.toUpperCase());
}
}