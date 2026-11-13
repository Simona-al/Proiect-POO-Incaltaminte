public class Gheata extends Incaltaminte{
    private String tipTalpa;
    private String tipGheata;
    private String captuseala;
    private double grosimeTalpa;
    private boolean impermeabila;

    public Gheata(){
        super();
        this.tipTalpa="Sintetica";
        this.tipGheata="Casual";
        this.captuseala="textil";
        this.grosimeTalpa=0;
        this.impermeabila=false;
    }

    public Gheata(String marca, String material, String culoare, double pret, int marime,
                  String tipTalpa, String tipGheata, String captuseala, double grosimeTalpa,
                  boolean impermeabila){
        super(marca,material,culoare,pret,marime);
        this.tipTalpa=tipTalpa;
        this.tipGheata=tipGheata;
        this.captuseala=captuseala;
        this.grosimeTalpa=grosimeTalpa;
        this.impermeabila=impermeabila;
    }

    public Gheata(Gheata g1){
        super(g1);
        if(this!=g1){
            this.tipTalpa=g1.tipTalpa;
            this.tipGheata=g1.tipGheata;
            this.captuseala=g1.captuseala;
            this.grosimeTalpa=g1.grosimeTalpa;
            this.impermeabila=g1.impermeabila;}
    }

    @Override
    public String toString(){
        return super.toString()+("\nTip talpa: "+tipTalpa+"\nTip gheata: "+tipGheata+"\nCaptuseala: "+
                captuseala+"\nGrosime talpa: "+grosimeTalpa+"\nEste impermeabila: "+impermeabila);
    }

    public void setTipTalpa(String t){
        this.tipTalpa=t;
    }

    public void setTipGheata(String g){
        this.tipGheata=g;
    }

    public void setCaptuseala(String c){
        this.captuseala=c;
    }

    public void setGrosimeTalpa(double g){
        this.grosimeTalpa=g;
    }

    public void setImpermeabila(boolean i){
        this.impermeabila=i;
    }

    public String getTipTalpa(){
        return tipTalpa;
    }

    public String getTipGheata(){
        return tipGheata;
    }

    public String getCaptuseala(){
        return captuseala;
    }

    public double getGrosimeTalpa(){
        return grosimeTalpa;
    }

    public boolean getImpermeabila(){
        return impermeabila;
    }




}
