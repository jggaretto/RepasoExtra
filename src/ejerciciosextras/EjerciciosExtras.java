/*
 Crear un método que dado un tiempo en minutos leído desde teclado, calcular su equivalente en
días y horas. Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
equivalente: 1 día, 2 horas.
 */
package ejerciciosextras;

import java.util.Scanner;


public class EjerciciosExtras {

   
   /* public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.print("Ingresa una cantidad de minutos: ");
        long minutos = leer.nextLong();
        long horas = minutos / 60;
        long dias = minutos / 1440;
        System.out.println("Minutos ingresados: " + minutos);
        System.out.println("Equivalente en horas: " + horas);
        System.out.println("Equivalente en dias: " + dias);
        
    }
    */
    /*public static void main(String[] args) {
        /*
        Crear un método dentro del cual tendrá cuatro variables de tipo entero A, B, C y D y asignarle
un valor diferente a cada una. A continuación, realizar las instrucciones necesarias para que: B
tome el valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar
los valores iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
        */
      /*  Scanner leer = new Scanner(System.in);
        int a, b, c , d, aux;
        System.out.println("Ingrese 4 numeros");
        a = leer.nextInt();
        b = leer.nextInt();
        c = leer.nextInt();
        d = leer.nextInt();
        System.out.println("A: "+ a + " B: "+ b + " C :"+c + " D: "+d);
       aux = b;
        b = c;
        c = a;
        a = d;
        d = aux;
        System.out.println("A: "+ a + " B: "+ b + " C :"+c + " D: "+d);
        
    }
*/
   /* public static void main(String[] args) {
        /*
        Elaborar un método en el cuál se ingrese una letra y se detecte si se trata de una vocal. Caso
contrario mostrar un mensaje.
        */
      /*  Scanner leer = new Scanner(System.in);
        String letra;
        System.out.println("Ingrese una letra");
        letra = leer.nextLine();
        if(letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")){
            System.out.println("La letra es vocal");
        } else {
            System.out.println("La letra es consonante");
        }
}
*/
   /* public static void main(String[] args) {
        /*
        Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su equivalente
en romano.
        */
     /*   Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero del 1 al 10: ");
        num = leer.nextInt();
        
        switch (num){
            case 1:{
                System.out.println("I");
            break;}
            case 2:{
                System.out.println("II");
            break;}
            case 3:{
                System.out.println("III");
            break;}
            case 4:{
                System.out.println("IV");
            break;}
            case 5:{
                System.out.println("V");
            break;}
            case 6:{
                System.out.println("VI");
            break;}
            case 7:{
                System.out.println("VII");
            break;}
            case 8:{
                System.out.println("VIII");
            break;}
            case 9:{
                System.out.println("IX");
            break;}
            case 10:{
                System.out.println("X");
            break;}
            
            default:{System.out.println("El numero ingresado no es valido");}
        }
    
}
*/
 /*   public static void main(String[] args) {
        /*
        Una obra social tiene tres clases de socios:
 Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos
los tipos de tratamientos.
 Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los
mismos tratamientos que los socios del tipo A.
 Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real que represente
el costo del tratamiento (previo al descuento) y determine el importe en efectivo a pagar por dicho
socio. Crear un método con el algoritmo para dar solución a lo propuesto.
        */
      /*  Scanner leer = new Scanner(System.in);
        System.out.println("OBRA SOCIAL");
        System.out.println("1: Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos\n" +
"los tipos de tratamientos.");
        System.out.println("2: Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los\n" +
"mismos tratamientos que los socios del tipo A.");
        System.out.println("3: Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos\n" +
"tratamientos.");
        System.out.println("_______________");
        System.out.print("Ingrese una tipo de socio: ");
        String letra = leer.nextLine();
        System.out.print("Ingrese costo del tratamiento: ");
        double costo = leer.nextDouble();
        double descuentoA = costo * 50 / 100 ;
        double descuentoB = costo * 35 / 100;
        switch(letra){
            case "A":{ System.out.println("El importe a pagar es: " + descuentoA);
            break;    
            }
            case "B":{ System.out.println("El importe a pagar es: " + descuentoB);
            break;    
            }
            case "C":{ System.out.println("El importe a pagar es: " + costo);
            break;    
            }
        } 
    }
    */
    /*public static void main(String[] args) {
      /*
        Crear un método dentro del cual permita la entrada desde teclado de la altura de N personas y
        determinar el promedio de estaturas que se encuentran por debajo de 1.60 mts. y el promedio de
        estaturas en general.
         */
            /*Scanner leer = new Scanner(System.in);
            System.out.print("Ingrese la cantidad de personas: ");
            double n = leer.nextInt();
            double altura;
            double sumaTotal = 0;
            double sumaBajo160 = 0;
            double contadorBajo160 = 0;
            
            for (int i = 1; i <= n; i++) {
                System.out.print("Ingrese la altura de la persona " + i + " (en metros): ");
                altura = leer.nextDouble();
                sumaTotal += altura;
                if (altura < 1.60) {
                    sumaBajo160 += altura;
                    contadorBajo160++;
                }
            }
            
            double promedioTotal = sumaTotal / n;
            double promedioBajo160 = 0;
            if (contadorBajo160 > 0) {
            promedioBajo160 = sumaBajo160 / contadorBajo160;
        }
            
            System.out.println("El promedio de estaturas es: " + promedioTotal + " metros");
            System.out.println("El promedio de estaturas por debajo de 1.60 mts es: " + promedioBajo160 + " metros");
        }
*/
    /*public static void main(String[] args) {
        /*
        Realice un método que calcule y visualice el valor máximo, el valor mínimo y el promedio de
n números (n>0). El valor de n se solicitará al principio del programa y los números serán
introducidos por el usuario. Realice dos versiones del método, una usando el bucle “while” y otra
con el bucle “do - while”.
        */
       /* Scanner leer = new Scanner(System.in);
        int valorMaximo = 0, valorMinimo = 0, promedioN = 0;
        int valorInicial = 0;
        int cont = 0;
        int suma = 0;
        System.out.print("Ingrese un numero para iniciar el programa: ");
        int n = leer.nextInt();
        System.out.println("A continuacion se tendra que inicar una serie de valores, para finalizar intruduzca: 0");
        while(n>0){
            System.out.print("Ingrese otro valor: ");
            n = leer.nextInt();
            suma += n;
            cont++;
            if(true){
              valorInicial = n;
              }else{
                System.out.println("No es un valor valido");
            }
            if(valorInicial > valorMinimo){
                valorMaximo = valorInicial;
            }else{
                if(valorInicial < valorMaximo){
                    valorMinimo = valorInicial;
                }
            }
            promedioN = suma / cont;
        }
        System.out.println("El valor Maximo: " + valorMaximo);
        System.out.println("El valor Minimo: " + valorMinimo);
        System.out.println("El promedio: " + promedioN);
    }
*/
   /* public static void main(String[] args) {
        /*
        Escriba un método que lea números enteros. Si el número es múltiplo de cinco debe detener la
lectura y mostrar la cantidad de números leídos, la cantidad de números pares y la cantidad de
números impares. Al igual que en el ejercicio anterior los números negativos no deben sumarse.
Nota: recordar el uso de la sentencia break.
        */
     /*   Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese numeros");
        
        int cont = 0;
        int nPares = 0;
        int nImpares = 0;
        while(true){
            int n = leer.nextInt();
            cont++;
            if(n%10==5 || n%10==0){
                break;}
             System.out.println("Ingrese otro numero");
            if(n%2==0 && n!=0){
                nPares++;
               }else{
                if(n%2==1 && n>=0)
                nImpares++;  
                }
                 }
        System.out.println("Cantidad de numeros leidos: " + cont);
        System.out.println("Cantidad de numeros pares: " + nPares);
        System.out.println("Cantidad de numeros impares: " + nImpares);
    }
*/
   /* public static void main(String[] args) {
        /*
        Simular la división usando solamente restas. Dados dos números enteros mayores que uno,
realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método: Restar el
dividendo del divisor hasta obtener un resultado menor que el divisor, este resultado es el residuo,
y el número de restas realizadas es el cociente. Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
Crear un método con el algoritmo necesario para dar solución a lo propuesto.
        */
     /*    Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el dividendo: ");
        int dividendo = leer.nextInt();

        System.out.print("Ingrese el divisor: ");
        int divisor = leer.nextInt();

        int cociente = divisionConRestas(dividendo, divisor);// Llama a la función divisionConRestas para obtener el cociente
        int residuo = dividendo - cociente * divisor;// Calcula el residuo a partir del dividendo, el cociente y el divisor
        System.out.println("Cociente: " + cociente + ", Residuo: " + residuo);
        
    }

    public static int divisionConRestas(int dividendo, int divisor) { //funcion
        if (dividendo < divisor) { // Si el dividendo es menor que el divisor, ya no se pueden hacer más restas
            return 0;// El cociente es cero
        } else {
            return 1 + divisionConRestas(dividendo - divisor, divisor);// Se hace una resta y se llama recursivamente a la función con el nuevo dividendo
    }
        }
*/
    /*public static void main(String[] args) {
        /*
        Realice un método para que el usuario adivine el resultado de una multiplicación entre dos
números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario si su respuesta
es o no correcta. En caso que la respuesta sea incorrecta se debe permitir al usuario ingresar su
respuesta nuevamente. Para realizar este ejercicio investigue como utilizar la función
Math.random() de Java.
        */
      /*  Scanner leer = new Scanner(System.in);
        int numero1 = (int) (Math.random()*10);
        int numero2 = (int) (Math.random()*10);
        int respuesta;
        System.out.println("Resuelva la siguente multiplicacion: ");
        System.out.println(numero1 + " * " + numero2);
        respuesta = leer.nextInt();
        while(true){
            if (respuesta == numero1 * numero2){
                System.out.println("La respuesta es correcta");
              break;  }else{
                System.out.println("La respuesta es incorrecta. Ingrese una respuesta nuevamente");
                respuesta = leer.nextInt();
            }
        }
            }
        */    
  /*  public static void main(String[] args) {
        /*
        Escribir un método que lea un número entero y devuelva el número de dígitos que componen
ese número. Por ejemplo, si introducimos el número 12345, el programa deberá devolver 5.
Calcular la cantidad de dígitos matemáticamente utilizando el operador de división. Nota: recordar
que las variables de tipo entero truncan los números o resultados.
        */
        
