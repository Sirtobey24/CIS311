public class TowersofHanoi
{
    public static String showMoves(int n, char startPeg, char destPeg, char tempPeg)
    {
        if (n == 1)
        {
            return "Move disc 1 from peg " + startPeg + " to peg " + destPeg + "\n";

        } else
        {
            return showMoves(n - 1, startPeg, tempPeg, destPeg) + "Move disk " + n + " from peg " + startPeg
                    + " to peg " + destPeg + "\n" + showMoves(n - 1, tempPeg, destPeg, startPeg);
        }
    }

    public static void main(String[] args)
    {
        System.out.println(showMoves(3, 'A', 'B', 'C'));
    }
}
