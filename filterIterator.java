/**
 * Created by Cody on 3/18/2017.
 */

public class filterIterator {
    public static void main(String[] args) {

        try {
            System.out.println("Int array");
            MyArray<Integer> a = new MyArray<>(20);
            a.add(1);
            a.add(2);
            a.add(3);
            a.add(4);
            a.add(5);
            a.add(6);
            Iterator<Integer> i = a.getIterator();
            while(!i.isDone()){
                System.out.println(i.current());
                i.next();
            }
            System.out.println("\nEven Predicate");
            i.first();
            Iterator<Integer> b = new MyFilterIterator<>(i,new evenPredicate());
            while(!b.isDone()){
                System.out.println(b.current());
                b.next();
            }
            System.out.println("\nReverse Iterator");
            Iterator<Integer> ri = new ReverseIterator<>(a);
            while(!ri.isDone()){
                System.out.println(ri.current());
                ri.next();
            }
            System.out.println("\nReverse Iterator with filter");
            ri.first();
            Iterator<Integer> rif = new MyFilterIterator<>(ri,new evenPredicate());
            while(!rif.isDone()){
                System.out.println(rif.current());
                rif.next();
            }

            System.out.println("\ngreaterThanFive");
            b.first();
            Iterator<Integer> q = new MyFilterIterator<>(b,new greaterThanFive());
            while(!q.isDone()){
                System.out.println(q.current());
                q.next();
            }
            System.out.println("\nFilter all out");
            b.first();
            Iterator<Integer> g = new MyFilterIterator<>(b,new filterAll<>());
            while(!g.isDone()){
                System.out.println(g.current());
                g.next();
            }
            System.out.println("\nString array");

            MyArray<String> s = new MyArray<>(10);
            s.add("a");
            s.add("banana");
            s.add("c");
            s.add("apple");
            Iterator<String> t = s.getIterator();
            while(!t.isDone()){
                System.out.println(t.current());
                t.next();
            }
            t.first();
            System.out.println("\nContains an 'a'");
            Iterator<String> c = new MyFilterIterator<>(t,new isAnA());
            while(!c.isDone()){
                System.out.println(c.current());
                c.next();
            }

            System.out.println("\nFilter all out");
            t.first();
            Iterator<String> r = new MyFilterIterator<>(t,new filterAll<>());
            while(!r.isDone()){
                System.out.println(r.current());
                r.next();
            }
            System.out.println("\nAll done!");
        }

        catch(Exception e){
            System.err.format("You encountered an error: ");
            e.printStackTrace();
        }
    }
}

