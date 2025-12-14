package Views;


import Controllers.BurgerController;
import Controllers.MenuController;
import Controllers.CommandeController;
import Controllers.PaiementController;
import Entity.Burger;

import java.util.List;
import java.util.Scanner;

public class MainView {

    private BurgerController burgerController;
    private MenuController menuController;
    private CommandeController commandeController;
    private PaiementController paiementController;

    private Scanner sc = new Scanner(System.in);

    public MainView(BurgerController bc, MenuController mc,
                    CommandeController cc, PaiementController pc) {
        this.burgerController = bc;
        this.menuController = mc;
        this.commandeController = cc;
        this.paiementController = pc;
    }

    public void menu() {
        int choix;

        do {
            System.out.println("\n=== BRASIL BURGER - MENU PRINCIPAL ===");
            System.out.println("1 - Gestion Burgers");
            System.out.println("2 - Gestion Menus");
            System.out.println("3 - Gestion Commandes");
            System.out.println("4 - Gestion Paiements");
            System.out.println("5 - Quitter");
            System.out.print("Choix : ");
            choix = sc.nextInt();

            switch (choix) {

                case 1 -> menuBurger();
                case 2 -> menuMenu();
                case 3 -> menuCommande();
                case 4 -> menuPaiement();
            }

        } while (choix != 5);

        System.out.println("Au revoir !");
    }

    private void menuBurger() {
        System.out.println("\n=== GESTION DES BURGERS ===");
        System.out.println("1 - Ajouter");
        System.out.println("2 - Lister");
        System.out.print("Choix : ");
        int ch = sc.nextInt();
     if (ch == 1) {
      System.out.print("Nom : ");
      String nom = sc.next();
      System.out.print("Prix : ");
      double prix = sc.nextDouble();
      System.out.print("Image : ");
      String image = sc.next();
    
    
    burgerController.ajouterBurger(1, nom, prix, image); 
} 
else if (ch == 2) {
    burgerController.listerBurgers();
}

    }

    private void menuMenu() {
        System.out.println("\n=== GESTION DES MENUS ===");
        System.out.println("1 - Ajouter");
        System.out.println("2 - Lister");
        System.out.print("Choix : ");
        int ch = sc.nextInt();

        if (ch == 1) {
            System.out.print("ID : ");
            int id = sc.nextInt();
            System.out.print("Nom : ");
            String nom = sc.next();
            System.out.print("Prix : ");
            double prix = sc.nextDouble();
            System.out.print("Image : ");
            String image = sc.next();
            menuController.ajouterMenu(id, nom, prix, image, (List<Burger>)null);
        }
        else if (ch == 2) {
            menuController.listerMenus();
        }
    }

    private void menuCommande() {
        System.out.println("\n=== GESTION DES COMMANDES ===");
        System.out.println("1 - Ajouter");
        System.out.println("2 - Lister");
        System.out.print("Choix : ");
        int ch = sc.nextInt();

        if (ch == 1) {
            System.out.print("ID Commande : ");
            int id = sc.nextInt();
            System.out.print("Mode : ");
            String mode = sc.next();
            commandeController.ajouterCommande(id, mode);
        }
        else if (ch == 2) {
            commandeController.listerCommandes();
        }
    }

    private void menuPaiement() {
        System.out.println("\n=== GESTION DES PAIEMENTS ===");
        System.out.println("1 - Ajouter");
        System.out.println("2 - Lister");
        System.out.print("Choix : ");
        int ch = sc.nextInt();

        if (ch == 1) {
            System.out.print("Montant : ");
            double montant = sc.nextDouble();
            System.out.println("Mode (1=WAVE / 2=OM) : ");
            int m = sc.nextInt();

            paiementController.enregistrerPaiement(montant,
                    (m == 1) ? Entity.Paiement.Mode.WAVE : Entity.Paiement.Mode.OM);
        }
        else if (ch == 2) {
            paiementController.listerPaiements();
        }
    }
}