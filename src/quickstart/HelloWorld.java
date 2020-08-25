package quickstart;

public class HelloWorld {

    static void myMethod() {
        System.out.println("I just got executed!");
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        int myNum = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";
        System.out.println(myNum);
        System.out.println(myFloatNum);
        System.out.println(myLetter);
        System.out.println(myBool);
        System.out.println(myText);
        myMethod();
//
        MyClass myMethod = new MyClass();
        myMethod.myMethod();
    }
}
