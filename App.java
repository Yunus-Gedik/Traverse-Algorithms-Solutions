public class App {
    public static void main(String[] args) throws Exception {

        int[][] map = {
            {0,1,1,1,0},
            {0,1,1,1,1},
            {1,0,0,1,1},
            {0,0,1,0,0}
        };

        // System.out.println(NumberOfIsland.byBFS(map));
        System.out.println(NumberOfIsland.byDFS(map));
    }
}