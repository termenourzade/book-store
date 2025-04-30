package products;

public abstract class Product {
    private String title;
    private Double price;
    private String id;

    public Product(String title, Double price) {
        setTitle(title);
        setPrice(price);
        this.id = generateId();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("title cannot be null or empty.");
        }
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("price should be positive.");
        }
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (!(id.length() == 4)) {
            throw new IllegalArgumentException("id should contain four digits.");
        }
        this.id = id;
    }

    @Override
    public String toString() {
        return "title: " + title + " ,price: " + price + " ,ID: " + id;
    }


    protected abstract String generateId();
}
