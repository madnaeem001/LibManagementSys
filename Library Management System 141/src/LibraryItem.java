public class LibraryItem {

    private String title;
    private String author;
    private int year;
    private boolean isBorrowed;
    private LibraryItemType itemType;

    public LibraryItem(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public LibraryItem() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public LibraryItemType getItemType() {
        return itemType;
    }

    public void setItemType(LibraryItemType itemType) {
        this.itemType = itemType;
    }
    @Override
    public String toString() {
        return "title=" + title + ", author=" + author + ", Year=" + year+ ", isBorrowed=" + isBorrowed + ", itemType=" + itemType;
    }


}
