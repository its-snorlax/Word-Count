import org.junit.Test;

import static org.junit.Assert.*;

public class StringManagerTest {
    @Test
    public void shouldReturnNumberOfCharacters() throws Exception {
        StringManager stringManager = new StringManager("Prayas");
        assertEquals(6, stringManager.getNumberOfCharacters());
    }

    @Test
    public void shouldReturnNumberofWord(){
        StringManager stringManager = new StringManager("hello i am Prayas");
        assertEquals(4,stringManager.getNumberOfWord());
    }

    @Test
    public void shouldReturnNumberOfLines(){
        StringManager stringManager = new StringManager("Hello this is first line." + "\n" + "This is second line");
        assertEquals(2,stringManager.getNumberOfLines());
    }
}