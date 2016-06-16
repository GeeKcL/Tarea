/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author abdelkarin
 */
import java.util.Scanner;
public class Tarea2 {
//MAIN
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Tam password: ");
        int Tam=sc.nextInt();
        String a=Tarea2.SeccionA(MAYUSCULAS,Tam);
        String b=Tarea2.SeccionB(PARES, Tam); 
        String c=Tarea2.SeccionC(NUMEROS, Tam);
        String d=Tarea2.SeccionD(NUMEROS,MINUSCULAS, Tam);
        String e=Tarea2.SeccionE(MINUSCULAS,Tam);
        System.out.println("Contraseña generada: "+a+"-"+b+"-"+c+"-"+d+"-"+e);
    }

    public static String NUMEROS = "0123456789";
    public static String PARES = "02468";
    
    public static String MAYUSCULAS = "BCDFGHJKLMNPQSTVWXYZ";
    public static String MINUSCULAS = "abcdefghijklmnopqrstuvwxyz"; 
   
//SECCION A
    public static String SeccionA(String key, int length) {
        String pswd = "AR";
        for (int i = 0; i < length; i++) {
            pswd+=(key.charAt((int)(Math.random() * key.length())));
        }
        //System.out.println(pswd);
        return pswd;
    }
        
//SECCION B    
    public static String SeccionB(String key, int length) {
        String pswd = "";
        String n3 = "";
        n3+=(key.charAt((int)(Math.random() * key.length())));
        
        for (int i = 0; i < length; i++) {
            pswd+=(key.charAt((int)(Math.random() * key.length())));
        }
        pswd+=n3+n3+n3;
        //System.out.println(pswd);
        return pswd;
    }
    
//SECCION C
        public static String SeccionC(String key, int length) {
        String onetofive = "";
        onetofive+=key.charAt((int)(Math.random() * (6-0)+0 ));
        String pswd = onetofive;
        int[]num=new int[length];
        int c=0;
        int j=0;
        for (int i = 0; i < length; i++) {
           c++;
           num[i]=(int) Math.pow(3, c); 
        j=48*(num[(int)(Math.random()*num.length)]);
        }
        pswd+=j;  
        //System.out.println(pswd);
        return pswd;
    }
  
//SECCION D
    public static String SeccionD(String key,String key2, int length) {
        /////////////////////////////////////////////////////////////////////////////////////////////////
        String ceroanueve = "";
        ceroanueve+=key.charAt((int)(Math.random() * key.length()));// primer digito de 0-9
        //System.out.println(ceroanueve);


        ///////////////////////////////////////////////////////////////////////////////////////////////////
        int[]num=new int[length];
        for (int i = 0; i < length; i++) {
            num[i]=(int) Math.pow(2, i);// genero largo par para las minusculas. si da 1n entonces no hay minusculas
            //System.out.println("numen la posicion "+i+": "+num[i]);
        }
        int c=(num[(int)(Math.random()*num.length)]);
        //System.out.println("c: "+c);
        String pswd=ceroanueve;
        if (c!=1){
            for (int i = 0; i < c ; i++) {
                pswd+=(key2.charAt((int)(Math.random() * key2.length())));
            }                
        }
        //////////////////////////////////////////////////////////////////////////////////////////////////
        //System.out.println(pswd);
        return pswd;    
    }
//SECCION E
    public static String SeccionE(String key, int length) {
        String pswd = "";
        for (int i = 0; i < length; i++) {
                pswd+=(key.charAt((int)(Math.random() * key.length())))+"x";
        }
        //System.out.println(pswd);
        return pswd;
    }
    
}

/*
//MAIN
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Tam password: ");
        int Tam=sc.nextInt();
        String a=Tarea2.SeccionA(MAYUSCULAS,Tam-2);
        String b=Tarea2.SeccionB(PARES, Tam-3); 
        String c=Tarea2.SeccionC(NUMEROS, Tam-1);
        String d=Tarea2.SeccionD(NUMEROS,MINUSCULAS, Tam);
        String e=Tarea2.SeccionE(MINUSCULAS,Tam);
        System.out.println("Contraseña generada: "+a+"-"+b+"-"+c+"-"+d+"-"+e);
    }
*/