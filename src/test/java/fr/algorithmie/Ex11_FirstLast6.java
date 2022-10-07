package fr.algorithmie;

import java.lang.reflect.Array;

import org.junit.Test;
import org.junit.runner.RunWith;

import outils.Exercice;
import outils.ExerciceRunner;
import outils.Question;
import outils.Resultat;

/**
 * Ne modifiez ni les noms des classes, ni les noms des méthodes.
 * Utilisez Resultat.log pour afficher les résultats
 *  
 * @author DIGINAMIC
 *
 */
@RunWith(ExerciceRunner.class)
@Exercice(nom="FirstLast6")
public class Ex11_FirstLast6 {

	int[] tab1 = {};
	int[] tab2 = { 2 };
	int[] tab3 = { 6 };
	int[] tab4 = { 1, 6 };
	int[] tab5 = { 6, 2 };
	int[] tab6 = { 0, 6, 2 };

	/**
	 * Ne pas modifier les informations portées par l'annotation. AU TOTAL : 6
	 */
	@Test
	@Question(numero = 1)
	public void afficherAlgo() throws Exception{

		// TODO Calculez une valeur booléenne qui contrôle le tableau de la sorte :
		//  o elle vaut true si le tableau a au moins 1 élément et si le premier élément ou le dernier élément vaut 6.
		//  o elle vaut false dans les autres cas
		
		/*int [][] tabArray = new int [][] {tab1, tab2, tab3, tab4, tab5, tab6};		
		
		for (int i=0; i<tabArray.length; i++) {
			
		}*/
		
		boolean b1 = false;
		if ((tab1.length !=0) && (tab1[0] == 6 || tab1[tab1.length-1] == 6)){
			b1 = true;
		}else {
			b1 = false;
		}
		
		boolean b2 = false;
		if ((tab2.length !=0) && (tab2[0] == 6 || tab2[tab2.length-1] == 6)){
			b2 = true;
		}else {
			b2 = false;
		}
		
		boolean b3 = false;
		if ((tab3.length !=0) && (tab3[0] == 6 || tab3[tab3.length-1] == 6)){
			b3 = true;
		}else {
			b3 = false;
		}
		
		boolean b4 = false;
		if ((tab4.length !=0) && (tab4[0] == 6 || tab4[tab4.length-1] == 6)){
			b4 = true;
		}else {
			b4 = false;
		}
		
		boolean b5 = false;
		if ((tab5.length !=0) && (tab5[0] == 6 || tab5[tab5.length-1] == 6)){
			b5 = true;
		}else {
			b5 = false;
		}
		
		boolean b6 = false;
		if ((tab6.length !=0) && (tab6[0] == 6 || tab6[tab6.length-1] == 6)){
			b6 = true;
		}else {
			b6 = false;
		}

		// TODO LOGUEZ la valeur obtenue pour chacun des 6 tableaux tab1 à tab6
		
		
		Resultat.log(b1);
		Resultat.log(b2);
		Resultat.log(b3);
		Resultat.log(b4);
		Resultat.log(b5);
		Resultat.log(b6);
		
		
		/*
		for (int i=1; i<=6; i++) {
			int[] tab = (int[])this.getClass().getDeclaredField("tab"+i).get(this);
			//System.out.println(Arrays.to.String(tab));
			Resultat.log(tab.length !=0 && (tab[0] == 6 || tab[tab.length-1] == 6));
		}
		*/
		

	}

}
