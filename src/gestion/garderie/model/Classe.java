package gestion.garderie.model;


import java.util.List;
import java.util.Scanner;


import gestion.garderie.impl.AnimateurImpl;
import gestion.garderie.impl.ClasseImpl;
import gestion.garderie.impl.CoursActivitéImpl;
import gestion.garderie.impl.ElèveImpl;



public class Classe {

		
		//Les attributs
		private int idClasse;
		private String nomClasse;
		private List<Elève> élèves;
		private List<Animateur> animateurs;
		private List<CoursActivité> coursActivités;
		
		static Scanner sc = new Scanner(System.in);
		
		
		//Les constructeurs 

		public Classe()
		{
			
		}
		
		public Classe(int idClasse, String nomClasse, List<Elève> élèves, List<Animateur> animateurs,
				List<CoursActivité> coursActivités) {
			super();
			this.idClasse = idClasse;
			this.nomClasse = nomClasse;
			this.élèves = élèves;
			this.animateurs = animateurs;
			this.coursActivités = coursActivités;
		}


		//Les getteurs et les setteurs
		
		public int getIdClasse() {
			return idClasse;
		}

		public void setIdClasse(int idClasse) {
			this.idClasse = idClasse;
		}

		public String getNomClasse() {
			return nomClasse;
		}

		public void setNomClasse(String nomClasse) {
			this.nomClasse = nomClasse;
		}

		public List<Elève> getÉlèves() {
			return élèves;
		}

		public void setÉlèves(List<Elève> élèves) {
			this.élèves = élèves;
		}

		public List<Animateur> getAnimateurs() {
			return animateurs;
		}

		public void setAnimateurs(List<Animateur> animateurs) {
			this.animateurs = animateurs;
		}

		public List<CoursActivité> getCoursActivités() {
			return coursActivités;
		}

		public void setCoursActivités(List<CoursActivité> coursActivités) {
			this.coursActivités = coursActivités;
		}
		
		//Les méthodes d'ordre général
	
		
		@Override
		public String toString() {
			return "Classe [idClasse=" + idClasse + ", nomClasse=" + nomClasse + "\n élèves=" + élèves + "\n animateurs="
					+ animateurs + "\n coursActivités=" + coursActivités + "]\n";
		}

		
		
		public static void menuClasse(String[] args)
		{
			
			System.out.println("\n*********************Gestion des classes*****************************\n");
			
			System.out.println("\nVeuillez choisir une option :\n " +
						"\n\t1- Ajout d'une classe\n\t2- Mise à jour d'une classe\n"
						+ "\t3- Suppression d'une classe\n\t4- Liste des classes\n"
						+ "\t5- Revenir au menu principal");
		}

