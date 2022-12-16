package List_Interface.Stack.Basic_Stack.Dsatck;

public class Dstack {

    int capacity = 2;
    int stack[] = new int[capacity];
    int top = 0;

    public void push(int n)
    {
        if(size() == capacity)
            expand();

        stack[top++] = n;

    }

    private void expand()
    {
        int length = size();
        int newStack[] = new int[capacity*2];
        System.arraycopy(stack,0,newStack,0,length); // copy stack element into newStack
        stack = newStack;
        capacity *= 2;
    }

    public int size()
    {
        return top;
    }

    public void show(){
        for (int i = 0; i < top; i++) {
            System.out.print(stack[i]+ " ");

        }
    }

}
