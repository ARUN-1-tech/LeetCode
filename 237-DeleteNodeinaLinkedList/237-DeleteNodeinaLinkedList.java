// Last updated: 8/6/2026, 2:33:51 PM
1class MyStack {
2    Queue<Integer> q;
3    public MyStack() {
4        q=new LinkedList<>();
5    }
6    
7    public void push(int x) {
8        q.add(x);
9        for(int i=1;i<q.size();i++){
10            q.add(q.remove());
11        }
12    }
13    
14    public int pop() {
15        return q.remove();
16    }
17    
18    public int top() {
19        return q.peek();
20    }
21    
22    public boolean empty() {
23        return q.isEmpty();
24    }
25}
26
27/**
28 * Your MyStack object will be instantiated and called as such:
29 * MyStack obj = new MyStack();
30 * obj.push(x);
31 * int param_2 = obj.pop();
32 * int param_3 = obj.top();
33 * boolean param_4 = obj.empty();
34 */