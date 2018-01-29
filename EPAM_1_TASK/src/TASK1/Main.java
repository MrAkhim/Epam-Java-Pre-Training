package TASK1;

public class Main {

    public static void main(String[] args) {
        System.out.print(123456789 + " g =>   ");
        System.out.println(Task1_1.dinosaurWeightKilogram(123456789) + " kg  and " + Task1_1.dinosaurWeightTon(123456789) + " tons");
        System.out.print("the square of the ring with radios 2 and 1 is =>   ");
        System.out.println(Task1_2.ringSquare(2, 1));
        System.out.print("Swap the values of a = 8 and b = 12 =>      ");
        Task1_3.swap(8, 12);
        System.out.println("1234 increasing/decreasing Sequence? => " + Task1_4.increasingDecreasingSequenceNumber(1234));
        System.out.println("9876 increasing/decreasing Sequence? => " + Task1_4.increasingDecreasingSequenceNumber(5789));
        System.out.println("1855 increasing/decreasing Sequence? => " + Task1_4.increasingDecreasingSequenceNumber(1855));
        System.out.println("5043 increasing/decreasing Sequence? => " + Task1_4.increasingDecreasingSequenceNumber(5043));
        System.out.println("6310 increasing/decreasing Sequence? => " + Task1_4.increasingDecreasingSequenceNumber(6310));
        System.out.println("5505 increasing/decreasing Sequence? => " + Task1_4.increasingDecreasingSequenceNumber(5505));
        System.out.println("Sum of the digits of 12345  =>   " + Task1_5.sumDigits5(12345));
        System.out.println("Product of the digits of 12345 =>  " + Task1_5.productDigits5(12345));
        System.out.println("Arithmetic mean of digits of 123456 =>  " + Task1_6.ArithmeticMeanDigits6(123456));
        System.out.println("Geometric mean of digits of 123456 =>   " + Task1_6.GeometricMeanDigits6(123456));
        System.out.println("Reverse of 1234567 =>  " + Task1_7.reverse(1234567));
    }
}
