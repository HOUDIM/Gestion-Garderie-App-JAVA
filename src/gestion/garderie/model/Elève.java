package gestion.garderie.model;


import gestion.garderie.impl.ElèveImpl;

public class Elève extends Personne{
		
		//Les attributs 
		private String prenomPere, prenomGP, prenomMere, nomMere;
		private String cinPere, telPere;
		private String nivScolaire;
		private int nbrCours;
		
		//Les constructeurs
		
		public Elève(int id, String nom, String prenom, String dateNaissance, String numdDesignationRue,
				String villeCodePostal, String gouvernerat,String prenomPere, String prenomGP, 
				String prenomMere, String nomMere, String cinPere, String telPere, String nivScolaire,int nbrCours) {
			super(id, nom, prenom, dateNaissance, numdDesignationRue, villeCodePostal, gouvernerat);
			// TODO Auto-generated constructor stub
			this.prenomPere=prenomPere;
			this.prenomGP=prenomGP;
			this.prenomMere=prenomMere;
			this.nomMere=nomMere;
			this.cinPere=cinPere;
			this.telPere=telPere;
			this.nivScolaire=nivScolaire;
			this.nbrCours=nbrCours;	
		}

		//Les getteurs et les setteurs
		public String getPrenomPere() {
			return prenomPere;
		}
		public void setPrenomPere(String prenomPere) {
			this.prenomPere = prenomPere;
		}
		public String getPrenomGP() {
			return prenomGP;
		}
		public void setPrenomGP(String prenomGP) {
			this.prenomGP = prenomGP;
		}
		public String getPrenomMere() {
			return prenomMere;
		}
		public void setPrenomMere(String prenomMere) {
			this.prenomMere = prenomMere;
		}
		public String getNomMere() {
			return nomMere;
		}
		public void setNomMere(String nomMere) {
			this.nomMere = nomMere;
		}
		public String getCinPere() {
			return cinPere;
		}
		public void setCinPere(String cinPere) {
			this.cinPere = cinPere;
		}
		public String getTelPere() {
			return telPere;
		}
		public void setTelPere(String telPere) {
			this.telPere = telPere;
		}
		public String getNivScolaire() {
			return nivScolaire;
		}
		public void setNivScolaire(String nivScolaire) {
			this.nivScolaire = nivScolaire;
		}
		public int getNbrCours() {
			return nbrCours;
		}
		public void setNbrCours(int nbrCours) {
			this.nbrCours = nbrCours;
		}

		
		
