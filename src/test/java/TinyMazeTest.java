import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TinyMazeTest {
    @Test
    public void singleRowMaze() {
        String[][] maze = {
                {"S", "E"}
        };
        TinyMaze tm = new TinyMaze(maze);
        String[][] solution = {
                {"x", "x"}
        };
        assertArrayEquals(solution, tm.solve());
    }
}
