import java.util.*;
class matrix{
	double matrix[][];
	int row, column;
	
	void create() {
		Scanner in = new Scanner(System.in);
		System. out.println("Enter the data :");
		for(int i=0; i < row; i++) {
			for(int j=0; j < column; j++) {
				matrix[i][j] = in.nextInt();
			}
		}
	}

	int getNoOfRows(){
		// input for  no of rows. 
		Scanner in = new Scanner(System. in);		
		System. out.println("Number of rows :");
		row = Integer.parseInt(in.nextLine());
		return row;
	}

	int getNoOfColumns(){
		// input for  no of Columns. 
		Scanner in = new Scanner(System.in);
		System. out.println("Number of columns :");
		column = Integer.parseInt(in.nextLine());
		return column;
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
}
 
class CreateMatrix {
	public static void main(String args[]) {
		matrix obj = new matrix();
		obj.getNoOfRows();
		obj.getNoOfColumns();
		obj.create();
		obj.display();
	}
}