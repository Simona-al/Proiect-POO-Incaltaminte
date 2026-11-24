public class Sandale extends Incaltaminte {

    private String tipInchidere;
    private int numarBarete;
    private double inaltimePlatforma;
    private boolean rezistentApa;
    private String stil;

    public Sandale() {
        super();
        this.tipInchidere = "Catarama";
        this.numarBarete = 2;
        this.inaltimePlatforma = 1.5;
        this.rezistentApa = false;
        this.stil = "Casual";
    }

    public Sandale(int stoc, String marca, String material, String culoare, double pret, int marime,
                   String tipInchidere, int numarBarete, double inaltimePlatforma, boolean rezistentApa, String stil) {
        super(stoc, marca, material, culoare, pret, marime);
        setTipInchidere(tipInchidere);
        this.numarBarete = numarBarete;
        this.inaltimePlatforma = inaltimePlatforma;
        this.rezistentApa = rezistentApa;
        this.stil = stil;
    }

    public Sandale(Sandale s) {
        super(s);
        this.tipInchidere = s.tipInchidere;
        this.numarBarete = s.numarBarete;
        this.inaltimePlatforma = s.inaltimePlatforma;
        this.rezistentApa = s.rezistentApa;
        this.stil = s.stil;
    }

    public void setTipInchidere(String tipInchidere) {
        if ("Catarama".equals(tipInchidere) || "Scai".equals(tipInchidere) ||
                "Siret".equals(tipInchidere) || "Fara inchidere".equals(tipInchidere)) {
            this.tipInchidere = tipInchidere;
        } else {
            System.out.println("Eroare: Tipul de inchidere '" + tipInchidere + "' nu este valid. S-a setat default pe 'Catarama'.");
            this.tipInchidere = "Catarama";
        }
    }

    public String getTipInchidere(){return tipInchidere;}

    public int getNumarBarete(){return numarBarete;}
    public void setNumarBarete(int numarBarete){this.numarBarete = numarBarete;}

    public double getInaltimePlatforma(){return inaltimePlatforma;}
    public void setInaltimePlatforma(double inaltimePlatforma){this.inaltimePlatforma = inaltimePlatforma;}

    public boolean getRezistentApa(){return rezistentApa;}
    public void setRezistentApa(boolean rezistentApa){this.rezistentApa = rezistentApa;}

    public String getStil(){return stil;}
    public void setStil(String stil){this.stil = stil;}

    @Override
    public String toString() {
        return super.toString() + "\nTip inchidere: " + tipInchidere + "\nNumar barete: " + numarBarete
                + "\nInaltime platforma: " + inaltimePlatforma + " cm" + "\nRezistenta la apa: " + (rezistentApa ? "Da" : "Nu")
                + "\nStil: " + stil;
    }

    @Override
    public void esteDisponibil() {
        if (getStoc() == 0) {
            System.out.println("Stoc epuizat");
        } else if (getStoc() <= 5) {
            System.out.println("Stoc limitat: au mai ramas doar " + getStoc() + " perechi");
        } else {
            System.out.println("Produsul este in stoc");
        }
    }

    @Override
    public void afisare() {
        System.out.println("Produs: Sandale");
        System.out.println(this.toString());
        System.out.print("Disponibilitate: ");
        esteDisponibil();
    }

}