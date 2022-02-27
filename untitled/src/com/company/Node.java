package com.company;

public class Node {
    private Node before;
    private Object obj;
    private Node next;
    public Node() {
        super();
    }
    public Node getBefore() {
        return before;
    }
    public void setBefore(Node before) {
        this.before = before;
    }
    public Object getObj() {
        return obj;
    }
    public void setObj(Object obj) {
        this.obj = obj;
    }
    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }
    public Node(Node before, Object obj, Node next) {
        super();
        this.before = before;
        this.obj = obj;
        this.next = next;
    }

    @Override
    public String toString() {
        return
                "" + obj;

    }
}
