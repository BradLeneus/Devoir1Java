package ca.cegepmv.grille.sudoku;

import java.util.Scanner;

public class Board {
    Case[][] cellules;
    public Board(Case[][] cellules){
        this.cellules = cellules;
    }

    public void demarrerJeu() {
        Scanner scan = new Scanner(System.in);
        int rangee, colonne, valeur;

        System.out.println("À n'importe quel moment, vous pouvez taper 0 pour terminer le jeu.\n");

        while(true) {
            afficherBoard();

            System.out.println("Entrez le numéro de la rangée à mettre à jour (1-9):");
            rangee = scan.nextInt();
            if (rangee == 0) break;

            System.out.println("Entrez le numéro de la colonne à mettre à jour (1-9):");
            colonne = scan.nextInt();
            if (colonne == 0) break;

            System.out.println("Entrez la valeur à mettre dans la case (1-9):");
            valeur = scan.nextInt();
            if (valeur == 0) break;

            if (cellules[rangee-1][colonne-1].isDefaut()) {
                System.out.println("Désolé, vous ne pouvez pas changer la valeur à cette position, car c'est une valeur par défaut et cette valeur est " + cellules[rangee-1][colonne-1].getValeur());
            } else {
                cellules[rangee-1][colonne-1].setValeur(String.valueOf(valeur));
            }
        }
    }

    private void afficherBoard(){
        for (int i = 0; i < cellules.length; i++) {
            for (int j = 0; j < cellules[i].length; j++){
                if (cellules[i][j].isDefaut()) {
                    System.out.print(Couleur.BLUE + cellules[i][j].getValeur() + Couleur.RESET + " ");
                } else {
                    System.out.print(Couleur.RED + cellules[i][j].getValeur() + Couleur.RESET + " ");
                }
            }
            System.out.println();
        }
    }
}