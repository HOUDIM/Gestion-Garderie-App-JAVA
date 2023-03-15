package gestion.garderie.model;


import gestion.garderie.impl.El�veImpl;

public class El�ve extends Personne{
		
		//Les attributs 
		private String prenomPere, prenomGP, prenomMere, nomMere;
		private String cinPere, telPere;
		private String nivScolaire;
		private int nbrCours;
		
		//Les constructeurs
		
		public El�ve(int id, String nom, String prenom, String dateNaissance, String numdDesignationRue,
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

		
		
		//Les m�thodes d'ordre g�n�ral
		
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
					 + "| Num�ro et d�signation de la rue   |"+getNumDesignationRue()+"\n"
					 + "+---------------------------------------------------------------------------------------+\n"
					 + "| Ville et code postal              |"+getVilleCodePostal()+"\n"
					 + "+---------------------------------------------------------------------------------------+\n"
					 + "| Gouvernerat                       |"+getGouvernerat()+"\n"
					 + "+---------------------------------------------------------------------------------------+\n"
					 + "| Pr�nom du p�re                    |"+prenomPere+"\n"
					 + "+---------------------------------------------------------------------------------------+\n"
					 + "| Pr�nom du grand-p�re              |"+prenomGP+"\n"
					 + "+---------------------------------------------------------------------------------------+\n"
					 + "| Pr�nom de la m�re                 |"+prenomMere+"\n"
					 + "+---------------------------------------------------------------------------------------+\n"
					 + "| Nom de la m�re                    |"+nomMere+"\n"
					 + "+---------------------------------------------------------------------------------------+\n"
					 + "| Num�ro CIN du p�re                |"+cinPere+"\n"
					 + "+---------------------------------------------------------------------------------------+\n"
					 + "| Niveau scolaire                   |"+nivScolaire+"\n"
					 + "+---------------------------------------------------------------------------------------+\n"
					 + "| Nombre de cours                   |"+nbrCours+"\n"
					 + "+---------------------------------------------------------------------------------------+\n\n";
		}
		
		
		public static void menuEl�ve(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("\n*********************Gestion des �l�ves*****************************\n");
			
			System.out.println("\nVeuillez choisir une option : \n " +
						"\n\t1- Ajout d'un �l�ve\n\t2- Mise � jour d'un �l�ve\n"
						+ "\t3- Suppression d'un �l�ve\n\t4- Liste des �l�ves\n"
						+ "\t5- Revenir au menu principal");
			}
		
