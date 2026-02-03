public class TestArrayCalculator {
    public static void main(String[] args) {
        ArrayCalculator calcOne = new ArrayCalculator(new double[]{1, 2, 3, 4, 5});
        System.out.println(calcOne); // 1.0 2.0 3.0 4.0 5.0
        System.out.println(calcOne.add()); // 15.0
        System.out.println(calcOne.subtract()); // -15.0

        calcOne.setNumber(1, 100);
        System.out.println(calcOne); // 1.0 100.0 3.0 4.0 5.0
        System.out.println(calcOne.add()); // 113.0
        System.out.println(calcOne.subtract()); // -113.0

        ArrayCalculator calcTwo = new ArrayCalculator(new double[]{1, 2, 3, 4, 5});
        System.out.println(calcOne.equals(calcTwo)); // true

        ArrayCalculator calcThree = new ArrayCalculator(new double[]{1, 2, 3, 4, 5});
        System.out.println(calcOne.equals(calcThree)); // false

    }
}
