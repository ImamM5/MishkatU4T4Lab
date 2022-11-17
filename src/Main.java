public class Main {
    public static void main(String[] args)
    {
        for (int row = 1; row <= 9; row++)
        {
            int x = 0;
            for (int col = 1; col <= 3; col++)
            {
                System.out.print(x + " "+ col);
            }
            x++;
            System.out.println();
        }

    }
}
