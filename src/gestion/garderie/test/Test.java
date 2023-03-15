package gestion.garderie.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import gestion.garderie.impl.GarderieImpl;
import gestion.garderie.impl.AnimateurImpl;
import gestion.garderie.impl.ClasseImpl;
import gestion.garderie.impl.CoursActivitéImpl;
import gestion.garderie.impl.DirecteurImpl;
import gestion.garderie.impl.ElèveImpl;
import gestion.garderie.model.Animateur;
import gestion.garderie.model.Classe;
import gestion.garderie.model.CoursActivité;
import gestion.garderie.model.Directeur;
import gestion.garderie.model.Elève;
import gestion.garderie.model.Garderie;

public class Test {
		
		@SuppressWarnings("resource")
		public static void main(String[] args) {
			
			
			Scanner sc = new Scanner(System.in);
			
			AnimateurImpl animateurImpl = new AnimateurImpl();
			CoursActivitéImpl coursActivitéImpl = new CoursActivitéImpl();
			ClasseImpl classeImpl = new ClasseImpl();
			ElèveImpl élèveImpl = new ElèveImpl();
			DirecteurImpl directeurImpl = new DirecteurImpl();
			GarderieImpl garderieImpl = new GarderieImpl();
			
			boolean menuP=true; 
			
			while ( menuP ) {
				
			System.out.println("\n*********************Bienvenu au menu principal*****************************\n");
			
			System.out.println("\nVeuillez choisir une option:\n\n\t1- Gestion des animateurs"
								+"\n\t2- Gestion des élèves\n\t3- Gestion des classes\n\t4- Gestion des cours"
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
							
							System.out.println("\n----------------- Mise à jour d'un animateur --------------------\n ");
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
							Animateur.listerCoursAnimateur(animateurImpl, coursActivitéImpl);
						
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
					
				Elève.menuElève(args);
				
				System.out.println("\nVotre Choix : ");
				
				int choixE = sc.nextInt();
				switch(choixE) {
				case 1:
					
					System.out.println("\n----------------- Ajout d'un élève --------------------\n ");
					Elève.ajouterElève(élèveImpl);
					
					break;
					
				case 2:
					
					System.out.println("\n----------------- Mise à jour d'un élève --------------------\n ");
					Elève.modifierElève(élèveImpl);
					
					break;
				
				case 3:
					
					System.out.println("\n----------------- Suppression d'un élève --------------------\n ");
					Elève.supprimerElève(élèveImpl);
					
					break;
					
				case 4:
					
					System.out.println("\n----------------- Listes des élèves --------------------\n ");
					List<Elève> élèves=élèveImpl.getAll();
				    System.out.println(élèves.toString());
					
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
				
				List<Elève> élèves = new ArrayList<Elève>();
				List<Animateur> animateurs = new ArrayList<Animateur>();
				List<CoursActivité> coursActivités = new ArrayList<>();
				
				
				while (menuC) {
				
				Classe.menuClasse(args);
				
				System.out.println("\nVotre Choix : ");
				
				int choixC = sc.nextInt();
				switch(choixC) {
				case 1:
					
					System.out.println("\n----------------- Ajout d'une classe --------------------\n ");
					Classe.ajouterClasse(classeImpl, élèveImpl, animateurImpl, coursActivitéImpl, élèves, animateurs, coursActivités);
			
					break;
				case 2:
					
					System.out.println("\n----------------- Mise à jour d'une classe --------------------\n ");
					Classe.modifierClasse(classeImpl, élèveImpl, animateurImpl, coursActivitéImpl, élèves, animateurs, coursActivités);
					
					break;
				case 3:
					
					System.out.println("\n----------------- Suppression d'une classe --------------------\n ");
					Classe.supprimerClasse(classeImpl, élèveImpl, animateurImpl, coursActivitéImpl, élèves, animateurs, coursActivités);
					
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
					
				CoursActivité.menuCoursActivité(args);
					
				System.out.println("\nVotre Choix : ");
				
				int choixCA = sc.nextInt();
				switch(choixCA) {
				case 1:
					
					System.out.println("\n----------------- Ajout d'un cours/activité --------------------\n ");
					CoursActivité.ajouterCoursAcvitivé(animateurImpl, coursActivitéImpl);
					
					break;
				case 2:
					
					System.out.println("\n----------------- Mise à jour d'un cours/activité --------------------\n ");
					CoursActivité.modifierCoursActivité(animateurImpl, coursActivitéImpl);
				
					break;
				case 3:
					
					System.out.println("\n----------------- Suppression d'un cours/activité --------------------\n ");
					CoursActivité.supprimerCoursActivité(animateurImpl, coursActivitéImpl);
					
					break;
				case 4:
					
					System.out.println("\n----------------- Listes des cours/activités --------------------\n ");
					List<CoursActivité> coursAcitivités=coursActivitéImpl.getAll();
				    System.out.println(coursAcitivités.toString());
					
					
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
				
					System.out.println("\n----------------- Mise à jour d'un directeur --------------------\n ");
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
