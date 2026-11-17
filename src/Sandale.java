public class Sandale extends Incaltaminte {

    private String tipInchidere;
    private int numarBarete;
    private double inaltimePlatforma;
    private boolean rezistentaLaApa;
    private String stil;

    public Sandale() {
        super();
        this.tipInchidere = "Catarama";
        this.numarBarete = 2;
        this.inaltimePlatforma = 1.5;
        this.rezistentaLaApa = false;
        this.stil = "Casual";
    }

    public Sandale(int stoc, String marca, String material, String culoare, double pret, int marime,
                   String tipInchidere, int numarBarete, double inaltimePlatforma, boolean rezistentaLaApa, String stil) {
        super(stoc, marca, material, culoare, pret, marime);
        setTipInchidere(tipInchidere);
        this.numarBarete = numarBarete;
        this.inaltimePlatforma = inaltimePlatforma;
        this.rezistentaLaApa = rezistentaLaApa;
        this.stil = stil;
    }

    public void setTipInchidere(String tipInchidere) {
        if (tipInchidere.equals("Catarama") || tipInchidere.equals("Scai") ||
                tipInchidere.equals("Siret") || tipInchidere.equals("Fara inchidere")) {
            this.tipInchidere = tipInchidere;
        } else {
            System.out.println("Eroare: Tipul de inchidere '" + tipInchidere + "' nu este valid. S-a setat default pe 'Catarama'.");
            this.tipInchidere = "Catarama";
        }
    }
}