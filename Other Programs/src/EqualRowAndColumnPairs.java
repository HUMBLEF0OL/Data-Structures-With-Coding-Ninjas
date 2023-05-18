import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EqualRowAndColumnPairs {
    public static int equalPairs(int[][] grid) {
        HashMap<List<Integer>, Integer> rows = new HashMap<>();
        for (int i = 0; i < grid.length; i++) {
            List<Integer> currentRow = new ArrayList<>();
            for (int j = 0; j < grid[i].length; j++) {
                currentRow.add(grid[i][j]);
            }
            rows.put(currentRow, rows.getOrDefault(currentRow, 0) + 1);
        }

        HashMap<List<Integer>, Integer> columns = new HashMap<>();
        for (int i = 0; i < grid[0].length; i++) {
            List<Integer> currentColumn = new ArrayList<>();
            for (int j = 0; j < grid.length; j++) {
                currentColumn.add(grid[j][i]);
            }
            columns.put(currentColumn, columns.getOrDefault(currentColumn, 0) + 1);
        }
        int result = 0;
        for (List<Integer> currentRow : rows.keySet()) {
            if (columns.containsKey(currentRow)) {
                result += rows.get(currentRow) * columns.get(currentRow);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[][] = { { 3, 2, 1 }, { 1, 7, 6 }, { 2, 7, 7 } };
        int result = equalPairs(arr);
        System.out.println(result);
    }
}
