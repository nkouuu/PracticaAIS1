/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaminasgit;

import java.io.Serializable;

/**
 *
 * @author Diegomendez1997
 */
public class Datos implements Serializable{
    private int n;
    private int m;
    int nomines;
    int [][] mines;
    int guesses[][];
    int perm[][];
    Botones botones [][];
    
    public Datos(int n,int m){
        this.n=n;
        this.m=m;
        mines=new int[n+2][m+2];
        guesses=new int[n+2][m+2];
        perm=new int[n][m];
        botones=new Botones[n][m];
        for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    //datos.getBotones()[n][m].setColor(b[n][m].getBackground());
                    botones[i][j]=new Botones();
                }
            }
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getNomines() {
        return nomines;
    }

    public void setNomines(int nomines) {
        this.nomines = nomines;
    }

    public int[][] getMines() {
        return mines;
    }

    public void setMines(int[][] mines) {
        this.mines = mines;
    }

    public int[][] getGuesses() {
        return guesses;
    }

    public void setGuesses(int[][] guesses) {
        this.guesses = guesses;
    }

    public int[][] getPerm() {
        return perm;
    }

    public void setPerm(int[][] perm) {
        this.perm = perm;
    }

    public Botones[][] getBotones() {
        return botones;
    }

    public void setBotones(Botones[][] botones) {
        this.botones = botones;
    }

    
    
}
