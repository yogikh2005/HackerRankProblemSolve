/*
Let's play a game on an array! You're standing at index  of an -element array named . From some index  (where ), you can perform one of the following moves:

Move Backward: If cell  exists and contains a , you can walk back to cell .
Move Forward:
If cell  contains a zero, you can walk to cell .
If cell  contains a zero, you can jump to cell .
If you're standing in cell  or the value of , you can walk or jump off the end of the array and win the game.
In other words, you can move from index  to index , , or  as long as the destination index is a cell containing a . If the destination index is greater than , you win the game.

Function Description

Complete the canWin function in the editor below.

canWin has the following parameters:

int leap: the size of the leap
int game[n]: the array to traverse
*/

import java.util.*;

public class Array1D {

    public static boolean canWin(int leap, int[] game) {
        return canWinRecursive(leap, game, 0);
    }

    // Helper method to recursively check possible moves
    private static boolean canWinRecursive(int leap, int[] game, int position) {
        int n = game.length;
        
        // Base case: If position is beyond the last index, you win
        if (position >= n) {
            return true;
        }
        
        // If position is out of bounds or cell is blocked, return false
        if (position < 0 || game[position] == 1) {
            return false;
        }
        
        // Mark the current cell as visited by setting it to 1
        game[position] = 1;

        // Check all possible moves: jump forward, move forward, or move backward
        return canWinRecursive(leap, game, position + leap) ||  // Jump forward
               canWinRecursive(leap, game, position + 1) ||     // Move forward
               canWinRecursive(leap, game, position - 1);       // Move backward
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();  // Number of queries
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println((canWin(leap, game)) ? "YES" : "NO");
        }
        scan.close();
    }
}
