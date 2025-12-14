package Controllers;

import Entity.Menu;
import Entity.Burger;
import Services.IMenuService;
import Services.Impl.MenuServiceImpl;
import java.util.List;
import java.util.ArrayList;

public class MenuController {

  
    private IMenuService menuService = new MenuServiceImpl();

    public void ajouterMenu(int id, String nom, double prix, String image, List<Burger> burgers) {
        Menu menu = new Menu(id, nom, prix, image, (burgers != null) ? burgers : new ArrayList<>());
        menuService.ajouterMenu(menu);
        System.out.println("Menu ajouté : " + nom);
    }

    public void listerMenus() {
        List<Menu> menus = menuService.listerMenus();
        if (menus.isEmpty()) {
            System.out.println("Aucun menu disponible.");
        } else {
            for (Menu m : menus) {
                System.out.println(m);
            }
        }
    }
}
