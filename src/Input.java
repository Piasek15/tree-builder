import java.util.Scanner;

public class Input {
    Scanner scanner = new Scanner(System.in);

    private static char sign; //= scanner.next().charAt(0);
    private static int height; // = scanner.nextInt();
    private static int direction; // = scanner.nextInt();


    public void checker() {
        while ((direction != 1) && (direction != 2) && (direction != 3) && (direction != 4) && (direction != 5)){
            System.out.println("Wybrano niepoprawny kierunek \n" + "Podaj kierunek rysowania: (1 - góra, 2 - prawo, 3 - dół, 4 - lewo) \n" + "Lub: (5 - wyjdź)");
            direction = scanner.nextInt();
        }
    }

    public void input() {
        System.out.println("Podaj znak, z którego ma być narysowana choinka: ");
        setSign(scanner.next().charAt(0));
        System.out.println("");

        System.out.println("Podaj wysokość choinki: ");
        setHeight(scanner.nextInt());
        System.out.println("");

        System.out.println("Podaj kierunek rysowania: \n" + "(1 - góra, 2 - prawo, 3 - dół, 4 - lewo) \n" + "Lub: (5 - wyjdź)");
        setDirection(scanner.nextInt());
        System.out.println("");
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public char getSign() {
        return sign;
    }

    public int getHeight() {
        return height;
    }

    public int getDirection() {
        return direction;
    }






}
