package mypractice;

public class Specimen {

        static int countMultiples;

        private final double PI = 3.14;

        private double radius;
        public void Specimen() {
        }
        public Specimen(double radius) {
            this.radius = radius;
            if ((int) (this.PI * this.radius * 2) % 3 == 0)
                countMultiples++;
        }
        public static int getCountMultiples() {
            return countMultiples;
        }
        public static void setCountMultiples(int countMultiples) {
            Specimen.countMultiples = countMultiples;
        }
        public double getPI() {
            return PI;
        }
        public double getRadius() {
            return radius;
        }
        public void setRadius(double radius) {
            this.radius = radius;

    }
}
