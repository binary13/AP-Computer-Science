package ch09;

/**
 * Implements a 2-D array of characters
 */

public class CharMatrix
{
  // Fields:
  private char[][] matrix;


  /**
   * Constructor: creates a grid with dimensions rows, cols,
   * and fills it with spaces
   */
  public CharMatrix(int rows, int cols)
  {
    matrix = new char[rows][cols];

    for(char[] row : matrix)
      for(char elem : row)
        elem = ' ';
  }

  /**
   * Constructor: creates a grid with dimensions rows , cols ,
   * and fills it with the fill character
   */
  public CharMatrix(int rows, int cols, char fill)
  {
    matrix = new char[rows][cols];

    for(char[] row : matrix)
      for(char elem : row)
        elem = fill;
  }

  /**
   * Returns the number of rows in grid
   */
  public int numRows()
  {
    return matrix.length;
  }

  /**
   * Returns the number of columns in grid
   */
  public int numCols()
  {
    return matrix[0].length;
  }

  /**
   * Returns the character at row, col location
   */
  public char charAt(int row, int col)
  {
    return matrix[row][col];
  }

  /**
   * Sets the character at row, col location to ch
   */
  public void setCharAt(int row, int col, char ch)
  {
    matrix[row][col] = ch;
  }

  /**
   * Returns true if the character at row, col is a SPACE,
   * false otherwise
   */
  public boolean isEmpty(int row, int col)
  {
    return matrix[row][col] == ' ';
  }

  /**
   * Fills the given rectangle with the fill characters.
   * row0, col0 is the upper left corner and row1, col1 is the
   * lower right corner of the rectangle.
   */
  public void fillRect(int row0, int col0, int row1, int col1, char fill)
  {
    for(int row = row0; row <= row1; row++)
      for(int col = col0; col <= col1; col++)
        matrix[row][col] = fill;
  }

  /**
   * Fills the given rectangle with the SPACE characters.
   * row0, col0 is the upper left corner and row1, col1 is the
   * lower right corner of the rectangle.
   */
  public void clearRect(int row0, int col0, int row1, int col1)
  {
    for(int row = row0; row <= row1; row++)
      for(int col = col0; col <= col1; col++)
        matrix[row][col] = ' ';
  }

  /**
   * Returns the count of all non-SPACE characters in row.
   */
  public int countInRow(int row)
  {
    int limit = numCols();
    int count = 0;
    for(int i = 0; i < limit; i++)
      if(matrix[row][i] != ' ')
        count++;

    return count;
  }

  /**
   * Returns the count of all non-SPACE characters in col.
   */
  public int countInCol(int col)
  {
    int limit = numRows();
    int count = 0;
    for(int i = 0; i < limit; i++)
      if(matrix[i][col] != ' ')
        count++;

    return count;
  }
}
