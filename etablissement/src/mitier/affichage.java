package mitier;

import java.util.Scanner;

public class affichage {

	public static void main(String[] args) {




etudiant e=new etudiant();
String adresse="21 rue alber";

				
				System.out.println("veuillez sisir votre mail");
				Scanner sc = new Scanner(System.in);
				String mail = sc.nextLine();
				System.out.println("veuillez sisir votre mdp");
				 sc = new Scanner(System.in);
				String mdp = sc.nextLine();
				 authentification s=new authentification();
				if (s.Authentifier(mail,mdp)==1) {
					System.out.println("menu");
					System.out.println("cliquer 0 pour ajouter un etudiant");
					System.out.println("cliquer 1 pour modifier l adresse d un etudiant");
					System.out.println("cliquer 2 pour afficher la liste des etudiants");
					System.out.println("cliquer 3 pour supprimer un etudiant");}
				 sc = new Scanner(System.in);
				 int reponse = sc.nextInt();
				 if (reponse==0)
				e.Creer(e);
				 else if(reponse==1)
					 e.Modifier(e, adresse);
				 else if(reponse==2)
					 e.lister();
				 else
					 e.supprimer(e);
				// TODO Auto-generated method stub

			}

		


		// TODO Auto-generated method stub

	}

