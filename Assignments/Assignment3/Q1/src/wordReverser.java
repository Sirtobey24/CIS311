import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringJoiner;

public class wordReverser
{
    public static void main(String[] args)
    {
        Deque<String> stack = new ArrayDeque<>();
        String mystring = "The quick brown fox jumps over the lazy dog";
        stack.push(mystring);
        String mystringarray[] = mystring.split("");

        StringJoiner sj = new StringJoiner("");

        for (int i = 0; i < mystringarray.length; i++)
        {

            System.out.print(mystringarray[i] + "");
        }

        for (int i = mystringarray.length - 1; i >= 0; i--)
        {
            sj.add(mystringarray[i]);
        }

        System.out.print("\n" + sj);

    }
}
