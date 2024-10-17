package edu.grinnell.csc207.util;

import static edu.grinnell.csc207.util.MatrixAssertions.assertMatrixEquals;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

/**e
 * A variety of tests for the Matrix class.
 *
 * @author Paden Houck
 */
class TestsByPaden {
    /**
     * Make sure that we can construct matrices.
     */
    @Test
    public void testConstruct() {
  
      Matrix<Integer> matrix1x1 = new MatrixV0<Integer>(1, 1);
      assertMatrixEquals(new Integer[][] {{null}}, matrix1x1,
          "default 1x1 matrix");
    }

} // TestMatrix
