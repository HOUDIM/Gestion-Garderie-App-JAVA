package gestion.garderie.model;

import java.util.Scanner;

import gestion.garderie.impl.AnimateurImpl;
import gestion.garderie.impl.CoursActivitéImpl;

public class CoursActivité {
	
		//Les attributs
		private int code;
		private String désignation;
		private Animateur animateurResponsable;
		private int volumeHoraire;
		private int fraisC;
		
		static Scanner sc = new Scanner(System.in);
	
		//Les constructeurs
		
		public CoursActivité ()
		{
		
		}
			

		public CoursActivité(int code, String désignation, Animateur animateurResponsable, 
				int volumeHoraire, int fraisC) {
			this.code = code;
			this.désignation = désignation;
			this.animateurResponsable = animateurResponsable;
			this.volumeHoraire = volumeHoraire;
			this.fraisC = fraisC;
		}




		//Les setteurs et les getteurs
		
		public int getCode() {
			return code;
		}

		public void setCode(int code) {
			this.code = code;
		}
		
		public String getDésignation() {
			return désignation;
		}

		public void setDésignation(String désignation) {
			this.désignation = désignation;
		}
		
		public Animateur getAnimateurResponsable() {
			return animateurResponsable;
		}


		public void setAnimateurResponsable(Animateur animateurResponsable) {
			this.animateurResponsable = animateurResponsable;
		}
		

		public int getVolumeHoraire() {
			return volumeHoraire;
		}


		public void setVolumeHoraire(int volumeHoraire) {
			this.volumeHoraire = volumeHoraire;
		}
		
		public int getFraisC() {
			return fraisC;
		}


		public void setFraisC(int fraisC) {
			this.fraisC = fraisC;
		}
		

		@Override
		public String toString() {
			return 
					"\n+---------------------------------------------------------------------------------------+\n"
					 + "| Code cours                        |"+code+"\n"
					 + "+---------------------------------------------------------------------------------------+\n"
					 + "| Désignation                       |"+désignation+"\n"
					 + "+---------------------------------------------------------------------------------------+\n"
					 + "| Nom de l'animateur responsable    |"+animateurResponsable.getNom()+"\n"
					 + "+---------------------------------------------------------------------------------------+\n"
					 + "| Prénom de l'animateur responsable |"+animateurResponsable.getPrenom()+"\n"
					 + "+---------------------------------------------------------------------------------------+\n"
					 + "| Volume horaire                    |"+volumeHoraire+"\n"
					 + "+---------------------------------------------------------------------------------------+\n"
					 + "| Frais du cours                    |"+fraisC+"\n"
					 + "+---------------------------------------------------------------------------------------+\n\n";
		}
		
		
		public static void menuCoursActivité(String[] args)
		{
			System.out.println("\n*********************Gestion des cours/activités*****************************\n");
			
			System.out.println("\nVeuillez choisir une option :\n " +
						"\n\t1- Ajout d'un cours/activité\n\t2- Mise à jour d'un cours/activité\n"
						+ "\t3- Suppression d'un cours/activité\n\t4- Liste des cours/activités\n"
						+ "\t5- Revenir au menu principal");
			
		}
		
		public static void ajouterCoursAcvitivé (AnimateurImpl animateurImpl, CoursActivitéImpl coursActivitéImpl)
		{
			
			
			System.out.println("\n - Saisissez le code de cours/activité : ");
			int code=sc.nextInt();
			
			//vérification de l'ID
			boolean saisieCodeCA = false;
            while (saisieCodeCA == false) {
            String si=String.valueOf(code);
            if (si.matches("^[0-9]+$") && coursActivitéImpl.getById(code) == null) {
               // codee=Integer.parseInt(si);
                saisieCodeCA = true;
                break;
            }else {
            	 System.out.println("\n -Erreur!  Re-saisissez l'ID  : ");
            	 code=sc.nextInt();
            	 sc.nextLine();
            }
            }
			
			System.out.println("\n - Saisissez la désignation de cours/activité : ");
			String désignation=sc.next();
			System.out.println("\n - Saisissez l'ID de l'animateur respnsable de ce cours/activité : ");
			int id=sc.nextInt();
			
			//vérification de l'ID
			boolean saisieIdCAa = false;
            while (saisieIdCAa == false) {
            String si=String.valueOf(id);
            if (si.matches("^[0-9]+$") && animateurImpl.getById(id) != null) {
                id=Integer.parseInt(si);
                saisieIdCAa = true;
                break;
            }else {
            	 System.out.println("\n -Erreur!  Re-saisissez l'ID  : ");
            	 id=sc.nextInt();
            	 sc.nextLine();
            }
            }
			

			System.out.println("\n - Saisissez le volume horaire ce cours/activité : ");
			int volumeHoraire=sc.nextInt();
			System.out.println("\n - Saisissez le frais ce cours/activité : ");
			int fraisC=sc.nextInt();
			
			Animateur animateur = animateurImpl.getById(id);
			
			CoursActivité coursActivité = new CoursActivité();
		
			coursActivité.setCode(code);
			coursActivité.setDésignation(désignation);
			coursActivité.setAnimateurResponsable(animateur);
			
			coursActivité.setVolumeHoraire(volumeHoraire);
			coursActivité.setFraisC(fraisC);
			
			coursActivitéImpl.add(coursActivité);
			

			System.out.println("Cours ajouté avec succé");
		}

