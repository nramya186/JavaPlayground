package org.section3.operators;

public class BitMasking_Merging {
    //Check if a bit is set: (number & (1 << pos)) != 0 checks if a bit at position pos is 1.
    //Set a bit: number |= (1 << pos) sets the bit at position pos to 1.
    //Clear a bit: number &= ~(1 << pos) clears the bit at position pos, setting it to 0.
    //Toggle a bit: number ^= (1 << pos) flips the bit at position pos (changes 1 to 0 or 0 to 1).
    //Update a bit: (number & ~(1 << pos)) | (value << pos) updates the bit at position pos to value.

    public static void main(String[] args) {
        int number = 0b1010; // Original number (10 in decimal)
        System.out.println("orignal num :" + number);
        System.out.println("Original number in binary: " + Integer.toBinaryString(number));

        // Check if a specific bit is set (e.g., 3rd bit)
        int posCheck = 3;
        boolean isSet = (number & (1 << posCheck)) != 0;
        System.out.println("Is the 3rd bit set? " + isSet);

        // Set a specific bit (e.g., set the 1st bit)
        int posSet = 1;
        number |= (1 << posSet);
        System.out.println("After setting the 1st bit: " + Integer.toBinaryString(number));

        // Clear a specific bit (e.g., clear the 3rd bit)
        int posClear = 3;
        number &= ~(1 << posClear);
        System.out.println("After clearing the 3rd bit: " + Integer.toBinaryString(number));

        // Toggle a specific bit (e.g., toggle the 1st bit)
        int posToggle = 1;
        number ^= (1 << posToggle);
        System.out.println("After toggling the 1st bit: " + Integer.toBinaryString(number));

        // Update a specific bit (e.g., update the 2nd bit to 1)
        int posUpdate = 2;
        int value = 1; // New value for the bit (0 or 1)
        number = (number & ~(1 << posUpdate)) | (value << posUpdate);
        System.out.println("After updating the 2nd bit to 1: " + Integer.toBinaryString(number));

        // Update a specific bit (e.g., update the 2nd bit to 0)
        value = 0; // New value for the bit (0 or 1)
        number = (number & ~(1 << posUpdate)) | (value << posUpdate);
        System.out.println("After updating the 2nd bit to 0: " + Integer.toBinaryString(number));
    }
    }

