package main.model;

import java.util.Scanner;

/**
 * Created by fcmam5 on 27/09/15.
 */
public class Distributeur {
    /**
     * afficher
     * consulter
     * ajout
     * retire
     */

    static Compte compte;

    static Scanner clavier = new Scanner(System.in);

    public static void menu() {

        init();

        int choix;

        do {

            System.out.println("1. Affichage");
            System.out.println("2. Taux D'interet");
            System.out.println("3. Ajouter un montant");
            System.out.println("4. Retrait");
            System.out.println("5. Crée un nouveau Compte");
            System.out.println("99. Exit");


            System.out.print("Votre choix : ");
            choix = clavier.nextByte();

            switch (choix) {
                case 1:
                    // Affichage
                    System.out.println(compte.toString());
                    break;
                case 2:
                    // Taux d'interet
                    System.out.println("Votre intert est de : " + compte.calculInteret(5));
                    break;

                case 3:
                    // Ajouter un monatnt
                    System.out.print("Votre montant :");
                    compte.augmenter(clavier.nextDouble());
                    break;

                case 4:
                    // Retrait
                    System.out.print("Montant a retirer : ");
                    compte.retirer(clavier.nextDouble());
                    break;

                case 5:
                    // Crée un nouveau Compte
                    System.out.println("Creation D'un nouveau");
                    Compte com = new Compte(21, 5);
                    System.out.println(com);

            }
        } while (choix != 99);
    }

    private static void init() {
        compte = new Compte(1235, 5);
    }

}
