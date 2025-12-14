package Entity;

import java.time.LocalDateTime;

public class Commande {

    public enum Etat { EN_COURS, VALIDEE, ANNULEE, TERMINEE }

    private int id;
    private String mode;                   
    private LocalDateTime dateCommande;    
    private Etat etat;

    public Commande(int id, String mode) {
        this.id = id;
        this.mode = mode;
        this.dateCommande = LocalDateTime.now();
        this.etat = Etat.EN_COURS;  
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getMode() { return mode; }
    public void setMode(String mode) { this.mode = mode; }

    public LocalDateTime getDateCommande() { return dateCommande; }
    public void setDateCommande(LocalDateTime dateCommande) { this.dateCommande = dateCommande; }

    public Etat getEtat() { return etat; }
    public void setEtat(Etat etat) { this.etat = etat; }

    @Override
    public String toString() {
        return "Commande: " + id + " - Mode : " + mode + " - Date : " + dateCommande + " - Etat : " + etat;
    }
}
