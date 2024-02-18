package utils;

public class SinglyLinkedList<T> {

    private Node<T> front;
    private int size;

    public SinglyLinkedList() {
        front = null;
        size = 0;
    }

    public boolean add(T value) {
        Node<T> newNode = new Node<>(value);
        if (isEmpty()) {
            front = newNode;
        } else {
            Node<T> endNode = node(size - 1);
            endNode.next = newNode;
        }
        size++;
        return true; // Indicate that the addition was successful
    }

    public void add(int index, T value) {
        if (index == 0) {
            front = new Node<>(value, front);
        } else {
            Node<T> nodeBefore = node(index - 1);
            Node<T> targetNode = nodeBefore.next;
            nodeBefore.next = new Node<>(value, targetNode);
        }
        size++;
    }

    public void addAll(SinglyLinkedList<T> other) {
        for (int i = 0; i < other.size; i++) {
            add(other.get(i));
        }
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid Index: " + index);
        }
    }

    public void clear() {
        front = null;
        size = 0;
    }

    public T get(int index) {
        return node(index).data;
    }

    public int indexOf(T value) {
        int index = 0;
        for (Node<T> node = front; node != null; node = node.next, index++) {
            if (node.data.equals(value)) {
                return index;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return front == null && size == 0;
    }

    private Node<T> node(int index) {
        checkIndex(index);
        Node<T> current = front;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    public T remove(int index) {
        checkIndex(index);
        Node<T> toRemove;
        if (index == 0) {
            toRemove = front;
            front = front.next;
        } else {
            Node<T> prev = node(index - 1);
            toRemove = prev.next;
            prev.next = toRemove.next;
        }
        size--;
        return toRemove.data;
    }

    public int size() {
        return size;
    }

    public String toString() {
        if (isEmpty()) {
            return "[]";
        } else {
            StringBuilder result = new StringBuilder("[" + front.data);
            for (Node<T> node = front.next; node != null; node = node.next) {
                result.append(", ").append(node.data);
            }
            return result.append("]").toString();
        }
    }

    public T set(int index, T element) {
        checkIndex(index);
        Node<T> target = node(index);
        T oldData = target.data;
        target.data = element;
        return oldData;
    }

    private static class Node<T> {
        T data;
        Node<T> next;

        // Constructor with only data argument
        public Node(T data) {
            this(data, null);
        }

        // Constructor with data and next node arguments
        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }
    }
}
