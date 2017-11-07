public class TreeBuilder {
    Input in = new Input();
    private int d = in.getDirection();
    private int h = in.getHeight();
    private char s = in.getSign();

    public void start(){

    }

    public TreeBuilder() {

        switch (d) {
            case 1:
                for (int i = 1; i <= h ; i++)
                {
                    for (int j = 1; j <= ((2 * h) - 1); j++)
                    {
                        if (j <= (h - i) || j >= (h + i))
                            System.out.print(" ");
                        else
                            System.out.print(s);
                    }
                    System.out.println("");
                }
                break;
            case 3:
                for (int i = 1; i <= h; i++)
                {
                    for (int j = 1; j <= ((2 * h) - 1); j++)
                    {
                        if (j < i || j > ((2 * h) - i))
                            System.out.print(" ");
                        else
                            System.out.print(s);
                    }
                    System.out.println("");

                }   break;
            case 2:
                for (int i = 1; i <= ((2 * h) - 1); i++)
                {
                    for (int j = 1; j <= h; j++)
                    {
                        if (j <= i && i<= h)
                            System.out.print(s);
                        else if (i > h && j <= (h - (i % h) ))
                            System.out.print(s);
                        else
                            System.out.print(" ");
                    }
                    System.out.println("");
                }   break;
            case 4:
                for (int i = 1; i <= ((2 * h) - 1); i++)
                {
                    for (int j = 1; j <= h; j++)
                    {
                        if (j <= (h - i) && i<= h)
                            System.out.print(" ");
                        else if (i > h && j <= (i - h))
                            System.out.print(" ");
                        else
                            System.out.print(s);
                    }
                    System.out.println("");
                }   break;
            default:
                System.out.println("Zamknięcie programu");
                System.exit(0);
        }
    }
}
