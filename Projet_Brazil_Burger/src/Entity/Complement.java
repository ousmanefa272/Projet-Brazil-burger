package Entity;

public class Complement {
    private int id;
    private String nom;
    private String image;
    private double prix;

    public Complement(int id, String nom, String image, double prix){
        this.id = id;
        this.nom = nom;
        this.image = image;
        this.prix = prix;
    }

    public int getId() { return id; }
    public String getNom() { return nom; }
    public String getImage() { return image; }
    public double getPrix() { return prix; }
}