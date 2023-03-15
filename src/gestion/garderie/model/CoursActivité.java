package gestion.garderie.model;

import java.util.Scanner;

import gestion.garderie.impl.AnimateurImpl;
import gestion.garderie.impl.CoursActivit�Impl;

public class CoursActivit� {
	
		//Les attributs
		private int code;
		private String d�signation;
		private Animateur animateurResponsable;
		private int volumeHoraire;
		private int fraisC;
		
		static Scanner sc = new Scanner(System.in);
	
		//Les constructeurs
		
		public CoursActivit� ()
		{
		
		}
			

		public CoursActivit�(int code, String d�signation, Animateur animateurResponsable, 
				int volumeHoraire, int fraisC) {
			this.code = code;
			this.d�signation = d�signation;
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
		
		public String getD�signation() {
			return d�signation;
		}

		public void setD�signation(String d�signation) {
			this.d�signation = d�signation;
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
					 + "| D�signation                       |"+d�signation+"\n"
					 + "+---------------------------------------------------------------------------------------+\n"
					 + "| Nom de l'animateur responsable    |"+animateurResponsable.getNom()+"\n"
					 + "+---------------------------------------------------------------------------------------+\n"
					 + "| Pr�nom de l'animateur responsable |"+animateurResponsable.getPrenom()+"\n"
					 + "+---------------------------------------------------------------------------------------+\n"
					 + "| Volume horaire                    |"+volumeHoraire+"\n"
					 + "+---------------------------------------------------------------------------------------+\n"
					 + "| Frais du cours                    |"+fraisC+"\n"
					 + "+---------------------------------------------------------------------------------------+\n\n";
		}
		
		
		public static void menuCoursActivit�(String[] args)
		{
			System.out.println("\n*********************Gestion des cours/activit�s*****************************\n");
			
			System.out.println("\nVeuillez choisir une option :\n " +
						"\n\t1- Ajout d'un cours/activit�\n\t2- Mise � jour d'un cours/activit�\n"
						+ "\t3- Suppression d'un cours/activit�\n\t4- Liste des cours/activit�s\n"
						+ "\t5- Revenir au menu principal");
			
		}
		
		public static void ajouterCoursAcvitiv� (AnimateurImpl animateurImpl, CoursActivit�Impl coursActivit�Impl)
		{
			
			
			System.out.println("\n - Saisissez le code de cours/activit� : ");
			int code=sc.nextInt();
			
			//v�rification de l'ID
			boolean saisieCodeCA = false;
            while (saisieCodeCA == false) {
            String si=String.valueOf(code);
            if (si.matches("^[0-9]+$") && coursActivit�Impl.getById(code) == null) {
               // codee=Integer.parseInt(si);
                saisieCodeCA = true;
                break;
            }else {
            	 System.out.println("\n -Erreur!  Re-saisissez l'ID  : ");
            	 code=sc.nextInt();
            	 sc.nextLine();
            }
            }
			
			System.out.println("\n - Saisissez la d�signation de cours/activit� : ");
			String d�signation=sc.next();
			System.out.println("\n - Saisissez l'ID de l'animateur respnsable de ce cours/activit� : ");
			int id=sc.nextInt();
			
			//v�rification de l'ID
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
			

			System.out.println("\n - Saisissez le volume horaire ce cours/activit� : ");
			int volumeHoraire=sc.nextInt();
			System.out.println("\n - Saisissez le frais ce cours/activit� : ");
			int fraisC=sc.nextInt();
			
			Animateur animateur = animateurImpl.getById(id);
			
			CoursActivit� coursActivit� = new CoursActivit�();
		
			coursActivit�.setCode(code);
			coursActivit�.setD�signation(d�signation);
			coursActivit�.setAnimateurResponsable(animateur);
			
			coursActivit�.setVolumeHoraire(volumeHoraire);
			coursActivit�.setFraisC(fraisC);
			
			coursActivit�Impl.add(coursActivit�);
			

			System.out.println("Cours ajout� avec succ�");
		}

		public static void modifierCoursActivit�(AnimateurImpl animateurImpl, CoursActivit�Impl coursActivit�Impl)
		{
			
			
			System.out.println("\n - Donnez le code de cours/activit� � modifier : ");
			int codeM = sc.nextInt();
			
			//v�rification de l'ID
			boolean updateCodeCA = false;
            while (updateCodeCA == false) {
            String si=String.valueOf(codeM);
            if (si.matches("^[0-9]+$") && coursActivit�Impl.getById(codeM) != null) {
               // codee=Integer.parseInt(si);
                updateCodeCA = true;
                break;
            }else {
            	 System.out.println("\n -Erreur!  Re-saisissez l'ID  : ");
            	 codeM=sc.nextInt();
            	 sc.nextLine();
            }
            }
			
			CoursActivit� coursActivit�2 = coursActivit�Impl.getById(codeM);
			
					System.out.println("\n - Choisissez les informations � modifier :\n 1- D�signation"
							+ "\n 2- Aimateur responsable\n 3- Volume horaire \n 4- Frais");
					System.out.println("\n - Votre Choix : ");
					int choix= sc.nextInt();
					switch(choix) {
					case 1:
						System.out.println("\n - Saisissez la d�signation : ");
						String d�signation1=sc.next();
						coursActivit�2.setD�signation(d�signation1);
						break;
					case 2:
						System.out.println("\n - Saisissez l'ID de l'animateur responsable : ");
						int idA=sc.nextInt();
						
						//v�rification de l'ID
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
						
						coursActivit�2.setAnimateurResponsable(animateurRsp);
						
						break;
					case 3: 
						System.out.println(" - Saisissez le volume horaire  : ");
						int volumeHoraire2=sc.nextInt();
						coursActivit�2.setVolumeHoraire(volumeHoraire2);
						break;
					case 4:
						System.out.println("\n - Saisissez le frais : ");
						int fraisC2=sc.nextInt();
						coursActivit�2.setFraisC(fraisC2);
						break;
					default:
						System.out.println("Choix invalide ! ");
						break;		
				
}
			
			coursActivit�Impl.update(coursActivit�2);
			

			System.out.println("Cours modifi� avec succ�s!");
		}
		
		public static void supprimerCoursActivit�(AnimateurImpl animateurImpl, CoursActivit�Impl coursActivit�Impl)
		{
			
			System.out.println("\n - Donnez le code de cours/activit� � supprimer : ");
			int codeS = sc.nextInt();
			
			//v�rification de l'ID
			boolean removeCodeCA = false;
            while (removeCodeCA == false) {
            String si=String.valueOf(codeS);
            if (si.matches("^[0-9]+$") && coursActivit�Impl.getById(codeS) != null) {
 
                removeCodeCA = true;
                break;
            }else {
            	 System.out.println("\n -Erreur!  Re-saisissez l'ID  : ");
            	 codeS=sc.nextInt();
            	 sc.nextLine();
            }
            }
			
			CoursActivit� coursActivit�3 = coursActivit�Impl.getById(codeS);
			
			coursActivit�Impl.remove(coursActivit�3);
			
			System.out.println("\n\n Cours supprim� avec succ�s! \n\n");
		}
}
