
package uni.aed.stack;

/**
 *
 * @author AndreP
 */
public class TestStack {
    public static void main(String[] args) {
        StackTDA<String> stackOverflow = new ArrayStackTDA<>();
        stackOverflow.push("Styreep");
        stackOverflow.push("Harushio");
        stackOverflow.push("TheSergitoX");
        
        System.out.println("After introducing elements to the stack");
        System.out.println(stackOverflow.toString());
        
        System.out.println("Elements of the stack: " + stackOverflow.size());
        
        System.out.println("Worse player of L4D2:" + stackOverflow.peek());
        System.out.println("Deleting the last player to enter to the game:");
        stackOverflow.pop();
        System.out.println("Bye bye noob ;)\n");
        
        System.out.println("Remaining players:");
        System.out.println(stackOverflow.toString());

    }
}
