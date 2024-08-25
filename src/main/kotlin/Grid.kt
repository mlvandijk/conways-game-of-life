package org.example

data class Grid(val width: Int, val height: Int) {

    val grid = create2DArray(width, height)
    
    private fun create2DArray(width: Int, height: Int): Array<Array<CellStatus>> {
        return Array(height) { Array(width) { CellStatus.DEAD } }
    }

    fun getCellStatus(x: Int, y: Int): CellStatus {
        return grid[y][x]
    }
}
