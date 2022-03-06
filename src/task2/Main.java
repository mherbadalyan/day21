package task2;

public class Main {
    /**
     * printing sum of given 2 numbers
     * @param num1
     * @param num2
     */
    public void sum(int num1, int num2){
        System.out.println(num1 + num2);
    }

    /**
     * printing sum of given 3 numbers
     * @param num1
     * @param num2
     * @param num3
     */
    public void sum(int num1, int num2,int num3){
        System.out.println(num1 + num2 + num3);
    }

    public static void main(String[] args) {
        Main main = new Main();
        //compile time polymorphism
        main.sum(10,20);
        main.sum(10,20,30);

        //runtime polymorphism
        SecondClass secondClass = new SecondClass();
        secondClass.method();

        FirstClass firstClass = new SecondClass();
        firstClass.method();

        FirstClass firstClass1 = new FirstClass();
        firstClass1.method();

    }
}
