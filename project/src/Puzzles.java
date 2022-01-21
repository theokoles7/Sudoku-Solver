// This file holds example puzzles of various difficulties used for testing.

public class Puzzles{

  public static final int[][][] easy = {
    {
      {5, 8, 0, 1, 0, 2, 0, 4, 0},
      {0, 0, 0, 0, 0, 0, 2, 1, 6},
      {9, 1, 0, 7, 0, 4, 0, 0, 3},
      {0, 0, 0, 0, 2, 0, 0, 0, 0},
      {2, 0, 3, 9, 1, 0, 7, 0, 0},
      {7, 9, 0, 0, 0, 3, 4, 0, 5},
      {6, 0, 0, 0, 0, 1, 5, 0, 4},
      {1, 5, 0, 0, 4, 0, 6, 7, 2},
      {3, 0, 0, 2, 0, 0, 0, 8, 9}
    },
    {
      {0, 9, 3, 0, 7, 4, 0, 0, 5},
      {5, 0, 0, 8, 0, 0, 0, 9, 1},
      {8, 0, 7, 1, 0, 0, 0, 4, 3},
      {0, 0, 9, 0, 0, 1, 5, 8, 6},
      {0, 0, 2, 0, 0, 5, 4, 0, 0},
      {3, 5, 8, 0, 0, 7, 0, 1, 0},
      {4, 3, 0, 0, 0, 8, 6, 2, 0},
      {0, 0, 0, 0, 0, 0, 0, 0, 0},
      {9, 8, 1, 0, 0, 2, 3, 7, 0}
    },
    {
      {0, 7, 9, 0, 2, 0, 6, 8, 0},
      {5, 0, 0, 6, 4, 7, 0, 1, 9},
      {1, 0, 0, 0, 8, 0, 7, 0, 4},
      {0, 0, 0, 0, 0, 0, 0, 0, 0},
      {7, 2, 0, 0, 9, 3, 8, 5, 1},
      {8, 0, 0, 0, 0, 2, 4, 0, 0},
      {0, 1, 0, 2, 0, 4, 5, 6, 0},
      {6, 0, 0, 0, 5, 0, 3, 4, 0},
      {0, 0, 4, 0, 3, 6, 0, 0, 7}
    }
  };

  public static final int[][][] medium = {
    {
      {7, 6, 0, 0, 0, 0, 0, 1, 0},
      {5, 0, 0, 1, 6, 0, 0, 0, 4},
      {0, 0, 0, 4, 0, 9, 0, 0, 0},
      {4, 0, 0, 9, 0, 0, 0, 0, 8},
      {0, 0, 0, 6, 0, 7, 0, 0, 0},
      {0, 0, 3, 2, 0, 0, 1, 0, 7},
      {0, 7, 0, 0, 4, 5, 0, 2, 0},
      {3, 4, 9, 7, 0, 6, 8, 0, 0},
      {0, 0, 0, 0, 0, 0, 0, 7, 3}
    },
    {
      {7, 6, 0, 0, 0, 0, 8, 0, 1},
      {0, 0, 0, 0, 1, 4, 0, 6, 7},
      {0, 3, 1, 0, 6, 0, 0, 0, 0},
      {5, 0, 0, 0, 0, 0, 0, 0, 0},
      {6, 4, 7, 0, 0, 0, 9, 3, 5},
      {3, 0, 0, 9, 0, 5, 0, 0, 0},
      {1, 0, 6, 0, 9, 0, 5, 2, 0},
      {0, 0, 0, 0, 5, 0, 0, 0, 8},
      {0, 5, 0, 0, 0, 3, 4, 0, 6}
    },
    {
      {4, 7, 0, 0, 0, 0, 5, 8, 0},
      {0, 6, 0, 0, 9, 0, 0, 0, 7},
      {5, 0, 8, 0, 6, 0, 9, 1, 2},
      {0, 0, 5, 0, 7, 0, 0, 0, 0},
      {0, 0, 0, 0, 0, 3, 0, 0, 0},
      {8, 9, 1, 0, 0, 2, 3, 0, 0},
      {6, 8, 0, 0, 0, 9, 2, 0, 3},
      {0, 1, 0, 7, 0, 0, 0, 0, 5},
      {0, 0, 0, 0, 0, 0, 0, 9, 0}
    }
  };

