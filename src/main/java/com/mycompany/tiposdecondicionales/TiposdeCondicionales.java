/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tiposdecondicionales;

/**
 *
 * @author jmbb
 */
public class TiposdeCondicionales {

    public static void main(String[] args) {
        if (noHayInternet) {
        System.out.println("No hay inertnet");
    }  else if (hayInternetPeroMuyPoquito) {
        System.out.println("Tienes muy poquito Internet");
    }   else if (hayBuenInernetPeroNoEsSuficiente) {
        System.out.println("Casi casi, falta un poquito mas");
    } else {
        System.out.println("¡Tienes sufiente Internet");
    }

