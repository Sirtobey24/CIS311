public class CountryListTest
{
    //Don't change this class. Just run it. 
    public static void main(String[] args)
    {
        CountryList<String> myList = new CountryList();
        myList.add("Mexico");
        myList.add("Zambia");
        myList.add("Brazil");
        myList.add("Austria");
        for (String s : myList)
        {
            System.out.println(s);
        }
        System.out.println("Size of the list is " + myList.size());
        System.out.println("_________________________________________________________________");
        System.out.println("Ordered list after adding 2 more countries, Canada and Uruguay-->");
        myList.add("Canada");
        myList.add("Uruguay");
        for (String s : myList)
        {
            System.out.println(s);
        }
        System.out.println("Size of the list is " + myList.size());
        System.out.println("_________________________________________________________________");
        System.out.println("Ordered list after removing Mexico from the list-->");
        myList.remove("Mexico");
        for (String s : myList)
        {
            System.out.println(s);
        }
        System.out.println("Size of the list is " + myList.size());
        System.out.println("_________________________________________________________________");
        System.out.println("Removing Russia from the list-->");
        myList.remove("Russia");
        for (String s : myList)
        {
            System.out.println(s);
        }
        System.out.println("Size of the list is " + myList.size());
    }
}

