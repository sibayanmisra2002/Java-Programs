public class DiagonalDiff{
	public static void main (String args[]){
		 int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {9, 8, 9}
        };
		
		int left=0;
		int right=0;
		for(int i=0;i<matrix.length;i++){
			left+=matrix[i][i];
			right+=matrix[i][matrix.length-1-i];
		}
		System.out.println("Diagonal Difference: "+Math.abs(left-right));
	}
}
