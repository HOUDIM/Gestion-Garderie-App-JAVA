package gestion.garderie.model;


import gestion.garderie.impl.DirecteurImpl;

public class Directeur extends Personne{
	
		//Les attributs
		
		private String user;
		private String mdp;
		private int numTelD;
		private int cinD;
		
		
		//Les constructeurs
		public Directeur() {
			
		}
	
		public Directeur(int id, String nom, String prenom, String dateNaissance, String numdDesignationRue,
				String villeCodePostal, String gouvernerat,String user, String mdp, int numTelD, int cinD) {
			super(id, nom, prenom, dateNaissance, numdDesignationRue, villeCodePostal, gouvernerat);
			// TODO Auto-generated constructor stub
			this.user=user;
			this.mdp=mdp;
			this.numTelD=numTelD;
			this.cinD=cinD;
		}
		
		//Les getteurs et les setteurs
		

		public String getUser() {
			return user;
		}
		public void setUser(String user) {
			this.user = user;
		}
		
		public String getMdp() {
			return mdp;
		}
		public void setMdp(String mdp) {
			this.mdp = mdp;
		}
		
		public int getNumTelD() {
			return numTelD;
		}

		public void setNumTelD(int numTelD) {
			this.numTelD = numTelD;
		}
		public int getCinD() {
			return cinD;
		}
		public void setCinD(int cinD) {
			this.cinD = cinD;
		}
		
		//Les méthodes d'ordre général
		@Override
		public String toString() 
		{
			return "[ ID = " + getId() + "| Nom = " + getNom() + "| Prénom = " + getPrenom()+  "| Date de naissance = "
					+ getDateNaissance() + "| Numéro et désignation de la rue =  " + getNumDesignationRue() + "| Ville et code postal = " 
					+ getVilleCodePostal() + "| Gouvernerat = " + getGouvernerat() + "| user=" + user + "| mdp=" + mdp + 
					"| numTelD=" + numTelD + "| cinD=" + cinD + "]\n";
		}
		

		public static void menuDirecteur(String[] args)
		{

			System.out.println("\n******************** Gestion de directeur *****************************\n");
			
			System.out.println("\nVeuillez choisir une option : \n " +
						"\n\t1- Ajout d'un directeur\n\t2- Mise à jour d'un directeur\n\t3- Supprimer directeur\n\t4- Lister directeur"
						+ "\n\t5- Revenir au menu principal");
			
		}
		
