package com.charleskelly.magic.puzzles.sudoku;

import com.charleskelly.magic.puzzles.cubes.MagicCubeCharacteristics;
import com.charleskelly.magic.tuple.TupleException;
import com.charleskelly.magic.utility.MathUtilityException;

/**
 * Created by Charles on 9/27/2016.
 */
public class SudokuCharacteristics extends MagicCubeCharacteristics
{
    private int						initialPercentage;	// used in UI; how many filled/empty cells when puzzle is created
    private SudokuDifficultyEnum	sudokuDifficultyEnum;

    public SudokuCharacteristics(int order, int dimensions) throws MathUtilityException, TupleException, Exception
    {
        super(order,dimensions);
    }

    public int getInitialPercentage()
    {
        return initialPercentage;
    }

    public void setInitialPercentage(int initialPercentage)
    {
        this.initialPercentage = initialPercentage;
    }

    public SudokuDifficultyEnum getSudokuDifficultyEnum()
    {
        return sudokuDifficultyEnum;
    }

    public void setSudokuDifficultyEnum(SudokuDifficultyEnum sudokuDifficultyEnum)
    {
        this.sudokuDifficultyEnum = sudokuDifficultyEnum;
    }

    @Override
    public String toString()
    {
        return "SudokuCharacteristics [dimensions=" + dimensions
                + ", order=" + order
                + ", initialPercentage=" + initialPercentage
                + ", sudokuDifficultyEnum=" + sudokuDifficultyEnum
                + ", name=" + name + "]";
    }
}
