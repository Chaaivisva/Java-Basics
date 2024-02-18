public class MainProgram {
    public static void main(String[] args) {
        System.out.println("This is the main method in OtherClass");
        
        // Creating an instance of MainClass to access its methods
        MainClass mainObj = new MainClass();
        mainObj.displayMessage();
    }
}

// Second program HelloWorld1.java
public class MainClass {
    public void displayMessage() {
        System.out.println("Hello from MainClass!");
    }
}
