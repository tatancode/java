public class Magic {
    // This program prints the same output for every
    // number between 0 and 9999 - Math Magic!
    public static void main(String[] args) {
        // Below is the original number
        int myNumber = 9999;

        int magicNumber = myNumber * myNumber;

        magicNumber += myNumber;

        magicNumber /= myNumber;

        magicNumber += 17;

        magicNumber -= myNumber;

        magicNumber /= 6;

        System.out.println(magicNumber);
    }
}
