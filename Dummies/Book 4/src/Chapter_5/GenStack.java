package Chapter_5;

import java.util.LinkedList;

public class GenStack<E>
{
    private LinkedList<E> list = new LinkedList<E>();

    public void push (E item)
    {
        list.push(item);
    }

    public E pop ()
    {
        return list.pop();
    }

    public E peek()
    {
        return list.peek();
    }

    public boolean hasItems()
    {
        return !list.isEmpty();
    }

    public int size()
    {
        return list.size();
    }

}

class GenStackTest
{
    public static void main(String[] args) {
        GenStack<String> gs = new GenStack<>();

        System.out.println("Pushing 4 items onto the stack.");
        gs.push("One");
        gs.push("Two");
        gs.push("Three");
        gs.push("Four");

        System.out.println("There are " + gs.size() + " items in the stack.\n");
        System.out.println("The top item is: " + gs.peek() + "\n");
        System.out.println("There are still " + gs.size() + " items in the stack.\n");

        System.out.println("Popping everything");
        while (gs.hasItems())
        {
            System.out.println(gs.pop());
        }

        System.out.println("There are " + gs.size() + " items in the stack.\n");
        System.out.println("The top item is: " + gs.peek() + "\n");


    }
}