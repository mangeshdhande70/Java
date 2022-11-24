import javax.swing.*;
import java.util.Scanner;

public class Stack {

    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();

//    int size = 5;

    int stack[] = new int[size];
    int top = 0;
    public void push(int n)
    {
        if (top == size)
        {
            System.out.println("Stack Overflow");
        }
        else
        {
            stack[top++] = n;
        }

    }
    public void pop() {
        if (top == 0) {
            System.out.println("Stack underflow");
        } else {
            top--;
            stack[top] = 0;
        }
    }

    public void isEmpty()
    {
        if (top == 0)
            System.out.println("Stack is Empty");
        else
            System.out.println("Not Empty");
    }

    public void peek() {
        if (top == 0) {
            System.out.println("Stack is Empty");
        } else {
            int data = top - 1;
            System.out.println("peek " + stack[data]);
        }
    }

    public void show()
    {
//        for(int i : stack)
//        {
//            System.out.println(i);
//        }
        System.out.println("********** STACK *******");
        if (top == 0)
        {
            System.out.println("Stack is Empty");
        }
        else {

            for (int i = 0; i < top; i++) {

                System.out.println(stack[i]);

            }
        }
    }

    public int search(int n)
    {
        for (int i = 0; i < top ; i++) {
            if (n == stack[i])
                return i;
        }
        return -1;
    }
}
