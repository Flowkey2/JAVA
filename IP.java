import java.util.*;

class IP {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter IP address: ");
        String s = sc.nextLine();
        String[] tokens = s.split("\\.");
        boolean valid = true;

        if(tokens.length != 4 || s.startsWith(".") || s.endsWith(".")) {
            valid = false;
        } else {
            for(String token : tokens) {
                try {
                    int num = Integer.parseInt(token);
                    if(num < 0 || num > 255) {
                        valid = false;
                        break;
                    }
                } catch(NumberFormatException e) {
                    valid = false;
                    break;
                }
            }
        }

        if(valid) {
            System.out.println("Valid IP address");
        } else {
            System.out.println("Invalid IP address");
        }
        sc.close();
    }
}

