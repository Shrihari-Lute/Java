/* Create a class Math_Operation containing method multiply, to calculate multiplication of following arguments. 
two integers,
three float,
all elements of array,
one double and one integer 
*/

class Math_Operation {
    
    public int multiply(int a, int b) {
        return a * b; // Ca
    }

    public float multiply(float a, float b, float c) {
        return a * b * c;
    }

    public double multiply(double[] array) {
        double result = 1; 
        for (double num : array) {
            result = result * num;
        }
        return result;
    }

    public double multiply(double a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Math_Operation mathOp = new Math_Operation();

        // Testing multiplication of two integers
        int intResult = mathOp.multiply(5, 3);
        System.out.println("Multiplication of two integers (5 * 3): " + intResult);

        // Testing multiplication of three floats
        float floatResult = mathOp.multiply(2.5f, 3.5f, 4.5f);
        System.out.println("Multiplication of three floats (2.5 * 3.5 * 4.5): " + floatResult);

        // Testing multiplication of all elements in an array
        double[] array = {1.2, 3.4, 5.6};
        double arrayResult = mathOp.multiply(array);
        System.out.println("Multiplication of array elements (1.2 * 3.4 * 5.6): " + arrayResult);

        // Testing multiplication of one double and one integer
        double doubleIntResult = mathOp.multiply(2.5, 4);
        System.out.println("Multiplication of one double and one integer (2.5 * 4): " + doubleIntResult);
    }
}
