public class Test12 {
    public static void main(String[] args){

        //Testare constructori
        /*Incaltaminte i1=new Incaltaminte();
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

        System.out.println("METODA ABSTRACTA AFISARE");

        p1.afisare();
        p2.afisare();
        p3.afisare();

        g1.afisare();
        g2.afisare();
        g3.afisare();*/

        //Testare vectori
        Object[] pantofi=new Object[10];
        Object[] ghete=new Object[10];

        pantofi[0]=new Pantof();
        pantofi[1]=new Pantof(50,"Anna Cori","Piele naturala","Roz pudra",330,36,"Fara toc","Rotund","Casual",0,2);
        pantofi[2]=new Pantof((Pantof) pantofi[1]);
        pantofi[3]=new Pantof();
        pantofi[4]=new Pantof();
        pantofi[5]=new Pantof();
        pantofi[6]=new Pantof();
        pantofi[7]=new Pantof();
        pantofi[8]=new Pantof();
        pantofi[9]=new Pantof();

        ghete[0]=new Gheata();
        ghete[1]=new Gheata(30,"Dr. Martens","Piele","Maro",700,38,"Cauciuc","Iarna","Cu blana",2.5,true);
        ghete[2]=new Gheata((Gheata) ghete[1]);
        ghete[3]=new Gheata();
        ghete[4]=new Gheata();
        ghete[5]=new Gheata();
        ghete[6]=new Gheata();
        ghete[7]=new Gheata();
        ghete[8]=new Gheata();
        ghete[9]=new Gheata();

        for(int i=0;i<ghete.length;i++){
            ((Pantof) pantofi[i]).afisare();
        }

        for(int j=0;j<ghete.length;j++){
            ((Gheata) ghete[j]).afisare();
        }

        System.out.println("FILTRARE PANTOFI");
        filtrarePantofi( pantofi,2000,"Roz pudra");

    }

    public static void filtrarePantofi(Object[] pantofi, double pretMaxim, String culoare){
        for(int i=0;i<pantofi.length;i++){

            if( ((Pantof)pantofi[i]).getPret()<=pretMaxim && ((Pantof) pantofi[i]).getCuloare().equals(culoare)){

                ((Pantof) pantofi[i]).afisare();
            }
        }
    }

    public static void filtrareGhete(Object[] ghete, int marime, boolean impermeabilitate){
        for(int i=0;i<ghete.length;i++){
            if( ((Gheata) ghete[i]).getMarime()==marime && ((Gheata) ghete[i]).getImpermeabila()==impermeabilitate){

                ((Gheata) ghete[i]).afisare();
            }
        }
    }

}
