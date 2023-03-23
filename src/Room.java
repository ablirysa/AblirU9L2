public class Room {
    private String color;
    private double size;

    public Room (String color, double size) {
        this.color = color;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public double getSize() {
        return size;
    }

    public void paint(String newColor) {
        System.out.println("You have painted the room " + newColor + ". ");
        color = newColor;
    }
}
