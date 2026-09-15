public class NumberConversion {
    public static void main(String[] args) {
        int number = 42;

        
        String binary = Integer.toBinaryString(number);
        System.out.println("Binary: " + binary); 

    
        String octal = Integer.toOctalString(number);
        System.out.println("Octal: " + octal); 

       
        String hex = Integer.toHexString(number);
        System.out.println("Hexadecimal: " + hex); 
    }
}

