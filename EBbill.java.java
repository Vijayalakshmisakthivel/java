import java.util.Scanner;

public class EBBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int prev, curr, units;
        double bill = 0;
        char type;

        System.out.print("Enter Previous Reading: ");
        prev = sc.nextInt();

        System.out.print("Enter Current Reading: ");
        curr = sc.nextInt();

        System.out.print("Enter Connection Type (D/C): ");
        type = sc.next().charAt(0);

        units = curr - prev;

        if (type == 'D' || type == 'd') {
            if (units <= 100)
                bill = 0;
            else if (units <= 200)
                bill = units * 2;
            else if (units <= 500)
                bill = units * 4;
            else
                bill = units * 6;
        } else {
            if (units <= 100)
                bill = units * 2;
            else if (units <= 200)
                bill = units * 4;
            else if (units <= 500)
                bill = units * 6;
            else
                bill = units * 7;
        }

        System.out.println("Units Consumed = " + units);
        System.out.println("EB Bill = Rs. " + bill);

        sc.close();
    }
}
