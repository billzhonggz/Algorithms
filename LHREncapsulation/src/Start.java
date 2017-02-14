import java.util.Scanner;

/**
 * Created by ZHONG on 2016/6/2.
 * This is the entrance of the program.
 * To call methods in calculation class.
 */
public class Start
{
    public static void main (String[] args)
    {
        System.out.print("> java Comp（Only integers are supported.）      ");
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        //Create object according to calculation class.
        Calculation c = new Calculation();
        c.calc(input);
    }
}