		public static void ajouterEl�ve(El�veImpl �l�veImpl)
		{
			System.out.println("\n *** Informations personnelles *** \n");
			System.out.println("\n - Saisissez l'ID : ");
			int id=sc.nextInt();
			sc.nextLine();
			
			//v�rification de l'ID
			boolean saisieIdE = false;
            while (saisieIdE == false) {
            String si=String.valueOf(id);
            if (si.matches("^[0-9]+$") && �l�veImpl.getById(id) == null) {
                id=Integer.parseInt(si);
                saisieIdE = true;
                break;
            }else {
            	 System.out.println("\n - L'ID existe d�ja!  Re-saisissez un autre ID  : ");
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
			
			//v�rification de la date de naissance
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
			
			System.out.println(" - Saisissez le num�ro et la d�signation de la rue  : ");
			String numdDesignationRue=sc.nextLine();
			
			
			System.out.println("\n - Saisissez le nom de la ville et le code postal : ");
			String villeCodePostal=sc.nextLine();
			
			
			System.out.println("\n - Saisissez le gouvernerat : ");
			String gouvernerat=sc.nextLine();
			
			
			System.out.println("\n *** Informations des parents *** \n");
			
			System.out.println(" - Saisissez le pr�nom du p�re : ");
			String prenomPere=sc.nextLine();
			
			System.out.println("\n - Saisissez le nom du grand-p�re : ");
			String prenomGP=sc.nextLine();
			
			System.out.println("\n - Saisissez le pr�nom de la m�re : ");
			String prenomMere=sc.nextLine();
			
			System.out.println("\n - Saisissez le nom de la m�re : ");
			String nomMere=sc.nextLine();
			
			System.out.println("\n - Saisissez le CIN du p�re : ");
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
			
			System.out.println("\n - Saisissez le t�l�phone du p�re : ");
			String telPere=sc.nextLine();
			
			boolean saisieTelA = false;

            while (saisieTelA == false) {
           
            if (telPere.matches("^[0-9]+$")&& telPere.length()== 8) {
                saisieTelA = true;
                break;
            }else {
            	 System.out.println("\n - Format incorrect! Re-saisissez le num�ro de t�l�phone  : ");
            	 telPere=sc.nextLine();
            }
            }
			
			System.out.println("\n *** Informations scolaires *** \n");
			
			System.out.println(" - Saisissez le niveau scolaire : ");
			String nivScolaire=sc.nextLine();
			
			System.out.println("\n - Saisissez le nombre des cours � suivre : ");
			int nbrCours=sc.nextInt();
			
			
			El�ve �l�ve = new El�ve(id,nom,prenom,dateNaissance,numdDesignationRue,villeCodePostal, 
					        	gouvernerat,prenomPere,prenomGP,prenomMere,nomMere,cinPere,telPere, 
					        	nivScolaire,nbrCours);
			
			
			�l�veImpl.add(�l�ve);
			
			System.out.println("\n\n El�ve ajout� avec succ�s! \n\n");
		}
		
		public static void modifierEl�ve (El�veImpl �l�veImpl)
		{

			
			System.out.println("\n - Saisissez l'ID de l'�l�ve dont vous voulez modifier : ");
			int idm=sc.nextInt();
			
			//v�rification de l'ID
			boolean updateIdE = false;
            while (updateIdE == false) {
            String si=String.valueOf(idm);
            if (si.matches("^[0-9]+$") && �l�veImpl.getById(idm) != null) {
                idm=Integer.parseInt(si);
                updateIdE = true;
                break;
            }else {
            	 System.out.println("\n - L'ID n'existe pas !  Re-saisissez un autre ID  : ");
            	 idm=sc.nextInt();
            	 sc.nextLine();
            }
            }
		
			
			El�ve �l�ve1 = �l�veImpl.getById(idm);
			

					System.out.println("\n - Choisissez les informations � modifier :\n 1- Informations personnelles"
							+ "\n 2- Adresse\n 3- Informations des parents\n 4- Informations scolaires");
					System.out.println("\n - Votre Choix : ");
					int choix= sc.nextInt();
					sc.nextLine();
					switch(choix) {
					case 1:
						
						System.out.println("\n - Saisissez le nom : ");
						String nom2=sc.nextLine();
						�l�ve1.setNom(nom2);
						
						System.out.println("\n - Saisissez le prenom : ");
						String prenom2=sc.nextLine();
						�l�ve1.setPrenom(prenom2);
						
						System.out.println("\n - Saisissez la dateNaissance (JJ/MM/YYYY) : ");
						String dateNaissance2=sc.nextLine();
						//v�rification de la date de naissance
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
						�l�ve1.setDateNaissance(dateNaissance2);
						
						break;
					case 2: 
						System.out.println(" - Saisissez le num�ro et la d�signation de la rue  : ");
						String numdDesignationRue2=sc.nextLine();
						�l�ve1.setNumDesignationRue(numdDesignationRue2);
						
						System.out.println("\n - Saisissez le nom de la ville et le code postal : ");
						String villeCodePostal2=sc.nextLine();
						�l�ve1.setVilleCodePostal(villeCodePostal2);
						
						System.out.println("\n - Saisissez le gouvernerat : ");
						String gouvernerat2=sc.nextLine();
						�l�ve1.setGouvernerat(gouvernerat2);
						
						break;
					case 3:
						System.out.println(" - Saisissez le pr�nom du p�re : ");
						String prenomPere2=sc.nextLine();
						�l�ve1.setPrenomPere(prenomPere2);
						
						System.out.println("\n - Saisissez le nom du grand-p�re : ");
						String prenomGP2=sc.nextLine();
						�l�ve1.setPrenomGP(prenomGP2);
						
						System.out.println("\n - Saisissez le pr�nom de la m�re : ");
						String prenomMere2=sc.nextLine();
						�l�ve1.setPrenomMere(prenomMere2);
						
						System.out.println("\n - Saisissez le nom de la m�re : ");
						String nomMere2=sc.nextLine();
						�l�ve1.setNomMere(nomMere2);
						
						System.out.println("\n - Saisissez le CIN du p�re : ");
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
						�l�ve1.setCinPere(cinPere2);
						
						System.out.println("\n - Saisissez le t�l�phone du p�re : ");
						String telPere2=sc.nextLine();

						boolean saisieTelA = false;

			            while (saisieTelA == false) {
			           
			            if (telPere2.matches("^[0-9]+$")&& telPere2.length()== 8) {
			                saisieTelA = true;
			                break;
			            }else {
			            	 System.out.println("\n - Erreur de format! Re-saisissez le num�ro de t�l�phone  : ");
			            	 telPere2=sc.nextLine();
			            }
			            }
						�l�ve1.setTelPere(telPere2);
						
						break;
					case 4:
						
						System.out.println(" - Saisissez le niveau scolaire : ");
						String nivScolaire2=sc.next();
						�l�ve1.setNivScolaire(nivScolaire2);
						
						System.out.println("\n - Saisissez le nombre des cours � suivre : ");
						int nbrCours2=sc.nextInt();
						�l�ve1.setNbrCours(nbrCours2);
						
						break;
					default:
						System.out.println("Choix invalide ! ");
						break;
				
}
			
			�l�veImpl.update(�l�ve1);

			System.out.println("\n\n El�ve modifi� avec succ�s! \n\n");
			
		}
		
		public static void supprimerEl�ve(El�veImpl �l�veImpl)
		{
			System.out.println("\n - Saisissez l'ID de l'�l�ve dont vous voulez retirer : ");
			int idr=sc.nextInt();
			
			//v�rification de l'ID
			boolean removeIdE = false;
            while (removeIdE == false) {
            String si=String.valueOf(idr);
            if (si.matches("^[0-9]+$") && �l�veImpl.getById(idr) != null) {
                idr=Integer.parseInt(si);
                removeIdE = true;
                break;
            }else {
            	 System.out.println("\n - L'ID n'existe pas!  Re-saisissez l'ID  : ");
            	 idr=sc.nextInt();
            	 sc.nextLine();
            }
            }

			
			El�ve �l�ve2 = �l�veImpl.getById(idr);
			
			�l�veImpl.remove(�l�ve2);
			
			System.out.println("\n\n El�ve supprim� avec succ�s! \n\n");
			
		}
}

		