		public static void ajouterClasse(ClasseImpl classeImpl,ElèveImpl élèveImpl,AnimateurImpl animateurImpl,CoursActivitéImpl coursActivitéImpl,
				List<Elève> élèves,List<Animateur> animateurs,List<CoursActivité> coursActivités)
		{

			System.out.println("\n - Saisissez l'ID : ");
			int idClasse=sc.nextInt();
			
			//vérification de l'ID
			boolean saisieIdC = false;
            while (saisieIdC == false) {
            String si=String.valueOf(idClasse);
            if (si.matches("^[0-9]+$") && classeImpl.getById(idClasse) == null) {
                idClasse=Integer.parseInt(si);
                saisieIdC = true;
                break;
            }else {
            	 System.out.println("\n -Erreur!  Re-saisissez l'ID  : ");
            	 idClasse=sc.nextInt();
            	 sc.nextLine();
            }
            }
			
			System.out.println("\n - Saisissez le nom de la classe : ");
			String nomClasse=sc.next();
			
			System.out.println("\n - Saisissez le nombre des élèves dans cette classe : ");
			int nbrElève=sc.nextInt();
			
			for (int i=1; i <= nbrElève ; i++)
			{
				System.out.println("\n - Saisissez l'ID de l'élève N° "+ i +" apparatenant à cette classe : ");
				int ide=sc.nextInt();
				
				//vérification de l'ID
				boolean saisieIdEc = false;
                while (saisieIdEc == false) {
                String si=String.valueOf(ide);
                if (si.matches("^[0-9]+$") && élèveImpl.getById(ide) != null) {
                    ide=Integer.parseInt(si);
                    saisieIdEc = true;
                    break;
                }else {
                	 System.out.println("\n - Cet ID n'existe pas!  Re-saisissez un autre ID  : ");
                	 ide=sc.nextInt();
                	 sc.nextLine();
                }
                }
				
				Elève élève = élèveImpl.getById(ide);
				
				élèves.add(élève);
				
			}
			
			System.out.println("\n - Saisissez le nombre des animateurs dans cette classe : ");
			int nbrAnimateur=sc.nextInt();
			
			
			for (int i=1; i <= nbrAnimateur ; i++)
			{
				System.out.println("\n - Saisissez l'ID de l'animateur N° "+ i +" apparatenant à cette classe : ");
				int ide=sc.nextInt();
				
				//vérification de l'ID
				boolean saisieIdCa = false;
                while (saisieIdCa == false) {
                String si=String.valueOf(ide);
                if (si.matches("^[0-9]+$") && animateurImpl.getById(ide) != null) {
                    ide=Integer.parseInt(si);
                    saisieIdCa = true;
                    break;
                }else {
                	 System.out.println("\n - Cet ID n'existe pas!  Re-saisissez un autre ID  :  : ");
                	 ide=sc.nextInt();
                	 sc.nextLine();
                }
                }
				
				Animateur animateur = animateurImpl.getById(ide);
				
				animateurs.add(animateur);
				
				
			}
			
			System.out.println("\n - Saisissez le nombre des cours dans cette classe : ");
			int nbrCA=sc.nextInt();
			
			for (int i=1; i <= nbrCA ; i++)
			{
				System.out.println("\n - Saisissez le code de le cours N° "+ i +" apparatenant à cette classe : ");
				int codee=sc.nextInt();
				
				//vérification de l'ID
				boolean saisieCodeC = false;
                while (saisieCodeC == false) {
                String si=String.valueOf(codee);
                if (si.matches("^[0-9]+$") && coursActivitéImpl.getById(codee) != null) {
                   // codee=Integer.parseInt(si);
                    saisieCodeC = true;
                    break;
                }else {
                	 System.out.println("\n - Cet ID n'existe pas!  Re-saisissez un autre ID  : : ");
                	 codee=sc.nextInt();
                	 sc.nextLine();
                }
                }
				
				
				CoursActivité coursActivité = coursActivitéImpl.getById(codee);
				
				coursActivités.add(coursActivité);
				
			}
			
			Classe classe = new Classe();
			
			classe.setIdClasse(idClasse);
			classe.setNomClasse(nomClasse);
			classe.setÉlèves(élèves);
			classe.setAnimateurs(animateurs);
			classe.setCoursActivités(coursActivités);
			
			
			
			classeImpl.add(classe);
			
			System.out.println("\n\n Classe ajoutée avec succés! \n\n");
		}
		
