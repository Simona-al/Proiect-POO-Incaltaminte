public class Incaltaminte extends abstracta {
    protected int stoc;
    protected String material;
    protected String culoare;
    protected double pret;
    protected int marime;


    public Incaltaminte(){
        this.stoc=0;
        this.material="Necunoscut";
        this.culoare="Negru";
        this.pret=0;
        this.marime=0;
    }

    public Incaltaminte(int stoc, String material, String culoare, double pret, int marime){
        this.stoc=stoc;
        this.material=material;
        this.culoare=culoare;
        this.pret=pret;
        this.marime=marime;
    }

    public Incaltaminte(Incaltaminte i1){
        this.stoc=i1.stoc;
        this.material=i1.material;
        this.culoare=i1.culoare;
        this.pret=i1.pret;
        this.marime=i1.marime;
    }

    public int getStoc(){
        return stoc;
    }

    public String getMaterial(){
        return material;
    }

    public String getCuloare(){
        return culoare;
    }

    public double getPret(){
        return pret;
    }

    public int getMarime(){
        return marime;
    }
    @Override
    public String toString(){
        return ("Stoc: "+stoc+"\nMaterialul: "+material+"\nCuloare: "+culoare+"\nPretul: "+pret+"\nMarimea: "+marime);
    }

    @Override
    public void EsteDisponibil(){

    }

    @Override
    public void afisare(){

    }
    }


