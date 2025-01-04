import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NumberOfIsland {
    public static int byBFS(int[][] collection) {
        Queue<Pair> queue = new LinkedList<>();
        int result = 0;

        for (int i = 0; i < collection.length; ++i) {
            for (int j = 0; j < collection[0].length; ++j) {
                if (collection[i][j] == 0) {
                    continue;
                }

                ++result;
                queue.add(new Pair(i, j));
                NumberOfIsland.lander(queue, collection);
            }
        }

        return result;
    }

    private static void lander(Queue<Pair> queue, int[][] collection) {
        Pair head = queue.remove();
        int i = head.i, j = head.j;
        collection[i][j] = 0;

        if (i + 1< collection.length && collection[i + 1][j] == 1) {
            queue.add(new Pair(i + 1, j));
        }
        if (j + 1< collection[0].length && collection[i][j + 1] == 1) {
            queue.add(new Pair(i, j + 1));
        }
        if (i - 1 >= 0 && collection[i - 1][j] == 1) {
            queue.add(new Pair(i - 1, j));
        }
        if (j - 1>= 0 && collection[i][j - 1] == 1) {
            queue.add(new Pair(i, j - 1));
        }

        if(!queue.isEmpty()){
            NumberOfIsland.lander(queue, collection);
        }
    }

    public static List<Integer> byDFS(int[][] collection) {
        List<Integer> result = new ArrayList<>();
        Queue<Integer> temp = new LinkedList<>();

        for (int i = 0; i < collection.length; ++i) {
            for (int j = 0; j < collection[0].length; ++j) {

            }
        }

        return result;
    }
}
