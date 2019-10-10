public class NFL
{

    private String team[] = {"New England Patriots", "Dallas Cowboys", "Philadelphia Eagles", "Minnesota Vikings",
            "Pittsburgh Steelers", "Green Bay Packers", "Los Angeles Rams", "Chicago Bears"}; //list of teams in an array

    private String players[] = {"Derek Carr", "Andrew Luck", "Carson Palmer", "Drew Brees", "Kirk Cousins", "Joe Flacco"
            , "Aaron Rodgers", "Russel Wilson", "Ben Roethlisberger", "Eli Manning", "Philip Rivers",
            "Cam Newton", "Matth Ryan", "Tom Brady", "Ryan Tannehill", "Tony Romo", "Demarco Murray",
            "Sam Bradford", "Adrian Peterson", "Landr Jones", "Blake Bell", "Roy Finch", "Ryan Broyles",
            "Trevor Knight", "Peytton Manning", "Brett Favre", "Reggie Bush", "Lance Dunbar",
            "Toby Gerhart", "Brandon Bostick", "Anthony Fasano", "Johny Manziel"}; //list of players in an array


    Team[][] playerAssignment;

    public NFL() //constructors
    {
        playerAssignment = new Team[4][8]; //assigning a player
        for (int i = 0; i < 8; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                playerAssignment[i][j] = new Team();
                playerAssignment[i][j].teamName = team[i];
            }
        }

    }

    public NFL(Team[] temp)
    {
        for (int i = 0; i < 8; i++)
        {
            temp[i] = new Team(); //nfl class to be called and used in main
            temp[i].teamName = team[i];
        }
    }

    public void randomize(Team[] tempTeam) //random method to randomize percentages
    {

        for (int i = 0; i < 8; i++)
        {
            int[] isAssigned = new int[32];
            tempTeam[i].winningPercent = Math.random() * 101;
            for (int j = 0; j < 4; j++)
            {

                int randNum = (int) (Math.random() * 4 + 1);
                while (isAssigned[randNum] == 1)
                {
                    randNum = (int) (Math.random() * 4 + 1);
                }
                tempTeam[i].player[j] = players[randNum];
                isAssigned[randNum] = 1;


            }

            System.out.println("The " + tempTeam[i].teamName + " won " + Math.round(tempTeam[i].winningPercent) + "% of their games last season!\n");
        }
    }

    public void Sort(Team[] tempTeam) //sorting method using a swap
    {

        Team temp;

        for (int i = 0; i < tempTeam.length; i++)
        {
            for (int j = i + 1; j < tempTeam.length; j++)
            {
                if (tempTeam[i].winningPercent > tempTeam[j].winningPercent)
                {
                    temp = tempTeam[i];
                    tempTeam[i] = tempTeam[j];
                    tempTeam[j] = temp;

                }
            }
        }
        System.out.println("After sorting the data is:\n");

        for (int i = 0; i < 8; i++)
        {
            int name = i + 1;
            System.out.println("The " + tempTeam[i].teamName + " is ranked " + name + "\n");

        }


    }

    public void rounds(Team[] tempTeam)
    {
        for (int round = 1; round < 5; round++)
        {
            for (int i = 0; i < tempTeam.length; i++)
            {

                for (int j = 0; j < tempTeam.length; j++)
                {
                    System.out.println(tempTeam[round].player + " has been selected to be drafted in Round" + round + "\n");
                }
            }
        }
    }

    public void possibleCandidate(Team[] tempTeam) //candiates to be drafted
    {
        int count = 0;
        for (int round = 1; round < 5; round++)
        {

            for (int i = 0; i < tempTeam.length; i++)
            {

                for (int j = 0; j < tempTeam.length; j++)
                {
                    //if (round == tempTeam[i][j])
                    {

                        System.out.println("Round :" + round + " Team: " + tempTeam[i].teamName + " selected: " + tempTeam[i].player);
                    }
                }
            }
            count = 0;
        }

    }
}

