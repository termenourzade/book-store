import invetory.Inventory;
import products.Accessory;
import products.Book;
import products.Notebook;
import products.Product;

public class Main {
    public static double calculateTotalPrice (Inventory<? extends Product> inventory) {
        double total = 0.0;
        for(Product product : inventory.getItems()) {
            total += product.getPrice();
        }
        return total;
    }
    public static void main(String[] args) {
        Inventory<Book> books = new Inventory<Book>();
        Inventory<Notebook> notebooks = new Inventory<Notebook>();
        Inventory<Accessory> accessories = new Inventory<Accessory>();

        books.addItems(new Book("1984", 180.0, "George Orwell", "cheshme", "novel"));
        books.addItems(new Book("Animal Farm", 120.0, "George Orwell", "cheshme", "novel"));
        notebooks.addItems(new Notebook("notes", 150.0, 100, true));
        notebooks.addItems(new Notebook("notebook", 80.0, 60, false));
        accessories.addItems(new Accessory("pencil", 50.0, "Blue"));
        accessories.addItems(new Accessory("pen", 25.0, "Black"));

        System.out.println("books:\n");
        books.displayAll();
        System.out.println();

        System.out.println("notebooks:\n");
        notebooks.displayAll();
        System.out.println();

        System.out.println("accessories:\n");
        accessories.displayAll();
        System.out.println();

        books.removeItemById(Integer.valueOf((books.getItems().getFirst().getId())));
        accessories.removeItemById(Integer.valueOf((accessories.getItems().getFirst().getId())));

        System.out.println();

        System.out.println("books total price : " + calculateTotalPrice(books));
        System.out.println("books total price : " + calculateTotalPrice(notebooks));
        System.out.println("accessories total price : " + calculateTotalPrice(accessories));

        System.out.println();

        System.out.println(books.findItemsById(1002));
        System.out.println(books.findItemsById(1001));

        System.out.println();


        accessories.applyDiscount(accessories.getItems().getFirst().getTitle() , 50);
        notebooks.applyDiscount(notebooks.getItems().getFirst().getTitle() , 50);

        System.out.println();

        books.displayAll();
        notebooks.displayAll();
        accessories.displayAll();







    }
}