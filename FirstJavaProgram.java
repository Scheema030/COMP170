/* Summary: Working from a simple Hello World program (or any simple starting
point of a program that *works*), make at least the changes and additions listed
below. You can add more, try other things, but be sure your program compiles
without errors and runs correctly before turning it in. If you have something that
is “good enough” you might save that as is and make a copy to continue trying
new things. */

public class FirstJavaProgram {
    public static void main(String[] args) {
        Console.println("Hello World");
        Console.print("Are you still there? ");
        Console.println("User detected.");

        Console.print("Enter your name: ");
        String name = Console.nextLine();
        Console.print("Hello, " + name + "!");

        Console.print("Enter a whole nunber: ");
        int whole = Console.nextInt();
        Console.print("Enter a second number: ");
        int second = Console.nextInt();
        Console.print("Enter a third number: ");
        int third = Console.nextInt();
        Console.print("Enter a fourth number: ");
        int fourth = Console.nextInt();


        int sum = whole + second + third + fourth;
        Console.println("Your sum is " + sum);

        System.out.println("Coding is fun so far");
        System.out.println("But it will be so much harder and difficult in the future.");

        Console.print("Adios!");
    }
}
