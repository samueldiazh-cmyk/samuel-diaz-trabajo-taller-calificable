/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

public class Competidor extends Atleta {

    private int rankingMundial;
    private double estatura;
    private double peso;
    private int puntos;

    public Competidor(String nombre, int edad, String pais, int rankingMundial, double estatura, double peso) {
        super(nombre, edad, pais);
        this.rankingMundial = rankingMundial;
        this.estatura = estatura;
        this.peso = peso;
        this.puntos = 0;
    }

    public int getRankingMundial() { return rankingMundial; }
    public int getPuntos() { return puntos; }

    @Override
    public String toString() {
        return super.toString() + " | Ranking: " + rankingMundial + " | Estatura: " + estatura
                + " | Peso: " + peso + " | Puntos: " + puntos;
    }
}
