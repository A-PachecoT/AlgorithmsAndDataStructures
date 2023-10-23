
package uni.aed.stack;

/**
 *
 * @author AndreP
 */
public class TestStack {
    public static void main(String[] args) {
        System.out.println("Trying ArrayStack");
        StackTDA<String> stackOverflow = new ArrayStackTDA<>();
        tryStack(stackOverflow);
        StackTDA<String> linkedStack = new LinkedStackTDA<>();
        tryStack(linkedStack);
    }
    private static void tryStack(StackTDA<String> stack){
        
        stack.push("Styreep");
        stack.push("Harushio");
        stack.push("TheSergitoX");

        System.out.println("After introducing elements to the stack");
        System.out.println(stack.toString());

        System.out.println("Elements of the stack: " + stack.size());

        System.out.println("Worse player of L4D2:" + stack.peek());
        System.out.println("Deleting the last player to enter to the game:");
        stack.pop();
        System.out.println("Bye bye noob ;)\n");

        System.out.println("Remaining players:");
        System.out.println(stack.toString());
    }
}
