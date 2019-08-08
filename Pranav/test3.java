import java.io.*;
class test3 {

   public static void main(String[] args)throws IOException {
     

     // Creating an Scanner object
     DataInputStream in =new DataInputStream(System.in);
     String originalNumber, reverse = "";

     System.out.println("Enter a number:");
     // Reading an input 
     originalNumber = in.readLine();

     // Calculating a length
     int length = originalNumber.length();

     // Reverse a given number
     for ( int i = length - 1 ; i >= 0 ; i-- )
        reverse = reverse + originalNumber.charAt(i);
     //System.out.println("Reverse number: "+reverse);
     digits(Integer.parseInt(reverse));
   }

   /* digits of num */
   public static void digits(int number) {
       if (number == 0)
          System.out.println("");
       else {
          int mode=10;
          System.out.println(+number%mode);
          digits(number/mode);
       }
   }
}