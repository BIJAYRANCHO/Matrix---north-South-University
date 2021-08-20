import java.util.*;
class Matrix1{
	int row, column, constant;
	double matrix[][];

	Matrix1(int constant, int row, int column)
	{
			for(int i=0; i < row; i++) {
				for(int j=0; j < column; j++) {
					matrix[i][j] = constant;
				}
			}
	}
	void display() {
		System. out.println("\nThe Matrix is :");
		for(int i=0; i < row; i++) {
			for(int j=0; j < column; j++) {
				System. out.print("\t" + matrix[i][j]);
			}
			System. out.println();
		}
	}

	public static void main(String[] args) {
		
		Matrix1 obj = new Matrix1(3,3,3);
		obj.display();
		Matrix1 obj1 = new Matrix1(1,3,4);
		obj1.display();




	}
}