# Hotel Occupancy Calculator

## Overview

This Java program calculates the occupancy rate of a hotel based on user input for the number of floors, the number of rooms on each floor, and the number of occupied rooms on each floor. The program provides a detailed summary, including the total number of rooms, occupied rooms, vacant rooms, and the percentage of rooms that are occupied. The program skips the 13th floor, following the traditional practice of most hotels.

## Features

- **User Input Handling:** Uses `JOptionPane` for a user-friendly interface to gather input for the number of floors, rooms, and occupancy details.
- **Input Validation:** Ensures the user inputs are valid:
  - The number of floors must be at least 1.
  - The number of rooms on each floor must be at least 10.
  - The number of occupied rooms cannot exceed the number of rooms on that floor.
- **Skip the 13th Floor:** Automatically skips the 13th floor when collecting room and occupancy data.
- **Occupancy Rate Calculation:** Computes the total number of rooms, occupied rooms, vacant rooms, and occupancy rate as a percentage.
- **Formatted Output:** Displays results using `JOptionPane` in a well-formatted and easy-to-read manner.

## Getting Started

### Prerequisites

To run this program, you need to have the following installed on your system:

- Java Development Kit (JDK) 8 or higher
- NetBeans IDE or any other Java-compatible IDE (e.g., Eclipse, IntelliJ IDEA)

### Installation

1. Clone this repository to your local machine using:

   ```bash
   git clone https://github.com/yourusername/hotel-occupancy-calculator.git
