package org.azamat.homeworks.mylinkedlist;

import java.util.Iterator;

public class MyLinkedList<E> implements ILinkedList<E>{
    private Node<E> head;
    private int size;

    public MyLinkedList() {
        head = new Node<E>(null,null);
        size = 0;
    }

    @Override
    public void add(E element) {
        head = new Node<E>(element, head);
        size++;
    }

    @Override
    public void add(int index, E element) {
        Node<E> next = getNodeByIndex(index);
        Node<E> newNode = new Node<E>(element, next.nextNode);
        head.nextNode = newNode;
        size++;
    }

    @Override
    public void clear() {

    }

    @Override
    public E get(int index) {
        if (index < 0)
            System.out.println("index must be > 0");
        Node<E> a = getNodeByIndex(index);
        return a.element;
    }

    @Override
    public int indexOf(E element) {
        return 0;
    }

    @Override
    public E remove(int index) {
        Node<E> a = getNodeByIndex(index);
        return null;
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public <E> E[] toArray(E[] arrE) {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int count = 0;

            @Override
            public boolean hasNext() {
                return count < size;
            }

            @Override
            public E next() {
                return get(count++);
            }
        };
    }

    private Node<E> getNodeByIndex(int index){
            Node<E> a = head;
            for (int i = 0; i < index; ++i) {
                a = a.nextNode;
            }
            return a;
    }

    private static class Node<E> {
        private E element;
        private Node<E> nextNode;

        public Node(E element, Node<E> nextNode) {
            this.element = element;
            this.nextNode = nextNode;
        }

    }
}
