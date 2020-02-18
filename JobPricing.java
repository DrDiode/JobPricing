import java.util.Scanner;

public class JobPricing
{
    public static void main(String[] args)
    {
        // Variables and constants
        final double JOB_HOURS = 35;
        double hrsWork;
        final double DAYS_HOURS = 35;
        double hrsDrive;
        Scanner keyboard = new Scanner(System.in);

        // Input phase
        System.out.print("How many hours of work have been done? >>");
        hrsWork = keyboard.nextDouble();

        System.out.print("How many hours did you drive? >> ");
        hrsDrive = keyboard.nextDouble();

        // Output phase
        System.out.print(hrsWork * JOB_HOURS + hrsDrive * DAYS_HOURS);
    }
}