package javacore.Stack;

/**
 * 数组模拟栈
 */

public class MyStack {
    int size;
    int[] arr ;
    int top = -1;
    public MyStack(int size){
        this.size=size;
        this.arr = new int[size];
    }
    public boolean full(){
        if(top == size - 1){
            return true;
        }else
            return false;
    }
    public boolean isEmpty(){
        return top== -1;
    }
    public void push(int number){
        if(this.full()){
           return;
        }else {
            arr[top+1] = number;
            top++;
        }
    }
    public void pop(){
        if(this.isEmpty()){
            System.out.println("空的");
        }
        int value = arr[top];
        top--;
    }
    public int peek(){
        if(this.isEmpty()){
            throw new RuntimeException("空栈");
        }
        return arr[top];
    }
    public void lookAll(){
        if(isEmpty()){
            return;
        }
        for(int i = top;i>-1;i--){
            System.out.print(arr[i]);
        }
    }
}
