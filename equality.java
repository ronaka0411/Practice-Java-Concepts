
//Check equality of objects

public class equality { //child class to Object class
	int number;		//global variable for class

    public equality(int num){ //declaration of constructor

            number = num;
    
    }

    public boolean equals(Object obj){ //equals method for class equality with object as an argument

            equality temp = (equality)obj;

            if(number == temp.number)
                    return true;
            else
                    return false;

    }

    public static void main(String[] args){

            equality e1 = new equality(10);
            equality e2 = new equality(10);

            if (e1.equals(e2))
                    System.out.println("Equal");
            else
                    System.out.println("Not Equal");

    }
}
