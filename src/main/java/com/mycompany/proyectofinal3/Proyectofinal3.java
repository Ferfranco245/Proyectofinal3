/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectofinal3;
import java.util.ArrayList;
/**
 *
 * @author fernada
 */
public class Proyectofinal3 {
     public static ArrayList<Usuario> usuarios = new ArrayList<>();

    public static void main(String[] args) {
        Login v = new Login();
        v.setVisible(true);

        // Crear usuario administrador
        Usuario admin = new Usuario("Fernanda", "admin", "admin", 1);
        usuarios.add(admin);

        // Crear usuario vendedor
        Usuario vendedor = new Usuario("Fernanda", "Fernanda", "Fer123", 2);
        usuarios.add(vendedor);
      }
 public static ArrayList<Libro> libro = new ArrayList<>();
 public static ArrayList<Cupon> cupones = new ArrayList<>();
 public static ArrayList<RegistroVentas> listaRegistroVentas = new ArrayList<>();
 
 

}
