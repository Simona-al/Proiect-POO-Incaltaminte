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

    public Papuci(Papuci p) {
        super(p);
        this.tipPapuc = p.tipPapuc;
        this.arePuf = p.arePuf;
        this.grosimeTalpa = p.grosimeTalpa;
        this.deschisLaDegete = p.deschisLaDegete;
        this.greutateGrame = p.greutateGrame;
    }

    public void setTipPapuc(String tipPapuc) {
        if ("De casa".equals(tipPapuc) || "De afara".equals(tipPapuc) ||
                "De plaja".equals(tipPapuc) || "Medicinali".equals(tipPapuc)) {
            this.tipPapuc = tipPapuc;
        } else {
            System.out.println("Eroare: Tipul '" + tipPapuc + "' nu este valid. S-a setat default pe 'De casa'.");
            this.tipPapuc = "De casa";
        }
    }
    public String getTipPapuc(){return tipPapuc;}

    public boolean getArePuf() {return arePuf;}
    public void setArePuf(boolean arePuf){this.arePuf = arePuf;}

    public double getGrosimeTalpa(){return grosimeTalpa;}
    public void setGrosimeTalpa(double grosimeTalpa){this.grosimeTalpa = grosimeTalpa;}

    public boolean getDeschisLaDegete() {return deschisLaDegete;}
    public void setDeschisLaDegete(boolean deschisLaDegete){this.deschisLaDegete = deschisLaDegete;}

    public int getGreutateGrame(){return greutateGrame;}
    public void setGreutateGrame(int greutateGrame){this.greutateGrame = greutateGrame;}

    @Override
    public String toString() {
        return super.toString() + "\nTip papuc: " + tipPapuc + "\nAre puf: " + (arePuf ? "Da" : "Nu")
                + "\nGrosime talpa: " + grosimeTalpa + " cm" + "\nDeschis la degete: " + (deschisLaDegete ? "Da" : "Nu")
                + "\nGreutate: " + greutateGrame + " g";
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
        System.out.println("Produs: Papuci");
        System.out.println(this.toString());
        System.out.print("Disponibilitate: ");
        esteDisponibil();
    }

}
