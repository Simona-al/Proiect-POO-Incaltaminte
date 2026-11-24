import java.util.Scanner;
public class Test12 {
    public static void main(String[] args){

        //Testare constructori
        Incaltaminte i1=new Incaltaminte();
        Incaltaminte i2=new Incaltaminte(70,"Nike","Piele","Alb",650,37);
        Incaltaminte i3=new Incaltaminte(i2);

        Pantof p1=new Pantof();
        Pantof p2=new Pantof(20, "Dior", "Panza","Crem",1600,37,"Fara toc","Rotund","Casual",0,2);
        Pantof p3=new Pantof(p2);

        Gheata g1=new Gheata();
        Gheata g2=new Gheata(60,"Dr. Martens","Cauciuc","Maro",500,40,"Cauciuc","Iarna","Blana artificiala",3.5,true);
        Gheata g3=new Gheata(g2);

        System.out.println("AFISARE DATE MEMBRE");

        System.out.println("\nDate membre incaltaminte i1: "+"\n"+i1);
        System.out.println("\nDate membre incaltaminte i2: "+"\n"+i2);
        System.out.println("\nDate membre incaltaminte i3: "+"\n"+i3);

        System.out.println("\nDate membre pantof p1: "+"\n"+p1);
        System.out.println("\nDate membre pantof p2: "+"\n"+p2);
        System.out.println("\nDate membre pantof p3: "+"\n"+p3);

        System.out.println("\nDate membre gheata g1: "+"\n"+g1);
        System.out.println("\nDate membre gheata g2: "+"\n"+g2);
        System.out.println("\nDate membre gheata g3: "+"\n"+g3);

        //Testare metode override
        System.out.println("\nMETODE ABSTRACTE AFISARE");

        p1.afisare();
        p1.esteDisponibil();
        p2.afisare();
        p2.esteDisponibil();
        p3.afisare();
        p3.esteDisponibil();

        g1.afisare();
        g1.esteDisponibil();
        g2.afisare();
        g2.esteDisponibil();
        g3.afisare();
        g3.esteDisponibil();

        //Testare vectori
        Object[] pantofi=new Object[10];
        Object[] ghete=new Object[10];

        pantofi[0] = new Pantof();
        pantofi[1] = new Pantof(50, "Anna Cori", "Piele naturala", "Roz pudra", 330, 36, "Fara toc", "Rotund", "Casual", 0, 2);
        pantofi[2] = new Pantof((Pantof) pantofi[1]);
        pantofi[3] = new Pantof(20, "Deichmann", "Piele ecologica", "Negru", 250, 37, "Toc gros", "Patrat", "Elegant", 5, 1);
        pantofi[4] = new Pantof(15, "Zara", "Piele naturala", "Bej", 450, 38, "Toc subtire", "Ascutit", "Elegant", 8, 3);
        pantofi[5] = new Pantof(30, "CCC", "Textil", "Alb", 180, 39, "Fara toc", "Rotund", "Sport", 0, 0);
        pantofi[6] = new Pantof(12, "Guess", "Piele ecologica", "Rosu", 520, 37, "Toc cui", "Ascutit", "De ocazie", 10, 4);
        pantofi[7] = new Pantof(25, "Nike", "Textil", "Gri", 390, 40, "Fara toc", "Rotund", "Sport", 0, 2);
        pantofi[8] = new Pantof(18, "Puma", "Piele naturala", "Maro", 290, 36, "Toc mic", "Patrat", "Casual", 3, 1);
        pantofi[9] = new Pantof(10, "Reserved", "Piele ecologica", "Albastru", 210, 38, "Toc gros", "Rotund", "Casual", 4, 2);


        ghete[0] = new Gheata();
        ghete[1] = new Gheata(30, "Dr. Martens", "Piele", "Maro", 700, 38, "Cauciuc", "Iarna", "Cu blana", 2.5, true);
        ghete[2] = new Gheata((Gheata) ghete[1]);
        ghete[3] = new Gheata(20, "Timberland", "Piele naturala", "Galben", 850, 39, "Cauciuc", "Drumetie", "Textil", 3.0, true);
        ghete[4] = new Gheata(15, "Deichmann", "Piele ecologica", "Negru", 300, 37, "Sintetica", "Iarna", "Cu blana", 2.0, false);
        ghete[5] = new Gheata(25, "CCC", "Piele", "Gri", 420, 40, "Cauciuc", "Casual", "Textil", 1.5, true);
        ghete[6] = new Gheata(10, "Zara", "Piele ecologica", "Bej", 380, 36, "Sintetica", "Iarna", "Cu blana", 2.2, false);
        ghete[7] = new Gheata(18, "Salomon", "Textil", "Albastru", 650, 41, "Cauciuc", "Drumetie", "Impermeabil", 3.5, true);
        ghete[8] = new Gheata(22, "Nike", "Textil", "Alb", 500, 39, "Cauciuc", "Sport", "Textil", 1.8, true);
        ghete[9] = new Gheata(12, "Reserved", "Piele naturala", "Visiniu", 460, 38, "Sintetica", "Casual", "Cu blana", 2.7, false);

        //Afisare vectori
        for(int i=0;i<pantofi.length;i++){
            ((Pantof) pantofi[i]).afisare();
        }

        for(int j=0;j<ghete.length;j++){
            ((Gheata) ghete[j]).afisare();
        }

        //Citire de la tastatura
        Scanner citire = new Scanner(System.in);
        System.out.println("\nIntrodu pretul maxim pentru pantof:");
        double pretMaxim = citire.nextDouble();
        citire.nextLine(); // consuma Enter-ul ramas
        System.out.println("Introdu marca pantofului:");
        String marca = citire.nextLine();

        filtrarePantofi(pantofi, pretMaxim, marca);

        System.out.println("\nIntrodu tipul ghetei:");
        String tip= citire.nextLine();
        System.out.println("Introdu marimea ghetei:");
        int marime = citire.nextInt();
        System.out.println("Gheata este impermeabila? (true/false)");
        boolean impermeabila = citire.nextBoolean();

        filtrareGhete(ghete, tip, marime, impermeabila);

    }

    //Metode de filtrare
    public static void filtrarePantofi(Object[] pantofi, double pretMaxim, String marca){
        boolean gasit=false;
        for(int i=0;i<pantofi.length;i++){

            if( ((Pantof)pantofi[i]).getPret()<=pretMaxim && ((Pantof) pantofi[i]).getMarca().equals(marca)){

                ((Pantof) pantofi[i]).afisare();
                gasit=true;
            }
        }
        if(gasit==false){System.out.println("Nu s-a gasit niciun pantof cu specificatiile introduse!");}

    }

    public static void filtrareGhete(Object[] ghete, String tip, int marime, boolean impermeabilitate){
       boolean gasit=false;
        for(int i=0;i<ghete.length;i++){
            if( ((Gheata) ghete[i]).getTipGheata().equals(tip) && ((Gheata) ghete[i]).getMarime()==marime && ((Gheata) ghete[i]).getImpermeabila()==impermeabilitate){

                ((Gheata) ghete[i]).afisare();
                gasit=true;
            }
        }
        if(gasit==false){System.out.println("Nu s-a gasit nicio gheata cu specificatiile introduse!");}
    }

}
