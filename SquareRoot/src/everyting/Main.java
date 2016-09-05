package everyting;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args){
		JOptionPane.showMessageDialog(null, squareRoot(1588846658));
	}
	
	
	public static double squareRoot(double input_in){
		if(input_in < 0){
			return Double.NaN;
		}
		else if(input_in == 0 ){
			return 0;
		}
		
		
		double t;
		double sqrRoot = input_in/2;
		do{
			t = sqrRoot;
			sqrRoot = (t+(input_in/t))/2;
			System.out.println(sqrRoot);
		}while((t-sqrRoot)!=0);
		return sqrRoot;
	}
	
//	public double onceThrough(double input_in){
//		double temp0 = input_in;
//		double temp1 = input_in/2;
//				
//	}
//	
}
