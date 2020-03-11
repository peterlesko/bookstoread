package bookstoread;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import java.util.List;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("BookShelf")
class BookShelfSpec {

//    private BookShelfSpec(TestInfo testInfo) {
//        System.out.println("Working on test " + testInfo.getDisplayName());
//    }

    @Test
    @DisplayName("is empty when no book is added to it")
    void shelfEmptyWhenNoBookAdded() throws Exception {
                                                                // Arrange
        BookShelf shelf = new BookShelf();
                                                                //Actj
        List<String> books = shelf.books();
                                                                //Assert

        assertTrue(books.isEmpty(), () -> "Bookshelf should be empty");

    }

}
