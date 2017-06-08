public class MyIterator<T> implements Iterator<T> {
    // Fill in your stuff here
    private MyArray<T> data;
    private int pos;

    MyIterator (MyArray a){
        data = a;
    }

    @Override
    public void first() {
        pos = 0;
    }

    @Override
    public void next() {
        ++pos;
    }

    @Override
    public boolean isDone() {
        if ( pos < data.size())
            return false;
        else return true;
    }

    @Override
    public T current() {
        return data.get(pos);
    }
}
