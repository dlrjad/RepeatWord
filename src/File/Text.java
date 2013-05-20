package File;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Text {
    private String delims = "[ .,?!]+";
    private ArrayList<String> repeatwords = new ArrayList();
    
    public Text(){}
    
    public ArrayList<String> getListWords(String text1, String text2) throws FileNotFoundException, IOException{
        String[] tokens1 = getWord(text1);
        String[] tokens2 = getWord(text2);
        compareWord(tokens1, tokens2);
        return repeatwords;
    }
    
    private String[] getWord(String text) throws FileNotFoundException, IOException{
        String[] tokens = text.split(delims);
        return tokens;
    }
    
    private void compareWord(String[] tokens1, String[] tokens2){
        for (int i=0; i<tokens1.length; i++){
            for (int j=0; j<tokens2.length; j++){
                wordFound(tokens1, i, tokens2, j);
            }
        }
    }

    private void wordFound(String[] tokens1, int i, String[] tokens2, int j) {
        if(tokens1[i].equals(tokens2[j])){
            wordRepeat(tokens1, i);
        }
    }

    private void wordRepeat(String[] tokens1, int i) {
        boolean flag = true;
        for(int k =0; k<repeatwords.size(); k++){
            if(repeatwords.get(k).equals(tokens1[i])){
                flag = false;
            }
        }
        if(flag) repeatwords.add(tokens1[i]);
        else flag = false;
    }
}
