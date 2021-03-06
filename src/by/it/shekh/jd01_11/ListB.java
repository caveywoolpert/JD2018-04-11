package by.it.shekh.jd01_11;

import java.util.*;

public class ListB<T> implements List<T> {
    @SuppressWarnings("all")
    private T[] array = (T[]) new Object[]{};
    private int size = 0;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        String delimiter = "";
        for (int i = 0; i < size; i++) {
            T element = array[i];
            sb.append(delimiter).append(element);
            delimiter = ", ";
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean add(T element) {
        if (size == array.length)
            array = Arrays.copyOf(array, array.length * 3 / 2 + 1);
        array[size++] = element;
        return true;
    }


    @Override
    public T remove(int index) {
        T deleted = array[index];
        System.arraycopy(array, index + 1, array, index, size - (index + 1));
        size--;
        return deleted;
    }


    @Override
    public T get(int index) {
        return array[index];
    }


    @Override
    public boolean remove(Object o) {
        int i = indexOf(o);
        if (i > -1) {
            remove(i);
            return true;
        }
        return false;
    }

    @Override
    public int indexOf(Object o) {
        if (o == null)
            for (int i = 0; i < size; i++) {
                if (array[i] == null)
                    return i;
            }
        else
            for (int i = 0; i < size; i++) {
                if (o.equals(array[i]))
                    return i;
            }
        return -1;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return indexOf(o) > -1;
    }

    ///Task A ---------------------------------------


    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        if (c.isEmpty()) {
            System.out.println("Попытка добавить ничего");
            return false;
        } else {
            Iterator<? extends T> iterator = c.iterator();
            while (iterator.hasNext()) {
                if (size == array.length)
                    array = Arrays.copyOf(array, size * 3 / 2 + 1);
                array[size++] = iterator.next();
            }
            return true;
        }

    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public T set(int index, T element) {
        if (index > size) {
            System.out.println("Введен неправильный индекс");
            return element;
        } else {
            T elem = array[index];
            array[index] = element;
            return elem;
        }

    }

    @Override
    public void add(int index, T element) {
        if (index >= array.length) {
            System.out.println("Элемент будет добавлен в конец списка");
            add(element);
        } else {
            size++;
            T[] elementsArr;
            elementsArr = Arrays.copyOf(array, array.length);
            if (size == array.length) {
                array = Arrays.copyOf(array, size * 3 / 2 + 1);
            }
            for (int i = 0; i < index; i++) {
                array[i] = elementsArr[i];
            }
            array[index] = element;
            for (int i = index + 1; i < size; i++) {
                array[i] = elementsArr[i - 1];

            }
        }

    }


    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }
}
