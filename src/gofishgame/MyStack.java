package gofishgame;

import java.util.Stack;

import graphics.GofishFrame;

interface StackInterface<T>
{   
 
    /**
     * Adds a new entry to the top of the stack. 
    */
    public void push( T newEntry );  
    
    /**
     * Removes and returns the stack top entry.
    */ 
    public T pop();   
    
    /**
     * Retrieves this stack top entry.
    */
    public T peek();   
    
    /**
     * Detects whether the stack is empty.
    */
    public boolean isEmpty(); 
    
    /**
     * Removes all entries from the stack.
    */
    public void clear();
}

/**
 * Class implementing StackInterface in order to create 
 * a stack that will act as a deck of cards.
*/
public class MyStack<T> implements StackInterface<T>
{
    Stack<T> theStack;
    GofishFrame frame;
    
    public MyStack(GofishFrame frame)
    {
    	this.frame = frame;
        theStack = new Stack<>();
    }
    public void push( T newEntry )
    {
        theStack.push( newEntry );
    }
    public T peek()
    {   
        return theStack.peek();
    } 
    public T pop()
    {   
        return theStack.pop();
    } 
    public boolean isEmpty()
    {   
        return theStack.empty();
    } 
    public void clear()
    {   
        theStack.clear();
    } 
}
