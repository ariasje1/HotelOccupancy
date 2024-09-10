/*
Author: Jesus Arias
GitHub username: ariasje1
Date: 09/08/2024
Description: The HotelOccupancy class calculates the total number of rooms and occupancy rate of a hotel 
*/

package hoteloccupancy;
import javax.swing.JOptionPane;

public class HotelOccupancy {

    public static void main(String[] args) {
        // Variable to store the number of floors in the hotel
        int numberOfFloors;
        
        // Input for number of floors with validation (must be at least 1)
        do {
            String floors = JOptionPane.showInputDialog("Enter the number of floors in the hotel");
            numberOfFloors = Integer.parseInt(floors); 
        } while (numberOfFloors < 1); // Repeat until a valid number is entered

        // Variables to store total number of rooms and total occupied rooms
        int total_rooms = 0;
        int total_occupancy = 0;
        
        // Loop through each floor to get the number of rooms and occupancy details
        for (int floor = 1; floor <= numberOfFloors; floor++) {
            // Skip floor 13 as per hotel convention
            if (floor == 13) {
                continue; // Skip this iteration
            }   
            
            int numberOfRooms; // Number of rooms on the current floor
            int numberOfOccupancy; // Number of occupied rooms on the current floor
            
            // Input for the number of rooms on the current floor with validation (must be at least 10)
            do {
                String rooms = JOptionPane.showInputDialog("Enter the number of rooms on floor " + floor + " of the hotel");
                numberOfRooms = Integer.parseInt(rooms);
            } while (numberOfRooms < 10); // Repeat until a valid number is entered
            
            // Input for the number of occupied rooms with validation (must be between 0 and numberOfRooms)
            do {
                String occupied = JOptionPane.showInputDialog("Enter the number of rooms on floor " + floor + " that are occupied");
                numberOfOccupancy = Integer.parseInt(occupied);
            } while (numberOfOccupancy < 0 || numberOfOccupancy > numberOfRooms); // Repeat until a valid number is entered
            
            // Accumulate the total number of rooms and occupied rooms
            total_rooms += numberOfRooms;
            total_occupancy += numberOfOccupancy;
        }

        // Calculate the total number of vacant rooms
        int total_vacancy = total_rooms - total_occupancy;
        
        // Calculate the occupancy rate as a percentage
        double occupancy_rate = ((double)total_occupancy / total_rooms) * 100;
        
        // Display the results to the user
        JOptionPane.showMessageDialog(null, "There are a total of " + total_rooms + " rooms in the hotel.\n"
            + "There are a total of " + total_occupancy + " rooms that are occupied.\n"
            + "The number of rooms that are vacant is " + total_vacancy + ".\n"
            + "The occupancy rate is " + String.format("%.2f", occupancy_rate) + "%.");
    }
}
