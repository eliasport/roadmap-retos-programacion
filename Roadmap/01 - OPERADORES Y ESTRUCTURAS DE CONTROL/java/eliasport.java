/**
 * Ejercicio:
 * Crea ejemplos utilizando todos los tipos de operadores de tu lenguaje: Aritméticos, lógicos, de comparación,
 * asignación, identidad, pertenencia, bits... (ten en cuenta que cada lenguaje puede poseer unos diferentes).

 * Utilizando las operaciónes con operadores que tú quieras, crea ejemplos que representen todos los tipos de
 * estructuras de control que existen en tu lenguaje: condicionales, iterativas, excepciónes....

 * Debes hacer print por consola del resultado de todos los ejemplos.

 * Dificultad Extra
 * Crea un programa que imprima por consola todos los números comprendidos entre 10 y 55 (incluidos), pare y que no son
 * ni el 16 ni múltiplos de 3.
 */

public class Ejercicio_01 {

    public static void main(String[] args) {

        operadores();

        estructurasControl();

        extra();

    }

    public static void operadores(){
        System.out.println("Operadores del lenguaje Java: ");
        aritmeticos();

        System.out.println();

        aritmeticos_asignacion();

        System.out.println();

        incremento_decremento();

        System.out.println();

        relacionales();

        System.out.println();

        logicos();
    }

    public static void aritmeticos(){
        System.out.println("Operadores Aritméticos:");
        int num1 = 1;
        int num2 = 2;
        int suma = num1 + num2;
        System.out.println("Suma: 1 + 2 = " + suma);

        int resta = num2 - num1;
        System.out.println("Resta: 2 - 1 = " + resta);

        int num3 = 3;
        int multiplicacion = num2 * num3;
        System.out.println("Multiplicación: 2 * 3 = " + multiplicacion);

        int num4 = 4;
        int division = num4 / num2;
        System.out.println("Division: 4 / 2 = " + division);

        int modulo = num4 % num2;
        System.out.println("Resto - Modulo: 4 % 2 = " + modulo);
        modulo = num4 % num3;
        System.out.println("Resto - Modulo: 4 & 3 = " + modulo);

    }

    public static void aritmeticos_asignacion(){
        System.out.println("Operadores ariméticos y de asingación.");

        int var = 5;
        System.out.println(" 5 += 1 = " + (var += 1));

        System.out.println(" 5 -= 1 = " + (var -= 1));

        System.out.println(" 5 *= 2 = " + (var *= 2));

        System.out.println(" 5 /= 2 = " + (var /= 2));

        System.out.println(" 5 %= 2 = " + (var %= 2));
    }

    public static void incremento_decremento(){
        System.out.println("Operadores de incremento y de decremento.");

        int var = 4;

        var++;
        System.out.println("Incremento: 4++ = " + var);

        var--;
        var--;
        System.out.println("Decremento: 4-- = " + var);
    }

    public static void relacionales(){
        System.out.println("Relacionales.");

        int var1 = 1;
        int var2 = 2;
        int var3 = 2;

        System.out.println("Igual a: (1 == 2) = " + (var1 == var2));
        System.out.println("         (2 == 2) = " + (var2 == var3));

        System.out.println("Diferente de: (1 != 2) = " + (var1 != var2));
        System.out.println("              (2 != 2) = " + (var2 != var3));

        System.out.println("Mayor que: (1 > 2) = " + (var1 > var2));
        System.out.println("           (2 > 1) = " + (var2 > var1));

        System.out.println("Menor que: (1 < 2) = " + (var1 < var2));
        System.out.println("           (2 < 1) = " + (var2 < var1));

        System.out.println("Mayor o igual que: (1 >= 2) = " + (var1 >= var2));
        System.out.println("                   (2 >= 1) = " + (var2 >= var1));

        System.out.println("Menor o igual que: (1 >= 2) = " + (var1 <= var2));
        System.out.println("                   (2 >= 1) = " + (var2 <= var1));
    }

    public static void logicos(){

        System.out.println("Operadores Lógicos.");

        int var1 = 1;
        int var2 = 2;
        int var3 = 2;

        System.out.println("AND: true and true = " + (true && true));
        System.out.println("     true and false = " + (true && false));

        System.out.println("OR: true || true = " + (true || true));
        System.out.println("    true || false = " + (true || false));
    }

