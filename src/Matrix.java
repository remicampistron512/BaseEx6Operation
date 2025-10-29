import java.util.*;

public class Matrix {
    public static void main(String[] args) {
        int[][] firstMatrix = { {5, 2, 4},
                                {0, 1, 1},
                                {6, 3, 1} };

        int[][] secondMatrix = { {1, 1, 3},
                                 {2, 5, 6},
                                 {3, 0, 5} };

        int[][] thirdMatrix = { {8, 7},
                                {5, 4},
                                {2, 1} };

        int[][] fourthMatrix = { {0, 2},
                                 {1, 2},
                                 {1, 1} };

        addMatrix(firstMatrix, secondMatrix);
        System.out.println("--------------");
        //addMatrix(firstMatrix, thirdMatrix);
        System.out.println("--------------");
        subMatrix(thirdMatrix, fourthMatrix);
        System.out.println("--------------");
        mulScalMatrix(fourthMatrix, 2);
    }

	private static void mulScalMatrix(int[][] fourthMatrix, int i) {
		
		
	}

	private static void subMatrix(int[][] firstMatrix, int[][] secondMatrix) {
		// TODO Auto-generated method stub
		
	}

	private static void addMatrix(int[][] firstMatrix, int[][] secondMatrix) {
		int [][]resultMatrix = {{0,0,0},
								{0,0,0},
								{0,0,0},
								};
		List<Integer> list = new ArrayList<>();
		for (int i=0;i < firstMatrix.length;i++) {
			for (int j =0;j<firstMatrix[i].length;j++) {
				
					
						resultMatrix[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
						
					
				}
			}
		
		for (int i=0; i < resultMatrix.length;i++) {
			for (int j=0; j < resultMatrix[i].length;j++) {
				System.out.println(resultMatrix[i][j]);
			}
		}
		
	}
}
