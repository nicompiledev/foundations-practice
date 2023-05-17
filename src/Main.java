import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

// Se define una clase llamada "Main" que contiene el método principal "main".
public class Main {
    public static void main(String[] args) {
        // Se declaran dos variables constantes: "MONTHS_IN_YEAR" y "PERCENT".
        // Estas variables se utilizan para realizar cálculos en el programa.
        byte MONTHS_IN_YEAR = 12;
        byte PERCENT = 100;

        // Se crea un objeto "Scanner" para permitir la entrada de datos desde la consola.
        Scanner scanner = new Scanner(System.in);

        // Se solicita al usuario que ingrese el valor principal del préstamo ("Principal") y se guarda en la variable "principal".
        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        // Se solicita al usuario que ingrese la tasa de interés anual ("Annual Interest Rate") y se guarda en la variable "annualInterest". Luego, se calcula la tasa de interés mensual dividiendo "annualInterest" entre "PERCENT" y "MONTHS_IN_YEAR", y se guarda en la variable "monthlyInterest".
        System.out.print("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        // Se solicita al usuario que ingrese el período en años ("Period (Years)") y se guarda en la variable "years". A continuación, se calcula el número total de pagos dividiendo "years" por "MONTHS_IN_YEAR" y se guarda en la variable "numberOfPayments".
        System.out.print("Period (Years): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        // Se realiza el cálculo del monto de la hipoteca utilizando la fórmula de amortización de préstamos. El resultado se guarda en la variable "mortgage".
        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        // Se formatea el valor de la hipoteca utilizando la clase "NumberFormat" para mostrarlo como una cantidad monetaria y se guarda en la variable "mortgageFormatted".
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        // Se imprime en la consola el resultado final del cálculo de la hipoteca.
        System.out.println("Mortgage: " + mortgageFormatted);







    }
}