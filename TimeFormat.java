// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
        // Parse hours and minutes from the "hh:mm" input
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));

        // Determine AM or PM
        String period = (hours < 12) ? "AM" : "PM";

        // Convert hours for 12-hour format, treating midnight separately as "0:00 AM"
        if (hours == 0) {
            hours = 0;  // Midnight case
        } else if (hours > 12) {
            hours -= 12;
        }

        // Print formatted output
        System.out.print(hours + ":");
        System.out.print((minutes < 10 ? "0" : "") + minutes + " ");
        System.out.println(period);
	}
}