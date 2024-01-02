package sudoku.problemdomain;

import sudoku.computationLogic.SudokuUtilities;
import sudoku.constants.GameState;

import java.io.Serializable;

public class SudokuGame implements Serializable {
    private final GameState gameState;
    private final int[][] gridState;

    public static final int GRID_BOUNDARY = 9;
    //constructors and getters
    public SudokuGame(GameState gameState, int[][] gridState) {
        this.gameState = gameState;
        this.gridState = gridState;
    }

    public GameState getGameState() {
        return gameState;
    }

    //immutable getter here. to protect the obj of the game so that no one can mess with it
    public int[][] getCopyofGridState() {
        return SudokuUtilities.copyToNewArray(gridState);
    }
}

