interface A { default void show() { System.out.print("A"); } }
interface B { void show(); }
interface C extends A, B { }
public class Test implements C {
 public static void main(String[] args) {
 new Test().show();
 }
}


// A) A
// B) Nothing prints
// C) Compilation fails
// D) Runtime exception


// Answer: C
// Explanation: The code will not compile because interface C inherits conflicting default methods from interfaces A and B.