package gestion.garderie.model;

import java.util.List;


import gestion.garderie.impl.AnimateurImpl;
import gestion.garderie.impl.CoursActivitéImpl;

public class Animateur extends Personne{

		//Les attributs
		private String cinA;
		private String numTelA;
		private int salaire;
		
		//Les constructeurs
		
		public Animateur()
		{
			
		}
		
		public Animateur(int id, String nom, String prenom, String dateNaissance, String numdDesignationRue,
				String villeCodePostal, String gouvernerat,String cinA, String numTelA, int salaire) {
			super(id, nom, prenom, dateNaissance, numdDesignationRue, villeCodePostal, gouvernerat);
			// TODO Auto-generated constructor stub
			this.cinA = cinA;
			this.numTelA = numTelA;
			this.salaire = salaire;
		}

		
	    // Les getteurs et les setteurs

		public String getCinA() {
			return cinA;
		}

		public void setCinA(String cinA) {
			this.cinA = cinA;
		}

		public String getNumTelA() {
			return numTelA;
		}

		public void setNumTelA(String numTelA) {
			this.numTelA = numTelA;
		}

		public int getSalaire() {
			return salaire;
		}

		public void setSalaire(int salaire) {
			this.salaire = salaire;
		}

		
		// méthode toString
		
		@Override
		public String toString() {
			return 
				   
				 "\n+---------------------------------------------------------------------------------------+\n"
				 + "| ID                                |"+getId()+"\n"
				 + "+---------------------------------------------------------------------------------------+\n"
				 + "| Nom                               |"+getNom()+"\n"
				 + "+---------------------------------------------------------------------------------------+\n"
				 + "| Prenom                            |"+getPrenom()+"\n"
				 + "+---------------------------------------------------------------------------------------+\n"
				 + "| Date de naissance                 |"+getDateNaissance()+"\n"
				 + "+---------------------------------------------------------------------------------------+\n"
				 + "| Numéro et désignation de la rue   |"+getNumDesignationRue()+"\n"
				 + "+---------------------------------------------------------------------------------------+\n"
				 + "| Ville et code postal              |"+getVilleCodePostal()+"\n"
				 + "+---------------------------------------------------------------------------------------+\n"
				 + "| Gouvernerat                       |"+getGouvernerat()+"\n"
				 + "+---------------------------------------------------------------------------------------+\n"
				 + "| Numéro CIN                        |"+cinA+"\n"
				 + "+---------------------------------------------------------------------------------------+\n"
				 + "| Numéro de Téléphone               |"+numTelA+"\n"
				 + "+---------------------------------------------------------------------------------------+\n"
				 + "| Salaire                           |"+salaire+"\n"
				 + "+---------------------------------------------------------------------------------------+\n\n";		
		}

		
		// Menu Animateur
		
		 public static void menuAnimateur(String[] args)
		 {
			 System.out.println("\n*********************Gestion des animateurs*****************************\n");
				
				System.out.println("\nVeuillez choisir une option :\n " +
							"\n\t1- Ajout d'un animateur\n\t2- Mise à jour d'un animateur\n"
							+ "\t3- Suppression d'un animateur\n\t4- Liste des animateurs\n"
							+ "\t5- Lister les cours d'un animateur\n\t6- Revenir au menu principal");
		 }
		 
