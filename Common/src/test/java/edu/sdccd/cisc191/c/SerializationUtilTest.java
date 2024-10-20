package edu.sdccd.cisc191.c;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.IOException;
import edu.sdccd.cisc191.c.common.Book;
import edu.sdccd.cisc191.c.common.SerializationUtil;

public class SerializationUtilTest {
    @Test
    public void testSerializeAndDeserialize() throws IOException, ClassNotFoundException {
        Book book = new Book("Test Title", "Test Author");
        File file = new File("testBook.ser");
        SerializationUtil.serialize(book, file.getPath());
        Book deserializedBook = (Book) SerializationUtil.deserialize(file.getPath());
        assertEquals(book, deserializedBook);
        file.delete();
    }
}

