public class MyFilterIterator<T> implements Iterator<T> {
    private Iterator<T> it;
    private Predicate<T> pre;
    MyFilterIterator (Iterator<T> it , Predicate<T> pre){
        this.it = it;
        this.pre = pre;
    }
    @Override
    public void first() {
        it.first();
    }

    @Override
    public void next() {
        it.next();
    }
    @Override
    public boolean isDone() {
        while(!it.isDone()){
            if (pre.execute(it.current())){
                return false;
            }
            it.next();
        }
        return true;
    }
    @Override
    public T current() {
        return it.current();
    }
}
