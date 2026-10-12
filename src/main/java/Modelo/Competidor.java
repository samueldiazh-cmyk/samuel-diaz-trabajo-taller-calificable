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
    
 public void actualizarRanking(int puntosObtenidos) {
        puntos = puntos + puntosObtenidos;
       
        rankingMundial = rankingMundial - (puntosObtenidos / 100);
        if (rankingMundial < 1) {
            rankingMundial = 1;
        }
    }

    
    public void actualizarRanking(int puntosObtenidos, boolean ganoMedalla) {
        int bonificacion;
        if (ganoMedalla) {
            if (puntosObtenidos >= 100) {
                bonificacion = 100;
            } else {
                bonificacion = 50;
            }
        } else {
            bonificacion = 0;
        }
        actualizarRanking(puntosObtenidos + bonificacion);
    }

    

    @Override
    public String toString() {
        return super.toString() + " | Ranking: " + rankingMundial + " | Estatura: " + estatura
                + " | Peso: " + peso + " | Puntos: " + puntos;
    }
    }
   
   
