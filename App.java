public class App {
    public static void main(String[] args) throws Exception {

        int[][] map = {
            {0,1,1,1,0},
            {1,1,0,1,0},
            {1,1,0,0,0},
            {0,0,1,0,1}
        };

        System.out.println(NumberOfIsland.byBFS(map));
    }
}
