package org.azamat.homeworks.mylinkedlist;

import java.util.Iterator;

public class MyLinkedList<E> implements ILinkedList<E>{
    private Node<E> head;
    private Node<E> tail;
    private int size;

    public MyLinkedList() {
        head = new Node<E>(null,null);
        size = 0;
    }

    @Override
    public void add(E element) {
        Node<E> newNode = new Node<E>(element, null);
        if (head.element == null)
            head = newNode;
        else
            tail.nextNode = newNode;
        tail = newNode;
        size++;
    }

    @Override
    public void add(int index, E element) {
        Node<E> newNode = new Node<E>(element, null);
        if (index == size) {
            Node<E> oldTail = tail;
            tail = newNode;
            oldTail.nextNode = tail;
        } else if (index == 0) {
                Node<E> oldHead = head;
                head = newNode;
                newNode.nextNode = oldHead;
            } else {
                Node<E> curr = getNodeByIndex(index);
                Node<E> prev = getNodeByIndex(index - 1);
                prev.nextNode = newNode;
                newNode.nextNode = curr;
            }

        size++;
    }

    @Override
    public void clear() {
        Node<E> node = head;
        while (node != null) {
            Node<E> next = node.nextNode;
            node.element = null;
            node.nextNode = null;
            node = next;
        }
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public E get(int index) {
        Node<E> node = getNodeByIndex(index);
        return node.element;
    }

    @Override
    public int indexOf(E element) {
        if (element == null) {
            for (int i = 0; i <= size; ++i) {
                if (getNodeByIndex(i).element == null)
                    return i;
            }
        } else {
                for (int i = 0; i <= size; ++i) {
                    if (element.equals(getNodeByIndex(i).element))
                        return i;
                }
            }
        return -1;
    }

    @Override
    public E remove(int index) {
        Node<E> prev = getNodeByIndex(index-1);
        Node<E> oldCurr = getNodeByIndex(index);
        Node<E> curr = oldCurr;
        Node<E> next = getNodeByIndex(index+1);

        if (curr.nextNode == null) {
            prev.nextNode = null;
        } else if (curr.equals(head)) {
            head = next;
        } else {
            prev.nextNode = next;
        }

        oldCurr = null;
        size--;
        return curr.element;
    }

    @Override
    public E set(int index, E element) {
        Node<E> prev = getNodeByIndex(index-1);
        Node<E> oldCurr = getNodeByIndex(index);
        Node<E> curr = oldCurr;
        Node<E> next = getNodeByIndex(index+1);
        Node<E> newNode = new Node(element, curr.nextNode);

        if (curr.nextNode == null) {
            newNode.nextNode = null;
            prev.nextNode = newNode;
        } else if (curr.equals(head)) {
            head = newNode;
        } else {
            prev.nextNode = newNode;
        }

        oldCurr = null;
        return curr.element;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public <E> E[] toArray(E[] arrE) {
        arrE = (E[])java.lang.reflect.Array.newInstance(
                arrE.getClass().getComponentType(), size);
        return arrE;
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

    @Override
    public String toString() {
        if (head == null) {
            return "";
        }
        String result = "";

        for (int i = 0; i <= size; ++i ) {
            result += getNodeByIndex(i) + ", ";
        }
        return result;
    }

    private Node<E> getNodeByIndex(int index){
            Node<E> a = head;
            for (int i = 0; i < index; ++i) {
                a = a.nextNode;
            }
            return a;
    }

    private void linkLast(E element) {
        Node<E> l = tail;

    }

    private void linkBefore(E element, Node<E> pred) {
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
