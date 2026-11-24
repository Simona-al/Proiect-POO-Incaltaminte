public class Incaltaminte extends Abstracta {
    private int stoc;
    private String marca;
    private String material;
    private String culoare;
    private double pret;
    private int marime;


    public Incaltaminte(){
        this.stoc=0;
        this.marca="Necunoscuta";
        this.material="Necunoscut";
        this.culoare="Negru";
        this.pret=0;
        this.marime=0;
    }

    public Incaltaminte(int stoc, String marca, String material, String culoare, double pret, int marime){
        this.stoc=stoc;
        this.marca=marca;
        this.material=material;
        this.culoare=culoare;
        this.pret=pret;
        this.marime=marime;
    }

    public Incaltaminte(Incaltaminte i1){
        this.stoc=i1.stoc;
        this.marca=i1.marca;
        this.material=i1.material;
        this.culoare=i1.culoare;
        this.pret=i1.pret;
        this.marime=i1.marime;
    }

    public int getStoc(){
        return stoc;
    }
    public void setStoc(int stoc) {

            if (stoc < 0) throw new IllegalArgumentException("Stocul nu poate fi negativ");
            this.stoc = stoc;
        }



    public String getMaterial(){
        return material;
    }
    public void setMaterial(String material) { this.material = material; }


    public String getCuloare(){
        return culoare;
    }
    public void setCuloare(String culoare) { this.culoare = culoare; }

    public double getPret(){
        return pret;
    }
    public void setPret(double pret) {
            if (pret < 0) throw new IllegalArgumentException("Pretul nu poate fi negativ");
            this.pret = pret;
        }
    public int getMarime(){
        return marime;
    }
    public void setMarime(int marime) { this.marime = marime; }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) { this.marca = marca; }

    @Override
    public String toString(){
        return ("\nStoc: "+stoc+"\nMarca: "+marca+"\nMaterialul: "+material+"\nCuloare: "+culoare+"\nPretul: "+pret+"\nMarimea: "+marime);
    }

    @Override
    public void esteDisponibil(){

    }

    @Override
    public void afisare(){

    }
    }


