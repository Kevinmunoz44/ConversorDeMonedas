import com.google.gson.JsonSyntaxException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String opcion = """
                *************************************************************
                                       WELCOME
                Opciones disponibles en divisas
                
                    ARS - Peso argentino
                    BRL - Real brasileño
                    CLP - Peso chileno
                    COP - Peso colombiano
                    USD - Dolar estadounidense
                    EUR - Euro europeo
                
                *************************************************************
                """;
        Scanner leer = new Scanner(System.in);

        Application conversor = new Application();
        System.out.println(opcion);
        while(true){
            try{
                System.out.println("Escoja la moneda a convertir (COP)");
                String badge = leer.next().toUpperCase();
                System.out.println("Escoja la moneda de cambio (USD)");
                String money = leer.next().toUpperCase();

                System.out.println("Ingrese el valor a convertir");
                double value = leer.nextDouble();
                var converted = conversor.getCoin(badge, money, value);
                System.out.println("El valor " + value + " " + badge + " es igual a " + converted + " " + money);
            } catch (InputMismatchException | JsonSyntaxException e) {
                System.out.println("Valores invalidos");
                break;
            }
            System.out.println("Escriba salir, Para terminar el programa ");
            String exit = leer.next();
            if (exit.equalsIgnoreCase("salir")){
                System.out.println("Gracias por utilizar nuestros servicios");
                break;
            }
        }
    }
}
