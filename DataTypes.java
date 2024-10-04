/* Check default vaules & size for data types */

public class DataTypes {
    // Class-level variables for default values (Instance variables)
    static byte byteVal;
    static short shortVal;
    static int intVal;
    static long longVal;
    static float floatVal;
    static double doubleVal;
    static char charVal;
    static boolean boolVal;

    public static void main(String[] args) {
        // Display default values of each data type
        System.out.println("Default Values:");
        System.out.println("byte: " + byteVal);
        System.out.println("short: " + shortVal);
        System.out.println("int: " + intVal);
        System.out.println("long: " + longVal);
        System.out.println("float: " + floatVal);
        System.out.println("double: " + doubleVal);
        System.out.println("char: " + "'" + charVal + "'");
        System.out.println("boolean: " + boolVal);

        // Display size of each data type in bits
        System.out.println("\nSizes in bits:");
        System.out.println("byte: " + Byte.SIZE);
        System.out.println("short: " + Short.SIZE);
        System.out.println("int: " + Integer.SIZE);
        System.out.println("long: " + Long.SIZE);
        System.out.println("float: " + Float.SIZE);
        System.out.println("double: " + Double.SIZE);
        System.out.println("char: " + Character.SIZE);
        System.out.println("boolean: Size is JVM dependent");
    }
}
