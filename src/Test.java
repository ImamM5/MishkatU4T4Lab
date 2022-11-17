public class Test
{
    public Test()
    {

    }
    public void printNums (int value, int numRounds)
    {

        for (int i =1; i <= numRounds; i++)
        {
            int x = -1;
            while (x != value)
            {
                x = (int)(Math.random()*10);
                System.out.print(x);
            }
            System.out.println();
        }


    }
}
