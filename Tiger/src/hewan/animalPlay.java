package hewan;

public class animalPlay {
    public static void main(String[] args) {
        PantheraLeo lion1;
        lion1 = new PantheraLeo();
        System.out.println(lion1.eat());
       // lion1.id = "L1";
        lion1.setId("L1");
        System.out.println(lion1.getId());
    }
    
}

