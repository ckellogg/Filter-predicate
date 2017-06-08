/**
 * Created by Cody on 4/6/2017.
 */
public class greaterThanFive implements Predicate<Integer>{
    public boolean execute (Integer a){
        if (a > 5)
            return true;
        else
            return false;
    }
}

