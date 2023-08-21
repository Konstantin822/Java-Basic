package lessons.lesson3;

public class Homework {
    public static void main(String[] args) {
//        За господство в древнем Китае, сражались две династии: Ли и Минь.
//        С каждой стороны сражались 3 типа воинов с такими показателями атаки:
//        Ли:
//        воин - 13
//        лучник - 24
//        всадник - 46
//
//        Минь:
//        воин - 9
//        лучник - 35
//        всадник - 12
//
//        Рассчитать: общий показатель атаки для обеих династий, если известно что воинов династии Ли каждого типа
//        было 860, а количество воинов династии Минь каждого типа в полтора раза больше.
//
//        Вывести в консоль значения общей атаки для каждой армии

        int leeWarrior = 13;
        int leeArcher = 24;
        int leeRider = 46;
        int eachClass = 860;

        int minhWarrior = 9;
        int minhArcher = 35;
        int minhRider = 12;
        int eachClass2 = 860;
        float outnumbered = 1.5f;

        double leeAttack = (leeWarrior + leeArcher + leeRider) * eachClass;
        double minhAttack = (minhWarrior + minhArcher + minhRider) * (eachClass2 * outnumbered);

        System.out.println("Total Lee army strenght: " + leeAttack);
        System.out.println("Total Minh army strenght: " + minhAttack);
    }
}