		//Les méthodes d'ordre général
		
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
					 + "| Prénom du père                    |"+prenomPere+"\n"
					 + "+---------------------------------------------------------------------------------------+\n"
					 + "| Prénom du grand-père              |"+prenomGP+"\n"
					 + "+---------------------------------------------------------------------------------------+\n"
					 + "| Prénom de la mère                 |"+prenomMere+"\n"
					 + "+---------------------------------------------------------------------------------------+\n"
					 + "| Nom de la mère                    |"+nomMere+"\n"
					 + "+---------------------------------------------------------------------------------------+\n"
					 + "| Numéro CIN du père                |"+cinPere+"\n"
					 + "+---------------------------------------------------------------------------------------+\n"
					 + "| Niveau scolaire                   |"+nivScolaire+"\n"
					 + "+---------------------------------------------------------------------------------------+\n"
					 + "| Nombre de cours                   |"+nbrCours+"\n"
					 + "+---------------------------------------------------------------------------------------+\n\n";
		}
		
		
		public static void menuElève(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("\n*********************Gestion des élèves*****************************\n");
			
			System.out.println("\nVeuillez choisir une option : \n " +
						"\n\t1- Ajout d'un élève\n\t2- Mise à jour d'un élève\n"
						+ "\t3- Suppression d'un élève\n\t4- Liste des élèves\n"
						+ "\t5- Revenir au menu principal");
			}
		
		public static void ajouterElève(ElèveImpl élèveImpl)
		{
			System.out.println("\n *** Informations personnelles *** \n");
			System.out.println("\n - Saisissez l'ID : ");
			int id=sc.nextInt();
			sc.nextLine();
			
			//vérification de l'ID
			boolean saisieIdE = false;
            while (saisieIdE == false) {
            String si=String.valueOf(id);
            if (si.matches("^[0-9]+$") && élèveImpl.getById(id) == null) {
                id=Integer.parseInt(si);
                saisieIdE = true;
                break;
            }else {
            	 System.out.println("\n - L'ID existe déja!  Re-saisissez un autre ID  : ");
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
            	System.out.println("\n - Erreur de format! Re-saisissez la date de naissance (JJ/MM/YYYY) : ");
                dateNaissance=sc.nextLine();
            }
            }
			
			System.out.println(" - Saisissez le numéro et la désignation de la rue  : ");
			String numdDesignationRue=sc.nextLine();
			
			
			System.out.println("\n - Saisissez le nom de la ville et le code postal : ");
			String villeCodePostal=sc.nextLine();
			
			
			System.out.println("\n - Saisissez le gouvernerat : ");
			String gouvernerat=sc.nextLine();
			
			
			System.out.println("\n *** Informations des parents *** \n");
			
			System.out.println(" - Saisissez le prénom du père : ");
			String prenomPere=sc.nextLine();
			
			System.out.println("\n - Saisissez le nom du grand-père : ");
			String prenomGP=sc.nextLine();
			
			System.out.println("\n - Saisissez le prénom de la mère : ");
			String prenomMere=sc.nextLine();
			
			System.out.println("\n - Saisissez le nom de la mère : ");
			String nomMere=sc.nextLine();
			
			System.out.println("\n - Saisissez le CIN du père : ");
			String cinPere=sc.nextLine();
			
			boolean saisieCinA = false;
            while (saisieCinA == false) {
           
            if (cinPere.matches("^[0-9]+$")&& cinPere.length()== 8) {
                saisieCinA = true;
                break;
            }else {
            	 System.out.println("\n - Format incorrect! Re-saisissez le CIN  : ");
            	 cinPere=sc.nextLine();
            }
            }
			
			System.out.println("\n - Saisissez le téléphone du père : ");
			String telPere=sc.nextLine();
			
			boolean saisieTelA = false;

            while (saisieTelA == false) {
           
            if (telPere.matches("^[0-9]+$")&& telPere.length()== 8) {
                saisieTelA = true;
                break;
            }else {
            	 System.out.println("\n - Format incorrect! Re-saisissez le numéro de téléphone  : ");
            	 telPere=sc.nextLine();
            }
            }
			
			System.out.println("\n *** Informations scolaires *** \n");
			
			System.out.println(" - Saisissez le niveau scolaire : ");
			String nivScolaire=sc.nextLine();
			
			System.out.println("\n - Saisissez le nombre des cours à suivre : ");
			int nbrCours=sc.nextInt();
			
			
			Elève élève = new Elève(id,nom,prenom,dateNaissance,numdDesignationRue,villeCodePostal, 
					        	gouvernerat,prenomPere,prenomGP,prenomMere,nomMere,cinPere,telPere, 
					        	nivScolaire,nbrCours);
			
			
			élèveImpl.add(élève);
			
			System.out.println("\n\n Elève ajouté avec succès! \n\n");
		}
		
		public static void modifierElève (ElèveImpl élèveImpl)
		{

			
			System.out.println("\n - Saisissez l'ID de l'élève dont vous voulez modifier : ");
			int idm=sc.nextInt();
			
			//vérification de l'ID
			boolean updateIdE = false;
            while (updateIdE == false) {
            String si=String.valueOf(idm);
            if (si.matches("^[0-9]+$") && élèveImpl.getById(idm) != null) {
                idm=Integer.parseInt(si);
                updateIdE = true;
                break;
            }else {
            	 System.out.println("\n - L'ID n'existe pas !  Re-saisissez un autre ID  : ");
            	 idm=sc.nextInt();
            	 sc.nextLine();
            }
            }
		
			
			Elève élève1 = élèveImpl.getById(idm);
			

					System.out.println("\n - Choisissez les informations à modifier :\n 1- Informations personnelles"
							+ "\n 2- Adresse\n 3- Informations des parents\n 4- Informations scolaires");
					System.out.println("\n - Votre Choix : ");
					int choix= sc.nextInt();
					sc.nextLine();
					switch(choix) {
					case 1:
						
						System.out.println("\n - Saisissez le nom : ");
						String nom2=sc.nextLine();
						élève1.setNom(nom2);
						
						System.out.println("\n - Saisissez le prenom : ");
						String prenom2=sc.nextLine();
						élève1.setPrenom(prenom2);
						
						System.out.println("\n - Saisissez la dateNaissance (JJ/MM/YYYY) : ");
						String dateNaissance2=sc.nextLine();
						//vérification de la date de naissance
						boolean saisie = false;
			            while (saisie == false) {
			            if ( dateNaissance2.matches("[0-9]{2}/[0-9]{2}/[0-9]{4}")) {
			                saisie = true;
			                break;
			            }else {
			            	System.out.println("\n - Format incorrect! Re-saisissez la date de naissance (JJ/MM/YYYY) : ");
			                dateNaissance2=sc.nextLine();
			            }
			            }
						élève1.setDateNaissance(dateNaissance2);
						
						break;
					case 2: 
						System.out.println(" - Saisissez le numéro et la désignation de la rue  : ");
						String numdDesignationRue2=sc.nextLine();
						élève1.setNumDesignationRue(numdDesignationRue2);
						
						System.out.println("\n - Saisissez le nom de la ville et le code postal : ");
						String villeCodePostal2=sc.nextLine();
						élève1.setVilleCodePostal(villeCodePostal2);
						
						System.out.println("\n - Saisissez le gouvernerat : ");
						String gouvernerat2=sc.nextLine();
						élève1.setGouvernerat(gouvernerat2);
						
						break;
					case 3:
						System.out.println(" - Saisissez le prénom du père : ");
						String prenomPere2=sc.nextLine();
						élève1.setPrenomPere(prenomPere2);
						
						System.out.println("\n - Saisissez le nom du grand-père : ");
						String prenomGP2=sc.nextLine();
						élève1.setPrenomGP(prenomGP2);
						
						System.out.println("\n - Saisissez le prénom de la mère : ");
						String prenomMere2=sc.nextLine();
						élève1.setPrenomMere(prenomMere2);
						
						System.out.println("\n - Saisissez le nom de la mère : ");
						String nomMere2=sc.nextLine();
						élève1.setNomMere(nomMere2);
						
						System.out.println("\n - Saisissez le CIN du père : ");
						String cinPere2=sc.nextLine();
						boolean saisieCinA = false;
			            while (saisieCinA == false) {
			           
			            if (cinPere2.matches("^[0-9]+$")&& cinPere2.length()== 8) {
			                saisieCinA = true;
			                break;
			            }else {
			            	 System.out.println("\n - Erreur de format! Re-saisissez le CIN  : ");
			            	 cinPere2=sc.nextLine();
			            }
			            }
						élève1.setCinPere(cinPere2);
						
						System.out.println("\n - Saisissez le téléphone du père : ");
						String telPere2=sc.nextLine();

						boolean saisieTelA = false;

			            while (saisieTelA == false) {
			           
			            if (telPere2.matches("^[0-9]+$")&& telPere2.length()== 8) {
			                saisieTelA = true;
			                break;
			            }else {
			            	 System.out.println("\n - Erreur de format! Re-saisissez le numéro de téléphone  : ");
			            	 telPere2=sc.nextLine();
			            }
			            }
						élève1.setTelPere(telPere2);
						
						break;
					case 4:
						
						System.out.println(" - Saisissez le niveau scolaire : ");
						String nivScolaire2=sc.next();
						élève1.setNivScolaire(nivScolaire2);
						
						System.out.println("\n - Saisissez le nombre des cours à suivre : ");
						int nbrCours2=sc.nextInt();
						élève1.setNbrCours(nbrCours2);
						
						break;
					default:
						System.out.println("Choix invalide ! ");
						break;
				
}
			
			élèveImpl.update(élève1);

			System.out.println("\n\n Elève modifié avec succès! \n\n");
			
		}
		
		public static void supprimerElève(ElèveImpl élèveImpl)
		{
			System.out.println("\n - Saisissez l'ID de l'élève dont vous voulez retirer : ");
			int idr=sc.nextInt();
			
			//vérification de l'ID
			boolean removeIdE = false;
            while (removeIdE == false) {
            String si=String.valueOf(idr);
            if (si.matches("^[0-9]+$") && élèveImpl.getById(idr) != null) {
                idr=Integer.parseInt(si);
                removeIdE = true;
                break;
            }else {
            	 System.out.println("\n - L'ID n'existe pas!  Re-saisissez l'ID  : ");
            	 idr=sc.nextInt();
            	 sc.nextLine();
            }
            }

			
			Elève élève2 = élèveImpl.getById(idr);
			
			élèveImpl.remove(élève2);
			
			System.out.println("\n\n Elève supprimé avec succès! \n\n");
			
		}
}

		

