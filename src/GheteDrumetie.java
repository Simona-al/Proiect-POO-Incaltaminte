
public class GheteDrumetie extends Incaltaminte {

	private String factorAderenta;
	private String sezon;
	private int numarPerechiInMagazin;
	private boolean exclusivOnline;
	private double greutateTalpa;

	public GheteDrumetie(){
		super();
		this.factorAderenta=" ";
		this.sezon=" ";
		this.numarPerechiInMagazin=0;
		this.exclusivOnline=false;
		this.greutateTalpa=0;
	}

	public GheteDrumetie(int stoc, String marca, String material, String culoare, double pret, int marime,
				  String factorAderenta, String sezon,int numarPerechiInMagazin, boolean exclusivOnline,
				  double greutateTalpa){
		super(stoc,marca,material,culoare,pret,marime);
		this.factorAderenta=factorAderenta;
		this.sezon=sezon;
		this.numarPerechiInMagazin=numarPerechiInMagazin;
		this.exclusivOnline=exclusivOnline;
		this.greutateTalpa=greutateTalpa;
	}

	public GheteDrumetie(GheteDrumetie g){
		super(g);
		this.factorAderenta=g.factorAderenta;
		this.sezon=g.sezon;
		if(g.getStoc()==0)
		{
			this.numarPerechiInMagazin=0;
		}
		else
		{
			this.numarPerechiInMagazin=g.numarPerechiInMagazin;
		}
		this.exclusivOnline=g.exclusivOnline;
		this.greutateTalpa=g.greutateTalpa;

	}

	void setFactorAderenta(String s){ this.factorAderenta=s;}
	String getFactorAderenta(){return factorAderenta;}

	void setSezon(String s){this.sezon=s;}
	String getSezon(){return sezon;}

	void setNumarPerechiInMagazin(int n){this.numarPerechiInMagazin=n;}
	int getNumarPerechiInMagazin(){return numarPerechiInMagazin;}

	void setExclusivOnline(boolean t){this.exclusivOnline=t;}
	boolean getExclusivOnline(){return exclusivOnline;}

	void setGreutateTalpa(double n){this.greutateTalpa=n;}
	double getGreutateTalpa(){return greutateTalpa;}

	@Override
	public String toString(){return super.toString()+("\nFactor de aderenta - "+ factorAderenta+"\nSezon recomandat - "
			+sezon+"\n Numar de perechi disponibile in magazin - "+numarPerechiInMagazin+"\nExclusiv Online - "+exclusivOnline+
			"\nGreutate talpa - "+greutateTalpa);}


	@Override
	public void esteDisponibil() {
		if (getStoc() != 0) {
			System.out.println("\nprodusul este disponibil ");
			if(getNumarPerechiInMagazin()!=0){
				System.out.println("in magazin");}
				else
				{
					System.out.println(" doar online ");
				}
		} else {
			System.out.println("\nPRODUS CU STOC EPUIZAT ");
		}
		}
	@Override
	public void afisare(){
		if(getStoc()!=0){
		System.out.println(" Ghete de drumetie "+getMarca()+" adecvate sezonului de " +sezon+
				"Specificatii:\nfactor aderenta-"+factorAderenta+"\ngreutate talpa-"+greutateTalpa+"\nmaterial-"+getMaterial()+
				(exclusivOnline==true? "\nProdus disponibil doar pe website":" \nProdus disponibil in magazine si online"));
	}else {
			System.out.println(" Ghete de drumetie "+getMarca()+" adecvate sezonului de " +sezon+
				"Specificatii:\nfactor aderenta-"+factorAderenta+"\ngreutate talpa-"+greutateTalpa+"\nmaterial-"+getMaterial()+
					"\nProdus indisponibil-Stoc epuizat");

		}

	}


}