		 public static void ajouterAnimateur(AnimateurImpl animateurImpl) {
			 System.out.println("\n - Saisissez l'ID : ");
				int id=sc.nextInt();
				sc.nextLine();
				
				//vérification de l'ID
				boolean saisieId = false;
             while (saisieId == false) {
             String si=String.valueOf(id);
             if (si.matches("^[0-9]+$") && animateurImpl.getById(id) == null) {
                 id=Integer.parseInt(si);
                 saisieId = true;
                 break;
             }else {
             	 System.out.println("\n -Erreur!  Re-saisissez l'ID  : ");
             	 id=sc.nextInt();
             	 sc.nextLine();
             }
             }
				
				System.out.println("\n - Saisissez le nom : ");
				String nom=sc.nextLine();
				
				
				System.out.println("\n - Saisissez le prenom : ");
				String prenom=sc.nextLine();
				
				
				System.out.println("\n - Saisissez la date de Naissance (JJ/MM/YYYY) : ");
				String dateNaissance=sc.nextLine();
				
				//vérification de la date de naissance
				boolean saisie = false;
             while (saisie == false) {
             if ( dateNaissance.matches("[0-9]{2}/[0-9]{2}/[0-9]{4}")) {
             
                 saisie = true;
                 break;
             }else {
             	System.out.println("\n - Erreur! Re-saisissez la date de naissance (JJ/MM/YYYY) : ");
                 dateNaissance=sc.nextLine();
             }
             }
				
				System.out.println(" - Saisissez le numéro et la désignation de la rue  : ");
				String numdDesignationRue=sc.nextLine();
				
				
				System.out.println("\n - Saisissez le nom de la ville et le code postal : ");
				String villeCodePostal=sc.nextLine();
				
				
				System.out.println("\n - Saisissez le gouvernerat : ");
				String gouvernerat=sc.nextLine();
				
				
				
				System.out.println("\n - Saisissez le CIN : ");
				String cinA=sc.nextLine();

				boolean saisieCinA = false;
             while (saisieCinA == false) {
            
             if (cinA.matches("^[0-9]+$")&& cinA.length()== 8) {
                 saisieCinA = true;
                 break;
             }else {
             	 System.out.println("\n -Erreur! Re-saisissez le CIN  : ");
                  cinA=sc.nextLine();
             }
             }
             
				System.out.println("\n - Saisissez le numéro de téléphone : ");
				String numTelA=sc.nextLine();
				
				boolean saisieTelA = false;

             while (saisieTelA == false) {
            
             if (numTelA.matches("^[0-9]+$")&& numTelA.length()== 8) {
                 saisieTelA = true;
                 break;
             }else {
             	 System.out.println("\n - Saisissez le numéro de téléphon  : ");
             	 numTelA=sc.nextLine();
             }
             }
				
				System.out.println("\n - Saisissez le salaire : ");
				int salaire=sc.nextInt();
				
				Animateur animateur = new Animateur(id, nom, prenom, dateNaissance, numdDesignationRue, villeCodePostal, gouvernerat, cinA, numTelA, salaire);
				
				animateurImpl.add(animateur);
				
				System.out.println("\n\n Animateur ajouté avec succès! \n\n");
		 }
		 
