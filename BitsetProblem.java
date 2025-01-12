/*
Java's BitSet class implements a vector of bit values (i.e.:  () or  ()) that grows as needed, allowing us to easily manipulate bits while optimizing space (when compared to other collections). Any element having a bit value of  is called a set bit.

Given  BitSets,  and , of size  where all bits in both BitSets are initialized to , perform a series of  operations. After each operation, print the number of set bits in the respective BitSets as two space-separated integers on a new line.

Input Format

The first line contains  space-separated integers,  (the length of both BitSets  and ) and  (the number of operations to perform), respectively.
The  subsequent lines each contain an operation in one of the following forms:

AND 
OR 
XOR 
FLIP
SET 

*/
import java.util.BitSet;
import java.util.Scanner;

public class BitsetProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the input values
        int n = scanner.nextInt();  // Size of the BitSets
        int m = scanner.nextInt();  // Number of operations
        
        BitSet bitset1 = new BitSet(n);
        BitSet bitset2 = new BitSet(n);
        
        // Process each operation
        for (int i = 0; i < m; i++) {
            String operation = scanner.next();
            
            switch (operation) {
                case "AND":
                    // Read operands, operation updates bitset1
                    int andX = scanner.nextInt() - 1; // 1-based to 0-based index
                    int andY = scanner.nextInt() - 1; // 1-based to 0-based index
                    if (andX == 0 && andY == 1) {
                        bitset1.and(bitset2);  // AND operation between bitset1 and bitset2
                    } else if (andX == 1 && andY == 0) {
                        bitset2.and(bitset1);  // AND operation between bitset2 and bitset1
                    }
                    break;
                    
                case "OR":
                    // Read operands, operation updates bitset1
                    int orX = scanner.nextInt() - 1;  // 1-based to 0-based index
                    int orY = scanner.nextInt() - 1;  // 1-based to 0-based index
                    if (orX == 0 && orY == 1) {
                        bitset1.or(bitset2);  // OR operation between bitset1 and bitset2
                    } else if (orX == 1 && orY == 0) {
                        bitset2.or(bitset1);  // OR operation between bitset2 and bitset1
                    }
                    break;
                    
                case "XOR":
                    // Read operands, operation updates bitset1
                    int xorX = scanner.nextInt() - 1;  // 1-based to 0-based index
                    int xorY = scanner.nextInt() - 1;  // 1-based to 0-based index
                    if (xorX == 0 && xorY == 1) {
                        bitset1.xor(bitset2);  // XOR operation between bitset1 and bitset2
                    } else if (xorX == 1 && xorY == 0) {
                        bitset2.xor(bitset1);  // XOR operation between bitset2 and bitset1
                    }
                    break;
                    
                case "FLIP":
                    // Flip operation on bitset X at index i
                    int flipX = scanner.nextInt() - 1;
                    int flipIndex = scanner.nextInt() - 1;  // 1-based to 0-based index
                    if (flipX == 0) bitset1.flip(flipIndex); // Flip bitset1
                    else bitset2.flip(flipIndex);            // Flip bitset2
                    break;
                    
                case "SET":
                    // Set operation on bitset X at index i
                    int setX = scanner.nextInt() - 1;
                    int setIndex = scanner.nextInt() - 1;  // 1-based to 0-based index
                    if (setX == 0) bitset1.set(setIndex);  // Set bitset1
                    else bitset2.set(setIndex);             // Set bitset2
                    break;
            }
            // Print the number of set bits in both BitSets
            System.out.println(bitset1.cardinality() + " " + bitset2.cardinality());
        }
        
        scanner.close();
    }
}
