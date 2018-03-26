public class FinalClass{

	public static void main(String[] args){
	
		final Variable v = new Variable(5,7);
		System.out.println("Original x and y.");
		System.out.println("x = "+v.x+"   y = "+v.y);
		v.x=22;
		v.y=22;
		System.out.println("Modified x and y.");
		System.out.println("x = "+v.x+"   y = "+v.y);
		
		//uncomment the following lines and try to compile
		//System.out.println("Change the reference.");
		
		//v = new Variable(100,100);
	
	
	}

}

class Variable{

	int x;
	int y;
	Variable(){
		x=0;
		y=0;		
	}
	Variable(int x, int y){

		this.x=x;
		this.y=y;	
	}
}
