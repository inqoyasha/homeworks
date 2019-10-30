package org.azamat.homeworks.hw1.printRect;

public class Printer {
    void rect(int size) {
        for (int row = 1; row <= size; ++row) {
            for (int col = 1; col <= size; ++col) {
                System.out.print("#");
            }
            System.out.println("");
        }
    }
    void reverseTriangle(int size) {
        for (int row = 1; row <= size; ++row) {
            for (int col = 1; col <= size-row+2; ++col) {
                if (col != size-row+2) System.out.print("#");
            }
            System.out.println("");
        }
    }
    void printZ(int size) {
        for (int row = 1; row <= size; ++row) {
            for (int col = 1; col <= size; ++col) {
                if (row!=1 && row!=size) {
                    if (col+row==size+1) System.out.print("# "); else System.out.print("  ");
                } else System.out.print("# ");
            }
            System.out.println("");
        }
    }
    void printXInRect(int size) {
        for (int row = 1; row <= size; ++row) {
            for (int col = 1; col <= size; ++col) {
                if (row!=1 && row!=size) {
                    if (col+row==size+1 || col==row) System.out.print("# "); else if (col!=1 && col!=size) System.out.print("  "); else System.out.print("# ");
                } else System.out.print("# ");
            }
            System.out.println("");
        }
    }
}
