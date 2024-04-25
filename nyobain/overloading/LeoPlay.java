package nyobain.overloading;

public class LeoPlay {
    public static void main(String[] args) {
        Pantheraleo lion1, lion2;
        Pantheraleo.staticFieldA = 125; //manggil beserta kelasnya
        lion1 = new Pantheraleo();
        lion1.staticFieldA = 100;
        lion2 = new Pantheraleo("L1", "Supri", "White");
        System.out.println("Description of this lion:\n"
                + "ID: " + lion1.getId() + "\n"
                + "Name: " + lion1.getName() + "\n"
                + "Colour: " + lion1.getColor() + "\n"
                + "Gender: " + lion1.getGender() + "\n"
                + "staticFieldA: " + lion1.staticFieldA + "\n" 
                + "Reference value: " + lion1 + "\n");
        lion2.setName("Leon Black");
        lion2.setColor("Black");
        System.out.println("Description of this lion:\n"
                + "ID: " + lion2.getId() + "\n"
                + "Name: " + lion2.getName() + "\n"
                + "Colour: " + lion2.getColor() + "\n"
                + "staticFieldA: " + lion2.staticFieldA + "\n" //sharing resources dengan lion1, jadi outputnya sama 100
                + "Gender: " + lion2.getGender() + "\n"
                + "Reference value: " + lion2 + "\n");
        lion2.staticFieldA = 13;
        System.out.println(lion1.staticFieldA);
        System.out.println(lion2.staticFieldA);
    }
}