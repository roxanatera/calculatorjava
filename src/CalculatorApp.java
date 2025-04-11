import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("✨ CALCULADORA MODERNA ✨");

        while (true) {
            mostrarMenu();

            try {
                var operacion = Integer.parseInt(consola.nextLine());

                if (operacion == 5) {
                    System.out.println("👋 ¡Gracias por usar la calculadora! ¡Hasta pronto!");
                    break;
                } else if (operacion >= 1 && operacion <= 4) {
                    ejecutarOperacion(operacion, consola);//LLamada de la función.
                } else {
                    System.out.println(" Error: '" + operacion + "' no es una opcion valida.");
                }

                System.out.println("\n"); // Espacio entre operaciones
            } catch (NumberFormatException e) {
                System.out.println(" Error: Ingresa solo numeros enteros.");
            } catch (Exception e) {
                System.out.println(" Ohoh! Ha ocurrido un error: " + e.getMessage());
            }
        }
        consola.close();
    }

    private static void mostrarMenu() {
        System.out.println("""
                🔢 ELIGE UNA OPERACION:
                1. Suma (+)
                2. Resta (-)
                3. Multiplicacion (×)
                4. Division (÷)
                5. Salir 🚪
                """);
        System.out.print("➡ Ingresa tu opcion: ");
    }

    private static void ejecutarOperacion(int operacion, Scanner consola) {
        System.out.print("🔢 Ingresa el primer valor: ");
        var operando1 = Double.parseDouble(consola.nextLine());
        System.out.print("🔢 Ingresa el segundo valor: ");
        var operando2 = Double.parseDouble(consola.nextLine());

        switch (operacion) {
            case 1 -> { // Suma
               double resultado = operando1 + operando2;
                System.out.println("✅ Resultado final: " + operando1 + " + " + operando2 + " = " + resultado);
            }
            case 2 -> { // Resta
               double resultado = operando1 - operando2;
                System.out.println("✅ Resultado final: " + operando1 + " - " + operando2 + " = " + resultado);
            }
            case 3 -> { // Multiplicacion
                double resultado = operando1 * operando2;
                System.out.println("✅ Resultado final: " + operando1 + " × " + operando2 + " = " + resultado);
            }
            case 4 -> { // Division
                if (operando2 == 0) {
                    System.out.println(" Error: No se puede dividir entre cero.");
                } else {
                    double resultado = operando1 / operando2;
                    System.out.println("✅ Resultado final: " + operando1 + " ÷ " + operando2 + " = " + resultado);
                }
            }
        }
    }
}