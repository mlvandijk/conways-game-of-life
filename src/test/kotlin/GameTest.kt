import org.example.Game
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class GameTest{

    @Test
    fun initializeGrid() {
        val game = Game(1, 1)
        assertEquals(1, game.width)
        assertEquals(1, game.height)
    }
}