  public static final int[][][] hard = {
    {
      {0, 1, 0, 0, 0, 8, 9, 0, 0},
      {7, 0, 3, 4, 0, 0, 0, 0, 5},
      {0, 0, 0, 0, 6, 0, 0, 0, 4},
      {0, 9, 0, 0, 0, 5, 0, 0, 8},
      {0, 8, 0, 0, 0, 0, 0, 0, 0},
      {0, 5, 7, 8, 3, 0, 0, 0, 6},
      {0, 0, 2, 0, 0, 0, 0, 3, 0},
      {8, 0, 0, 0, 5, 0, 0, 0, 0},
      {0, 0, 0, 0, 1, 3, 0, 2, 0}
    },
    {
      {0, 0, 0, 7, 0, 0, 4, 0, 0},
      {0, 8, 0, 5, 0, 0, 9, 0, 0},
      {0, 7, 5, 3, 0, 0, 0, 1, 0},
      {0, 1, 0, 0, 2, 0, 6, 0, 0},
      {7, 0, 4, 0, 0, 0, 0, 0, 0},
      {6, 0, 0, 0, 8, 0, 0, 4, 0},
      {0, 0, 0, 0, 0, 0, 0, 0, 0},
      {0, 6, 0, 8, 0, 0, 0, 0, 3},
      {0, 5, 0, 0, 9, 0, 1, 0, 0}
    },
    {
      {4, 0, 0, 0, 0, 0, 0, 0, 0},
      {3, 0, 8, 0, 0, 0, 0, 0, 0},
      {0, 6, 1, 4, 7, 0, 0, 0, 0},
      {0, 0, 0, 0, 0, 5, 0, 2, 7},
      {0, 0, 0, 0, 0, 0, 8, 0, 0},
      {6, 0, 3, 0, 0, 0, 5, 0, 0},
      {8, 0, 0, 6, 9, 0, 1, 0, 5},
      {0, 0, 0, 0, 1, 2, 0, 6, 9},
      {1, 0, 0, 3, 0, 7, 2, 0, 8}
    }
  };

  public static final int[][][] expert = {
    {
      {0, 1, 3, 0, 0, 7, 0, 0, 6},
      {0, 0, 0, 0, 0, 0, 0, 2, 4},
      {0, 5, 0, 8, 0, 0, 0, 7, 0},
      {0, 0, 0, 9, 0, 8, 7, 0, 0},
      {0, 0, 0, 0, 0, 0, 0, 5, 0},
      {0, 0, 0, 6, 7, 0, 0, 0, 0},
      {0, 0, 0, 0, 0, 0, 9, 0, 2},
      {7, 0, 6, 0, 3, 0, 8, 0, 0},
      {0, 0, 1, 0, 2, 0, 0, 0, 0}
    },
    {
      {8, 0, 0, 0, 0, 0, 9, 0, 0},
      {0, 0, 0, 0, 9, 5, 6, 0, 0},
      {7, 0, 1, 0, 6, 0, 0, 0, 0},
      {5, 0, 0, 3, 0, 0, 0, 7, 0},
      {0, 3, 0, 0, 0, 8, 0, 0, 2},
      {0, 0, 0, 0, 0, 4, 0, 3, 0},
      {0, 0, 0, 0, 0, 6, 0, 9, 0},
      {0, 0, 0, 0, 0, 0, 0, 0, 5},
      {1, 0, 8, 4, 0, 0, 0, 0, 0}
    },
    {
      {0, 0, 0, 2, 0, 0, 0, 0, 1},
      {0, 2, 8, 0, 0, 0, 9, 0, 0},
      {0, 0, 0, 0, 5, 0, 3, 0, 0},
      {4, 0, 0, 3, 0, 0, 0, 5, 0},
      {7, 0, 0, 0, 0, 0, 0, 0, 0},
      {0, 1, 0, 0, 0, 0, 0, 4, 7},
      {0, 0, 0, 5, 7, 4, 0, 0, 0},
      {9, 0, 1, 0, 0, 3, 0, 0, 0},
      {0, 0, 6, 0, 0, 1, 0, 0, 0}
    }
  };

