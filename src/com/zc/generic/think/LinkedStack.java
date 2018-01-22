package com.zc.generic.think;

public class LinkedStack<T>
{
    //节点,包含item和next
    private static class Node<U>
    {
        U item;
        Node<U> next;
        Node(){}
        Node(U item,Node<U> next) 
        {
            this.item=item;
            this.next=next;
        }
        boolean isEnd()
        {
            return item==null&&next==null;
        }
    }
    
    private Node<T> top=new Node<T>();
    
    public void push(T item)
    {
        top=new Node<T>(item,top);
    }
    
    public T pop()
    {
        //返回栈顶元素
        T result=top.item;
        if(!top.isEnd()){
            top=top.next;
        }
        return result;
    }
    
    
}
