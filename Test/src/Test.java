import java.util.ArrayList;
import java.util.List;

public class Test
{
    public static void main(String[] args)
    {
        List<String> myList = new ArrayList<>();
        myList.add("Bashful");
        myList.add("Happy");
        myList.add("Sad");
        myList.add(2, "ok");

        myList.remove(1);
        //System.out.println(myList.indexOf("Bashful"));

        for (String s : myList)
        {

            System.out.println(s);


        }
    }
}
