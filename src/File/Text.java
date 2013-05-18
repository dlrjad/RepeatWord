package File;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Text {
    private File file = null;
    private FileReader fr = null;
    private BufferedReader br = null;
    private String delims = "[ .,?!]+";
    private ArrayList<String> repeatwords = new ArrayList();
    
    public Text(){}
    
    public void ReadFile(String path1, String path2) throws FileNotFoundException, IOException{
        file = new File(path1);
        fr = new FileReader(file);
        br = new BufferedReader(fr); 
        String line = br.readLine();
        String[] tokens1 = line.split(delims);
        
        file = new File(path2);
        fr = new FileReader(file);
        br = new BufferedReader(fr);
        line = br.readLine();
        String[] tokens2 = line.split(delims);
        
        compareWord(tokens1, tokens2);
        
        closeFile();
    }

    private void closeFile() throws IOException {
        if( null != fr ){
            fr.close();    
        } 
    }
    
    private void compareWord(String[] tokens1, String[] tokens2){
        
        for (int i=0; i<tokens1.length; i++){
            for (int j=0; j<tokens2.length; j++){
                if(tokens1[i].equals(tokens2[j])){
                    boolean flag = true;
                    for(int k =0; k<repeatwords.size(); k++){
                        if(repeatwords.get(k).equals(tokens1[i])){
                            flag = false;
                        }
                    }
                    if(flag){
                        repeatwords.add(tokens1[i]);
                    }
                    flag = false;
                    
                }
            }
        }
        
    
    }
    
    public ArrayList<String> getRepeatWords(){
        return repeatwords;
    }
}
