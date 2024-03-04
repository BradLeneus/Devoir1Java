package ca.cegepmv.rochepapierciseau;

import java.util.Random;
import java.util.Scanner;

public class JeuRochePapierCiseau {
	
	public void demarrerJeu() {
		//tableau d'enum qui contient les 3 valeurs, ROCHE, PAPIER, CISEAU
		//choix = [ROCHE, PAPIER, CISEAU]
		RochePapierCiseau[] choix = RochePapierCiseau.values();
		
		Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        //Ces variables devraient être incrémenté quand c'est l'utilisateur qui a gagné ou quand c'est l'ordinateur
        int pointUtilisateur = 0, pointOrdinateur = 0;
        
        System.out.println("Bienvenue dans le jeu Roche-Papier-Ciseaux!");


		for(int nombrePartie = 0; nombrePartie < 5; nombrePartie++) {
			
			/*******************************votre code va ici*******************************************/
			System.out.println("1.Roche\n2.Papier\n3.Ciseaux");
			 int userInput = scanner.nextInt();
			while (userInput< 1 ||  userInput > 3){
				System.out.println("Vous devez choisir un nombre entre 1 et 3 inclusivement");
				userInput = scanner.nextInt();
			}
			int choixOrdiIndex = random.nextInt(choix.length);



















			//remplacer par le choix de l'ordinateur en utilisant random
			RochePapierCiseau choixOrdi = choix[choixOrdiIndex];
			
			// remplacer par le choix de l'utilisateur
			RochePapierCiseau choixUtilisateur = choix[userInput - 1];
			
			/* déterminer le gagnant comme suit:
			 * ROCHE et PAPIER => PAPIER gagne
			 * ROCHE et CISEAU => CISEAU gagne
			 * PAPIER et CISEAU = PAPIER gagne
			 */
			int gagnant = determinerGagnant(choixUtilisateur, choixOrdi);
			
			//ajouter du code ici pour incrémenter pointUtilisateur quand c'est l'utilisateur qui a gagné
			//ou incrémenter pointOrdinateur, quand c'est l'ordinateur qui a gagné
	 		/*******************************votre code va ici*******************************************/
			 	if (gagnant == 1){
					 pointUtilisateur ++ ;
				}
				else if(gagnant == -1){
					pointOrdinateur ++;
				}





		}
		
		//fermer le scanner à la fin du jeu
		scanner.close();
		
		// Le message final
        System.out.printf("%nVous avez eu %d points. L'ordinateur a eu %d points", pointUtilisateur, pointOrdinateur);

	}
	
	
	
	/*  Vous devez comparer le choix de l'utilisateur avec celui et l'ordi
	 * si le choix de l'ordi est le même que celui de l'ordi, c'est égalité. Vous affichez "egalité" et la méthode retourne 0
	 * Selon les choix, si l'utilisateur a gagné, vous affichez le message "Vous avez gagné" et la méthode retourne 1
	 * Selon les choix, si l'ordinateur a gagné, vous affichez le message "L'ordinateur a gagné" et la méthode retourne -1
	 * -1 représente que l'ordinateur a gagné
		0 représente égalité
		1 représente que l'utilisateur a gagné
		
		Déterminer le gagnant comme suit:
		 * ROCHE et PAPIER => PAPIER gagne
		 * ROCHE et CISEAU => CISEAU gagne
		 * PAPIER et CISEAU = PAPIER gagne
		 */
	private int determinerGagnant(RochePapierCiseau monChoix, RochePapierCiseau choixOrdi) {
		/*******************************votre code va ici*******************************************/
		System.out.println("Vous avez choisi :"+" "+ monChoix +" "+"L'ordinateur  a choisi :" +" "+ choixOrdi);
		if(monChoix == choixOrdi){
			System.out.println("Égalité");
			return 0;
		}
		else if(monChoix == RochePapierCiseau.ROCHE&&choixOrdi == RochePapierCiseau.CISEAU||monChoix ==RochePapierCiseau.PAPIER && choixOrdi == RochePapierCiseau.ROCHE||monChoix == RochePapierCiseau.CISEAU && choixOrdi == RochePapierCiseau.PAPIER){
			System.out.println("Vous  avez  gagné");
			return 1;
		}
		else{
			System.out.println("L'ordinateur a gagné");
			return -1;
		}
	}

}
