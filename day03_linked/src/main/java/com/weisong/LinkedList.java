package com.weisong;

public class LinkedList {
    private int size;
    private Node firstNode;
    private static class Node<E>{
        E element;
        Node<E> nextNode;

        public Node(E element, Node<E> nextNode) {
            this.element = element;
            this.nextNode = nextNode;
        }
    }


}