		public static void modifierClasse(ClasseImpl classeImpl,ElèveImpl élèveImpl,AnimateurImpl animateurImpl,CoursActivitéImpl coursActivitéImpl,
				List<Elève> élèves,List<Animateur> animateurs,List<CoursActivité> coursActivités)
		{
			System.out.println("\n - Saisissez l'ID de la classe dont vous voulez modifier : ");
			int ida=sc.nextInt();
			
			//vérification de l'ID
			boolean updateIdC = false;
            while (updateIdC == false) {
            String si=String.valueOf(ida);
            if (si.matches("^[0-9]+$") && classeImpl.getById(ida) != null) {
                ida=Integer.parseInt(si);
                updateIdC = true;
                break;
            }else {
            	 System.out.println("\n - Cet ID n'existe pas!  Re-saisissez un autre ID  : ");
            	 ida=sc.nextInt();
            	 sc.nextLine();
            }
            }
			
			Classe classe1 = classeImpl.getById(ida);
			
		
					System.out.println("\n - Choisissez les informations à modifier :"
							+ "\n 1- Nom"
							+ "\n 2- Ajouter élève"
							+ "\n 3- Ajouter animateur"
							+ "\n 4- Ajouter cours");
					System.out.println("\n - Votre Choix : ");
					int choix= sc.nextInt();
					switch(choix) {
					case 1:
						System.out.println("\n - Saisissez le nom de la classe : ");
						String nomClasse1=sc.next();
						classe1.setNomClasse(nomClasse1);
						break;
					case 2:
						System.out.println("\n - Saisissez l'ID de l'élève que vous voulez ajouter à cette classe : ");
						int ide1=sc.nextInt();
						
						//vérification de l'ID
						boolean saisieIdEc = false;
	                    while (saisieIdEc== false) {
	                    String si=String.valueOf(ide1);
	                    if (si.matches("^[0-9]+$") && élèveImpl.getById(ide1) != null) {
	                        ide1=Integer.parseInt(si);
	                        saisieIdEc = true;
	                        break;
	                    }else {
	                    	 System.out.println("\n - Cet ID n'existe pas!  Re-saisissez un autre ID   : ");
	                    	 ide1=sc.nextInt();
	                    	 sc.nextLine();
	                    }
	                    }
				
						Elève élève1 = élèveImpl.getById(ide1);
						élèves.add(élève1);
						classe1.setÉlèves(élèves);
						break;
					case 3:
						System.out.println("\n - Saisissez l'ID de l'animateur que vous voulez ajouter à cette classe : ");
						int ida1=sc.nextInt();
						
						//vérification de l'ID
						boolean saisieIdCa = false;
	                    while (saisieIdCa == false) {
	                    String si=String.valueOf(ida1);
	                    if (si.matches("^[0-9]+$") && animateurImpl.getById(ida1) != null) {
	                        ida1=Integer.parseInt(si);
	                        saisieIdCa = true;
	                        break;
	                    }else {
	                    	 System.out.println("\n - Cet ID n'existe pas!  Re-saisissez un autre ID  : ");
	                    	 ida1=sc.nextInt();
	                    	 sc.nextLine();
	                    }
	                    }
				
						Animateur animateur1 = animateurImpl.getById(ida1);
						animateurs.add(animateur1);
						classe1.setAnimateurs(animateurs);
						break;
					case 4:
						System.out.println("\n - Saisissez le code de le cours ue vous voulez ajouter à cette classe : ");
						int codee1=sc.nextInt();
						
						//vérification de l'ID
						boolean saisieCodeC = false;
	                    while (saisieCodeC == false) {
	                    String si=String.valueOf(codee1);
	                    if (si.matches("^[0-9]+$") && coursActivitéImpl.getById(codee1) != null) {
	                       // codee=Integer.parseInt(si);
	                        saisieCodeC = true;
	                        break;
	                    }else {
	                    	 System.out.println("\n -Erreur!  Re-saisissez l'ID  : ");
	                    	 codee1=sc.nextInt();
	                    	 sc.nextLine();
	                    }
	                    }
						
				
						CoursActivité coursActivité1 = coursActivitéImpl.getById(codee1);
						coursActivités.add(coursActivité1);
						classe1.setCoursActivités(coursActivités);
						break;
					default:
						System.out.println("\n Choix invalide!\n");
						break;
		
					}
			//classeImpl.add(classe1);
			
			System.out.println("Classe modifié avec succé");
		}
		
