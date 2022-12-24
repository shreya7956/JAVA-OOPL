
import java.util.Scanner;
class Complex_No{
    float real,img;
    //data member
    public Complex_No(){
        real=0;
        img=0;
        //default constructor
    }
    public Complex_No(float a,float b){
        //parameterised constructor
        real=a;
        img=b;
    }
    public void Display(Complex_No C1,Complex_No C2){
        System.out.println("First Complex Numbers=("+C1.real+")+("+C1.img+")i");
         //printing 1st no
        System.out.println("Secon Complex Numbers=("+C2.real+")+("+C2.img+")i");
        //printing 2nd no

    }
    public void AddNumbers(Complex_No C1,Complex_No C2){
        float real,img;
        real=(C1.real+C2.real);
        // real part of complex number
        img=(C1.img+C2.img);
        //img part of complex number
        System.out.println("Addition of complex Numbers=("+real+")+("+img+")i");
        //printing adition of two number
    }
     public void SubNumbers(Complex_No C1,Complex_No C2){
        float real,img;
        real=(C1.real-C2.real);
        // real part of complex number
        img=(C1.img-C2.img);
        //img part of complex number
        System.out.println("Substrction of complex Numbers=("+real+")+("+img+")i");
        //printing substraction of two number
    }
     public void MultiNumbers(Complex_No C1,Complex_No C2){
        float real,img;
        real=(C1.real*C2.real);
        // real part of complex number
        img=(C1.img*C2.img);
        //img part of complex number
        System.out.println("Multiplication of complex Numbers=("+real+")+("+img+")i");
        //printing multiply of two number
    }
     public void DivNumbers(Complex_No C1,Complex_No C2){
        float real,img;
        real=(C1.real/C2.real);
        // real part of complex number
        img=(C1.img/C2.img);
        //img part of complex number
        System.out.println("Division of complex Numbers=("+real+")+("+img+")i");
        //printing division of two number
    }
}
    //=====================CLASS MAIN===========//
    public class Main {
      public static void main(String args[])
      {
        float num1,num2;
        Complex_No cal=new Complex_No();
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the complex number in a+bi format :");
        //taking input for1st number
        System.out.println("Enter real part of First number :a :");
        num1=Sc.nextFloat();
         System.out.println("Enter img part of First number :b :");
        num2=Sc.nextFloat();
         Complex_No Com1=new Complex_No(num1,num2);
         //taking input for 2nd number
         System.out.println("Enter real part of Second number :a :");
        num1=Sc.nextFloat();
         System.out.println("Enter img part of Second number :b :");
        num2=Sc.nextFloat();
         Complex_No Com2=new Complex_No(num1,num2);
         Sc.close();//clsing Scanner close
         System.out.println("\n");
         cal.Display(Com1,Com2);
         //calling disply function
          System.out.println("\n");
         cal.AddNumbers(Com1,Com2);
         //calling Addition function
          System.out.println("\n");
         cal.SubNumbers(Com1,Com2);
         //calling Substraction function
          System.out.println("\n");
         cal.MultiNumbers(Com1,Com2);
         //calling Multiply function
          System.out.println("\n");
         cal.DivNumbers(Com1,Com2);
         //calling division function
      }
    }
/*============output=====================
Enter the complex number in a+bi format :
Enter real part of First number :a :
4
Enter img part of First number :b :
5.3
Enter real part of Second number :a :
2.7
Enter img part of Second number :b :
-6.4

First Complex Numbers=(4.0)+(5.3)i
Secon Complex Numbers=(2.7)+(-6.4)i

Addition of complex Numbers=(6.7)+(-1.0999999)i

Substrction of complex Numbers=(1.3)+(11.700001)i

Multiplication of complex Numbers=(10.8)+(-33.920002)i

Division of complex Numbers=(1.4814814)+(-0.828125)i
*/
