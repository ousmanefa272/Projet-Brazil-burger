package Controllers;

import Entity.Burger;
import Services.IBurgerService;
import java.util.List;

public class BurgerController {

    private IBurgerService service;

    public BurgerController(IBurgerService service) {
        this.service = service;
    }

    public void ajouterBurger( int id,String nom, double prix,String image) {
        Burger b = new Burger(id,nom, prix,image);
        service.ajouterBurger(b);
        System.out.println("Burger ajouté !");
    }

    public void listerBurgers() {
        List<Burger> liste = service.listerBurgers();
        System.out.println("=== LISTE DES BURGERS ===");
        for (Burger b : liste) {
            System.out.println(b);
        }
    }
}