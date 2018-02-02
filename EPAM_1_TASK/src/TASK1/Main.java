package task1;

public class Main {

    public static void main(String[] args) {
        System.out.print(123456789 + " g =>   ");
        System.out.println(Dino.convectGramToKilo(123456789) + " kg  and " + Dino.convectGramToTonne(123456789) + " tons");
        System.out.print("the square of the ring with radios 2 and 1 is =>   ");
        System.out.println(Square.calculateRingSquare(2, 1));
        System.out.print("Swap the values of a = 8 and b = 12 =>      ");
        SwapValue.swap(8, 12);
        System.out.println("1234 increasing/decreasing Sequence? => " + SequenceDigits.IsIncreasingDecreasingSequenceDigits(1234));
        System.out.println("9876 increasing/decreasing Sequence? => " + SequenceDigits.IsIncreasingDecreasingSequenceDigits(5789));
        System.out.println("1855 increasing/decreasing Sequence? => " + SequenceDigits.IsIncreasingDecreasingSequenceDigits(1855));
        System.out.println("5043 increasing/decreasing Sequence? => " + SequenceDigits.IsIncreasingDecreasingSequenceDigits(5043));
        System.out.println("6310 increasing/decreasing Sequence? => " + SequenceDigits.IsIncreasingDecreasingSequenceDigits(6310));
        System.out.println("5505 increasing/decreasing Sequence? => " + SequenceDigits.IsIncreasingDecreasingSequenceDigits(5505));
        System.out.println("Sum of the digits of 12345  =>   " + OperationDigits.sumDigits(12345));
        System.out.println("Product of the digits of 12345 =>  " + OperationDigits.productDigits(12345));
        System.out.println("Arithmetic mean of digits of 123456 =>  " + MeanDigits.ArithmeticMeanDigits(123456));
        System.out.println("Geometric mean of digits of 123456 =>   " + MeanDigits.GeometricMeanDigits(123456));
        System.out.println("Reverse of 1234567 =>  " + ReverseNumber.reverse(1234567));
    }
}
