package ArrayList;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    Object element[];

    public MyList(){
        element = new Object[DEFAULT_CAPACITY];
    }
    public MyList(int capacity) {
        element = new Object[capacity];
    }

    public void ensureCapa() {
        if (size >= element.length) {
            element = Arrays.copyOf(element , element.length* 2);
        }
    }
    public void add(int index , E e) {
        if(index < element.length && index >=0 ) {
            ensureCapa();
            for (int i = index + 1 ; i < element.length ; i++) {
                Object temp1 = element[i];
                element[i] = temp1;
            }
            element[index] = e;
            size++;
        }
    }
    public E remove (int index) {
        if(index < element.length && index >=0 ) {
            E e = (E) element[index];
            for (int i = index + 1 ; i < element.length ; i++) {
                element[i-1] = element[i];
            }
            size--;
            return e;
        }
        return null;
    }
    public int size() {
        return size;
    }

    public  int indexOf(E e) {
        int index = 0;
        for (int i = 0 ; i < element.length ; i++) {
            if (element[i] == e) {
                index = i;
                break;
            }
        }
        return index;
    }
    public  boolean add(E e) {

        ensureCapa();
        size++;
        element[size] = e;
        return true;
    }
    public E get( int index) {
        if (index > size || index < 0) {
            return null;
        }else {
            return (E) element[index];
        }
    }
    public void clear() {
        for (int i = 0; i < size ; i++) {
            element[i] = null;
        }
        size = 0;
    }

}