  public static final int[][][] evil =  {
    {
      {0, 8, 0, 0, 9, 0, 7, 5, 0},
      {5, 0, 0, 0, 0, 0, 0, 0, 2},
      {0, 0, 0, 7, 0, 0, 0, 0, 6},
      {3, 0, 0, 1, 0, 0, 8, 7, 0},
      {0, 0, 0, 0, 0, 0, 6, 0, 0},
      {0, 0, 1, 0, 2, 0, 0, 0, 0},
      {0, 0, 0, 0, 0, 0, 0, 0, 5},
      {8, 0, 0, 2, 0, 0, 1, 3, 0},
      {0, 9, 0, 0, 0, 4, 0, 0, 0}
    },
    {
      {1, 0, 0, 0, 0, 0, 0, 0, 2},
      {0, 4, 0, 8, 0, 0, 1, 5, 0},
      {0, 0, 0, 0, 5, 0, 0, 0, 7},
      {3, 0, 0, 0, 6, 0, 5, 4, 0},
      {0, 0, 6, 2, 0, 0, 0, 0, 0},
      {0, 0, 0, 0, 0, 0, 0, 7, 0},
      {0, 8, 0, 0, 0, 9, 0, 0, 0},
      {0, 0, 0, 0, 0, 0, 0, 0, 1},
      {4, 0, 0, 0, 2, 0, 3, 6, 0}
    },
    {
      {0, 0, 0, 5, 0, 0, 6, 0, 0},
      {0, 2, 0, 7, 0, 0, 0, 0, 0},
      {0, 0, 8, 0, 2, 6, 0, 0, 3},
      {9, 0, 0, 0, 0, 0, 0, 0, 8},
      {0, 0, 0, 6, 0, 0, 0, 0, 0},
      {0, 5, 0, 0, 4, 1, 3, 0, 0},
      {0, 0, 5, 0, 0, 0, 0, 4, 0},
      {0, 4, 0, 0, 3, 2, 1, 0, 0},
      {0, 0, 0, 0, 7, 0, 0, 0, 0}
    }
  };

  public static final int[][][] minimum_clues = {
    {
      {0, 0, 0, 0, 0, 0, 0, 1, 5},
      {0, 2, 0, 0, 6, 0, 0, 0, 0},
      {0, 0, 0, 0, 0, 0, 4, 0, 8},
      {0, 0, 3, 0, 0, 0, 9, 0, 0},
      {0, 0, 0, 1, 0, 0, 0, 0, 0},
      {0, 0, 0, 0, 0, 8, 0, 0, 0},
      {1, 5, 0, 4, 0, 0, 0, 0, 0},
      {0, 0, 0, 0, 7, 0, 3, 0, 0},
      {8, 0, 0, 0, 0, 0, 0, 6, 0}
    },
    {
      {0, 0, 0, 8, 0, 1, 0, 0, 0},
      {0, 0, 0, 0, 0, 0, 4, 3, 0},
      {5, 0, 0, 0, 0, 0, 0, 0, 0},
      {0, 0, 0, 0, 7, 0, 8, 0, 0},
      {0, 0, 0, 0, 0, 0, 1, 0, 0},
      {0, 2, 0, 0, 3, 0, 0, 0, 0},
      {6, 0, 0, 0, 0, 0, 0, 7, 5},
      {0, 0, 3, 4, 0, 0, 0, 0, 0},
      {0, 0, 0, 2, 0, 0, 6, 0, 0}
    },
    {
      {0, 0, 0, 0, 4, 0, 0, 2, 0},
      {0, 5, 0, 9, 0, 0, 0, 0, 0},
      {0, 1, 0, 0, 0, 0, 0, 0, 0},
      {0, 0, 0, 8, 0, 0, 1, 0, 5},
      {2, 0, 0, 0, 3, 0, 0, 0, 0},
      {0, 0, 0, 0, 0, 0, 9, 0, 0},
      {4, 9, 0, 0, 0, 2, 0, 0, 0},
      {3, 0, 0, 0, 0, 0, 0, 6, 0},
      {0, 0, 0, 1, 0, 0, 0, 0, 0}
    }
  };
}