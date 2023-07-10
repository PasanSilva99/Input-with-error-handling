import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int test_num1 = getInput();
        int test_num2 = getInput();

        double result = Divide(test_num1, test_num2);

        System.out.println(result);

        System.out.println("Program Compiled without errors!");
    }

    static Integer getInput(){

        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        String userIn = sc.nextLine();
        try{
            return Integer.parseInt(userIn);
        }
        catch (Exception _e) {
            System.out.println("Please enter a valid number");
            return getInput();
        }
    }
    static double Divide(int dividend, int divisor) throws ArithmeticException, Error{

        double result = 0;

        try {
            result = dividend / divisor;
        }
        catch (ArithmeticException e){
            System.out.println("Divisor cannot be 0");
        }
        catch (Exception ex){
            System.out.println("Error occurred" + ex);
        }
        finally {
            System.out.println("This is finally");
        }

        return result;
    }
}