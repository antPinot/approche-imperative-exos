package fr.algorithmie;

import java.util.Scanner;

import org.junit.Test;
import org.junit.runner.RunWith;

import outils.Exercice;
import outils.ExerciceRunner;
import outils.Question;
import outils.Resultat;

/**
 * Ne modifiez ni les noms des classes, ni les noms des méthodes.
 * 
 * @author DIGINAMIC
 *
 */
@RunWith(ExerciceRunner.class)
@Exercice(nom="InteractifPlusGrand")
public class Ex18_InteractifPlusGrand {
	
	/**
	 * Ne pas modifier les informations portées par l'annotation. 
	 */
	@Test
	@Question(numero = 1)
	public void interactif() {
		
		Scanner scanner = new Scanner(System.in) ;
		
		// TODO Demander à l'utilisateur de saisir 10 nombres entiers
		
		System.out.println("Veuillez saisir 10 nombres entiers");
		
		int [] nb = new int[];
		
		for (int i=0; i<nb.length; i++) {
			
			int nb[i] = scanner.nextInt();
			
		}

		

		
		// TODO Affichez chaque nombre saisi avec Resultat.log
		
		
		// TODO Enfin affichez avec Resultat.log le max des 10 nombres
	
		
		scanner.close();
	}

}
