package Lecture10;

import java.util.ArrayList;

public class Solution {
    public void setZeroes(ArrayList<ArrayList<Integer>> matrix) {
        int numRows = matrix.size();
        int numCols = matrix.get(0).size();
        
        // Arrays to mark zero rows and columns
        ArrayList<Boolean> zeroRow = new ArrayList<>(numRows);
        ArrayList<Boolean> zeroColumn = new ArrayList<>(numCols);
        
        // Initialize zeroRow and zeroColumn arrays
        for (int i = 0; i < numRows; i++) zeroRow.add(false);
        for (int j = 0; j < numCols; j++) zeroColumn.add(false);
        
        // First pass: mark the rows and columns that need to be zeroed
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (matrix.get(i).get(j) == 0) {
                    zeroRow.set(i, true);
                    zeroColumn.set(j, true);
                }
            }
        }

        // Second pass: set elements to 0 if their row or column is marked
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (zeroRow.get(i) || zeroColumn.get(j)) {
                    matrix.get(i).set(j, 0);
                }
            }
        }
    }

    // Method to display matrix (ArrayList version)
    public void displayMatrix(ArrayList<ArrayList<Integer>> matrix) {
        for (ArrayList<Integer> row : matrix) {
            for (Integer element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    // Main method to test the solution
    public static void main(String[] args) {
        // Create an instance of Solution class
        Solution sol = new Solution();
        
        // Initializing the matrix using ArrayLists
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(List.of(1, 1, 1)));
        matrix.add(new ArrayList<>(List.of(1, 0, 1)));
        matrix.add(new ArrayList<>(List.of(1, 1, 1)));
        
        System.out.println("Original Matrix:");
        sol.displayMatrix(matrix);
        
        // Call the setZeroes method
        sol.setZeroes(matrix);
        
        System.out.println("Matrix after setting zeroes:");
        sol.displayMatrix(matrix);
    }
}
    

