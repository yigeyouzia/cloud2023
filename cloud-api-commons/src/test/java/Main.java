/**
 * @author cyt
 * @version 1.0
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.PriorityQueue;
import java.util.Scanner;

import java.math.BigInteger;
import java.io.*;
import java.util.Stack;
import java.util.stream.Collectors;

class MinStack {
    PriorityQueue<Integer> minq;
    Stack<Integer> q;

    public MinStack() {
        q = new Stack<Integer>();
        minq = new PriorityQueue<Integer>();
    }

    public void push(int val) {
        q.add(val);
        minq.add(val);
    }

    public void pop() {
        if(q.peek() != null) {
            minq.remove(q.peek());
        }
        q.pop();
    }

    public int top() {
        return q.peek();
    }

    public int getMin() {
        return minq.peek();
    }
};

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack* obj = new MinStack();
 * obj->push(val);
 * obj->pop();
 * int param_3 = obj->top();
 * int param_4 = obj->getMin();
 */

