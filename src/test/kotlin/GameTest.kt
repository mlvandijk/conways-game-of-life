import org.example.CellStatus
import org.example.Grid
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class GameTest{

    @Test
    fun initializeGridWithDeadCell() {
        val grid = Grid(1, 1)
        assertEquals(CellStatus.DEAD, grid.getCellStatus(0, 0))
    }
}

