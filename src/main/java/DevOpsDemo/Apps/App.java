package DevOpsDemo.Apps;

import Calculators.Calculator;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Premier saisie en numeric: ");
        int number1 = myObj.nextInt();
        System.out.print("Deuxieme saisie en numeric: ");
        int number2 = myObj.nextInt();
        
        Calculator calculator = new Calculator();
        
        System.out.println("Resultat des saisaies (sum) : "+calculator.sum(number1, number2));
         System.out.println("Resultat des saisaies (sum) : "+calculator.sum(number2, number2));
        System.out.println("Resultat des saisaies (subtract) : "+calculator.subtract(number1, number2));
        System.out.println("Resultat des saisaies (multiply) : "+calculator.multiply(number1, number2));
        System.out.println("Resultat des saisaies (divide) : "+calculator.divide(number1, number2));
    }
}
