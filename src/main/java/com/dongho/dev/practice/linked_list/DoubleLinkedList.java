package com.dongho.dev.practice.linked_list;

public class DoubleLinkedList<T> {

    static class Element<T> {
        private T data;

        private Element<T> prev;
        private Element<T> next;

        Element(T data) {
            this.data = data;
            this.prev = this.next = null;
        }
    }

    private Element<T> head = null;

    public void add(T data) {
        Element<T> newElement = new Element<>(data);

        if (head == null) {
            head = newElement;
            return;
        }

        Element<T> prev = head;
        while (prev.next != null) {
            prev = prev.next;
        }

        newElement.prev = prev;
        prev.next = newElement;
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

    public void add(T data, int pos) {
        Element<T> newElement = new Element<>(data);

        if (head == null) {
            head = newElement;
            return;
        }

        if (pos == 0) {
            newElement.next = head;
            head.prev = newElement;

            head = newElement;
            return;
        }

        Element<T> prev = head;
        Element<T> current = prev.next;
        for (int i = 1; i < pos; i++) {
            if (prev.next == null) {
                prev.next = newElement;
                newElement.prev = prev;
                return;
            }

            prev = prev.next;
            current = prev.next;
        }

        prev.next = newElement;
        newElement.prev = prev;
        newElement.next = current;

        if (current != null) {
            current.prev = newElement;
        }
    }

    public void delete(int pos) {
        if (head == null) {
            return;
        }

        if (pos == 0) {
            head = head.next;

            if (head != null) {
                head.prev = null;
            }

            return;
        }

        Element<T> prev = head;
        Element<T> current = head.next;
        for (int i = 1; i < pos; i++) {
            if (prev.next == null) {
                return;
            }

            prev = prev.next;
            current = prev.next;
        }

        prev.next = current.next;

        if (current.next != null) {
            current.next.prev = prev;
        }
    }

    public void reverse() {
        if (head == null) {
            return;
        }

        Element<T> prev = null;
        Element<T> cur = null;
        Element<T> next = head;

        while (next != null) {
            prev = cur;
            cur = next;
            next = next.next;

            cur.next = prev;
            cur.prev = next;
        }

        head = cur;
    }

}
