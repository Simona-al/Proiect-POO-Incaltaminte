import java.util.Scanner;
public class Testari14 {

    public static void main(String[] args) {

        System.out.println("===== Incaltaminte =====");

        Incaltaminte i1 = new Incaltaminte();
        System.out.println("\n--- Constructor fara parametrii ---");
        System.out.println(i1);


        Incaltaminte i2 = new Incaltaminte(10, "NIKE", "PIELE", "ALB", 400.0, 42);
        System.out.println("\n--- Constructor cu parametri ---");
        System.out.println(i2);

        Incaltaminte i3 = new Incaltaminte(i2);
        System.out.println("\n--- constructor de copiere ---");
        System.out.println(i3);


        // getteri
        System.out.println("\n--- Getteri (i2) ---");
        System.out.println("Stoc: " + i2.getStoc());
        System.out.println("Marca: " + i2.getMarca());
        System.out.println("Material: " + i2.getMaterial());
        System.out.println("Culoare: " + i2.getCuloare());
        System.out.println("Pret: " + i2.getPret());
        System.out.println("Marime: " + i2.getMarime());


        System.out.println("\n--- Getteri copie (i3) ---");
        System.out.println("Stoc: " + i3.getStoc());
        System.out.println("Marca: " + i3.getMarca());
        System.out.println("Material: " + i3.getMaterial());
        System.out.println("Culoare: " + i3.getCuloare());
        System.out.println("Pret: " + i3.getPret());
        System.out.println("Marime: " + i3.getMarime());

        //setteri
        System.out.println("\n--- setteri (i3) ---");
        i3.setMarca("ADIDAS");
        System.out.println("Marca: " + i3.getMarca());
        i3.setMaterial("TEXTIL");
        System.out.println("Material: " + i3.getMaterial());
        i3.setCuloare("NEGRU");
        System.out.println("Culoare: " + i3.getCuloare());
        i3.setMarime(41);
        System.out.println("Marime: " + i3.getMarime());

        // setStoc si setPret cu exceptie
        try {
            i3.setStoc(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("ATENTIE: " + e.getMessage());
        }

        try {
            i3.setPret(-100.0);
        } catch (IllegalArgumentException e) {
            System.out.println("ATENTIE: " + e.getMessage());
        }

        //toString
        System.out.println("--- toString ---");
        System.out.println(i1.toString()+ i2.toString()+i3.toString());


        // GheteDrumetie
        System.out.println("===== GheteDrumetie =====");

        // constructor implicit
        GheteDrumetie g1 = new GheteDrumetie();
        System.out.println("\n--- Constructor fara argumente ---");
        System.out.println(g1);

        // constructor cu parametri
        GheteDrumetie g2 = new GheteDrumetie(10, "Adidas", "Gore-Tex", "Negru", 650.0, 42,
                "Vibram", "iarna", 4, false, 1.2);
        System.out.println("\n--- Constructor cu parametri ---");
        System.out.println(g2);

        //  constructor copiere
        GheteDrumetie g3 = new GheteDrumetie(g2);
        System.out.println("\n--- constructor de copiere ---");
        System.out.println(g3);

        // setteri
        g1.setFactorAderenta("Contagrip");
        g1.setSezon("toamna");
        g1.setNumarPerechiInMagazin(7);
        g1.setExclusivOnline(false);
        g1.setGreutateTalpa(0.9);

        // getteri
        System.out.println("\n--- Getteri (g1 dupa setteri) ---");
        System.out.println("Factor aderenta: " + g1.getFactorAderenta());
        System.out.println("Sezon: " + g1.getSezon());
        System.out.println("Perechi in magazin: " + g1.getNumarPerechiInMagazin());
        System.out.println("Exclusiv online: " + g1.getExclusivOnline());
        System.out.println("Greutate talpa: " + g1.getGreutateTalpa());

        // getteri  din Incaltaminte
        System.out.println("\n--- Getteri mosteniti (g2) ---");
        System.out.println("Stoc: " + g2.getStoc());
        System.out.println("Marca: " + g2.getMarca());
        System.out.println("Material: " + g2.getMaterial());
        System.out.println("Marime: " + g2.getMarime());
        System.out.println("Culoare: " + g2.getCuloare());

        // esteDisponibil
        System.out.println("\n--- esteDisponibil ---");
        g2.esteDisponibil();
        g2.setNumarPerechiInMagazin(0);
        g2.esteDisponibil();

        GheteDrumetie g4 = new GheteDrumetie(0, "Columbia", "Piele", "Maro", 500.0, 40,
                "Omni-Grip", "vara", 0, true, 1.0);
        g4.esteDisponibil();

        // afisare
        System.out.println("\n--- afisare ---");
        g2.afisare();
        System.out.println();
        g4.afisare();

        //toString
        System.out.println("--- toString ---");
        System.out.println(g1.toString()+ g2.toString()+g3.toString()+g4.toString());


        // ================= PantofCasual =================
        System.out.println("\n\n===== PantofCasual =====");

        // constructor implicit
        PantofCasual p1 = new PantofCasual();
        System.out.println("\n--- Constructor implicit ---");
        System.out.println(p1);

        // constructor cu parametri
        PantofCasual p2 = new PantofCasual(5, "H&M", "Piele", "Maro", 350.0, 43,
                2020, true, 12, "Armani", "Italia");
        System.out.println("\n--- Constructor cu parametri ---");
        System.out.println(p2);

        // copy constructor
        PantofCasual p3 = new PantofCasual(p2);
        System.out.println("\n--- Copy constructor ---");
        System.out.println(p3);

        // setteri
        p1.setAnFabricatie(2018);
        p1.setEditieLimitata(false);
        p1.setDurataFabricatie(24);
        p1.setDesignerColaborator("");
        p1.setTaraDeOrigine("Portugalia");

        // getteri
        System.out.println("\n--- Getteri (p1 dupa setteri) ---");
        System.out.println("An fabricatie: " + p1.getAnFabricatie());
        System.out.println("Editie limitata: " + p1.getEditieLimitata());
        System.out.println("Durata fabricatie: " + p1.getDurataFabricatie() + " ore");
        System.out.println("Designer colaborator: '" + p1.getDesignerColaborator() + "'");
        System.out.println("Tara de origine: " + p1.getTaraDeOrigine());

        // getteri Incaltaminte
        System.out.println("\n--- Getteri mosteniti (p2) ---");
        System.out.println("Stoc: " + p2.getStoc());
        System.out.println("Marca: " + p2.getMarca());
        System.out.println("Material: " + p2.getMaterial());
        System.out.println("Marime: " + p2.getMarime());
        System.out.println("Culoare: " + p2.getCuloare());

        // esteDisponibil
        System.out.println("\n--- esteDisponibil ---");
        p2.esteDisponibil();
        p1.esteDisponibil();

        PantofCasual p4 = new PantofCasual(0, "Salamander", "Piele", "Negru", 400.0, 41,
                2019, false, 8, "", "Romania");
        p4.esteDisponibil();                 // stoc epuizat

        // afisare
        System.out.println("\n--- afisare ---");
        p2.afisare();
        System.out.println();
        p4.afisare();
        //toString
        System.out.println("--- toString ---");
        System.out.println(p1.toString()+ p2.toString()+p3.toString()+p4.toString());

        //Metodele de filtrare a vectorilor de tip GheteDrumetie si PantofCasual-saptamana 3
        //GHETE DRUMETIE

        Object[] ghete_drumetie= new Object[10];
        ghete_drumetie[0] = new GheteDrumetie(10, "NIKE",   "GORE-TEX", "NEGRU",   650.0, 42, "VIBRAM",     "IARNA", 4, false, 1.2);
        ghete_drumetie[1] = new GheteDrumetie(5,  "COLUMBIA",  "PIELE",    "MARO",    500.0, 40, "OMNI-GRIP",  "VARA",  0, true,  1.0);
        ghete_drumetie[2] = new GheteDrumetie(0,  "ADIDAS",   "TEXTIL",   "GRI",     420.0, 41, "VIBRAM",     "VARA",  0, false, 0.9);
        ghete_drumetie[3] = new GheteDrumetie(8,  "QUECHUA",   "SINTETIC", "VERDE",   300.0, 43, "CONTAGRIP",  "TOAMNA", 3, false, 1.1);
        ghete_drumetie[4] = new GheteDrumetie(12, "NIKE",    "PIELE",    "MARO",    900.0, 44, "VIBRAM",     "IARNA", 6, false, 1.5);
        ghete_drumetie[5] = new GheteDrumetie(3,  "SCARPA",    "GORE-TEX", "ALBASTRU", 780.0, 39, "VIBRAM",     "TOAMNA", 0, true,  1.3);
        ghete_drumetie[6] = new GheteDrumetie(0,  "LOWA",      "PIELE",    "NEGRU",   850.0, 45, "VIBRAM",     "IARNA", 0, false, 1.4);
        ghete_drumetie[7] = new GheteDrumetie(15, "ADIDAS",  "TEXTIL",   "ROSU",    250.0, 38, "STANDARD",   "PRIMAVARA", 9, false, 0.8);
        ghete_drumetie[8] = new GheteDrumetie(7,  "THE NORTH FACE", "GORE-TEX", "PORTOCALIU", 720.0, 42, "VIBRAM", "IARNA", 0, true, 1.2);
        ghete_drumetie[9] = new GheteDrumetie(20, "DECATHLON", "SINTETIC", "NEGRU",   200.0, 41, "CONTAGRIP",  "VARA",  11, false, 0.7);

        for(int i=0;i<=9;i++)
        {
            System.out.println("PRODUSUL CU NUMARUL "+(i+1));
            ((GheteDrumetie) ghete_drumetie[i]).afisare();
        }

        //PANTOFI CASUAL
        Object[] pantofi_casual= new Object[10];
        pantofi_casual[0] = new PantofCasual(5,  "H&M",    "PIELE",    "MARO",    350.0, 43, 2018, true,  12, "ARMANI",  "ITALIA");
        pantofi_casual[1] = new PantofCasual(0,  "GEOX",      "PIELE",    "NEGRU",   400.0, 41, 2022, false, 8,  "",        "ROMANIA");
        pantofi_casual[2] = new PantofCasual(12, "ECCO",      "PIELE",    "BEJ",     520.0, 42, 2019, false, 10, "",        "DANEMARCA");
        pantofi_casual[3] = new PantofCasual(3,  "GUCCI",     "PIELE",    "ALB",     1800.0, 40, 2018, true,  30, "GUCCI ATELIER", "ITALIA");
        pantofi_casual[4] = new PantofCasual(20, "PULL&BEAR", "TEXTIL",   "GRI",     150.0, 44, 2024, false, 3,  "",        "TURCIA");
        pantofi_casual[5] = new PantofCasual(0,  "HUGO BOSS", "PIELE",    "NEGRU",   950.0, 43, 2021, true,  18, "HUGO BOSS", "GERMANIA");
        pantofi_casual[6] = new PantofCasual(8,  "TIMBERLAND","NUBUC",    "GALBEN",  600.0, 45, 2018, false, 14, "ARMANI",        "SUA");
        pantofi_casual[7] = new PantofCasual(6,  "VANS",      "PANZA",    "ALBASTRU",300.0, 39, 2025, true,  5,  "SUPREME", "VIETNAM");
        pantofi_casual[8] = new PantofCasual(14, "TOMMY HILFIGER", "PIELE", "MARO",  450.0, 42, 2018, false, 9,  "",        "PORTUGALIA");
        pantofi_casual[9] = new PantofCasual(2,  "DR. MARTENS","PIELE",   "VISINIU", 700.0, 41, 2017, true,  16, "RICK OWENS", "ANGLIA");

        for(int i=0;i<=9;i++)
        {
            System.out.println("PRODUSUL CU NUMARUL "+(i+1));
            ((PantofCasual) pantofi_casual[i]).afisare();
        }
        //TESTAREA METODELOR DE FILTRARE
        //GHETE DRUMETIE
        System.out.println("----FILTAREA PRODUSELOR DE TIP GHETE DE DRUMETIE----");
        Scanner sc = new Scanner(System.in);
        System.out.println("Intoroduceti pretul maxim al produsului dorit - ");
        double pret = sc.nextDouble();
        sc.nextLine();
        System.out.println("Introduceti materialul dorit - ");
        String material = sc.nextLine();

        filtruGheteDrumetie(ghete_drumetie,pret,material);

        //PANTOFI CASUAL
        System.out.println("----FILTAREA PRODUSELOR DE TIP PANTOF CASUAL ----");
        System.out.println("Introduceti anul de fabricatie dorit- " );
        int an = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduceti DESIGNER - ");
        String designer = sc.nextLine();

      filtruPantofiCasual(pantofi_casual,an,designer);





    }
//METODA FILTRARE VECTOR PANTOFI-CASUAL
    public static void filtruPantofiCasual(Object[] o,int an,String colaborator)
    {
        int contor=0;
        for(int i = 0;i<o.length;i++)
        {

            if ((an == ((PantofCasual)o[i]).getAnFabricatie()) && (colaborator.equalsIgnoreCase(((PantofCasual)o[i]).getDesignerColaborator())))
            {
                ((PantofCasual)o[i]).afisare();
                contor++;
        }
        }
        if(contor != 0){
        System.out.println("Au fost gasite "+contor+" perechi de pantofi casual care se potrivesc cerinelor alese");
        }else
            System.out.println("NU exita pantofi casual care sa indeplineasca cerintele precizate!!!");
    }

    //METODA FILTRARE VECTOR GHETE DRUMETIE
    public static void filtruGheteDrumetie(Object[] o,double p,String material)
    { int contor =0;
        for(int i = 0;i<o.length; i++)
        {
            if ((p >= ((GheteDrumetie) o[i]).getPret() )&& (material.equalsIgnoreCase(((GheteDrumetie)o[i]).getMaterial())))
            {
                ((GheteDrumetie)o[i]).afisare();
                contor++;

            }
        }
        if(contor!=0){
            System.out.println("Au fost gasite "+contor+" perechi de ghete de drumetie care indeplinesc criteriile alese.");
        }else
        {
            System.out.println("NU exista ghete de drumetie cu specificatiile alese");
        }
    }


}