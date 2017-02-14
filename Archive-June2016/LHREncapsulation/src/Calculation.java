/**
 * Created by ZHONG on 2016/6/2.
 * Perform calculations in this class.
 */
public class Calculation
{
    public void calc(String compString)
    {
        int i = 0;
        if (compString.contains("+"))
        {
            i = 1;
        }
        if (compString.contains("-"))
        {
            i = 2;
        }
        if (compString.contains("*"))
        {
            i = 3;
        }
        if (compString.contains("/"))
        {
            i = 4;
        }
        if (compString.contains("%"))
        {
            i = 5;
        }
        System.out.println("i--" + "i" + "    " + "compString--" + compString);

        switch (i)
        {
            case 1:
                String s1[] = compString.toString().split("\\+");
                System.out.println(Integer.parseInt(s1[0]) + Integer.parseInt(s1[1]));
                break;
            case 2:
                String s2[] = compString.toString().split("-");
                System.out.println(Integer.parseInt(s2[0]) - Integer.parseInt(s2[1]));
                break;
            case 3:
                String s3[] = compString.toString().split("\\*");
                System.out.println(Integer.parseInt(s3[0]) * Integer.parseInt(s3[1]));
                break;
            case 4:
                String s4[] = compString.toString().split("/");
                System.out.println(Integer.parseInt(s4[0]) / Integer.parseInt(s4[1]));
                break;
            case 5:
                String s5[] = compString.toString().split("%");
                System.out.println(Integer.parseInt(s5[0]) % Integer.parseInt(s5[1]));
                break;
        }
    }
}

