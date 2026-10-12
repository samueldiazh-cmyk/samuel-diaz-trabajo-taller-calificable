/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.util.Scanner;

public class VistaMundial {

    private Scanner sc = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n=== MUNDIAL DE CICLISMO DE PISTA - CALI ===");
        System.out.println("1. Registrar competidor");
        System.out.println("2. Actualizar ranking");
        System.out.println("3. Listar competidores");
        System.out.println("4. Salir");
        return leerEntero("Opcion: ");
    }

    public String leerTexto(String mensaje) {
        System.out.print(mensaje);
        return sc.nextLine();
    }

    public int leerEntero(String mensaje) {
        System.out.print(mensaje);
        int valor = sc.nextInt();
        sc.nextLine();
        return valor;
    }

    public double leerDecimal(String mensaje) {
        System.out.print(mensaje);
        double valor = sc.nextDouble();
        sc.nextLine();
        return valor;
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
