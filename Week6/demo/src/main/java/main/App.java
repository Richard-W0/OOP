package main;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Boolean exit = false;
        while (exit = false) {
            System.out.println("1) Lisää soitin");
            System.out.println("2) Listaa soittimet");
            System.out.println("3) Viritä kielisoittimet");
            System.out.println("4) Soita rumpuja");
            System.out.println("0) Lopeta");

            String choice = input.nextLine();
            Int number = Integer.parseInt(choice);

            switch (number) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 0:
                    exit = true;
                    break;

            }
        }
    }
}
