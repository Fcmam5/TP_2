package main.model;

/**
 * Created by ilyes on 27/09/15.
 */
public class Compte {

    private static int numCompte = 0;
    private double solde;
    private double taux;


    public Compte(double solde, double taux) {
        Compte.numCompte++;
        this.solde = solde;
        this.taux = taux;
    }

    public int getNumCompte() {
        return numCompte;
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


    public double calculInteret(int taux) {
        return (solde * taux / 100);
    }

    @Override
    public String toString() {
        return "le Compte n: " + numCompte + " Son solde est de : " + (solde - calculInteret((int) taux));
    }


    public void augmenter(double montant) {
        solde += montant;
    }

    public double retirer(double montant) {
        if (solde >= montant) {
            return solde -= montant;
        } else
            return -1;
    }



}
