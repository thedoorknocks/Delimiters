import java.util.ArrayList;
public class Delimiters{
    private String openDel;
    private String closeDel;

    public Delimiters(String open, String close){
        openDel = open;
        closeDel = close;
    }

    public ArrayList<String> getDelimitersList(String[] tokens){
        ArrayList<String> delimiters = new ArrayList<String>();
        for(String s : tokens){
            if(s.equals(openDel) || s.equals(closeDel)){
                delimiters.add(s);
            }
        }
        return delimiters;

    }

    public boolean isBalanced(ArrayList<String> delimiters){
        int open = 0;
        int close = 0;
        for(String s : delimiters){
            if(s.equals(openDel)){
                open++;
            }
            if(s.equals(closeDel)){
                close++;
            }
            if(close>open){
                return false;
            }
        }
        return close == open;
    }
}