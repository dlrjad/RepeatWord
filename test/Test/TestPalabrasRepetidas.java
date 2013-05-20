package Test;

import File.Text;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestPalabrasRepetidas {
    
    private String path1 = "en un lugar de la Mancha, de cuyo nombre no quiero acordarme, no ha mucho tiempo que vivía un hidalgo";
    private String path2 = "ponte en mi lugar, no tengo mucho tiempo para acordarme de tu nombre";
    private ArrayList<String> repeatwords = new ArrayList();
    
    public TestPalabrasRepetidas() {
    }
    
    @Test
    public void ReadFile() throws FileNotFoundException, IOException{
        Text text = new Text();
        repeatwords = text.getListWords(path1, path2);
        assertEquals(repeatwords.toString(), "[en, lugar, de, nombre, no, acordarme, mucho, tiempo]");
    }
}
