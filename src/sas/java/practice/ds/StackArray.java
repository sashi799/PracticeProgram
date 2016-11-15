package sas.java.practice.ds;

import java.util.Iterator;

public class StackArray<T> implements IStack<T>{
    private int top;
    private static final int DEFAULT_CAPACITY = 10;
    private Object container[];

    public StackArray() {
            this(DEFAULT_CAPACITY);
    }
    
    public StackArray(int size) {
    	container = new Object[size];
        top = -1;
    }

    public T peek()
    {
        if (top == -1)
            return null;
        return (T) container[top];
    }
 
    public boolean isEmpty()
    {
        return (top == -1);
    }
 
    public T pop()
    {
        if (top == -1)
            return null;
 
        T itm = (T) container[top];
        container[top--] = null;
 
        if(top > 0 && top == container.length / 4)
           resize (container.length/2);
 
        return itm;
    }
 
    public void push(T itm)
    {		
        if (top == container.length - 1)
            resize(2 * container.length);
 
        container[++top] = itm;
    }
 
    public int size()
    {
        return (top + 1);
    }
 
    private void resize (int newSize)
    {
        T t[] = (T[]) new Object[newSize];
        for (int i = 0; i <= top; i++)
            t[i] = (T) container[i];
        container = t;
    }
 
    public Iterator<T> iterator()
    {
        return new ArrayStackIterator();
    }
 
    private class ArrayStackIterator implements Iterator <T>
    {
        private int i = top;
 
        public boolean hasNext()
        {
            return (i > -1);
        }
 
        public T next()
        {
            return (T) container[i--];
        }
 
        public void remove()
        {
           // not needed
        }
    }
}
