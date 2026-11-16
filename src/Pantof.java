public class Pantof extends Incaltaminte{
    private String tipToc;
    private String formaVarf;
    private String destinatie;
    private double inaltimeToc;
    private int numarAccesorii;

    public Pantof(){
        super();
        this.tipToc="Fara toc";
        this.formaVarf="Rotund";
        this.destinatie="Casual";
        this.inaltimeToc=0;
        this.numarAccesorii=0;

    }

    public Pantof(int stoc, String marca, String material, String culoare, double pret, int marime,
                  String tipToc, String formaVarf,String destinatie, double inaltimeToc,
                  int numarAccesorii){
        super(stoc,marca,material,culoare,pret,marime);
        this.tipToc=tipToc;
        this.formaVarf=formaVarf;
        this.destinatie=destinatie;
        this.inaltimeToc=inaltimeToc;
        this.numarAccesorii=numarAccesorii;
    }

    public Pantof(Pantof p1){
        super(p1);
        this.tipToc=p1.tipToc;
        this.formaVarf=p1.formaVarf;
        this.destinatie=p1.destinatie;
        this.inaltimeToc=p1.inaltimeToc;
        this.numarAccesorii=p1.numarAccesorii;
    }

    @Override
    public String toString(){
        return super.toString()+("\nTip toc: "+tipToc+"\nForma varf: "+formaVarf+"\nDestinatie: "+destinatie+
                "\nInaltime toc: "+inaltimeToc+"\nNumar accesorii: "+numarAccesorii);
    }

    public void setTipToc(String t){
        this.tipToc=t;
    }

    public void setFormaVarf(String v){
        this.formaVarf=v;
    }

    public void setDestinatie(String d){
        this.destinatie=d;
    }

    public void setInaltimeToc(double i){
        this.inaltimeToc=i;
    }

    public void setNumarAccesorii(int a){
        this.numarAccesorii=a;
    }

    public String getTipToc(){
        return tipToc;
    }

    public String getFormaVarf(){
        return formaVarf;
    }

    public String getDestinatie(){
        return destinatie;
    }

    public double getInaltimeToc(){
        return inaltimeToc;
    }

    public int getNumarAccesorii(){
        return numarAccesorii;
    }

    @Override
    public void EsteDisponibil(){
        if(getStoc()==0){
            System.out.println("Stoc epuizat");
        } else if(getStoc()<=5){
            System.out.println("Stoc redus");
        } else {
            System.out.println("Produsul este in stoc");
        }
    }

    @Override
    public void afisare(){
        if(getStoc()!=0){
            System.out.println("\nProdus: Pantof");
            System.out.println(this.toString());
            System.out.println("\nDisponibilitate:");
            EsteDisponibil();
        }
    }


}
