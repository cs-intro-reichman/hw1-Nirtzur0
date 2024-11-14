// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) { 
        String diner1 = args[2];
        String diner2 = args[1];
        String diner3 = args[0];
        int totalAmount = Integer.parseInt(args[3]);

        double amountPerDiner = Math.ceil(totalAmount / 3.0);
        System.out.println("Dear " + diner1 + ", " + diner2 + ", and " + diner3 + ": pay " + amountPerDiner + " Shekels each.");
	}
}
