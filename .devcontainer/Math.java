public class Math {
    public static void main(String[] args){
        int num1 = 20;
        int num2 = 13;
        int add;
        int subtract;
        int product;
        int divide;
        double divouble;

        add = num1 + num2;
        subtract = num1 - num2;
        product = num1 * num2;
        divide = num1 / num2;
        divouble = (double) num1 / num2;
        

        System.out.printf("Addition: %d \nSubtration: %d \nMultiplication: %d \nDivison: %d \nDivouble: %.1f", add, subtract, product, divide, divouble);
    }
}
