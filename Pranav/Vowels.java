import java.io.*;

class Vowels
{
    public static void main(String args[])throws IOException {
    
    DataInputStream in =new DataInputStream(System.in);
    String x;
    System.out.println("Enter the String");
    x=in.readLine();
    int countv=0,a=0,countn=0;
    for(int i=0;i<x.length();i++)
        {
        char c=x.charAt(i);
        if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u')  {
         countv=countv+1;   
        }
        a= (int) c;
        if(a>=48 && a<=57)
        {
        countn=countn+1;
        }
        }
        System.out.println("Number of vowels ="+countv);
        System.out.println("Number of Digits ="+countn);
    }
}