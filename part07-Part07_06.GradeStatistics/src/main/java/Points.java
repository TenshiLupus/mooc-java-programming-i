/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Angel
 */
import java.util.ArrayList;

public class Points {

    private ArrayList<Integer> pointList;

    public Points() {
        this.pointList = new ArrayList<>();
    }

    public void printStats() {
        String[] board = {"", "", "", "", "", ""};

        for (Integer i : pointList) {
            if (i < 50) {
                board[0] += "*";
            } else if (i < 60) {
                board[1] += "*";
            } else if (i < 70) {
                board[2] += "*";
            } else if (i < 80) {
                board[3] += "*";
            } else if (i < 90) {
                board[4] += "*";
            } else {
                board[5] += "*";
            }   
        }
        for (int row = board.length - 1; row >= 0; row--) {
            System.out.println(row + ": " + board[row]);
        }
    }

    public void add(int points) {
        if (points >= 0 && points <= 100) {
            this.pointList.add(points);
        }
    }

    public void printPassingAverage() {
        int size = 0;
        int amount = 0;
        for (Integer i : pointList) {
            if (i > 50) {
                size += 1;
                amount += i;
            }
        }
        String printOut = "Point average (passing): ";
        if (size == 0) {
            printOut += "-";
        } else {
            printOut += (amount * 1.0 / size);
        }
        System.out.println(printOut);

    }

    public double getPassingPercentage() {
        int size = 0;
        for (Integer i : pointList) {
            if (i >= 50) {
                size++;
            }
        }
        return (size * 100.0 / pointList.size());
    }

    public void passingGrade() {
        int sum = 0;

        for (Integer i : pointList) {
            sum += i;

        }
        String printOut = "Point average (all): " + (sum * 1.0 / pointList.size());
        System.out.println(printOut);
    }

    public void printPercentage() {
        System.out.println("Pass percentage: " + getPassingPercentage());
    }

}
