package src.main.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SumOfDaigonal2dList {

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here'
        int firstDaigonal = 0;
        int secondDaignal = 0;

        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).size(); j++) {
                if (i == j) {
                    firstDaigonal += arr.get(i).get(j);
                }
                if (i + j == arr.size() - 1) {
                    secondDaignal += arr.get(i).get(j);
                }
            }
        }
        return Math.abs(firstDaigonal - secondDaignal);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(Arrays.asList(1,2,3));
        arr.add(Arrays.asList(9,8,7));
        arr.add(Arrays.asList(5,2,3));

        diagonalDifference(arr);
    }
}
