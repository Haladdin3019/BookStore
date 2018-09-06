package pl.sda.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;




class BookCollectionTest {

    private final static Book BOOK = new Book("Test Author", "Test title", 10);


    @Test
    public void afterAddOneBookMyCollectionSizeShouldBeSeven(){
        //given
        BookStore bookStore = new BookStore();
        //when
        bookStore.addBook(BOOK);
        //then
        assertEquals(7, bookStore.collectionSize());
    }

    @Test
    public void checkIfCollectionSizeWillDecreaseAfterParticularBookWillBeRemoved (){

        //given
        BookStore bookStore = new BookStore();

        //when
        bookStore.deleteBook("Pani Jeziorna");

        //then
        assertEquals(5,bookStore.collectionSize());

    }

    @Test
    public void checkIfCollectionSizeWillDecreaseByTwoAfterBooksWillBeRemovedByAuthor() {

        //given
        BookStore bookStore = new BookStore();

        //when
        bookStore.deleteBooksByAuthor("Brent Weeks");

        //then
        assertEquals(4,bookStore.collectionSize());
    }
}