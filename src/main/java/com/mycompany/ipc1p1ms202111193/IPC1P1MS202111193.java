/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ipc1p1ms202111193;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author solar
 */
public class IPC1P1MS202111193 {

    public static void main(String[] args) {
                System.out.println("MENU CALCULADORA\n1.Iniciar Sistema\n2.Salir");//Escoger si iniciar sistema o terminar.
        Scanner leer=new Scanner(System.in);
        int o1 = leer.nextInt();
        
        if (o1 == 1) {                                                    //Iniciar Sistema
            System.out.println("Seleccionar las operaciones que desea realizar:");
            System.out.println("1.Aritmetica\n2.Geometria\n3.Estadistica\n4.Avanzadas");//Seleccionar tipo de operacion
                int o2 = leer.nextInt();
                
                if (o2 == 1){
                    System.out.println("Indicar operacion aritmetica:\n1.SUMA\n2.RESTA\n3.MULTIPLICACION\n4.DIVISION");//Seleccionar operacion aritmetica
                                   int o2_1 = leer.nextInt();
                                   if (o2_1 == 1){
                                           System.out.println("Ingresar datos a SUMAR\nrecuerde que puede ingresar hasta 10 datos");                              //SUMA
                                          
                                           float s1 = leer.nextFloat();
                                           float s2 = leer.nextFloat();
                                           System.out.println("Si desea realizar su operacion seleccione el 0");
                                            float s3 = leer.nextFloat();
                                            if (s3 == 0){
                                                
                                                System.out.println("La SUMA de los datos es:" +(s1+s2));
                                            }
                                            else  {
                                                 System.out.println("Si desea realizar su operacion seleccione el 0");
                                            float s4 = leer.nextFloat();
                                                  if (s4 == 0){
                                                
                                                    System.out.println("La SUMA de los datos es:" +(s1+s2+s3));
                                            }
                                                    else  {
                                                       System.out.println("Si desea realizar su operacion seleccione el 0");
                                                    float s5 = leer.nextFloat();
                                                          if (s5 == 0){
                                                
                                                          System.out.println("La SUMA de los datos es:" +(s1+s2+s3+s4));
                                            }
                                                          else  {
                                                               System.out.println("Si desea realizar su operacion seleccione el 0");
                                                          float s6 = leer.nextFloat();
                                                                if (s6 == 0){
                                                
                                            }
                                                                else  {
                                                                     System.out.println("Si desea realizar su operacion seleccione el 0");
                                                                float s7 = leer.nextFloat();
                                                                      if (s7 == 0){
                                                
                                                                      System.out.println("La SUMA de los datos es:" +(s1+s2+s3+s4+s5+s6));
                                                                System.out.println("La SUMA de los datos es:" +(s1+s2+s3+s4+s5));
                                            }
                                                                      else  {
                                                                           System.out.println("Si desea realizar su operacion seleccione el 0");
                                                                      float s8 = leer.nextFloat();
                                                                            if (s8 == 0){
                                                
                                                                            System.out.println("La SUMA de los datos es:" +(s1+s2+s3+s4+s5+s6+s7));
                                            }
                                                                            else  {
                                                                                 System.out.println("Si desea realizar su operacion seleccione el 0");
                                                                            float s9 = leer.nextFloat();
                                                                            if (s9 == 0){
                                                
                                                                            System.out.println("La SUMA de los datos es:" +(s1+s2+s3+s4+s5+s6+s7+s8));
                                            }
                                                                            else  {
                                                                                 System.out.println("Si desea realizar su operacion seleccione el 0");
                                                                            float s10 = leer.nextFloat();
                                                                                System.out.println("La Suma de los datos es:"+(s1+s2+s3+s4+s5+s6+s7+s8+s9+s10));
                                               
                                               
                                            
                                               
                                            }
                                               
                                            }
                                               
                                            }
                                               
                                            }
                                               
                                               
                                            }
                                               
                                            }
                                            }
                                           
                                           
                                           
                                               
            
                                                    
                                           
                                   }
                                   else if (o2_1 == 2){
                                       System.out.println("Ingresar datos a RESTAR\nrecuerde que puede ingresar hasta 10 datos");                                   //Resta
                                          
                                           float r1 = leer.nextFloat();
                                           float r2 = leer.nextFloat();
                                           System.out.println("Si desea realizar su operacion seleccione el 0");
                                            float r3 = leer.nextFloat();
                                            if (r3 == 0){
                                                
                                                System.out.println("La RESTA de los datos es:" +(r1-r2));
                                            }
                                            else  {
                                                 System.out.println("Si desea realizar su operacion seleccione el 0");
                                            float r4 = leer.nextFloat();
                                                  if (r4 == 0){
                                                
                                                    System.out.println("La RESTA de los datos es:" +(r1-r2-r3));
                                            }
                                                    else  {
                                                       System.out.println("Si desea realizar su operacion seleccione el 0");
                                                    float r5 = leer.nextFloat();
                                                          if (r5 == 0){
                                                
                                                          System.out.println("La RESTA de los datos es:" +(r1-r2-r3-r4));
                                            }
                                                          else  {
                                                               System.out.println("Si desea realizar su operacion seleccione el 0");
                                                          float r6 = leer.nextFloat();
                                                                if (r6 == 0){
                                                
                                                                System.out.println("La RESTA de los datos es:" +(r1-r2-r3-r4-r5));
                                            }
                                                                else  {
                                                                     System.out.println("Si desea realizar su operacion seleccione el 0");
                                                                float r7 = leer.nextFloat();
                                                                      if (r7 == 0){
                                                
                                                                      System.out.println("La RESTA de los datos es:" +(r1-r2-r3-r4-r5-r6));
                                            }
                                                                      else  {
                                                                           System.out.println("Si desea realizar su operacion seleccione el 0");
                                                                      float r8 = leer.nextFloat();
                                                                            if (r8 == 0){
                                                
                                                                            System.out.println("La RESTA de los datos es:" +(r1-r2-r3-r4-r5-r6-r7));
                                            }
                                                                            else  {
                                                                                 System.out.println("Si desea realizar su operacion seleccione el 0");
                                                                            float r9 = leer.nextFloat();
                                                                            if (r9 == 0){
                                                
                                                                            System.out.println("La RESTA de los datos es:" +(r1-r2-r3-r4-r5-r6-r7-r8));
                                            }
                                                                            else  {
                                                                                 System.out.println("Si desea realizar su operacion seleccione el 0");
                                                                            float r10 = leer.nextFloat();
                                                                                System.out.println("La RESTA de los datos es:"+(r1-r2-r3-r4-r5-r6-r7-r8-r9-r10));
                                               
                                               
                                            
                                               
                                            }
                                               
                                            }
                                               
                                            }
                                               
                                            }
                                               
                                               
                                            }
                                               
                                            }
                                            }
                                   }
                                   else if (o2_1 == 3){
                                       System.out.println("Ingresar datos a MULTIPLICAR\nrecuerde que puede ingresar hasta 10 datos\ncuando desee realizar la operacion debe de ingresar la letra r");//Multi
                                            float m1 = leer.nextFloat();
                                           float m2 = leer.nextFloat();
                                           System.out.println("Si desea realizar su operacion seleccione el 0");
                                            float m3 = leer.nextFloat();
                                            if (m3 == 0){
                                                
                                                System.out.println("La MULTIPLICACION de los datos es:" +(m1*m2));
                                            }
                                            else  {
                                                 System.out.println("Si desea realizar su operacion seleccione el 0");
                                            float m4 = leer.nextFloat();
                                                  if (m4 == 0){
                                                
                                                    System.out.println("La MULTIPLICACION de los datos es:" +(m1*m2*m3));
                                            }
                                                    else  {
                                                       System.out.println("Si desea realizar su operacion seleccione el 0");
                                                    float m5 = leer.nextFloat();
                                                          if (m5 == 0){
                                                
                                                          System.out.println("La MULTIPLICACION de los datos es:" +(m1*m2*m3*m4));
                                            }
                                                          else  {
                                                               System.out.println("Si desea realizar su operacion seleccione el 0");
                                                          float m6 = leer.nextFloat();
                                                                if (m6 == 0){
                                                
                                                                System.out.println("La MULTIPLICACION de los datos es:" +(m1*m2*m3*m4*m5));
                                            }
                                                                else  {
                                                                     System.out.println("Si desea realizar su operacion seleccione el 0");
                                                                float m7 = leer.nextFloat();
                                                                      if (m7 == 0){
                                                
                                                                      System.out.println("La MULTIPLICACION de los datos es:" +(m1*m2*m3*m4*m5*m6));
                                            }
                                                                      else  {
                                                                           System.out.println("Si desea realizar su operacion seleccione el 0");
                                                                      float m8 = leer.nextFloat();
                                                                            if (m8 == 0){
                                                
                                                                            System.out.println("La MULTIPLICACION de los datos es:" +(m1*m2*m3*m4*m5*m6*m7));
                                            }
                                                                            else  {
                                                                                 System.out.println("Si desea realizar su operacion seleccione el 0");
                                                                            float m9 = leer.nextFloat();
                                                                            if (m9 == 0){
                                                
                                                                            System.out.println("La MULTIPLICACION de los datos es:" +(m1*m2*m3*m4*m5*m6*m7*m8));
                                            }
                                                                            else  {
                                                                                 System.out.println("Si desea realizar su operacion seleccione el 0");
                                                                            float m10 = leer.nextFloat();
                                                                                  if (m10 == 0){
                                                                                      System.out.println("La MULTIPLICACION de los datos es:"+(m1*m2*m3*m4*m5*m6*m7*m8*m9));
                                               
                                                                                  }
                                                                                
                                               
                                            
                                               
                                            }
                                               
                                            }
                                               
                                            }
                                               
                                            }
                                               
                                               
                                            }
                                               
                                            }
                                            }
                                   }
                                   else if (o2_1 == 4){
                                       System.out.println("Ingresar datos a DIVIDIR");//DIVI
                                       float d1 = leer.nextFloat();
                                       float d2 = leer.nextFloat();
                                       
                                       System.out.println("La DIVISION es:" +(d1/d2));
                                   
                                   
                                   }
                }
                else if (o2 == 2){                                                           //Calculo geometrico
                    System.out.println("Indicar calculo geometrico:\n1.Areas\n2.Perimetros");//Sellecionar calculo geometrico
                                   int o2_2 = leer.nextInt();
                                   if (o2_2 == 1){
                                       System.out.println("Seleccionar la figura para calcular area\nRecordar que las medidas se dan en metros\n1.Triangulos\n2.Cuadrados\n3.Rectangulos\n4.Circulos");//Tipo de figura dentro del calculo geometrico
                                       
                                       int o2_2_1 = leer.nextInt();
                                       if (o2_2_1 == 1){//Triangulo
                                           System.out.println("Por favor ingresar Base y Altura del triangulo:");
                                           System.out.println("Base");float base_t = leer.nextFloat();
                                           System.out.println("Altura");float altura_t = leer.nextFloat();
                                           System.out.println("El area del triangulo es:"+((base_t*altura_t)/2));
                                           
                                       }
                                       else if (o2_2_1 == 2){//Cuadrado
                                           System.out.println("Ingresar un lado del cuadrado");
                                           System.out.println("Lado");float lado_c = leer.nextFloat();
                                           System.out.println("El area del cuadrado es:"+(lado_c*lado_c));
                                       }
                                       else if (o2_2_1 == 3){//Rectangulo
                                           System.out.println("Ingresar Base y Altura del rectangulo:");
                                           System.out.println("Base");float base_r = leer.nextFloat();
                                           System.out.println("Altura");float altura_r = leer.nextFloat();
                                           System.out.println("El area del rectangulo es:"+(base_r*altura_r));
                                       }
                                       else if (o2_2_1 == 4){//Circulo
                                           double pi = 3.1416;
                                           System.out.println("Ingresar el radio del circulo:");
                                           System.out.println("Radio:");float radio_ci = leer.nextFloat();
                                           System.out.println("El area del circulo es:"+(pi*radio_ci*radio_ci));
                                       }
                                   
                                   }
                                   else if (o2_2 == 2){
                                       System.out.println("Seleccionar la figura para calcular perimetro\n1.Triangulos\n2.Cuadrados\n3.Rectangulos\n4.Circulos");//Tipo de figura dentro del calculo geometrico
                                       int o2_2_2 = leer.nextInt();
                                       if (o2_2_2 == 1){//Triangulo
                                           System.out.println("Ingresar los tres lados del triangulo:");
                                           System.out.println("Lado 1");float lado_1t = leer.nextFloat();
                                           System.out.println("Lado 2");float lado_2t = leer.nextFloat();
                                           System.out.println("Lado 3");float lado_3t = leer.nextFloat();
                                           System.out.println("El perimetro del triangulo es:" +(lado_1t+lado_2t+lado_3t));
                                           
                                       }
                                       else if (o2_2_2 == 2){//Cuadrado
                                           System.out.println("Ingrear el lado del cuadrado");
                                           System.out.println("Lado");float lado_pc = leer.nextFloat();
                                           System.out.println("El perimetro del rectangulo es:"+(4*lado_pc));
                                       }
                                       else if (o2_2_2 == 3){//Rectangulo
                                           System.out.println("Ingresar Base y Altura del rectangulo:");
                                           System.out.println("Base");float base_pr = leer.nextFloat();
                                           System.out.println("Altura");float altura_pr = leer.nextFloat();
                                           System.out.println("El perimetro del rectangulo es:"+((2*base_pr)+(2*altura_pr)));
                                       
                                       }
                                       else if (o2_2_2 == 4){//Circulo
                                           double pi = 3.1416;
                                           System.out.println("Ingresar el radio del circulo:");
                                           System.out.println("Radio:");float radio_pci = leer.nextFloat();
                                           System.out.println("El perimetro del circulo es:"+(pi*radio_pci*2));
                                       }
                                   
                                   
                                   }
                }
                 else if (o2 == 3){
                     System.out.println("Indicar calculo estadistico:\n1.Moda\n2.Mediana\n3.Media");                  //Sellecionar calculo estadistico
                                   int o2_3 = leer.nextInt();
                                   
                                   if (o2_3 == 1){ //MODA
                                       System.out.println("Ingresar la cantidad de números aleatorios para el calculo de la MODA");
                                       int cont = 0;
                                       int limMo = leer.nextInt();
                                       System.out.println("Listado de numeros:");
                                       int [] listaMo = new int [limMo];
                                       Random numal = new Random();
                                       
                                       while(cont < limMo){
                                       
                                           listaMo[cont] = numal.nextInt(501);
                                           int numR = numal.nextInt(501);
                                           System.out.println(numR);
                                           cont++;
                                       }
                                       System.out.println("No hay numeros repetidos por lo tanto no hay MODA para este conjunto de numeros");
                                   }
                                   else if (o2_3 == 2){//MEDIANA
                                   System.out.println("Ingresar la cantidad de números aleatorios para el calculo de la MEDIANA");
                                       int cont = 0;
                                       int limMo = leer.nextInt();
                                       System.out.println("Listado de numeros:");
                                       int [] listaMo = new int [limMo];
                                       Random numal = new Random();
                                       
                                       while(cont < limMo){
                                       
                                           listaMo[cont] = numal.nextInt(501);
                                           int numR = numal.nextInt(501);
                                           System.out.println(numR);
                                           cont++;
                                       }
                                       System.out.println("Para calcular la mediana debes de ordenar el listado anterior, si es par\n Debes de sumar los dos de en medio y dividirlo dentro de dos\n Si es impar unicamente esocges el de en medio");
                                       
                                   }
                                   else if (o2_3 == 3){//MEDIA
                                   System.out.println("Ingresar la cantidad de números aleatorios para el calculo de la MEDIA");
                                       int cont = 0;
                                       int limMo = leer.nextInt();
                                       System.out.println("Listado de numeros:");
                                       int [] listaMo = new int [limMo];
                                       Random numal = new Random();
                                       
                                       while(cont < limMo){
                                       
                                           listaMo[cont] = numal.nextInt(501);
                                           int numR = numal.nextInt(501);
                                           System.out.println(numR);
                                           cont++;
                                       }
                                       System.out.println("La media sera igual a la suma de otodos los numeros anteriores dividido dentro de:" +limMo);
                                   }
                 }
                 else if (o2 == 4){
                     System.out.println("Indicar operacion avanzada:\n1.Factorial N\n2.Fibonacci");                      //Seleccionar operacion avanzada
                                   int o2_4 = leer.nextInt();
                                   if (o2_4 == 1){                                                                       //Factorial
                                       System.out.println("Ingresar el factorial que desea calcular\nUnicamente utilizar numeros entre (1-100)");
                                       int fact = leer.nextInt();
                                       int factorial = 1;
                                       for (int i = 1; i<fact;i++){
                                       factorial = factorial * i;
                                   }
                                       System.out.println("El factorial de:" +fact+ "Es:" +factorial );
                                   }
                                   else if (o2_4 == 2){                                                                    //Fibonacci
                                       int f1=0,f2=1,f3,fn;
                                       System.out.println("Ingresar el numero de elemento que desea calcular de la serie Fibonacci:\nUnicamente utilizar numeros entre (1-100)");
                                       fn = leer.nextInt();
                                       for ( int i = 0; i <fn; i++){
                                       System.out.println(f1);
                                           f3 = f1 + f2;
                                           f1 = f2;
                                           f2 = f3;
                                       
                                       }
                                       
                                       
                                       
                                   }
                }
        }
        else if (o1 == 2 ){                                                                                              //Finalizar sistema
            System.out.println("SISTEMA FINALIZADO");
        }
    }
}
