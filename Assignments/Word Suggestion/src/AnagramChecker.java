import java.io.FileReader;
import java.util.*;


public class AnagramChecker
{
    private static Scanner sc = new Scanner(System.in);
    private ArrayList<String> dictionary;
    private HashMap<String, Integer> userinputwords;
    private HashMap<String, Integer> sortdictionary;

    public void reader() //Reads a file and puts the contents of that file into a ARRAYLIST
    {
        dictionary = new ArrayList<>();
        try
        {
            Scanner s = new Scanner(new FileReader("C:\\Users\\seand\\IdeaProjects\\CIS311\\Assignments\\Word Suggestion\\src\\words.txt")); //Full path of file required to work for IDE

            while (s.hasNext())
            {
                dictionary.add(s.next());
            }

            s.close();
            System.out.println("Existing Word List: " + dictionary.toString());//testing

        } catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    public void inputfromuser(String userinput)//Get input from user and stores it in a hashmap
    {
        userinputwords = new HashMap<>();

        System.out.println(("Hello user!\nPlease enter the list of words to check and type DONE to stop: "));
        while (!userinput.equals("DONE"))
        {
            userinput = sc.next();
            if (userinput.equals("DONE"))
            {
                break;
            }
            userinputwords.put(userinput, 20);
        }
        // System.out.println(userinputwords); //test to print userinput vals in hashmap
    }

    public void wordsort()//Sorting Algorithm
    {
        Collections.sort(dictionary);
        sortdictionary = new HashMap<>();
        for (String item : dictionary)
        {
            sortdictionary.put(item, 20);
            //System.out.println(item);
        }
    }

    public void search() //Search through hashmap to compare given userinput
    {
        for (String key : userinputwords.keySet())
        {
            int count = 0;
            if (sortdictionary.containsKey(key))
            {
                System.out.println("Correct!... " + key + " has an exact match!");
            }
            else
            {

                char[] chars = key.toCharArray();
                Arrays.sort(chars);
                //System.out.println(chars);

                for (String key2 : sortdictionary.keySet())
                {
                    char[] chars2 = key2.toCharArray();
                    Arrays.sort(chars2);
                    //cat => act
                    //tca => act
                    if (Arrays.equals(chars2, chars))
                    {
                        System.out.println("Suggestions found for " + key + "... Did you mean? " + key2);
                        count++;
                    }
                }
                if (count == 0)
                {
                    System.out.println("No Suggestions found for " + key);
                }

            }
        }
    }
}
