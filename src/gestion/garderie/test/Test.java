package gestion.garderie.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import gestion.garderie.impl.GarderieImpl;
import gestion.garderie.impl.AnimateurImpl;
import gestion.garderie.impl.ClasseImpl;
import gestion.garderie.impl.CoursActivit�Impl;
import gestion.garderie.impl.DirecteurImpl;
import gestion.garderie.impl.El�veImpl;
import gestion.garderie.model.Animateur;
import gestion.garderie.model.Classe;
import gestion.garderie.model.CoursActivit�;
import gestion.garderie.model.Directeur;
import gestion.garderie.model.El�ve;
import gestion.garderie.model.Garderie;

public class Test {
		
		@SuppressWarnings("resource")
		public static void main(String[] args) {
			
			
			Scanner sc = new Scanner(System.in);
			
			AnimateurImpl animateurImpl = new AnimateurImpl();
			CoursActivit�Impl coursActivit�Impl = new CoursActivit�Impl();
			ClasseImpl classeImpl = new ClasseImpl();
			El�veImpl �l�veImpl = new El�veImpl();
			DirecteurImpl directeurImpl = new DirecteurImpl();
			GarderieImpl garderieImpl = new GarderieImpl();
			
			boolean menuP=true; 
			
			while ( menuP ) {
				
			System.out.println("\n*********************Bienvenu au menu principal*****************************\n");
			
			System.out.println("\nVeuillez choisir une option:\n\n\t1- Gestion des animateurs"
								+"\n\t2- Gestion des �l�ves\n\t3- Gestion des classes\n\t4- Gestion des cours"
								+ "\n\t5- Gestion de la garderie\n\t6- Gestion directeur\n\t7- Quitter");
			
			System.out.println("\nVotre Choix : ");
			
			int choixMP = sc.nextInt();
			
				
			switch(choixMP) {
			case 1 :
				 boolean menuA=true;
				 
				 while (menuA) {
						
						Animateur.menuAnimateur(args);
						
						System.out.println("\nVotre Choix : ");
						int choixA = sc.nextInt();
						switch(choixA) {
						
						case 1:
							
							System.out.println("\n----------------- Ajout d'un animateur --------------------\n ");
							Animateur.ajouterAnimateur(animateurImpl);
							
							break;
							
						case 2:
							
							System.out.println("\n----------------- Mise � jour d'un animateur --------------------\n ");
							Animateur.modifierAnimateur(animateurImpl);
							
							break;
							
						case 3:
							
							System.out.println("\n----------------- Suppression d'un animateur --------------------\n ");
							Animateur.supprimerAnimateur(animateurImpl);
							
							break;
							
						case 4:
							System.out.println("\n----------------- Listes des animateurs --------------------\n ");
							
							List<Animateur> animateurs=animateurImpl.getAll();
							System.out.println(animateurs.toString());
						        
							break;
							
						case 5:
							
							System.out.println("\n----------------- Listes des cours d'un animateur --------------------\n ");
							Animateur.listerCoursAnimateur(animateurImpl, coursActivit�Impl);
						
							break;
						case 6:
							
							menuA=false;
							menuP=true;
							
							break;
							
						default:
							
							System.out.println("\nChoix invalide!");
							
							break;
						}}
				break;
			
			case 2 :
				
				
				boolean menuE=true;
				
				
				
				while (menuE) {
					
				El�ve.menuEl�ve(args);
				
				System.out.println("\nVotre Choix : ");
				
				int choixE = sc.nextInt();
				switch(choixE) {
				case 1:
					
					System.out.println("\n----------------- Ajout d'un �l�ve --------------------\n ");
					El�ve.ajouterEl�ve(�l�veImpl);
					
					break;
					
				case 2:
					
					System.out.println("\n----------------- Mise � jour d'un �l�ve --------------------\n ");
					El�ve.modifierEl�ve(�l�veImpl);
					
					break;
				
				case 3:
					
					System.out.println("\n----------------- Suppression d'un �l�ve --------------------\n ");
					El�ve.supprimerEl�ve(�l�veImpl);
					
					break;
					
				case 4:
					
					System.out.println("\n----------------- Listes des �l�ves --------------------\n ");
					List<El�ve> �l�ves=�l�veImpl.getAll();
				    System.out.println(�l�ves.toString());
					
					break;
					
				case 5:
					
					menuE=false;
					menuP=true;
					
					break;
					
				default:
					System.out.println("\nChoix invalide!");
					break;}}
				
				break;
				
			case 3 :
				
				boolean menuC=true;
				
				List<El�ve> �l�ves = new ArrayList<El�ve>();
				List<Animateur> animateurs = new ArrayList<Animateur>();
				List<CoursActivit�> coursActivit�s = new ArrayList<>();
				
				
				while (menuC) {
				
				Classe.menuClasse(args);
				
				System.out.println("\nVotre Choix : ");
				
				int choixC = sc.nextInt();
				switch(choixC) {
				case 1:
					
					System.out.println("\n----------------- Ajout d'une classe --------------------\n ");
					Classe.ajouterClasse(classeImpl, �l�veImpl, animateurImpl, coursActivit�Impl, �l�ves, animateurs, coursActivit�s);
			
					break;
				case 2:
					
					System.out.println("\n----------------- Mise � jour d'une classe --------------------\n ");
					Classe.modifierClasse(classeImpl, �l�veImpl, animateurImpl, coursActivit�Impl, �l�ves, animateurs, coursActivit�s);
					
					break;
				case 3:
					
					System.out.println("\n----------------- Suppression d'une classe --------------------\n ");
					Classe.supprimerClasse(classeImpl, �l�veImpl, animateurImpl, coursActivit�Impl, �l�ves, animateurs, coursActivit�s);
					
					break;
				case 4:
					
					System.out.println("\n----------------- Listes des classes --------------------\n ");
					List<Classe> classes=classeImpl.getAll();
				    System.out.println(classes.toString());
				    
					break;
				case 5:
					
					menuC=false;
					menuP=true;
					
					break;
				default:
					System.out.println("\nChoix invalide!");
					break;
				}}
				break;
				
			case 4 :
				boolean menuCA=true;
				
				while (menuCA) {
					
				CoursActivit�.menuCoursActivit�(args);
					
				System.out.println("\nVotre Choix : ");
				
				int choixCA = sc.nextInt();
				switch(choixCA) {
				case 1:
					
					System.out.println("\n----------------- Ajout d'un cours/activit� --------------------\n ");
					CoursActivit�.ajouterCoursAcvitiv�(animateurImpl, coursActivit�Impl);
					
					break;
				case 2:
					
					System.out.println("\n----------------- Mise � jour d'un cours/activit� --------------------\n ");
					CoursActivit�.modifierCoursActivit�(animateurImpl, coursActivit�Impl);
				
					break;
				case 3:
					
					System.out.println("\n----------------- Suppression d'un cours/activit� --------------------\n ");
					CoursActivit�.supprimerCoursActivit�(animateurImpl, coursActivit�Impl);
					
					break;
				case 4:
					
					System.out.println("\n----------------- Listes des cours/activit�s --------------------\n ");
					List<CoursActivit�> coursAcitivit�s=coursActivit�Impl.getAll();
				    System.out.println(coursAcitivit�s.toString());
					
					
					break;
				case 5:
					
					menuCA=false;
					menuP=true;
					
					break;
				default:
					System.out.println("\nChoix invalide!");
					break;
				}
				}
				break;
				
			case 5:
				boolean menuG=true;
				while(menuG)
				{
					Garderie.menuGarderie(args);
					
					System.out.println("\nVotre Choix : ");
					int choixD = sc.nextInt();
					switch(choixD) {
					case 1:
						
						System.out.println("\n----------------- Ajout d'une garderie --------------------\n ");
						Garderie.ajouterInfoGarderie(garderieImpl);
						
						break;
					case 2:
						
						System.out.println("\n----------------- Modification des informations --------------------\n ");
						Garderie.modifierInfoGarderie(garderieImpl);
						
						break;
					case 3:
						menuG=false;
						menuP=true;
						break;
					default:
						System.out.println("Choix invalide !");
						break;
					}
					
				}
				
				break;
				
			case 6:
				
				
				boolean menuD=true;
				
				while (menuD) {
					
				Directeur.menuDirecteur(args);
					
				System.out.println("\nVotre Choix : ");
				
				int choixE = sc.nextInt();
				switch(choixE) {
				case 1:
					
					System.out.println("\n----------------- Ajout d'un directeur --------------------\n ");
					Directeur.ajouterDirecteur(directeurImpl);
					
					break;
					
				case 2:
				
					System.out.println("\n----------------- Mise � jour d'un directeur --------------------\n ");
					Directeur.modifierDirecteur(directeurImpl);
					
					break;
				case 3:
					
					System.out.println("\n----------------- Suppression d'un directeur --------------------\n ");
					Directeur.supprimerDirecteur(directeurImpl);
					
					break;
				case 4:
					
					System.out.println("\n----------------- Listes des directeurs --------------------\n ");
					List<Directeur> directeurs=directeurImpl.getAll();
				    System.out.println(directeurs.toString());
				    
					break;
				case 5:
					menuD=false;
					menuP=true;
					break;
				default:
					System.out.println("Choix invalide!");
				}}
				break;
				
			case 7:
				System.out.println("Au revoir!");
				System.exit(0);
				break;
				
			default:
				System.out.println("\nChoix invalide!");
				break;
			}
			}
			
			}	
			
}
