public class Driver
{

    public static void main(String[] args) //main method
    {
        Team[] temp = new Team[8]; //creates object based on nfl class
        NFL object = new NFL(temp);

        object.randomize(temp); //calls randomize
        object.Sort(temp); //calls sort
        object.rounds(temp);//calls rounds
        object.possibleCandidate(temp); //calls possiblecandidate
        


    }

}

