public class Students
{
    private String name;
    private String number;

    Students(String name, String number)
    {
        this.name = name;
        this.number = number;
    }

    public String toString()
    {
        return name + " " + number + " ";
    }
}
