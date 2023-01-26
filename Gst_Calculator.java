import java.util.Scanner;

public class Gst_Calculator {
    public static void main(String args[]) {
        float Amount = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Amount : ");
        Amount = sc.nextInt();

        // Menu
        System.out.println("\t\t\t\t\tMenu\t\t\t");
        System.out.println("1 : +5%");
        System.out.println("2 : +12%");
        System.out.println("3 : +18%");
        System.out.println("4 : +21%");
        System.out.println("5 : -5%");
        System.out.println("6 : -12%");
        System.out.println("7 : -18%");
        System.out.println("8 : -21%");

        int op = sc.nextInt();

        if (op == 1) {
            // logic
            float cent = (5 * Amount) / 100;
            Amount += cent;
            float Cgst = cent / 2;
            float Sgst = cent / 2;
            float total = Math.round(Amount);
            float round = total - Amount;
            float NetPrice = Math.round(Amount - round);
            // print output
            System.out.println("Total Amount : " + NetPrice);
            System.out.println("Cgst (2.5%) : " + Cgst);
            System.out.println("Sgst (2.5%) : " + Sgst);
            System.out.printf("RoundOff : %0,2.2f", round);

        } else if (op == 2) {

            float cent = (12 * Amount) / 100;
            Amount += cent;
            float Cgst = cent / 2;
            float Sgst = cent / 2;
            float total = Math.round(Amount);
            float round = total - Amount;
            float NetPrice = Math.round(Amount - round);

            System.out.println("Total Amount : " + NetPrice);
            System.out.println("Cgst (2.5%) : " + Cgst);
            System.out.println("Sgst (2.5%) : " + Sgst);
            System.out.printf("RoundOff : %0,2.2f", round);

        } else if (op == 3) {
            float cent = (18 * Amount) / 100;
            Amount += cent;
            float Cgst = cent / 2;
            float Sgst = cent / 2;
            float total = Math.round(Amount);
            float round = total - Amount;
            float NetPrice = Math.round(Amount - round);

            System.out.println("Total Amount : " + NetPrice);
            System.out.println("Cgst (2.5%) : " + Cgst);
            System.out.println("Sgst (2.5%) : " + Sgst);
            System.out.printf("RoundOff : %0,2.2f", round);
        } else if (op == 4) {
            float cent = (21 * Amount) / 100;
            Amount += cent;
            float Cgst = cent / 2;
            float Sgst = cent / 2;
            float total = Math.round(Amount);
            float round = total - Amount;
            float NetPrice = Math.round(Amount - round);

            System.out.println("Total Amount : " + NetPrice);
            System.out.println("Cgst (2.5%) : " + Cgst);
            System.out.println("Sgst (2.5%) : " + Sgst);
            System.out.printf("RoundOff : %0,2.2f", round);

        } else if (op == 5) {
            float cent = (5 * Amount) / 100;
            Amount -= cent;
            float Cgst = cent / 2;
            float Sgst = cent / 2;
            float total = Math.round(Amount);
            float round = total - Amount;
            float NetPrice = Math.round(Amount - round);

            System.out.println("Total Amount : " + NetPrice);
            System.out.println("Cgst (2.5%) : " + Cgst);
            System.out.println("Sgst (2.5%) : " + Sgst);
            System.out.printf("RoundOff : %0,2.2f", round);

        } else if (op == 6) {
            float cent = (12 * Amount) / 100;
            Amount -= cent;
            float Cgst = cent / 2;
            float Sgst = cent / 2;
            float total = Math.round(Amount);
            float round = total - Amount;
            float NetPrice = Math.round(Amount - round);

            System.out.println("Total Amount : " + NetPrice);
            System.out.println("Cgst (2.5%) : " + Cgst);
            System.out.println("Sgst (2.5%) : " + Sgst);
            System.out.printf("RoundOff : %0,2.2f", round);
        } else if (op == 7) {
            float cent = (18 * Amount) / 100;
            Amount -= cent;
            float Cgst = cent / 2;
            float Sgst = cent / 2;
            float total = Math.round(Amount);
            float round = total - Amount;

            float NetPrice = Math.round(Amount - round);
            System.out.println("Total Amount : " + NetPrice);
            System.out.println("Cgst (2.5%) : " + Cgst);
            System.out.println("Sgst (2.5%) : " + Sgst);
            System.out.printf("RoundOff : %0,2.2f", round);
        } else if (op == 8) {
            float cent = (21 * Amount) / 100;
            Amount -= cent;
            float Cgst = cent / 2;
            float Sgst = cent / 2;
            float total = Math.round(Amount);
            float round = total - Amount;
            float NetPrice = Math.round(Amount - round);

            System.out.println("Total Amount : " + NetPrice);
            System.out.println("Cgst (2.5%) : " + Cgst);
            System.out.println("Sgst (2.5%) : " + Sgst);
            System.out.printf("RoundOff : %0,2.2f", round);
        }

    }
}