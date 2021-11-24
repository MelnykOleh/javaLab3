package lab3;

import java.util.regex.*;
import java.util.Objects;
import java.util.regex.Pattern;

public class Character implements Comparable<Character>  {
    protected String name;
    protected double health;
    protected double attack;

    public String getName() {return name;}

    public void setName(String name) {
        this.name = name;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public void changeHealth(double coefficient) {
        this.health = this.health-this.health*coefficient;
    }

    public void changeAttack(double coefficient) {
        this.attack = this.attack-this.attack*coefficient;
    }

    @Override
    public int compareTo(Character character) {
        Double health_2 = character.getHealth();
        Double health_1 = this.getHealth();
        return health_1.compareTo(health_2);
    }

    public static class Builder {
        private Character newCharacter;

        public Builder() {
            newCharacter = new Character();
        }

        public Builder withName(String name){
            newCharacter.name = name;
            return this;
        }

        public Builder withHealth(double health){
            newCharacter.health = health;
            return this;
        }

        public Builder withAttack(double attack){
            newCharacter.attack = attack;
            return this;
        }

        public Character build(){
            return newCharacter;
        }

    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", attack=" + attack +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Character character = (Character) o;
        return Double.compare(character.health, health) == 0 && Double.compare(character.attack, attack) == 0 && name.equals(character.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, health, attack);
    }
}
