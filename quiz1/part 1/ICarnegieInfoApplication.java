import  java.io.*;




    /* DOCUMENT THIS CLASS */
    public class ICarnegieInfoApplication {

        private static BufferedReader stdIn =
                new BufferedReader(new InputStreamReader(System.in));
        private static PrintWriter stdOut =
                new PrintWriter(System.out, true);
        private static PrintWriter stdErr =
                new PrintWriter(System.err, true);

        /* DOCUMENT THIS PUBLIC METHOD */
        public static void main(String[] args) throws IOException {

            ICarnegieInfo companyInfo = ICarnegieInfo.getInstance();

            int choice = getChoice();

            while (choice != 0) {

                if (choice == 1) {
                    stdOut.println(companyInfo.getName());
                } else if (choice == 2) {
                    stdOut.println(companyInfo.getAddress());
                } else if (choice == 3) {
                    stdOut.println(companyInfo.getTelephone());
                } else if (choice == 4) {
                    stdOut.println(companyInfo.getEmail());
                } else if (choice == 5) {
                    stdOut.println(companyInfo.getUrl());
                }

                choice = getChoice();
            }
        }

        private static int getChoice() throws IOException {
        /* PLACE YOUR CODE HERE */
        do {
            int value;
            try {
                System.out.println("0 – Quit");
                System.out.println("1 – Display name");
                System.out.println("2 – Display address");
                System.out.println("3 – Display telephone");
                System.out.println("4 – Display email");
                System.out.println("5 – Display URL");
                System.out.print("choice>");
                System.out.flush();

                value = Integer.parseInt(stdIn.readLine());

                if (value < 0 | value > 5) {
                    System.out.println("Invalid choice: " + value);
                }
                return value;

            } catch (NumberFormatException nfe) {
                stdErr.println(nfe);
            }
        }while(true);



        }
    }