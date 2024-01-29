import java.util.Stack;

public class MyQueue {
    private Stack<Integer> in;
    private Stack<Integer> out;

    public MyQueue() {
        in = new Stack<Integer>();
        out = new Stack<Integer>();
    }

    public void push(int x) {
        in.push(x);
    }

    public int pop() {
        if(out.empty()){
            flush();
        }
        return out.pop();
    }

    public int peek() {
        if(out.empty()){
            flush();
        }
        return out.peek();
    }

    private void flush(){
        while(!in.empty()){
            out.push(in.pop());
        }
    }

    public boolean empty() {
        return in.empty() && out.empty();
    }
}

