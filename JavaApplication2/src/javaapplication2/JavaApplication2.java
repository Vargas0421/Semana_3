/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author varga
 */
import javax.swing.JOptionPane;
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
     //Ejercicio 1 semana 3
    /*
    for (int i = 0; i < 5; i++){
    System.out.println("@@@@@@@@@@");
    }
    */

    
    //Ejercicio 2 semana 3
    /*
    String a;
    double numero;    
    a = JOptionPane.showInputDialog("Introduzca el numero para realizar la tabla");     
    numero = Double.parseDouble(a);
    
    int tabla = 1;
    for (int contador = 0; contador <= 9; contador++){
        System.out.println(numero + "x" + tabla + "=" + numero*tabla);
        tabla = tabla+1;
    }*/
    
    //Ejercicio 3 semana 3
    /*
    String b;
    double cantidad;    
    b = JOptionPane.showInputDialog("Ingrese la cantidad de veces que se va extender el triangulo");     
    cantidad = Double.parseDouble(b);
    String contenido = "*";
        
        while (cantidad >= 0){
            System.out.println(contenido);
            contenido = contenido + "*";
            cantidad--;
        }*/
        
    //Ejercicio 4 semana 3
    /*
    int valor = 10;
    int digito = 20;
    while (valor >= 0){
        System.out.println(digito + " al cuadrado" + " = " + digito * digito);
        digito++;
        valor--;
    }*/
        
     //Ejercicio 5 semana 3
     /*
    String x;
    int estudiantes;  
    x = JOptionPane.showInputDialog("Introduzca la cantidad de estudiantes");    
    estudiantes = Integer.parseInt(x);  
    int promedio = 0;
    int nota_mayor = 0;
    int nota_menor = 100; 
    int aprobados = 0 ;
            
        for (int i = 0; i < estudiantes; i++) {
        String y;
        int nota;  
        y = JOptionPane.showInputDialog("introduzca la nota");    
        nota = Integer.parseInt(y);
        if (nota >= 70){
            aprobados = aprobados + 1; 
        }
        if ( nota > nota_mayor){
            nota_mayor = nota;
        }
        if ( nota < nota_menor){
            nota_menor = nota;
        }
     
        promedio = promedio + nota; 
        }
        
        System.out.println("el promedio de las notas de los " + estudiantes + " es " + promedio / estudiantes);
        System.out.println("la cantidad de estudiantes aprobados es de" + aprobados);
        System.out.println("la nota mayor es de" + nota_mayor);
        System.out.println("la nota menor es de" + nota_menor);
    */
      
     //Ejercicio 6 ssemana 3
    int promedio = 0;
    int nota_mayor = 0;
    int nota_menor = 100; 
    int aprobados = 0 ;
    int nota = 0 ;
    int estudiantes = 0;
    
        do {  
            String y;
            y = JOptionPane.showInputDialog("introduzca la nota");    
            nota = Integer.parseInt(y);   
            
            if (nota >= 70){
                aprobados = aprobados + 1; 
            }
            if ( nota > nota_mayor){
                nota_mayor = nota;
            }
            if ( nota < nota_menor){
                nota_menor = nota;
            }
            promedio = promedio + nota;
            
            estudiantes = estudiantes +  1; 
        }while (nota >= 0);
        System.out.println("el promedio de las notas de los " + estudiantes + " es " + promedio / estudiantes);
        System.out.println("la cantidad de estudiantes aprobados es de " + aprobados);
        System.out.println("la nota mayor es de " + nota_mayor);
        System.out.println("la nota mayor es de " + nota_menor);
        
        
    }
}
