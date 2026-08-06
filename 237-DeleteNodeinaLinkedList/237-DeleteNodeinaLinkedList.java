// Last updated: 8/6/2026, 2:38:07 PM
1class MyQueue {
2    Stack<Integer> s1=new Stack<>();
3    Stack<Integer> s2=new Stack<>();
4
5    public MyQueue() {
6    }
7    
8    public void push(int x) {
9        while (!s2.isEmpty()) {
10            s1.push(s2.pop());
11        }
12        
13        s1.push(x);
14        
15        while (!s1.isEmpty()) {
16            s2.push(s1.pop());
17        }
18    }
19    
20    public int pop() {
21        return s2.pop();
22    }
23    
24    public int peek() {
25        return s2.peek();
26    }
27    
28    public boolean empty() {
29        return s2.isEmpty();
30    }
31}
32
33/**
34 * Your MyQueue object will be instantiated and called as such:
35 * MyQueue obj = new MyQueue();
36 * obj.push(x);
37 * int param_2 = obj.pop();
38 * int param_3 = obj.peek();
39 * boolean param_4 = obj.empty();
40 */