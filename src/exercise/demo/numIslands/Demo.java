package exercise.demo.numIslands;

public class Demo {
    public static void main(String[] args) {
        char[][] grid = new char[][]{{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};
        new NumLslands().numIslands(grid);
    }
}
