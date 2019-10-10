import java.util.ArrayList;

public class Enrollment
{
    public static void main(String[] args)
    {
        // Students object = new Students("", "");
        //object.name = "";
        //object.number = "";

        ArrayList<Students> myclass = new ArrayList<>();
        myclass.add(new Students("Sean", "101010"));
        myclass.add(new Students("David", "111111"));
        myclass.add(new Students("Paul", "123456"));
        myclass.add(new Students("Alex", "654321"));
        myclass.add(new Students("John", "246800"));

        System.out.println("The original list: \n");
        for (Students s : myclass)
        {
            System.out.println(s);
        }

        myclass.remove(2);

        System.out.println("\nThe list after removing the third person: \n");
        for (Students s : myclass)
        {
            System.out.println(s);
        }

        System.out.println("\nThe list after adding one student at position 2\n");
        myclass.add(1, (new Students("Luke", "111111")));

        for (Students s : myclass)
        {
            System.out.println(s);
        }

        int size = myclass.size();

        System.out.println("\nThe size of the list is " + size);

    }
}
