package myList;

import java.util.AbstractList;

public class CustomArrayList<E> extends AbstractList<E> {
    private Object[] array;
    private int size;

    public CustomArrayList() {
        size = 10;
        array = new Object[size];
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return (E) array[index];
    }

    public E set(int index, E value) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        E oldValue = (E) array[index];
        array[index] = value;
        return oldValue;
    }

    public void add(int index, E value) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        if (size == array.length) {
            expand();
        }
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = value;
        size++;
    }

    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        E value = (E) array[index];
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
        return value;
    }

    public int size() {
        return size;
    }

    private void expand() {
        Object[] temp = new Object[array.length * 2];
        for (int i = 0; i < size; i++) {
            temp[i] = array[i];
        }
        array = temp;
    }
}