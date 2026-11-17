public class Papuci extends Incaltaminte {
    private String tipPapuc;
    private boolean arePuf;
    private double grosimeTalpa;
    private boolean deschisLaDegete;
    private int greutateGrame;

    public Papuci() {
        super();
        this.tipPapuc = "De casa";
        this.arePuf = false;
        this.grosimeTalpa = 0.0;
        this.deschisLaDegete = true;
        this.greutateGrame = 100;
    }

    public Papuci(int stoc, String marca, String material, String culoare, double pret, int marime,
                  String tipPapuc, boolean arePuf, double grosimeTalpa, boolean deschisLaDegete, int greutateGrame) {
        super(stoc, marca, material, culoare, pret, marime);
        setTipPapuc(tipPapuc);
        this.arePuf = arePuf;
        this.grosimeTalpa = grosimeTalpa;
        this.deschisLaDegete = deschisLaDegete;
        this.greutateGrame = greutateGrame;
    }

    public void setTipPapuc(String tipPapuc) {
        if (tipPapuc.equals("De casa") || tipPapuc.equals("De afara") ||
                tipPapuc.equals("De plaja") || tipPapuc.equals("Medicinali")) {
            this.tipPapuc = tipPapuc;
        } else {
            System.out.println("Eroare: Tipul '" + tipPapuc + "' nu este valid. S-a setat default pe 'De casa'.");
            this.tipPapuc = "De casa";
        }
    }
}