     /*   Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un número entero:");
        int numero = leer.nextInt();
        
        int cantidadDigitos = contarDigitos(numero);
        
        System.out.println("El número " + numero + " tiene " + cantidadDigitos + " dígitos.");
        
        
    }
    
    public static int contarDigitos(int numero) {
        int contador = 0;
        
        while (numero != 0) {
            numero /= 10;
            contador++;
        }
        
        return contador;
    }
       */         
   /* public static void main(String[] args) {
        /*
        Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-0
al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Crear un método que dé solución a lo propuesto en el enunciado.
        */
      
     /*    for (int i = 0; i <= 9; i++) {
        for (int j = 0; j <= 9; j++) {
            for (int k = 0; k <= 9; k++) {
                if (i == 3) {
                    System.out.print("E-");
                } else if (j == 3) {
                    System.out.print(i + "-E-");
                } else if (k == 3) {
                    System.out.print(i + "-" + j + "-E");
                } else {
                    System.out.print(i + "-" + j + "-" + k);
                }
                System.out.println();
            }
        }
    }
    }
*/
   /* public static void main(String[] args) {
        /*
        Crear un método que dibuje una escalera de números, donde cada línea de números comience
en uno y termine en el número de la línea. Solicitar la altura de la escalera al usuario al comenzar.
Ejemplo: si se ingresa el número 3:
1
12
123
        */
     /*   Scanner leer = new Scanner(System.in);
         System.out.print("Ingrese la altura de la escalera: ");
        int altura = leer.nextInt();
        dibujarEscalera(altura);
    }
    
    public static void dibujarEscalera(int altura) {
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
*/
}

       
    





