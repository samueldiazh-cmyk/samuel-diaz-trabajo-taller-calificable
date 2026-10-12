/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import Modelo.Competidor;
import Vista.VistaMundial;
import java.util.ArrayList;

public class ControladorMundial {

    private ArrayList<Competidor> competidores;
    private VistaMundial vista;

    public ControladorMundial(VistaMundial vista) {
        this.vista = vista;
        this.competidores = new ArrayList<>();
    }

    public void registrarCompetidor(Competidor c) {
        competidores.add(c);
    }

    public Competidor buscarCompetidor(String nombre) {
        for (Competidor c : competidores) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                return c;
            }
        }
        return null;
    }

    public String listarCompetidores() {
        if (competidores.isEmpty()) {
            return "No hay competidores registrados";
        }
        String texto = "";
        for (Competidor c : competidores) {
            texto = texto + c.toString() + "\n";
        }
        return texto;
    }

    public void iniciar() {
        int opcion;
        do {
            opcion = vista.mostrarMenu();
            switch (opcion) {
                case 1:
                    String nombre = vista.leerTexto("Nombre: ");
                    int edad = vista.leerEntero("Edad: ");
                    String pais = vista.leerTexto("Pais: ");
                    int ranking = vista.leerEntero("Ranking mundial: ");
                    double estatura = vista.leerDecimal("Estatura (m): ");
                    double peso = vista.leerDecimal("Peso (kg): ");
                    registrarCompetidor(new Competidor(nombre, edad, pais, ranking, estatura, peso));
                    vista.mostrarMensaje("Competidor registrado");
                    break;
                case 2:
                    Competidor c = buscarCompetidor(vista.leerTexto("Nombre del competidor: "));
                    if (c == null) {
                        vista.mostrarMensaje("Competidor no encontrado");
                    } else {
                        int puntosObtenidos = vista.leerEntero("Puntos obtenidos: ");
                        String medalla = vista.leerTexto("Gano medalla? (s/n): ");
                        if (medalla.equalsIgnoreCase("s")) {
                            c.actualizarRanking(puntosObtenidos, true);
                        } else {
                            c.actualizarRanking(puntosObtenidos);
                        }
                        vista.mostrarMensaje("Ranking actualizado: " + c.toString());
                    }
                    break;
                case 3:
                    vista.mostrarMensaje(listarCompetidores());
                    break;
                case 4:
                    vista.mostrarMensaje("Saliendo...");
                    break;
                default:
                    vista.mostrarMensaje("Opcion no valida");
            }
        } while (opcion != 4);
    }
}