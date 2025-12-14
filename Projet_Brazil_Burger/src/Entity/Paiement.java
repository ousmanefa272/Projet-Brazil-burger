package Entity;

import java.time.LocalDateTime;

public class Paiement {

    public enum Mode { WAVE, OM }

    private LocalDateTime date = LocalDateTime.now();
    private double montant;
    private Mode mode;

    public Paiement(double montant, Mode mode){
        this.montant = montant;
        this.mode = mode;
    }

    public LocalDateTime getDate() { return date; }
    public void setDate(LocalDateTime date) { this.date = date; }

    public double getMontant() { return montant; }
    public void setMontant(double montant) { this.montant = montant; }

    public Mode getMode() { return mode; }
    public void setMode(Mode mode) { this.mode = mode; }

    @Override
    public String toString() {
        return "Paiement : " + montant + " - Mode : " + mode + " - Date : " + date;
    }
}
