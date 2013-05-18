package Test;

import File.Text;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestPalabrasRepetidas {
    
    private String path1 = "C:/Users/Jorge/Desktop/texto1.txt";
    private String path2 = "C:/Users/Jorge/Desktop/texto2.txt";
    private ArrayList<String> repeatwords = new ArrayList();
    
    public TestPalabrasRepetidas() {
    }
    
    @Test
    public void ReadFile() throws FileNotFoundException, IOException{
        Text text = new Text();
        text.ReadFile(path1, path2);
        repeatwords = text.getRepeatWords();
        assertEquals(repeatwords.toString(), "[en, lugar, de, nombre, no, acordarme, mucho, tiempo]");
    }
}