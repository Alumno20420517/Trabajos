/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete;

/**
 *
 * @author elalb
 */
public class ClasePass {
    public static String NUMEROS = "0123456789";
    public static String MAYUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static String MINUSCULAS = "abcdefghijklmnopqrstuvwxyz";
    public static String ESPECIALES = "!@#$%^&*=+";
    public static String ObtenerContra(){
        return ObtenerContra(8);
    }
    public static String ObtenerContra(int length){
        return ObtenerContra(NUMEROS + MAYUSCULAS + MINUSCULAS + ESPECIALES, length);
    }
    public static String ObtenerContra(String key, int length){
        String pswd = "";
        for(int i=0;i<length;i++){
            pswd+=(key.charAt((int)(Math.random()*key.length())));
        }
        return pswd;
    }
}
