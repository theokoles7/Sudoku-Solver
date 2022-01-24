package Classes;

public class CelledPuzzle {
  public Cell[][] grid;

  //==============================================================
  // Constructors
  //==============================================================

  public CelledPuzzle(){
    this.grid = new Cell[9][9];
  }

  public CelledPuzzle(int[][] g){
    this.grid = new Cell[9][9];
    for(int r = 0; r < g.length; r++){
      for(int c = 0; c < g.length; c++){
        this.grid[r][c] = new Cell(g[r][c]);
      }
    }
  }

  //==============================================================
  // Blanks
  //==============================================================

  /**
   * Returns the quantity of blanks cells in specified row
   * @param r [int] Row to be analyzed
   * @return [int] Quantity of blanks cells in row r
   */
  public int blankInRow(int r){
    int blanks = 0;
    for(Cell c : grid[r]){
      if(c.getVal() == 0){blanks++;}
    }
    return blanks;
  }

  /**
   * Returns the quantity of blank cells in specified column
   * @param c [int] Column to be analyzed
   * @return [int] Qantity of blanks in column c
   */
  public int blankInCol(int c){
      int blanks = 0;
      for(int r = 0; r < grid.length; r++){
          if(grid[r][c].getVal() == 0){blanks++;}
      }
      return blanks;
  }

  /**
   * Returns the quantity of blank cells in box containing specified coordinates
   * @param r [int] Row component of coordinate
   * @param c [int] Column component of coordinate
   * @return [int] Quantity of blanks cells in box containing (r, c)
   */
  public int blankInBox(int r, int c){
      int blanks = 0;
      for(int i = r - (r % 3); i <= (r - (r % 3)) + 2; i++){
          for(int j = c - (c % 3); j <= (c - (c % 3)) + 2; j++){
              if(grid[r][c].getVal() == 0){blanks++;}
          }
      }
      return blanks;
  }

  //==============================================================
  // Candidate Validation
  //==============================================================

  /**
   * Returns true if number n already exists in row r
   * @param n [int] Number to be searched for
   * @param r [int] Row to be searched
   * @return  boolean [TRUE] number is in row [FALSE] number is not in row
   */
  public boolean numInRow(int n, int r){
    for(Cell c : grid[r]){
      if(c.getVal() == n){return true;}
    }
    return false;
  }

  /**
   * Returns true if number n already exists in column c
   * @param n [int] Number to be searched for
   * @param c [int] Column to be searched
   * @return boolean [TRUE] number is in column [FALSE] number is not in column
   */
  public boolean numInCol(int n, int c){
    for(int r = 0; r < grid.length; r++){
      if(grid[r][c].getVal() == n){return true;}
    }
    return false;
  }

  /**
   * Returns true if number n already exists in box containing coordinate (r, c)
   * @param n [int] Number to be searched for
   * @param r [int] Row component of coordinate 
   * @param c [int] Column component of coordinate
   * @return boolean [TRUE] number is in box [FALSE] number is not in box
   */
  public boolean numInBox(int n, int r, int c){
    for(int i = r - (r % 3); i <= (r - (r % 3)) + 2; i++){
      for(int j = c - (c % 3); j <= (c - (c % 3)) + 2; j++){
        if(grid[i][j].getVal() == n){return true;}
      }
    }
    return false;
  }

  /**
   * Returns true if number n is a valid candidate for coordinate (r, c)
   * @param n [int] Number to be searched for
   * @param r [int] Row component of coordinate
   * @param c [int] Column component of coordinate
   * @return boolean [TRUE] number is a valid candidate [FALSE] number is not a valid candidate
   * @see numInRow(), numInCol(), numInBox()
   */
  public boolean numValid(int n, int r, int c){
      return !numInRow(n, r)
      && !numInCol(n, c)
      && !numInBox(n, r, c);
  }

  //==============================================================
  // Difference
  //==============================================================

  /**
   * Returns the difference of 45 minus the sum of the specified row
   * @param r [int] Row to be subtracted
   * @return [int] Difference of 45 - @see sumRow(r)
   */
  public int diffRow(int r){
      return 45 - sumRow(r);
  }

  /**
   * Returns the difference of 45 minus the sum of the specified column
   * @param c [int] Column to be subtracted
   * @return [int] Difference of 45 - @see sumCol(c)
   */
  public int diffCol(int c){
      return 45 - sumCol(c);
  }

  /**
   * Returns the difference of 45 minus the sum of the box containing 
   * the specified (r, c) coordinate
   * @param r [int] Row component of coordinate
   * @param c [int] Column component of coordinate
   * @return [int] Difference of 45 - @see sumBox(r, c)
   */
  public int diffBox(int r, int c){
      return 45 - sumBox(r, c);
  }

  //==============================================================
  // Pencil Marks
  //==============================================================

  /**
   * Adds pencil marks for valid candidates in grid[r][c]
   * @param r [int] Row component of coordinate
   * @param c [int] Column component of coordinate
   * @see Cell.mark()
   */
  public void pencilMark(int r, int c){
    for(int i = 1; i <= grid.length; i++){
      if(numValid(i, r, c)){ grid[r][c].mark(i);}
      //else{grid[r][c].erase(i);}
    }
  }

  //==============================================================
  // Sum
  //==============================================================

  /**
   * Returns the sum of the already existing entries withing the specified row
   * @param r [int] Row to be summed
   * @return [int] Sum of the row
   */
  public int sumRow(int r){
      int sum = 0;
      for(Cell c : grid[r]){
          sum += c.getVal();
      }
      return sum;
  }
  
  /**
   * Returns the sum of the already existing entries within the specified column
   * @param c [int] Column to be summed
   * @return [int] Sum of the column
   */
  public int sumCol(int c){
      int sum = 0;
      for(int r = 0; r < grid.length; r++){
          sum += grid[r][c].getVal();
      }
      return sum;
  }

  /**
   * Returns the sum of the already existing entries within the box containing 
   * the spcified (r, c) coordinate
   * @param r [int] Row component of coordinate
   * @param c [int] Column component of coordinate
   * @return [int] Sum of the box
   */
  public int sumBox(int r, int c){
      int sum = 0;
      for(int i = r - (r % 3); i <= (r - (r % 3)) + 2; i++){
          for(int j = c - (c % 3); j <= (c - (c % 3)) + 2; j++){
              sum += grid[i][j].getVal();
          }
      }
      return sum;
  }

  //==============================================================
  // Utility
  //==============================================================

  /**
   * Prints Puzzle object in traditional sudoku format (9 rows, 9 columns)
   */
    public void stringify(){
      System.out.println("\n-------------------------------------");
      for(int r = 0; r < grid.length; r++){
          System.out.print("|");
          for(int c = 0; c < grid.length; c++){
              if(grid[r][c].getVal() != 0){
                  System.out.print(" " + grid[r][c].getVal() + " |");
              }else{
                  System.out.print("   |");
              }
          }
          System.out.println("\n-------------------------------------");
      }
      System.out.println();
  }
}
