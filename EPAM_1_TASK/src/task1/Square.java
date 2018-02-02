package task1;

class Square {

    private static double calculateCircleSquare(double R) {
        return Math.PI * R * R;
    }

    static double calculateRingSquare(double R1, double R2) {
        return Math.abs(calculateCircleSquare(R1)-calculateCircleSquare(R2));
    }
}
