import java.util.Stack;
public class Stacks{

public static void main(String[] args) {

    // stack = LIFO data structure. Last-In First-Out
    //         stores objects into a sort of "vertical tower"
    //         push() to add to the top
    //         pop() to remove from the top
    
    // we name the stack stack and we declare the objects and instatiate. 
    // the example stores strings of names of videogames
    Stack<String> stack = new Stack<String>();

   

    stack.push("Skyrim");
    stack.push("LoL");
    stack.push("Borderlands");
    stack.push("FFVII");
    stack.push("DOOM");

    // returns false if is not empty
     //System.out.println(stack.empty());


     // prints the stack
     //System.out.println(stack);

     //stack.pop();// removes DOOM
     //stack.pop();// removes FFVII
     //stack.pop();// removes Borderlands
     //stack.pop();// removes LoL
     //stack.pop();// removes Skyrim

     // If we push the items to the stack and then remove (pop) them we get an 
     // EmptyStackException and returns a [] 
     //System.out.println(stack);


     // we can "peek" the top first item within our stack with the peek
     //System.out.println(stack.peek());

     // we can also "search" for an object. We print out the object by having
     //the search argument and then passing the exact name of the object and we get back 
     //an integer on where it is located from the top, like so : 
     //System.out.println(stack.search("DOOM"));
     

     //we can run easily out of memory with stacks.
     //next example has 1 billion copies of games etc
     for( int i = 0; i < 1000000000; i++) {
        stack.push("Fallout76");
     }

    //uses of stacks : 
    //1. undo/redo features in text editors
    //2. moving back/forward through browser history
    //3. backtracking algorithms (maze,file directories)
    //4. calling functions (call stack)
}

}