package main.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ilyes on 27/09/15.
 */
public class Compte {

    private int numCompte;
    private double solde;
    private double taux;


    public Compte(int numCompte, double solde, double taux) {
        this.numCompte = numCompte;
        this.solde = solde;
        this.taux = taux;
    }

    public int getNumCompte() {
        return numCompte;
    }

    public void setNumCompte(int numCompte) {
        this.numCompte = numCompte;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }


    @Override
    public String toString() {
        return "le Compte n: " + numCompte + " Son solde est de : " + solde;
    }

    public double calculInteret(int taux) {
        return (solde * taux / 100);

    }

    InputStreamReader lecture = new InputStreamReader(System.in);
    BufferedReader clavier = new BufferedReader(lecture);

    /***
     * @param montant
     * @param choice
     */
    public void modification(double montant, int choice) throws IOException {


        int choix = Integer.parseInt(clavier.readLine());
        switch (choix) {
            //ajout
            case 1:
                solde += montant;
                break;
            //retirer
            case 2:
                solde -= montant;
                break;
        }

    }

//    public void augmenter(double montant){
//        solde
//    }


    double calculInteret() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
