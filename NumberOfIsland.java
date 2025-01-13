import java.util.LinkedList;
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
                NumberOfIsland.landerBFS(queue, collection);
            }
        }

        return result;
    }

    private static void landerBFS(Queue<Pair> queue, int[][] collection) {
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
            NumberOfIsland.landerBFS(queue, collection);
        }
    }

    public static int byDFS(int[][] collection) {
        int result = 0;

        for (int i = 0; i < collection.length; ++i) {
            for (int j = 0; j < collection[0].length; ++j) {
                if(collection[i][j] == 1){
                    ++result;
                    landerDFS(i, j, collection);
                }
            }
        }

        return result;
    }

    private static void landerDFS(int i, int j, int[][] collection){
        if(collection[i][j] == 0){
            return;
        }
        collection[i][j] = 0;

        if(i + 1 < collection.length){
            landerDFS(i + 1, j, collection);
        }
        if(j + 1 < collection[0].length){
            landerDFS(i, j + 1, collection);
        }
        if(i - 1 >= 0){
            landerDFS(i - 1, j, collection);
        }
        if(j - 1 >= 0){
            landerDFS(i, j - 1, collection);
        }
    }
}
