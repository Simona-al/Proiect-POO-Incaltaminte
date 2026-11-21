
public class PantofCasual extends Incaltaminte {

    private int anFabricatie;
    private boolean editieLimitata;
    private int durataFabricatie; // in ore
    private String designerColaborator; // daca nu are, se pune ""
    private String taraDeOrigine;


    public PantofCasual() {
        super();
        this.anFabricatie = 0;
        this.editieLimitata = false;
        this.durataFabricatie = 0;
        this.designerColaborator = "";
        this.taraDeOrigine = " ";
    }


    public PantofCasual(int stoc, String marca, String material, String culoare, double pret, int marime,
                        int anFabricatie, boolean editieLimitata, int durataFabricatie,
                        String designerColaborator, String taraDeOrigine) {
        super(stoc, marca, material, culoare, pret, marime);
        this.anFabricatie = anFabricatie;
        this.editieLimitata = editieLimitata;
        this.durataFabricatie = durataFabricatie;
        this.designerColaborator = designerColaborator;
        this.taraDeOrigine = taraDeOrigine;
    }


    public PantofCasual(PantofCasual p) {
        super(p);
        this.anFabricatie = p.anFabricatie;
        this.editieLimitata = p.editieLimitata;
        this.durataFabricatie = p.durataFabricatie;
        this.designerColaborator = p.designerColaborator;
        this.taraDeOrigine = p.taraDeOrigine;
    }


    public void setAnFabricatie(int a) { this.anFabricatie = a; }
    public int getAnFabricatie() { return anFabricatie; }

    public void setEditieLimitata(boolean e) { this.editieLimitata = e; }
    public boolean getEditieLimitata() { return editieLimitata; }

    public void setDurataFabricatie(int d) { this.durataFabricatie = d; }
    public int getDurataFabricatie() { return durataFabricatie; }

    public void setDesignerColaborator(String d) { this.designerColaborator = d; }
    public String getDesignerColaborator() { return designerColaborator; }

    public void setTaraDeOrigine(String t) { this.taraDeOrigine = t; }
    public String getTaraDeOrigine() { return taraDeOrigine; }

    @Override
    public String toString() {
        return super.toString() + "\nAn fabricatie - " + anFabricatie + "\nEditie limitata - " + editieLimitata
                + "\nDurata fabricatie (ore) - " + durataFabricatie + "\nDesigner colaborator - " +
                (designerColaborator.isEmpty() ? "nu are" : designerColaborator) + "\nTara de origine - " + taraDeOrigine;
    }

    @Override
    public void esteDisponibil() {
        if (getStoc() != 0) {
            System.out.println("\nprodusul este disponibil ");
            if (editieLimitata) {
                System.out.println("ATENTIE: editie limitata, stoc restrans ");
            }
        } else {
            System.out.println("\nPRODUS CU STOC EPUIZAT ");
        }
    }

    @Override
    public void afisare(){

        System.out.println("Pantofi casual marimea "+getMarime()+" facuti in "+taraDeOrigine+
                (designerColaborator.isEmpty() ? " " : " in colaboare cu "+designerColaborator)+
                " pe o durata de "+durataFabricatie+( editieLimitata==true ? " in cadrul unei editii limitate. "
                :" ")+(getStoc()==0?"\nMomentan produsul nu este in stoc" : "\nDisponibil"));
    }
}
     
    