		 public static void modifierAnimateur(AnimateurImpl animateurImpl)
		 {
			 System.out.println("\n - Saisissez l'ID de l'animateur dont vous voulez modifier : ");
				int ida=sc.nextInt();
				
				//vérification de l'ID
				boolean updateIdA = false;
             while (updateIdA == false) {
             String si=String.valueOf(ida);
             if (si.matches("^[0-9]+$") && animateurImpl.getById(ida) != null) {
                 ida=Integer.parseInt(si);
                 updateIdA = true;
                 break;
             }else {
             	 System.out.println("\n -Erreur!  Re-saisissez l'ID  : ");
             	 ida=sc.nextInt();
             	 sc.nextLine();
             }
             }
				
				Animateur animateur1 = animateurImpl.getById(ida);
				
			
						System.out.println("\n - Choisissez les informations à modifier :\n 1- Informations personnelles"
								+ "\n 2- Adresse");
						System.out.println("\n - Votre Choix : ");
						int choix= sc.nextInt();
						sc.nextLine();
						switch(choix) {
						case 1:
							System.out.println("\n - Saisissez le nom : ");
							String nom2=sc.nextLine();
							animateur1.setNom(nom2);
							
							System.out.println("\n - Saisissez le prenom : ");
							String prenom2=sc.nextLine();
							animateur1.setPrenom(prenom2);
							
							System.out.println("\n - Saisissez la dateNaissance (JJ/MM/YYYY) : ");
							String dateNaissance2=sc.nextLine();
							
							boolean saisie = false;
				             while (saisie == false) {
				             if ( dateNaissance2.matches("[0-9]{2}/[0-9]{2}/[0-9]{4}")) {
				                 saisie = true;
				                 break;
				             }else {
				             	System.out.println("\n - Erreur! Re-saisissez la date de naissance (JJ/MM/YYYY) : ");
				                 dateNaissance2=sc.nextLine();
				             }
				             }
							
							animateur1.setDateNaissance(dateNaissance2);
							
							System.out.println("\n - Saisissez le CIN : ");
							String cinA2=sc.nextLine();
							
							boolean saisieCinA = false;
				             while (saisieCinA == false) {
				            
				             if (cinA2.matches("^[0-9]+$")&& cinA2.length()== 8) {
				                 saisieCinA = true;
				                 break;
				             }else {
				             	 System.out.println("\n -Erreur! Re-saisissez le CIN  : ");
				                  cinA2=sc.nextLine();
				             }
				             }
							
							animateur1.setCinA(cinA2);
							
							System.out.println("\n - Saisissez le numéro de téléphone : ");
							String numTelA2=sc.nextLine();
							
							boolean saisieTelA = false;

				             while (saisieTelA == false) {
				            
				             
				             if (numTelA2.matches("^[0-9]+$")&& numTelA2.length()== 8) {
				                 saisieTelA = true;
				                 break;
				             }else {
				             	 System.out.println("\n - Saisissez le numéro de téléphon  : ");
				             	 numTelA2=sc.nextLine();
				             }
				             }
							
							animateur1.setNumTelA(numTelA2);
							
							System.out.println("\n - Saisissez le salaire : ");
							int salaire2=sc.nextInt();
							animateur1.setSalaire(salaire2);
							
							break;
						case 2: 
							System.out.println(" - Saisissez le numéro et la désignation de la rue  : ");
							String numdDesignationRue2=sc.nextLine();
							animateur1.setNumDesignationRue(numdDesignationRue2);
							
							System.out.println("\n - Saisissez le nom de la ville et le code postal : ");
							String villeCodePostal2=sc.nextLine();
							animateur1.setVilleCodePostal(villeCodePostal2);
							
							System.out.println("\n - Saisissez le gouvernerat : ");
							String gouvernerat2=sc.nextLine();
							animateur1.setGouvernerat(gouvernerat2);
							
							break;
						
						default:
							System.out.println("Choix invalide ! ");
							break;
						}
				
				animateurImpl.update(animateur1);
				
				System.out.println("\n\n Animateur modifié avec succès! \n\n");
		 }
		 
		 public static void supprimerAnimateur(AnimateurImpl animateurImpl)
		 {
			 System.out.println("\n - Saisissez l'ID de l'animateur dont vous voulez retirer : ");
				int idr=sc.nextInt();
				
				//vérification de l'ID
				boolean removeIdA = false;
             while (removeIdA == false) {
             String si=String.valueOf(idr);
             if (si.matches("^[0-9]+$") && animateurImpl.getById(idr) != null) {
                 idr=Integer.parseInt(si);
                 removeIdA = true;
                 break;
             }else {
             	 System.out.println("\n -Erreur!  Re-saisissez l'ID  : ");
             	 idr=sc.nextInt();
             	 sc.nextLine();
             }
             }
				
				Animateur animateur2 = animateurImpl.getById(idr);
				
				animateurImpl.remove(animateur2);
				
				System.out.println("Annimateur supprimé avec succé");
		 }
		 
		 public static void listerCoursAnimateur(AnimateurImpl animateurImpl, CoursActivitéImpl coursActivitéImpl) {
				System.out.println("\n - Saisissez l'ID de l'animateur : ");
				int idA=sc.nextInt();
				
				//vérification de l'ID
				boolean listerIdA = false;
                while (listerIdA == false) {
                String si=String.valueOf(idA);
                if (si.matches("^[0-9]+$") && animateurImpl.getById(idA) != null) {
                    idA=Integer.parseInt(si);
                    listerIdA = true;
                    break;
                }else {
                	 System.out.println("\n -Erreur!  Re-saisissez l'ID  : ");
                	 idA=sc.nextInt();
                	 sc.nextLine();
                }
                }
				
				Animateur animateur3 = animateurImpl.getById(idA);
				
				System.out.println("\n Nom : "+animateur3.getNom()+", Prénom : "+animateur3.getPrenom());
				
				List<CoursActivité> coursActivités=coursActivitéImpl.getAll();
				
		
				
				for (int i=0; i< coursActivités.size();i++)
				{
				
				
					if ( animateur3 == coursActivités.get(i).getAnimateurResponsable() )
					{
						System.out.println("\n Désignation de la matière : "+ coursActivités.get(i).getDésignation());
					}
				}
		 }
}
