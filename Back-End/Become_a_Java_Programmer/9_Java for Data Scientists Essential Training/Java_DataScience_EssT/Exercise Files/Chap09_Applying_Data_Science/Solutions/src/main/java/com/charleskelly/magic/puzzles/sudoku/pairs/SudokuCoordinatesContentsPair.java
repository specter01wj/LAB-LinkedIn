package com.charleskelly.magic.puzzles.sudoku.pairs;

import com.charleskelly.magic.puzzles.cubes.MagicCube;
import com.charleskelly.magic.tuple.coordinates.CellCoordinates;

/**
 * Created by Charles on 9/27/2016.
 */
public class SudokuCoordinatesContentsPair
{
    private CellCoordinates cellCoordinates;
    private MagicCube       magicCube;

    /**
     * @throws Exception if any input parameter is null
     */
    public SudokuCoordinatesContentsPair(CellCoordinates cellCoordinates, MagicCube magicCube) throws Exception
    {
        super();	// auto-generated

        if (null == cellCoordinates)
            throw new Exception ("cellCoordinates parameter is null");
        if (null == magicCube)
            throw new Exception ("hyperSquare parameter is null");

        this.magicCube = magicCube;
        this.cellCoordinates = cellCoordinates;
    }

    public CellCoordinates getCellCoordinates()
    {
        return cellCoordinates;
    }

    public MagicCube getMagicCube()
    {
        return magicCube;
    }
}
