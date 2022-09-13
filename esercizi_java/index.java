
import java.util.Scanner;

/*
 *[An editor is available at the bottom of the page to write and execute the scripts.]

1. Write a Java program to print 'Hello' on screen and then print your name on a separate line
 * 
 */
public class index {
    

    /**
     * @param args
    */
    public static void main(String[] args) {

   Scanner message = new Scanner(System.in);
    /* 
   String saluta;
   String name;
   String cognome;


System.out.println("inserisci il tuo saluto: ");
     saluta = message.nextLine();

System.out.println("inserisci il tuo nome: ");
    name = message.nextLine().toLowerCase();

 System.out.println("inserisci il tuo cognome: ");

    cognome = message.nextLine().toUpperCase();


System.out.println( "result: \n" + saluta + "\n" + cognome + " " + name);

        message.close();

*/


/*
 * 2. Write a Java program to print the sum of two numbers.
Test Data:
 * 
 

 int num1, num2, resault;

        System.out.println("inserisci un numero");
        num1 = message.nextInt();

        System.out.println("inserisci un numero");
        num2 = message.nextInt();
        resault = num1 + num2;
System.out.println("resault: \n" + resault);
        message.close();

*/

/*
 *  Write a Java program to print the result of the following operations.
Test Data:
a. -5 + 8 * 6
b. (55+9) % 9
c. 20 + -3*5 / 8
d. 5 + 15 / 3 * 2 - 8 % 3
 */
/* 
 int a1, a2, a3;
 int b1, b2, b3;
int c1, c2, c3, c4;
int d1, d2, d3, d4, d5, d6;
 System.out.println("inserisci a1: ");
 a1 = message.nextInt();

 System.out.println("inserisci a2: ");
 a2 = message.nextInt();
 System.out.println("inserisci a3: ");
 a3 = message.nextInt();

 System.out.println("inserisci b1: ");
 b1 = message.nextInt();

 System.out.println("inserisci b2: ");
 b2 = message.nextInt();
 System.out.println("inserisci b3: ");
 b3 = message.nextInt();

 System.out.println("inserisci c1: ");
 c1 = message.nextInt();

 System.out.println("inserisci c2: ");
 c2 = message.nextInt();

 System.out.println("inserisci c3: ");
 c3 = message.nextInt();

 System.out.println("inserisci c4: ");
 c4 = message.nextInt();


 System.out.println("inserisci d1: ");
 d1 = message.nextInt();
 System.out.println("inserisci d2: ");
 d2 = message.nextInt();
 System.out.println("inserisci d3: ");
 d3 = message.nextInt();
 System.out.println("inserisci d4: ");
 d4 = message.nextInt();
 System.out.println("inserisci d5: ");
 d5 = message.nextInt();
 System.out.println("inserisci d6: ");
 d6 = message.nextInt();

message.close();

int a, b, c, d;
a = - a1 + a2 * a3;
b =  (b1+b2) % b3;
c = c1 + -c2*c3 / c4;
d = d1 + d2 / d3* d4 - d5 % d6;

System.out.println("Result:\n" + a + " \n" + b + "\n" + c + " \n" + d );

  */


  System.out.print("Input a number: ");
  int num1 = message.nextInt();
  message.close();
   int x = 1;
 while( x < 10){

    System.out.println(num1 + " x: " +  x +  " = " + num1 * x   );

    
x++;;
}
}
}


    















