package refactor;

public class Book {
    private String _title;
    private String _isbn;
    private String _price;
    private String _authorName;
    private String _authorMail;

    public Book(String title, String isbn, String price, String authorName, String authoMail) {
        _title = title;
        _isbn = isbn;
        _price = price;
        _authorName = authorName;
        _authorMail = authoMail;
    }

    public String getTitle() {
        return _title;
    }
    public String getIsbn() {
        return _isbn;
    }
    public String getPrice() {
        return _price;
    }
    public String getAuthorName() {
        return _authorName;
    }
    public String getAuthorMail() {
        return _authorMail;
    }

    public void setAuthorName(String name) {
        this._authorName = name;
    }
    public void setAuthorMail(String mail) {
        this._authorMail = mail;
    }
}
