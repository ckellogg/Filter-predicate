/**
 * Created by Cody on 4/7/2017.
 */
public class ReverseIterator<T> implements Iterator<T> {

    private MyArray<T> data;
    private int pos;

    ReverseIterator (MyArray a){
        data = a;
        first();
    }

    @Override
    public void first() {
        pos = data.size()-1;
    }

    @Override
    public void next() {
        --pos;
    }

    @Override
    public boolean isDone() {
        if ( pos >= 0)
            return false;
        else return true;
    }

    @Override
    public T current() {
        return data.get(pos);
    }
}