		public static void ajouterDirecteur(DirecteurImpl directeurImpl)
		{
			System.out.println("\n - Saisissez l'ID : ");
			int id=sc.nextInt();
			sc.nextLine();
			
			//vérification de l'ID
			boolean saisieIdD = false;
            while (saisieIdD == false) {
            String si=String.valueOf(id);
            if (si.matches("^[0-9]+$") && directeurImpl.getById(id) == null) {
                id=Integer.parseInt(si);
                saisieIdD = true;
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
			
			
			System.out.println("\n - Saisissez la date de Naissance (MM/JJ/YYYY) : ");
			String dateNaissance=sc.nextLine();
			
			//vérification de la date de naissance
			boolean saisie = false;
            while (saisie == false) {
            if ( dateNaissance.matches("[0-1][0-9]/[0-3][0-9]/[0-9]{4}")) {
                
                saisie = true;
                break;
            }else {
            	System.out.println("\n - Erreur! Re-saisissez la date de naissance (MM/JJ/YYYY) : ");
                dateNaissance=sc.nextLine();
            }
            }
			
			System.out.println(" - Saisissez le numéro et la désignation de la rue  : ");
			String numdDesignationRue=sc.nextLine();
			
			
			System.out.println("\n - Saisissez le nom de la ville et le code postal : ");
			String villeCodePostal=sc.nextLine();
			
			
			System.out.println("\n - Saisissez le gouvernerat : ");
			String gouvernerat=sc.nextLine();
			
			System.out.println("\n - Saisissez le pseudo : ");
			String user=sc.next();
			System.out.println("\n - Saisissez le mot de passe : ");
			String mdp=sc.next();
			System.out.println("\n - Saisissez le numéro de téléphone : ");
			int numTelD=sc.nextInt();
			System.out.println("\n - Saisissez le CIN : ");
			int cinD=sc.nextInt();
			
			

			Directeur directeur = new Directeur(id, nom, prenom, dateNaissance, numdDesignationRue, villeCodePostal, gouvernerat, user, mdp, numTelD, cinD);
			
			directeurImpl.add(directeur);
			
			System.out.println("Directeur ajouté avec succès!");
		}
		
		
		
		public static void modifierDirecteur(DirecteurImpl directeurImpl)
		{
			System.out.println("\n - Saisissez l'ID de directeur: ");
			int idD=sc.nextInt();
			
			//vérification de l'ID
			boolean updateIdD = false;
            while (updateIdD == false) {
            String si=String.valueOf(idD);
            if (si.matches("^[0-9]+$") && directeurImpl.getById(idD) != null) {
                idD=Integer.parseInt(si);
                updateIdD = true;
                break;
            }else {
            	 System.out.println("\n -Erreur!  Re-saisissez l'ID  : ");
            	 idD=sc.nextInt();
            	 sc.nextLine();
            }
            }
            
            
            
			
			Directeur directeur1 = directeurImpl.getById(idD);
			
		
			
					System.out.println("\n - Choisissez les informations à modifier :"
							+ "\n 1 - Nom\n 2 - Prénom\n 3 - Date de naissance\n 4 - CIN\n 5 - Numéro de téléphone\n"
							+ " 6 - Numéro et désignation de la rue "
							+ "\n 7 - Ville et code postal \n 8 - Gouvernerat \n"
							+ " 9 - Pseudo\n 10 - Mot de passe ");
					System.out.println("\n - Votre Choix : ");
					int choix= sc.nextInt();
					switch(choix) {

					case 1:
						System.out.println("\n - Saisissez le nouveau nom : ");
						String nom2=sc.next();
						directeur1.setNom(nom2);
						break;
					case 2:
						System.out.println("\n - Saisissez le nouveau prenom : ");
						String prenom2=sc.next();
						directeur1.setPrenom(prenom2);
						break;
					case 3:
						System.out.println("\n - Saisissez la nouvelle dateNaissance (JJ/MM/YYYY) : ");
						String dateNaissance2=sc.next();
						directeur1.setDateNaissance(dateNaissance2);
						break;
					case 4:
						System.out.println("\n - Saisissez le CIN : ");
						int cinD2=sc.nextInt();
						directeur1.setCinD(cinD2);
						break;
					case 5:
						System.out.println("\n - Saisissez le numéro de téléphone : ");
						int numTelD2=sc.nextInt();
						directeur1.setNumTelD(numTelD2);
						break;
					case 6:
						System.out.println(" - Saisissez le numéro et la désignation de la rue  : ");
						String numdDesignationRue2=sc.next();
						directeur1.setNumDesignationRue(numdDesignationRue2);
						break;
					case 7:
						System.out.println("\n - Saisissez le nom de la ville et le code postal : ");
						String villeCodePostal2=sc.next();
						directeur1.setVilleCodePostal(villeCodePostal2);
						break;
					case 8:
						System.out.println("\n - Saisissez le gouvernerat : ");
						String gouvernerat2=sc.next();
						directeur1.setGouvernerat(gouvernerat2);
						break;
					case 9:
						System.out.println("\n - Saisissez le pseudo : ");
						String user2=sc.next();
						directeur1.setUser(user2);
						break;
					case 10:
						System.out.println("\n - Saisissez le mot de passe : ");
						String mdp2=sc.next();
						directeur1.setMdp(mdp2);
					default:
						System.out.println("Choix invalide ! ");
						break;
					}
			
			directeurImpl.update(directeur1);
			

			System.out.println("Directeur modifié avec succès!");
		}
		
		public static void supprimerDirecteur(DirecteurImpl directeurImpl)
		{
			System.out.println("\n - Saisissez l'ID de directeur dont vous voulez retirer : ");
			int idD=sc.nextInt();
			
			//vérification de l'ID
			boolean removeIdD = false;
            while (removeIdD == false) {
            String si=String.valueOf(idD);
            if (si.matches("^[0-9]+$") && directeurImpl.getById(idD) != null) {
                idD=Integer.parseInt(si);
                removeIdD = true;
                break;
            }else {
            	 System.out.println("\n -Erreur!  Re-saisissez l'ID  : ");
            	 idD=sc.nextInt();
            	 sc.nextLine();
            }
            }
			
			Directeur directeur2 = directeurImpl.getById(idD);
			
			directeurImpl.remove(directeur2);
			
			System.out.println("Directeur supprimé avec succé");
		}
}
