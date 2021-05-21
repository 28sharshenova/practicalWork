package mypractice;

    public class task1 {
        public static void main(String[] args) {
            Specimen[] circles;
            circles = new Specimen[10];
            for (int i = 0; i < circles.length; i++)
                circles[i] = new Specimen(i + 1);

            System.out.println("The number circles whose area is equal to 3: " + Specimen.countMultiples);
            System.out.println("The number circles whose area is equal to 3: " + Specimen.getCountMultiples());
        }
    }

