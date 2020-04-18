package com.dongho.dev.practice.linked_list;


public class SinglyLinkedList<T> {

    static class Element<T> {

        private T data;
        private Element<T> next;

        Element(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Element<T> head = null;

    public void add(T data) {
        Element<T> newElement = new Element<>(data);

        if (head == null) {
            head = newElement;
        } else {
            Element<T> prev = head;

            while(prev.next != null) {
                prev = prev.next;
            }

            prev.next = newElement;
        }
    }

    public void add(T data, int pos) {
        Element<T> newElement = new Element<>(data);

        if (head == null) {
            head = newElement;
        } else {
            if (pos == 0) {
                newElement.next = head;
                head = newElement;
                return;
            }
            Element<T> prev = head;

            for (int i = 1; i < pos; i++) {
                if (prev.next == null) {
                    prev.next = newElement;
                    return;
                }
                prev = prev.next;
            }

            newElement.next = prev.next;
            prev.next = newElement;
        }
    }

    public T get(int pos) {
        if (head == null) {
            return null;
        }

        Element<T> current = head;
        for (int i = 0; i < pos; i++) {
            if (current.next == null) {
                return null;
            }

            current = current.next;
        }

        return current.data;
    }

    public int length() {
        int length = 0;

        if (head == null) {
            return length;
        }

        Element<T> current = head;
        while (current != null) {
            length++;
            current = current.next;
        }

        return length;
    }

    public void delete(int pos) {
        if (head == null) {
            return;
        }

        if (pos == 0) {
            head = head.next;
            return;
        }

        Element<T> prev = head;
        Element<T> current = head.next;
        for (int i = 1; i < pos; i++) {
            if (prev.next == null) {
                return;
            }
            prev = current;
            current = current.next;
        }

        prev.next = current.next;
    }

    public void concat(SinglyLinkedList<T> other) {
        if (head == null) {
            head = other.head;
            return;
        }

        if (other.head == null) {
            return;
        }

        Element<T> current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = other.head;
    }

    public void reverse() {
        Element<T> prev = null;
        Element<T> current = null;
        Element<T> next = head;

        while (next != null) {
            prev = current;
            current = next;
            next = next.next;

            current.next = prev;
        }
        head = current;
    }

}
