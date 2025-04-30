package products;

public class Accessory extends Product {
    private String color;
    public final static int CATEGORY_ID = 3;
    private static int idCounter = 1;

    public Accessory(String title, Double price, String color) {
        super(title, price);
        setColor(color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color == null || color.isEmpty()) {
            throw new IllegalArgumentException("color cannot be null or empty.");
        }
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + " color: " + color;
    }


    @Override
    protected String generateId() {
        String id = String.format("%03d", idCounter++);
        return CATEGORY_ID + id;
    }
}
