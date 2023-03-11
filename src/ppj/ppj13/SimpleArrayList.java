package ppj.ppj13;

public class SimpleArrayList {
    private int size;
    private int cap;
    private int[] arr;

    private static int INITIAL_CAPACITY = 5;

    public SimpleArrayList() {
        arr = new int[cap];
    }

    public SimpleArrayList(int a){
        size += 1;
        arr = new int[] {a};
        cap = arr.length;
    }

    public SimpleArrayList(int[] a ){
        size = a.length;
        arr = a;
        cap = size;
    }

    public SimpleArrayList ( SimpleArrayList a){
        size = a.arr.length;
        arr = a.arr;
        cap = size;
    }

    public int size() {
        return size;
    }

    public void clear(SimpleArrayList a){
        a = new SimpleArrayList();
    }

    public void trim(){
        int[] a = new int[size];
        int indx = 0;
        for (int i = 0; i < arr.length; i ++){
            if (arr[i] != 0){
                a[indx++] = arr[i];
            }
        }
        arr = a;
        cap = arr.length;
        cap = size;
    }

    public SimpleArrayList insert(int ind, int[] other){
        int sz = other.length;
        if (ind > size || ind < 0)
            throw new IndexOutOfBoundsException();
        else{
            if (cap - size > sz){
                for (int i = ind; i < sz + ind; i++){
                    arr[i + sz] = arr[i];
                    arr[i] = other[i - ind];
                }
            }else{
                int[] haha = new int[2*(size + sz)];
                for(int i = 0; i < arr.length; i++){
                    if (i < ind){
                        haha[i] = arr[i];
                    } else if (i == ind) {
                        int num = 0;
                        for(int j = ind; j < ind + other.length; j++){
                            haha[i + j] = other[num++];
                        }
                        haha[i + ind] = arr[i];
                    } else{
                        haha[i + ind] = arr[i];
                    }
                }

            }
        cap = arr.length;
        size += other.length;
        }
        return this;
    }

    public SimpleArrayList insert(int ind, int e){
        int[] a = new int[1];
        a[0] = e;
        return insert(ind, a);
    }

    public SimpleArrayList append(int e){
        return insert(size - 1, e);
    }
    public SimpleArrayList append (int[] a){
        return insert(size - 1, a);
    }

    public SimpleArrayList append (SimpleArrayList a){
        a.trim();
        return append(a.arr);
    }

    public int get(int ind){
        if (ind > size || ind < 0)
            throw new IndexOutOfBoundsException();
        return arr[ind];
    }

    public SimpleArrayList set(int ind, int val){
        if (ind > size || ind < 0)
            throw new IndexOutOfBoundsException();
        arr[ind] = val;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("[ ");
        for (int i = 0; i < size; i++){
            str.append(arr[i]).append(" ");
        }
        str.append("]");
        return String.valueOf(str);
    }
}
