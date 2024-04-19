package hus.oop.datastructure;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        /*
        Yêu cầu:

        - Hoàn thiện code chương trình theo mẫu đã cho.

        - Sinh ra một số tự nhiên ngẫu nhiên nằm trong đoạn [15 - 30], gọi là n.
        - Sinh ra n số nguyên ngẫu nhiên, cho vào stack.
            + In ra các phần tử trong stack.
            + Lần lượt xóa các phần tử trong stack. Sau mỗi lần xóa, in ra các phần tử còn lại trong stack.

        - Sinh ra n số nguyên ngẫu nhiên, cho vào queue.
            + In ra các phần tử trong queue.
            + Lần lượt xóa các phần tử trong queue. Sau mỗi lần xóa, in ra các phần tử còn lại trong queue.
        */
        testQueue();
        testStack();

//        Random random = new Random();
//        int n = random.nextInt(16) + 15;
//
//        // Sinh ra n số nguyên ngẫu nhiên và đưa vào stack
//        Stack<Integer> stack = new Stack<>();
//        for (int i = 0; i < n; i++) {
//            stack.push(random.nextInt(100) + 1); // Số nguyên ngẫu nhiên từ 1 đến 100
//        }
//
//        // In ra các phần tử trong stack
//        System.out.println("Stack: " + stack);
//
//        // Lần lượt xóa các phần tử trong stack và in ra các phần tử còn lại sau mỗi lần xóa
//        System.out.println("Stack after each deletion:");
//        while (!stack.isEmpty()) {
//            stack.pop();
//            System.out.println(stack);
//        }
//
//        // Sinh ra n số nguyên ngẫu nhiên và đưa vào queue
//        Queue<Integer> queue = new LinkedList<>();
//        for (int i = 0; i < n; i++) {
//            queue.offer(random.nextInt(100) + 1); // Số nguyên ngẫu nhiên từ 1 đến 100
//        }
//
//        // In ra các phần tử trong queue
//        System.out.println("\nQueue: " + queue);
//
//        // Lần lượt xóa các phần tử trong queue và in ra các phần tử còn lại sau mỗi lần xóa
//        System.out.println("Queue after each deletion:");
//        while (!queue.isEmpty()) {
//            queue.poll();
//            System.out.println(queue);
//        }
    }



    public static void testStack() {
        /* TODO */
        Random rand = new Random();
        int n = rand.nextInt(16) + 15; // Random number between 15 and 30
        MyStack stack = new MyStack();

        System.out.println("Stack operations:");
        for (int i = 0; i < n; i++) {
            int value = rand.nextInt(100); // Random number between 0 and 99
            stack.push(value);
            System.out.println("Pushed " + value + " to stack");
        }

        while (!stack.isEmpty()) {
            System.out.println("Popped " + stack.pop() + " from stack");
        }
    }

    public static void testQueue() {
        /* TODO */
        Random rand = new Random();
        int n = rand.nextInt(16) + 15; // Random number between 15 and 30
        MyQueue queue = new MyQueue();

        System.out.println("Queue operations:");
        for (int i = 0; i < n; i++) {
            int value = rand.nextInt(100); // Random number between 0 and 99
            queue.add(value);
            System.out.println("Added " + value + " to queue");
        }

        while (!queue.isEmpty()) {
            System.out.println("Removed " + queue.remove() + " from queue");
        }

    }
}
