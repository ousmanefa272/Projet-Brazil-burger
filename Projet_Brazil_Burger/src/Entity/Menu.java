package Entity;

import java.util.List;
import java.util.ArrayList;

public class Menu {
    private int id;
    private String nom;
    private double prix;
    private String image;
    private List<Burger> burgers;

    public Menu(int id, String nom, double prix, String image, List<Burger> burgers) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;           
        this.image = image;
        this.burgers = (burgers != null) ? burgers : new ArrayList<>();
    }

    public int getId() { return id; }
    public String getNom() { return nom; }
    public double getPrix() { return prix; }
    public String getImage() { return image; }
    public List<Burger> getBurgers() { return burgers; }

    @Override
    public String toString() {
        return "Menu [id=" + id + ", nom=" + nom + ", prix=" + prix + ", image=" + image + ", burgers=" + burgers + "]";
    }
}
