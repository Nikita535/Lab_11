package com.company;

import java.util.Iterator;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        // 1
	    Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(10);
        System.out.println("Before:");
        System.out.println(stack.toString());
        Integer buf0;
        Integer buf1;
        for (int i = 0; i < stack.size() / 2; i++){
            buf0 = stack.get(i);
            buf1 = stack.get(stack.size() - (i + 1));
            stack.remove(i);
            stack.add(i, buf1);
            stack.remove(stack.size() - (i + 1));
            stack.add(stack.size() - i, buf0);
        }
        System.out.println("After:");
        System.out.println(stack.toString());
        // 2 - 3
        Integer[] list = {1, 2, 3};
        SOList soList = new SOList(list);
        Iterator<Integer> iter = soList.iterator();
        System.out.println(iter.hasNext());
        iter.next();
        System.out.println(iter.hasNext());
        iter.next();
        System.out.println(iter.hasNext());
        iter.next();
        System.out.println(iter.hasNext());
    }
}
