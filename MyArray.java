public class MyArray<T> implements IterableSequence<T> {
    private T[] array;
    private int size = 0 ;

    MyArray(int cap){
        array = (T[]) new Object[cap];
    }

    @Override
    public void add(T value) {
        if (size() < capacity())
        array[size++]= value;
        else
            System.out.printf("You ran out of room!");
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int capacity() {
        return array.length;
    }

    @Override
    public T get(int index) {
        return array[index];
    }

    @Override
    public Iterator<T> getIterator() {

        return new MyIterator<T>(this);
    }
}
