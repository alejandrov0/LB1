/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author ZenBook Flip 5
 */
public class LAB1 {

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(68);
        lista.add(5);
        lista.add(100);
        //se invoca al metodo de ordenamiento
        // utilizando api Collection
        Collections.sort(lista);
        System.out.println("Ordenado "+lista);

       
        Collections.reverse(lista);
        System.out.println("reversa "+lista);
    }
}
    

