package lessons.lesson4;

public class Zoo {
    public static final double COEFFICIENT_BEARS = 1.3;
    public static final double COEFFICIENT_TIGERS = 1.2;
    public static final double COEFFICIENT_PARROTS = 1.4;
    public static final double COEFFICIENT_ELEPHANTS = 1.05;
    public static final double COEFFICIENT_RACCOONS = 1.8;
    public static final double COEFFICIENT_LIONS = 1.6;

    public static void main(String[] args) {
        int min = 2;
        int max = 30;

        int bears = getRandomNumber(min, max);
        int tigers = getRandomNumber(min, max);
        int parrots = getRandomNumber(min, max);
        int elephants = getRandomNumber(min, max);
        int raccoons = getRandomNumber(min, max);
        int lions = getRandomNumber(min, max);

        System.out.println("bears = " + bears);
        System.out.println("tigers = " + tigers);
        System.out.println("parrots = " + parrots);
        System.out.println("elephants = " + elephants);
        System.out.println("raccoons = " + raccoons);
        System.out.println("lions = " + lions);

        System.out.println("count animals = " + countAnimals(bears, tigers, parrots, elephants, raccoons));
        System.out.println("count animals with lions = " + countAnimals(bears, tigers, parrots, elephants, raccoons, lions));
        System.out.println("count animals next year  = " + countAnimalsNextYear(bears, tigers, parrots, elephants, raccoons));
        System.out.println("count animals next year with lions = " + countAnimalsNextYear(bears, tigers, parrots, elephants, raccoons, lions));


    }

    static int getRandomNumber(int min, int max) {
//        return min + (int) (Math.random() * max - min + 1);
        return min + (int) (Math.random() * max - 1);
    }

    public static int countAnimals(int bears, int tigers, int parrots, int elephants, int raccoons) {
        return bears + tigers + parrots + elephants + raccoons;
    }

    public static int countAnimals(int bears, int tigers, int parrots, int elephants, int raccoons, int lions) {
//        return bears + tigers + parrots + elephants + raccoons + lions;
        return countAnimals(bears, tigers, parrots, elephants, raccoons) + lions;
    }

    public static int countAnimalsNextYear(int bears, int tigers, int parrots, int elephants, int raccoons) {
        int result = (int) (bears * COEFFICIENT_BEARS)
                + (int) (tigers * COEFFICIENT_TIGERS)
                + (int) (parrots * COEFFICIENT_PARROTS)
                + (int) (elephants * COEFFICIENT_ELEPHANTS)
                + (int) (raccoons * COEFFICIENT_RACCOONS);
        return result;
    }

    public static int countAnimalsNextYear(int bears, int tigers, int parrots, int elephants, int raccoons, int lions) {
//        int result = (int) (bears * COEFFICIENT_BEARS)
//                + (int) (tigers * COEFFICIENT_TIGERS)
//                + (int) (parrots * COEFFICIENT_PARROTS)
//                + (int) (elephants * COEFFICIENT_ELEPHANTS)
//                + (int) (raccoons * COEFFICIENT_RACCOONS)
//                + (int) (lions * COEFFICIENT_LIONS);
//        return result;

        return countAnimalsNextYear(bears, tigers, parrots, elephants, raccoons) + (int) (lions * COEFFICIENT_LIONS);
    }
}