		public static void supprimerClasse(ClasseImpl classeImpl,ElèveImpl élèveImpl,AnimateurImpl animateurImpl,CoursActivitéImpl coursActivitéImpl,
				List<Elève> élèves,List<Animateur> animateurs,List<CoursActivité> coursActivités)
		{
			System.out.println("\n - Saisissez l'ID de la classe dont vous voulez modifier ou retirer : ");
			int idc=sc.nextInt();
			
			boolean removeIdC = false;
            while (removeIdC == false) {
            String si=String.valueOf(idc);
            if (si.matches("^[0-9]+$") && classeImpl.getById(idc) != null) {
                idc=Integer.parseInt(si);
                removeIdC = true;
                break;
            }else {
            	 System.out.println("\n -Erreur!  Re-saisissez l'ID  : ");
            	 idc=sc.nextInt();
            	 sc.nextLine();
            }
            }
			
			Classe classe2 = classeImpl.getById(idc);
			
		
					System.out.println("\n - Choisissez les informations à retirer :"
							+ "\n 1- Supprier toute la classe"
							+ "\n 2- Supprimer un élève"
							+ "\n 3- Supprimer un animateur"
							+ "\n 4- Supprimer un cours");
					System.out.println("\n - Votre Choix : ");
					int choix1= sc.nextInt();
					switch(choix1) {
					case 1:
						classeImpl.remove(classe2);
						System.out.println("\n - Classe supprimée ! \n ");
						
						break;
					case 2:
						System.out.println("\n - Saisissez l'ID de l'élève que vous voulez retirer de cette classe : ");
						int ide2=sc.nextInt();
						
						//vérification de l'ID
						boolean removeIdEc = false;
	                    while (removeIdEc== false) {
	                    String si=String.valueOf(ide2);
	                    if (si.matches("^[0-9]+$") && élèveImpl.getById(ide2) != null) {
	                        ide2=Integer.parseInt(si);
	                        removeIdEc = true;
	                        break;
	                    }else {
	                    	 System.out.println("\n -Erreur!  Re-saisissez l'ID  : ");
	                    	 ide2=sc.nextInt();
	                    	 sc.nextLine();
	                    }
	                    }
				
						Elève élève2 = élèveImpl.getById(ide2);
						élèves.remove(élève2);
						break;
					case 3:
						System.out.println("\n - Saisissez l'ID de l'animateur que vous voulez retirer de cette classe : ");
						int ida2=sc.nextInt();
						
						//vérification de l'ID
						boolean removeIdCa = false;
	                    while (removeIdCa == false) {
	                    String si=String.valueOf(ida2);
	                    if (si.matches("^[0-9]+$") && animateurImpl.getById(ida2) != null) {
	                        ida2=Integer.parseInt(si);
	                        removeIdCa = true;
	                        break;
	                    }else {
	                    	 System.out.println("\n -Erreur!  Re-saisissez l'ID  : ");
	                    	 ida2=sc.nextInt();
	                    	 sc.nextLine();
	                    }
	                    }
				
						Animateur animateur2 = animateurImpl.getById(ida2);
						animateurs.remove(animateur2);
						break;
					case 4:
						System.out.println("\n - Saisissez le code de le cours ue vous voulez retirer de cette classe : ");
						int codee2=sc.nextInt();
						
						//vérification de l'ID
						boolean removeCodeC = false;
	                    while (removeCodeC == false) {
	                    String si=String.valueOf(codee2);
	                    if (si.matches("^[0-9]+$") && coursActivitéImpl.getById(codee2) != null) {
	                       // codee=Integer.parseInt(si);
	                        removeCodeC = true;
	                        break;
	                    }else {
	                    	 System.out.println("\n -Erreur!  Re-saisissez l'ID  : ");
	                    	 codee2=sc.nextInt();
	                    	 sc.nextLine();
	                    }
	                    }
				
						CoursActivité coursActivité2 = coursActivitéImpl.getById(codee2);
						coursActivités.remove(coursActivité2);
						break;
					default:
						System.out.println("\n Choix invalide!\n");
						break;
		
					}
		}
	
}
