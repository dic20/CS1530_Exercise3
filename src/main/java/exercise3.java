public class exercise3 {
    public static void main(String[] args) {
        try {
            String methodOption = args[0].toLowerCase();
            int positiveInteger = Integer.parseInt(args[1]);

            if (!methodOption.equals("lazy") && !methodOption.equals("triangle")) {
                System.out.println("First argument must be either 'lazy' or 'triangle'. Exiting error code 2");
                System.out.println(methodOption);
                System.exit(2);
            }

            if (positiveInteger < 0 || positiveInteger > 2147483647) {
                System.out.println("Second argument must be a positive 32-bit integer. Exiting error code 2");
                System.exit(2);
            }

            switch (methodOption) {
                case "triangle":
                    System.out.println("Tri("+positiveInteger+") = " + Tri(positiveInteger));
                break;
                case "lazy":
                    System.out.println("Lazy("+positiveInteger+") = " + lazy(positiveInteger));
                break;
            }

        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Please enter in the required two arguments: 'lazy' or 'triangle' and a positive 32-bit integer");
        }
    }

    public static int Tri(int n) {
        return n*(n+1)/2;
    }

    public static int lazy(int n) {
        return (n*n + n + 2)/2;
    }
}