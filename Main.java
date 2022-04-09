package JavaLabs.JavaLab1;



public class Main {
    public static void main(String[] args) {
        TouristTicket a = new TouristTicket();
        TouristTicket b = new TouristTicket("One star", "Winter", 4);
        TouristTicket c = new TouristTicket("Three stars", "Summer", 10, 3, 500, "Mexico");

        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());

        System.out.println();

        System.out.println(a.returnCompany());
    }
}
