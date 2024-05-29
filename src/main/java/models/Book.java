package models;

public class Book {
    private int id;
    private String name;
    private String author;
    private int numberOfCopies;

    public Book(int id, String name, String author, int numberOfCopies) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.numberOfCopies = numberOfCopies;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfCopies() {
        return numberOfCopies;
    }
    public void setNumberOfCopies(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }

    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", numberOfCopies=" + numberOfCopies +
                '}';
    }
}
