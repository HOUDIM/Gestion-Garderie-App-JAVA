package gestion.garderie.model;

import java.util.Scanner;

import gestion.garderie.impl.GarderieImpl;

public class Garderie {

		//Les attributs
		
		private String nomGarderie;
		private String numRueDesignationGarderie;
		private String villeCodePostalGarderie;
		private String gouverneratGarderie;
	
		static Scanner sc = new Scanner(System.in);
		
		//Les constructeurs
		
		public Garderie()
		{
			
		}
		
		public Garderie(String nomGarderie, String numRueDesignationGarderie, String villeCodePostalGarderie,
						String gouverneratGarderie)
		{
			
			this.nomGarderie=nomGarderie;
			this.numRueDesignationGarderie=numRueDesignationGarderie;
			this.villeCodePostalGarderie=villeCodePostalGarderie;
			this.gouverneratGarderie=gouverneratGarderie;
			
		}
		
		//Les getters et les setters
			

	public String getNomGarderie() {
		return nomGarderie;
	}

	public void setNomGarderie(String nomGarderie) {
		this.nomGarderie = nomGarderie;
	}

	public String getNumRueDesignationGarderie() {
		return numRueDesignationGarderie;
	}

	public void setNumRueDesignationGarderie(String numRueDesignationGarderie) {
		this.numRueDesignationGarderie = numRueDesignationGarderie;
	}

	public String getVilleCodePostalGarderie() {
		return villeCodePostalGarderie;
	}

	public void setVilleCodePostalGarderie(String villeCodePostalGarderie) {
		this.villeCodePostalGarderie = villeCodePostalGarderie;
	}

	public String getGouverneratGarderie() {
		return gouverneratGarderie;
	}

	public void setGouverneratGarderie(String gouverneratGarderie) {
		this.gouverneratGarderie = gouverneratGarderie;
	}
		
		
	public static void menuGarderie(String[] args)
	{
	
		System.out.println("\n*********************Informations de la garderie*****************************\n");
		System.out.println("\nVeuillez choisir une option :\n" +
				"\n\t1- Ajouter informations  \n\t2- Modifier informations\n"
				+ "\t3- Revenir au menu principal");
				
	}
	
	public static void ajouterInfoGarderie(GarderieImpl garderieImpl)
	{
		System.out.println("\n - Saisissez le nom : ");
		String nomGarderie=sc.nextLine();
		sc.nextLine();
		

		System.out.println(" - Saisissez le numéro et la désignation de la rue  : ");
		String numRueDesignationGarderie=sc.nextLine();
		
		
		System.out.println("\n - Saisissez le nom de la ville et le code postal : ");
		String villeCodePostalGarderie=sc.nextLine();
		
		
		System.out.println("\n - Saisissez le gouvernerat : ");
		String gouverneratGarderie=sc.nextLine();
		
		Garderie garderie = new Garderie();
		
		garderie.setNomGarderie(nomGarderie);
		garderie.setNumRueDesignationGarderie(numRueDesignationGarderie);
		garderie.setVilleCodePostalGarderie(villeCodePostalGarderie);
		garderie.setGouverneratGarderie(gouverneratGarderie);

		garderieImpl.addGarderie(garderie);
		
	}
	
	public static void modifierInfoGarderie(GarderieImpl garderieImpl)
	{

		System.out.println("\n - Choisissez les informations à modifier :"
				+ "\n 1 - Nom\n 2 - Numéro et désignation de la rue "
				+ "\n 3 - Ville et code postal \n 4 - Gouvernerat \n");
		System.out.println("\n - Votre Choix : ");
		int choix= sc.nextInt();
		
		Garderie garderie1 = new Garderie();
		
		switch(choix) {

		case 1:
			System.out.println("\n - Saisissez le nouveau nom : ");
			String nom2=sc.next();
			garderie1.setNomGarderie(nom2);
			break;
		case 2:
			System.out.println(" - Saisissez le numéro et la désignation de la rue  : ");
			String numdDesignationRue2=sc.next();
			garderie1.setNumRueDesignationGarderie(numdDesignationRue2);
			break;
		case 3:
			System.out.println("\n - Saisissez le nom de la ville et le code postal : ");
			String villeCodePostal2=sc.next();
			garderie1.setVilleCodePostalGarderie(villeCodePostal2);
			break;
		case 4:
			System.out.println("\n - Saisissez le gouvernerat : ");
			String gouvernerat2=sc.next();
			garderie1.setGouverneratGarderie(gouvernerat2);
			break;
		default:
			System.out.println("Choix invalide ! ");
			break;
		}

		garderieImpl.updateGarderie(garderie1);
	}

}
