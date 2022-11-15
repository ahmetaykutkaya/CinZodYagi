import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int birthYear,CinZod;
        String seymbol = "";
        System.out.print("Lutfen Dogum yilinizi giriniz : ");
        birthYear = input.nextInt();

        CinZod =birthYear % 12;



        switch (CinZod){

            case 0:
                seymbol="Maymun";
                break;
            case 1:
                seymbol="Horoz";
                break;
            case 2:
                seymbol="Kopek";
                break;
            case 3:
                seymbol="Domuz";
                break;
            case 4:
                seymbol="Fare";
                break;
            case 5:
                seymbol="Okuz";
                break;
            case 6:
                seymbol="Kaplan";
                break;
            case 7:
                seymbol="Tavsan";
                break;
            case 8:
                seymbol="Ejdarha";
                break;
            case 9:
                seymbol="Yilan";
                break;
            case 10:
                seymbol="At";
                break;
            case 11:
                seymbol="Koyun";
                break;
            default:
                System.out.print("...");
        }
        System.out.print("Cin Zod Yagi Burcunuz : " + seymbol);

    }
}