		public static void modifierCoursActivité(AnimateurImpl animateurImpl, CoursActivitéImpl coursActivitéImpl)
		{
			
			
			System.out.println("\n - Donnez le code de cours/activité à modifier : ");
			int codeM = sc.nextInt();
			
			//vérification de l'ID
			boolean updateCodeCA = false;
            while (updateCodeCA == false) {
            String si=String.valueOf(codeM);
            if (si.matches("^[0-9]+$") && coursActivitéImpl.getById(codeM) != null) {
               // codee=Integer.parseInt(si);
                updateCodeCA = true;
                break;
            }else {
            	 System.out.println("\n -Erreur!  Re-saisissez l'ID  : ");
            	 codeM=sc.nextInt();
            	 sc.nextLine();
            }
            }
			
			CoursActivité coursActivité2 = coursActivitéImpl.getById(codeM);
			
					System.out.println("\n - Choisissez les informations à modifier :\n 1- Désignation"
							+ "\n 2- Aimateur responsable\n 3- Volume horaire \n 4- Frais");
					System.out.println("\n - Votre Choix : ");
					int choix= sc.nextInt();
					switch(choix) {
					case 1:
						System.out.println("\n - Saisissez la désignation : ");
						String désignation1=sc.next();
						coursActivité2.setDésignation(désignation1);
						break;
					case 2:
						System.out.println("\n - Saisissez l'ID de l'animateur responsable : ");
						int idA=sc.nextInt();
						
						//vérification de l'ID
						boolean updateIdCAa = false;
	                    while (updateIdCAa == false) {
	                    String si=String.valueOf(idA);
	                    if (si.matches("^[0-9]+$") && animateurImpl.getById(idA) != null) {
	                        idA=Integer.parseInt(si);
	                        updateIdCAa = true;
	                        break;
	                    }else {
	                    	 System.out.println("\n -Erreur!  Re-saisissez le code  : ");
	                    	 idA=sc.nextInt();
	                    	 sc.nextLine();
	                    }
	                    }
						
						Animateur animateurRsp = animateurImpl.getById(idA);
						
						coursActivité2.setAnimateurResponsable(animateurRsp);
						
						break;
					case 3: 
						System.out.println(" - Saisissez le volume horaire  : ");
						int volumeHoraire2=sc.nextInt();
						coursActivité2.setVolumeHoraire(volumeHoraire2);
						break;
					case 4:
						System.out.println("\n - Saisissez le frais : ");
						int fraisC2=sc.nextInt();
						coursActivité2.setFraisC(fraisC2);
						break;
					default:
						System.out.println("Choix invalide ! ");
						break;		
				
}
			
			coursActivitéImpl.update(coursActivité2);
			

			System.out.println("Cours modifié avec succès!");
		}
		
		public static void supprimerCoursActivité(AnimateurImpl animateurImpl, CoursActivitéImpl coursActivitéImpl)
		{
			
			System.out.println("\n - Donnez le code de cours/activité à supprimer : ");
			int codeS = sc.nextInt();
			
			//vérification de l'ID
			boolean removeCodeCA = false;
            while (removeCodeCA == false) {
            String si=String.valueOf(codeS);
            if (si.matches("^[0-9]+$") && coursActivitéImpl.getById(codeS) != null) {
 
                removeCodeCA = true;
                break;
            }else {
            	 System.out.println("\n -Erreur!  Re-saisissez l'ID  : ");
            	 codeS=sc.nextInt();
            	 sc.nextLine();
            }
            }
			
			CoursActivité coursActivité3 = coursActivitéImpl.getById(codeS);
			
			coursActivitéImpl.remove(coursActivité3);
			
			System.out.println("\n\n Cours supprimé avec succès! \n\n");
		}
}
