package com.company;

public class MyLinkedList {
    private Node first;
    private Node last;
    private int size;

    public void add(Object obj){
        Node node = new Node();
        if(first==null){

            node.setBefore(null);
            node.setNext(null);
            node.setObj(obj);
            first = node;
            last = first;
        }else{
            node.setBefore(last);
            node.setObj(obj);
            node.setNext(null);
            last.setNext(node);
            last = node;
        }
        size++;

    }

    public int size()
    {
        return size;
    }
    // Метод здесь состоит в том, чтобы получить узел, представленный указанным индексом.
    public Node node(int index)
    {
        Node temp =first;
        if(index<0||index>size)
        {
            System.out.println("Пожалуйста, правильно");
            temp = null;
        }
        else{
            if(first!=null)
            {


                if(index==0)
                {
                    temp = first;
                }
                else
                {
                    for(int i = 0;i<index;i++)
                    {
                        temp = temp.getNext();
                    }

                }

            }

        }
        return temp;

    }

    // Получить значение указанного местоположения
    public Object get(int index)
    {
        Node node =node(index);
        return node.getObj();
    }

	  // Удалите узел указанного местоположения, обратите внимание, что удаление здесь - значение следующего предыдущего узла и перед изменением следующего узла.
    public boolean remove(int index)
    {
        boolean isflag = false;
        Node node = node(index);
        Node before = node.getBefore();
        Node next = node.getNext();
        before.setNext(next);
        next.setBefore(before);
        isflag = true;
        size--;
        return isflag;
    }
    // Добавить в указанную позицию
    public void add(int index,Object obj)
    {
        Node node = node(index);
        Node node1 = node(index-1);
        Node newnode = new Node();
        newnode.setObj(obj);
        node1.setNext(newnode);
        node.setBefore(newnode);

        size++;

    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "first=" + first +
                ", last=" + last +
                ", size=" + size +
                '}';
    }
}