    public static void estructurasControl(){
        System.out.println("\nEstructuras de control.");

        sentenciaIf();

        sentenciaIfElse();

        sentenciaElseIf();

        operadorTernario();

        sentenciaSwitch();

        bucles();

        operadorBreak();

        operadorContinue();
    }
    public static void sentenciaIf(){
        System.out.println("Sentencia If");
        String var = "Hola";
        if (var == "Hola"){
            System.out.println("La sentencia if se ejecuta.");
        }
    }
    public static void sentenciaIfElse(){
        System.out.println("Sentencia If-Else");
        String var = "Hola";
        if (var == "Adios"){
            System.out.println("La sentencia if se ejecuta.");
        } else {
            System.out.println("La sentencia else se ejecuta.");
        }
    }

    public static void sentenciaElseIf(){
        System.out.println("Sentencia Else-If");
        String var = "Hola";
//        if (var == "Adios"){
//            System.out.println("La sentencia if se ejecuta.");
//        }  else if (var == "Hola"){
//            System.out.println("La sentencia else-if se ejecuta.");
//        } else {
//            System.out.println("La sentencia else se ejecuta.");
//        }
        if (var.equals("Adios")){
            System.out.println("La sentencia if se ejecuta.");
        }  else if (var.equals("Hola")){
            System.out.println("La sentencia else-if se ejecuta.");
        } else {
            System.out.println("La sentencia else se ejecuta.");
        }
    }

    public static void operadorTernario(){
        System.out.println("Operador Ternario.");
        String var = "Hola";
        System.out.println(var.equals("Hola") ? "Primer resultado del operador ternario." : "Segundo resultado del operador ternario.");
        System.out.println(var.equals("Adios") ? "Primer resultado del operador ternario." : "Segundo resultado del operador ternario.");
    }

    public static void sentenciaSwitch(){
        System.out.println("Sentencia Switch.");
        String dia = "Miercoles";
        switch (dia){
            case "Lunes":
                System.out.println("El dia es Lunes.");
                break;
            case "Martes":
                System.out.println("El dia es Martes.");
                break;
            case "Miercoles":
                System.out.println("El dia es Miercoles.");
                break;
            case "Jueves":
                System.out.println("El dia es Jueves.");
                break;
            default:
                System.out.println("Dia no encontrado.");
                break;
        }
    }
    public static void bucles(){
        System.out.println("Bucle for: ");
        bucleFor();
        System.out.println("Bucle forEach:");
        bucleForEach();
        System.out.println("Bucle while:");
        bucleWhile();
        System.out.println("Bucle do-While:");
        bucleDoWhile();
    }
    public static void bucleFor(){
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
    public static void bucleForEach(){
        String [] dias = {"Domingo", "Lunes", "Martes", "Miércoles" , "Jueves" , "Viernes" , "Sabado"};
        for (String dia : dias){
            System.out.println(dia);
        }
    }
    public static void bucleWhile(){
        int contador = 0;
        while (contador < 5){
            System.out.println(contador);
            contador++;
        }
    }

    public static void bucleDoWhile(){
        int contador = 0;
        do{
            System.out.println(contador);
            contador++;
        }while (contador < 5);
    }

    public static void operadorBreak(){
        System.out.println("Break:");
        int contador = 0;
        while (contador < 5){
            if (contador == 2){
                break;
            } else{
                System.out.println(contador);
            }
            contador++;
        }
    }

    public static void operadorContinue(){
        System.out.println("Continue:");
        for (int i = 0; i < 5; i++) {
            if (i ==2){
                continue;
            };
            System.out.println(i);
        }
    }

    public static void extra(){
        System.out.println("\nDificultad Extra: ");
        System.out.println("Un programa que imprima por consola todos los números comprendidos entre 10 y 55 (incluidos)" +
                ", pares, y que no son ni el 16 ni múltiplos de 3. ");
        numeros();
    }
    public static void numeros(){
        for (int i = 10; i < 55; i++) {
            if (i%2 == 0 && i%3!=0 && i%16!=0){
                System.out.print(i + " ");
            }
        }
    }

}


