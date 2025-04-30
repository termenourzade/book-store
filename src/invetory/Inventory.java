package invetory;

import products.Product;

import java.util.ArrayList;

public class Inventory <T extends Product> {
    private ArrayList<T> items = new ArrayList<>();

    public ArrayList<T> getItems() {
        return items;
    }

    public void setItems(ArrayList<T> items) {
        this.items = items;
    }

    public void applyDiscount(String productName, int discount) {
        Product product = null;
        for(T p : this.getItems()) {
            if (p.getTitle() == productName){
                product = p;
                break;
            }
        }
        if (product == null)
            throw new NullPointerException("item dose not exist in this inventory.");
        if (discount != 0) {
            product.setPrice((product.getPrice()) * ((double) (100 - discount) / (double) 100));
        }
    }

    public void addItems (T product) {
        items.add(product);
    }

    public void removeItemById(int id) {
        items.removeIf(item -> item.getId().equals( String.valueOf(id)));
    }

    public T findItemsById(int id) {
        for(T item : items) {
            if(item.getId().equals(String.valueOf(id))) {
                return item;
            }
        }
        System.out.println("no item found with this id.");
        return null;
    }

    public void displayAll() {
        for(T item : items) {
            System.out.println(item);
        }
    }
}
