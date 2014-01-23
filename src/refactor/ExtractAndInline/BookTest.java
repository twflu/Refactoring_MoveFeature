package refactor.ExtractAndInline;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by twer on 1/23/14.
 */
public class BookTest{

    @Test
    public void should_get_the_correct_book_info() {
        String title = "Refactor";
        String isbn = "123-10";
        String price = "110";
        String authorName = "Martin";
        String authorMail = "gmail@thoughtworks.com";

        Book book = new Book(title, isbn, price, authorName, authorMail);

        Assert.assertEquals(title, book.getTitle());
        Assert.assertEquals(isbn, book.getIsbn());
        Assert.assertEquals(price, book.getPrice());
        Assert.assertEquals(authorName, book.getAuthorName());
        Assert.assertEquals(authorMail, book.getAuthorMail());
    }
}
