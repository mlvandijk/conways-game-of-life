import org.example.Game
import org.example.Grid
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.awt.GridLayout

class GameTest{

    @Test
    fun initializeGrid() {
        val grid = Grid(1, 1)
        val game = Game(grid)
        assertEquals(1, game.grid.width)
        assertEquals(1, game.grid.height)
    }
}

