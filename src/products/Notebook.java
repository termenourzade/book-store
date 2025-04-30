package products;

public class Notebook extends Product {
    private int pageCount;
    private boolean isHardCover;
    public final static int CATEGORY_ID = 2;
    private static int idCounter = 1;

    public Notebook(String title, Double price, int pageCount, boolean isHardCover) {
        super(title, price);
        setPageCount(pageCount);
        setHardCover(isHardCover);
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        if (pageCount <= 0) {
            throw new IllegalArgumentException("page count must be positive.");
        }
        this.pageCount = pageCount;
    }

    public boolean isHardCover() {
        return isHardCover;
    }

    public void setHardCover(boolean hardCover) {
        isHardCover = hardCover;
    }

    @Override
    public String toString() {
        return super.toString() + " page count: " + pageCount + " ,is hard cover: " + isHardCover;
    }

    @Override
    protected String generateId() {
        String id = String.format("%03d", idCounter++);
        return CATEGORY_ID + id;
    }
}
