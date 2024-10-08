//In the repo "https://github.com/canyagiz/java-static-classes", static classes explained. That's the time for explaining inner non-static classes
public class OuterClassDetailed {
    private String secretMessage = "Hello from Outer Class!";

    class InnerClass {
    	//Feature 3: Encapsulation
        void revealSecretMessage() {
            System.out.println("Only inner class's revealSecretMessage method can show the secretMessage: " + secretMessage); // Directly access to outer class
        }
    }

    public static void main(String[] args) {
        //Feature 1: Directly access to outer class
    	//Feature 2: To initialize inner class's object, at the beg, outer class's object must be initialized. So, inner class is dependent to outer class.
    	OuterClassDetailed outer = new OuterClassDetailed();
        InnerClass inner = outer.new InnerClass();
        inner.revealSecretMessage(); // Output: Only inner class's ... + Hello from Outer Class!
    }
}

