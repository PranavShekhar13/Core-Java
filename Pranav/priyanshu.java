import java.util.*;
class priyanshu
{
  public static void main(String args[])
{
Scanner sc=new Scanner (System.in);
String s="";
System.out.println("Enter a string");
String p=sc.nextLine();
int l=p.length();
String u=p.toUpperCase();
for(int i=0;i<l;i++)
{
    char ch=p.charAt(i);
    if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
    {
    s=p.substring(0,i)+p.substring(i)+"AY"; 
    System.out.println(s);
    break;
}
}
}
}