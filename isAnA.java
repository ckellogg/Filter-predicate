/**
 * Created by Cody on 4/6/2017.
 */
public class isAnA implements Predicate<String>{
    public boolean execute (String a){
        if (a.contains("a"))
            return true;
        else
            return false;
    }

}
