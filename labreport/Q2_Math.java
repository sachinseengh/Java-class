// package labreport;
import java.lang.Math;

    public class Q2_Math{
        public static void main(String[] args) {
            double num1 = 10.5;
            double num2 = 5.3;
    
            // Basic mathematical operations
            double sum = Math.addExact((int) num1, (int) num2);
            double difference = Math.subtractExact((int) num1, (int) num2);
            double product = num1 * num2;
            double quotient = num1 / num2;
    
            System.out.println("num1: " + num1);
            System.out.println("num2: " + num2);
            System.out.println("Sum: " + sum);
            System.out.println("Difference: " + difference);
            System.out.println("Product: " + product);
            System.out.println("Quotient: " + quotient);
    
            // Other math operations
            double power = Math.pow(num1, num2);
            double sqrtNum1 = Math.sqrt(num1);
            double sqrtNum2 = Math.sqrt(num2);
            double maxNum = Math.max(num1, num2);
            double minNum = Math.min(num1, num2);
    
            System.out.println("Power: " + power);
            System.out.println("Square root of num1: " + sqrtNum1);
            System.out.println("Square root of num2: " + sqrtNum2);
            System.out.println("Maximum of num1 and num2: " + maxNum);
            System.out.println("Minimum of num1 and num2: " + minNum);
    
            // Trigonometric functions
            double angleInRadians = Math.toRadians(45);
            double sinValue = Math.sin(angleInRadians);
            double cosValue = Math.cos(angleInRadians);
            double tanValue = Math.tan(angleInRadians);
    
            System.out.println("Angle in radians: " + angleInRadians);
            System.out.println("Sine value: " + sinValue);
            System.out.println("Cosine value: " + cosValue);
            System.out.println("Tangent value: " + tanValue);
        }
    }
    

