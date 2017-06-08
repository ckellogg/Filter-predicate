/**
 * Created by Cody on 4/6/2017.
 */
public class evenPredicate implements Predicate<Integer>{
    public boolean execute (Integer a){
        if (a%2 == 0)
            return true;
        else
            return false;
    }
}
