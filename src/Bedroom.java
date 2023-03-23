import java.util.*;

public class Bedroom extends Room {
    private ArrayList<String> furniture;

    public Bedroom(String color, ArrayList<String> furniture, double size) {
        super(color, size);
        this.furniture = furniture;
    }

    public void printFurniture() {
        System.out.println("List of Furniture: ");
        for (String item : furniture) {
            System.out.println("- " + item);
        }
    }

    public void addFurniture(String item) {
        furniture.add(item);
        System.out.println("You have successfully added " + item + " to the bedroom.");
    }
}
