package javacore.Stack;

public class SimpleCalcultor {
    MyStack numberStack = new MyStack(20);
    MyStack symbolStack = new MyStack(20);

    public static void main(String[] args) {

    }
    public int calcultor(String string){
        for(int i = 0 ;i<string.length();i++){
            if(setLevel(string.charAt(i))==1){
                if(symbolStack.isEmpty()){
                    symbolStack.push(string.charAt(i));
                }
                if(symbolStack.peek()==string.charAt(i)){

                }
            }
        }
    }
    public  int setLevel(int ch){
        if(ch=='+'||ch=='-'){
            return 1;
        }
        if(ch=='*'||ch=='/')
            return 2;
        else return 0;
    }
}
