import java.util.ArrayDeque;
import java.util.Deque;

public class StackTest
{
    public static void main(String[] args)
    {
        Deque<String> stack1 = new ArrayDeque<>();

        stack1.push("Sal");
        stack1.push("Sean");
        stack1.push("Alejandro");
        stack1.push("Bob");

        StringBuilder result = new StringBuilder();
        while (!stack1.isEmpty())
        {
            result.append(stack1.pop());

        }

        System.out.println(stack1);
        System.out.println(result);


//        System.out.println(stack1);
//
//        stack1.pop();
//        System.out.println(stack1);


    }
}
