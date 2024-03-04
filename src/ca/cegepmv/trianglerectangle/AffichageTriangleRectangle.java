package ca.cegepmv.trianglerectangle;

import java.util.Random;

public class AffichageTriangleRectangle {

	public static void main(String[] args) {
		afficherTriangle(4, 3);
	}
	
	private static void afficherTriangle(int height, int multiple){
		//Vous ne devrez pas changer le début de cette méthode
        String [] couleurs = {Couleur.CYAN, Couleur.BLUE, Couleur.RED, Couleur.GREEN, Couleur.PURPLE, Couleur.YELLOW};
        
        //Utilise cet objet random pour générer les couleurs aléatoires du tableau couleur
        Random random = new Random();
		/*******************************votre code va ici*******************************************/

        for (int i = 0; i <= height; i++){
            String couleursAleatoires =couleurs[random.nextInt(couleurs.length)];
            System.out.println(couleursAleatoires+"*".repeat(multiple*i)+Couleur.RESET);

        }
        
    }

}
