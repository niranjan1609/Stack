
public class StackInt {

	int [] array =  new int[5];     
	int top=-1;
	int front=-1;
	//Default Constructor
	StackInt() {  
		array =new int[10];     
		int top =-1;
		} 
	//Constructor with size as an Argument
	StackInt(int sz) {    
		array =new int[sz];   
		top =-1;                   
		} 
	//Method to print the element in the stack
	public void print() {   
		if(front>=array.length-1)
			return;
		else{
				front++;
				System.out.println(array[front]+ " is pushed into the stack");
				
		}
		
	}
	//Method to push an element into the stack
	public void push(int item){
	if(top>=array.length-1) {
		System.out.println("STACK OVERFLOW");
	}
	else {
		array[++top]=item;	
	}
}
	public int getTop() {
		return top;
	}
	//Method to pop an element from the stack
	public int pop() {
		if(top<0) {
			System.out.println("UNDER FLOW");	
			return 0;
		}
		else {
		int x= array[top--];
		return x;
		}
	}
	//Method to peek the element from the stack
	public void  peek() {
		if(top<0) {
			System.out.println("Can't Peek");	
		}
		else {
			int x=array[top];
			System.out.println("Element on the StackTop is "+x);
		}
	}
	//Method to check if the stack is Empty or not
	public boolean isEmpty() {
		return (top < 0);
}
	//Method to Check if two stacks or equal  or not
	public boolean equals(StackInt another) {
		if(this.top!=another.top) {
			return false;
		}
		else {
			if(this.pop()==another.pop()) {
				if ( !this.isEmpty() && !another.isEmpty() ) {
				this.equals(another);
				return true;
				}
			}
			return false;
		}
	}
	
	

}
