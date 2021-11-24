package lab3;

import java.util.Comparator;

public class NewComparable implements Comparator<Character> {
    @Override
    public int compare(Character character_1, Character character_2) {
        Double health_1 = character_1.getHealth();
        Double health_2 = character_2.getHealth();
        return health_1.compareTo(health_2);
    }

}
