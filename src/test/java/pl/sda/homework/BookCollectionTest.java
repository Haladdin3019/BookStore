package pl.sda.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;




class BookCollectionTest {

    private final static Book BOOK = new Book("Test Author", "Test title", 10);
    BookStore bookStore = new BookStore();

    @Test
    public void afterAddOneBookMyCollectionSizeShouldBeSeven(){
        //given
        BookStore bookStocomre = new BookStore();
        //when
        bookStore.addBook(BOOK);
        //then
        assertEquals(7, bookStore.collectionSize());
    }

    @Test
    public void checkIfCollectionSizeWillDecreaseAfterParticularBookWillBeRemoved (){

        //given


    }
}