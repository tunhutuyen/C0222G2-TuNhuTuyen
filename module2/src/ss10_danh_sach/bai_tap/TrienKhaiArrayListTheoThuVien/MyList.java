package ss10_danh_sach.bai_tap.TrienKhaiArrayListTheoThuVien;

import java.util.Arrays;

public class MyList<E> {
    private int size =0;
    private static final int DEFAULT_CAPACITY =10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    private void ensureCapacity(int minCapacity) {
        if (minCapacity > 0) {
            int newSize = elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
        }else {
            throw new IllegalArgumentException("minCapacity "+minCapacity);
        }
    }
    public MyList(int capacity) {
        if (capacity>0){
            elements = new Object[capacity];
        }else {
            throw new IllegalArgumentException("Capacity "+capacity+" nhập sai");
        }
    }

    public void add(int index, E element) {
        if (index > elements.length || index < 0) {
            throw new IllegalArgumentException("index " + index);
        } else if (elements.length == size) {
            ensureCapacity(1);
        }
        if (elements[index] == null) {
            elements[index] = element;
            size++;
        } else {
            for (int i = index + 1; i <= size; i++) {
                elements[i] = elements[index];
            }
            size++;
            elements[index] = element;
        }
    }

    public E remove(int index){
        if (index<0 || index >size){
            throw new IndexOutOfBoundsException("index "+ index +" ,size "+index);
        }
        E element = (E) elements[index];
        for (int i = index; i < size; i++) {
            elements[i] = elements[i+1];
        }
        return element;
    }

    public int size(){
        return this.size;
    }

    public MyList<E> clone(){
        MyList<E> newMyList = new MyList<>();
        newMyList.elements = Arrays.copyOf(this.elements,this.size);
        newMyList.size =this.size;
        return newMyList;
    }

    public boolean contains (E o){
        return indexOf(o)>=0;
    }

    public int indexOf(E o){
        int index = -1;
        for (int i = 0; i < elements.length; i++) {
            if (o.equals(elements[i])){
                return i;
            }
        }
        return index;
    }
    public boolean add(E e){
        if (size == elements.length) {
            ensureCapacity(1);
        }
        elements[size] = e;
        size++;
        return true;
    }

    public void clear(){
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
    }
    public E get(int i){
        return (E)elements[i];
    }

}
