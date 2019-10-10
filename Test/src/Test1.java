import java.util.LinkedList;
import java.util.ListIterator;

public class Test1
{
    public static void main(String[] args)
    {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Adam");
        ll.add("Diana");
        ll.add("Jairo");
        ll.add("Sara");
        ll.add(0, "John");

        for (String s : ll)
        {
            System.out.println(s);
        }

        ListIterator<String> myIter = ll.listIterator();

        while (myIter.hasNext())
        {
            myIter.next();
            myIter.remove();
            //myIter.next();
            //myIter.remove();
        }


        for (String s : ll)
        {
            System.out.println(s);
        }

    }

}
