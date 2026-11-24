
public class Test13 {
    public static void main(String[] args) {
        testareObiecte();
        //testareVectori();
    }
    public static void testareObiecte() {

        System.out.println("===== PAPUCI =====");

        Papuci p1 = new Papuci();
        Papuci p2 = new Papuci(25, "Crocs", "Cauciuc", "Verde", 150, 40, "De plaja", false, 1.5, true, 180);

        System.out.println("\n--- Constructor fara argumente ---");
        p1.afisare();
        System.out.println("\n--- Constructor cu toate argumentele ---");
        p2.afisare();

        System.out.println("\n--- Constructor de copiere si setteri ---");
        Papuci p3 = new Papuci(p2);
        System.out.println("Copia p3 are marca " + p3.getMarca() + " si greutatea " + p3.getGreutateGrame() + " g");
        p3.setGreutateGrame(300);
        p3.setTipPapuc("Altul");
        System.out.println("Dupa setteri, copia p3: " + p3.getGreutateGrame() + " g, tip " + p3.getTipPapuc());
        System.out.println("Originalul p2 a ramas: " + p2.getGreutateGrame() + " g, tip " + p2.getTipPapuc());

        System.out.println("\n\n===== SANDALE =====");

        Sandale s1 = new Sandale();
        Sandale s2 = new Sandale(12, "Birkenstock", "Piele", "Maro", 450, 39, "Scai", 2, 3.0, false, "Casual");

        System.out.println("\n--- Constructor fara argumente ---");
        s1.afisare();
        System.out.println("\n--- Constructor cu toate argumentele ---");
        s2.afisare();

        System.out.println("\n--- Constructor de copiere si setteri ---");
        Sandale s3 = new Sandale(s2);
        System.out.println("Copia s3 are marca " + s3.getMarca() + " si stilul " + s3.getStil());
        s3.setStil("Elegant");
        s3.setTipInchidere("Nasturi");
        System.out.println("Dupa setteri, copia s3: stil " + s3.getStil() + ", inchidere " + s3.getTipInchidere());
        System.out.println("Originalul s2 a ramas: stil " + s2.getStil() + ", inchidere " + s2.getTipInchidere());
    }

    public static void testareVectori(){
                System.out.println("\n\n===== VECTOR PAPUCI =====");

        Object[] papuci = new Object[10];
        papuci[0] = new Papuci(25, "Crocs", "Cauciuc", "Verde", 150, 40, "De plaja", false, 1.5, true, 180);
        papuci[1] = new Papuci(10, "Rieker", "Lana", "Gri", 120, 38, "De casa", true, 1.0, false, 250);
        papuci[2] = new Papuci((Papuci) papuci[1]);
        papuci[3] = new Papuci(4, "Scholl", "Piele", "Bej", 280, 39, "Medicinali", false, 2.5, true, 220);
        papuci[4] = new Papuci(0, "Havaianas", "Cauciuc", "Albastru", 90, 42, "De plaja", false, 1.0, true, 120);
        papuci[5] = new Papuci(15, "Ugg", "Blana", "Roz", 450, 37, "De casa", true, 2.0, false, 300);
        papuci[6] = new Papuci(8, "Adidas", "Sintetic", "Negru", 200, 43, "De afara", false, 1.8, true, 210);
        papuci[7] = new Papuci(2, "Scholl", "Pluta", "Maro", 320, 41, "Medicinali", false, 3.0, true, 260);
        papuci[8] = new Papuci(20, "Pepco", "Textil", "Alb", 40, 36, "De casa", true, 0.8, false, 150);
        papuci[9] = new Papuci(12, "Nike", "Spuma", "Gri", 180, 44, "De afara", false, 2.2, true, 230);

        for (int i = 0; i < papuci.length; i++) {
            System.out.println("\n*** Papucii cu numarul " + (i + 1));
            ((Papuci) papuci[i]).afisare();
        }

        System.out.println("\n\n===== VECTOR SANDALE =====");

        Object[] sandale = new Object[10];
        sandale[0] = new Sandale(12, "Birkenstock", "Piele", "Maro", 450, 39, "Catarama", 2, 3.0, false, "Casual");
        sandale[1] = new Sandale(8, "Teva", "Textil", "Negru", 300, 42, "Scai", 3, 2.0, true, "Sport");
        sandale[2] = new Sandale((Sandale) sandale[1]);
        sandale[3] = new Sandale(5, "Zara", "Piele ecologica", "Alb", 220, 37, "Catarama", 1, 5.0, false, "Elegant");
        sandale[4] = new Sandale(0, "Geox", "Piele", "Bej", 380, 38, "Scai", 2, 2.5, true, "Casual");
        sandale[5] = new Sandale(18, "Ipanema", "Cauciuc", "Roz", 110, 36, "Fara inchidere", 2, 1.0, true, "Plaja");
        sandale[6] = new Sandale(3, "Guess", "Piele", "Auriu", 520, 38, "Catarama", 4, 7.0, false, "Elegant");
        sandale[7] = new Sandale(9, "Salomon", "Textil", "Gri", 400, 43, "Siret", 3, 2.0, true, "Sport");
        sandale[8] = new Sandale(14, "Deichmann", "Sintetic", "Negru", 150, 40, "Scai", 2, 1.5, false, "Casual");
        sandale[9] = new Sandale(6, "Ecco", "Piele", "Maro", 480, 41, "Catarama", 3, 2.5, true, "Casual");

        for (int i = 0; i < sandale.length; i++) {
            System.out.println("\n*** Sandalele cu numarul " + (i + 1));
            ((Sandale) sandale[i]).afisare();
        }
    }

}