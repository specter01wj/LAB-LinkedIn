package com.charleskelly.magic;

import com.charleskelly.magic.puzzles.cubes.MagicCubeTest;
import com.charleskelly.magic.puzzles.cubes.adjacency.AdjacencyMatrixTest;
import com.charleskelly.magic.puzzles.cubes.MagicCubeCharacteristicsTest;
import com.charleskelly.magic.tuple.TestTuplePrinting;
import com.charleskelly.magic.tuple.TupleTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * Created by Charles Kelly.
 */

@RunWith(Suite.class)
@SuiteClasses
(
    {
            TupleTest.class,
            TestTuplePrinting.class,

            AdjacencyMatrixTest.class,
            MagicCubeCharacteristicsTest.class,
            MagicCubeTest.class
    }
)
public class MagicTestSuite
{
    MagicTestSuite()
    {

    }
}
