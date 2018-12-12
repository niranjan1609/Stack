
public class Driver {
	public static void main(String[] args){
		StackInt si=new StackInt(5);		
		System.out.println("Stack si top is "+si.top);
		System.out.println("length of the array is "+ si.array.length); 
		StackInt si2 = new StackInt();
		System.out.println("length of the array is " + si2.array.length);
		si.push(100);
		si.print();
		si.push(200);
		si.print();
		si.push(300);
		si.print();
		si.push(400);
		si.print();
		si.push(500);
		si.print();
		si.push(600);
		si.print();
		si.push(700);
		si.print();
		si.push(800);
		si.print();
		si.push(900);
		si.print();
		si.push(1000);
		si.print();
		si.push(1100);
		si.print();
		si.push(1);
		si.print();
	
		System.out.println("The top of the stack si is "+si.getTop());
		System.out.println(si.pop()+" is popped out from the stack si");
		System.out.println(si.pop()+" is popped out from the stack si");
		System.out.println(si.pop()+" is popped out from the stack si");
		System.out.println(si.pop()+" is popped out from the stack si");
		System.out.println(si.pop()+" is popped out from the stack si");
		System.out.println(si.pop()+" is popped out from the stack si");
		System.out.println(si.pop()+" is popped out from the stack si");
		System.out.println(si.pop()+" is popped out from the stack si");
		System.out.println(si.pop()+" is popped out from the stack si");
		System.out.println(si.pop()+" is popped out from the stack si");
		System.out.println(si.pop()+" is popped out from the stack si");
		StackInt si3 = new StackInt(5);
		si3.peek();
		si3.push(100); 
		si3.print();
		si3.peek(); 
		si3.push(200); 
		si3.print();
		si3.peek();
		si3.push(300); 
		si3.peek(); 
		StackInt si1=new StackInt();
		si1.push(100);
		si2.push(100); 
		si1.push(300);
		si2.push(300);

		si1.push(200); 
		si2.push(200);
		if (si1 == si2)    
			System.out.println("Both si1 and si2 are same"); 
		else   
			System.out.println("Both si1 and si2 are not the same"); 
		System.out.println(si1.equals(si2));
		
	

	}
	 	
}
