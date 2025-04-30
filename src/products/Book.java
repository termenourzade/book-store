package products;

public class Book extends Product {
    private String author;
    private String publication;
    private String genre;
    public final static int CATEGORY_ID = 1;
    private static int idCounter = 1;

    public Book(String title, Double price, String author, String publication, String genre) {
        super(title, price);
        setAuthor(author);
        setPublication(publication);
        setGenre(genre);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author == null || author.isEmpty()) {
            throw new IllegalArgumentException("author cannot be null or empty.");
        }
        this.author = author;
    }

    public String getPublication() {
        return publication;
    }

    public void setPublication(String publication) {
        if (publication == null || publication.isEmpty()) {
            throw new IllegalArgumentException("publication cannot be null or empty.");
        }
        this.publication = publication;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        if (genre == null || genre.isEmpty()) {
            throw new IllegalArgumentException("genre cannot be null or empty.");
        }
        this.genre = genre;
    }

    @Override
    public String toString() {
        return super.toString() + " author: " + author + " ,publication: " + publication + " ,genre: " + genre;
    }


    @Override
    protected String generateId() {
        String id = String.format("%03d", idCounter++);
        return CATEGORY_ID + id;
    }
}

