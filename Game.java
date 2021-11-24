package lab3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.*;

import lab3.Character;

public class Game {
    private String gameName;
    private String developer;
    private List<Character>characterList;

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public List<Character> getCharacterList() {
        return characterList;
    }

    public void setCharacterList(List<Character> characterList) {
        this.characterList = characterList;
    }

    public static class Builder {
        private Game newGame;

        public Builder() {
            newGame = new Game();
        }

        public Builder withGameName(String name){
            newGame.gameName = name;
            return this;
        }

        public Builder withDeveloper(String developer){
            newGame.developer = developer;
            return this;
        }

        public Builder withList(List<Character> list){
            newGame.characterList = list;
            return this;
        }

        public Game build(){
            return newGame;
        }

    }

    public List<Character> findByName(List<Character> list, String name){
        List<Character> result = new ArrayList<Character>();

        for(int i = 0; i < list.size();i++){
            if(list.get(i).getName() == name){
                result.add(list.get(i));
            }
        }

        return result;
    }

    public void sortByHealth(List<Character> list){

        Collections.sort(list, new NewComparable());

    }

    public Character MaxHealth(List<Character> list){
        Character res = null;
        double temp = list.get(0).getHealth();
        for(int i=1;i<list.size();i++){
            if(list.get(i).getHealth() > temp){
                res = list.get(i);
            }
        }
        return res;
    }

    public void ChangeAttack(List<Character> list, double health, double change_coefitient){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getHealth() > health){
                list.get(i).setAttack(list.get(i).getAttack()*change_coefitient);
            }
        }
    }


    @Override
    public String toString() {
        return "Game{" +
                "gameName='" + gameName + '\'' +
                ", developer='" + developer + '\'' +
                ", characterList=" + characterList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return gameName.equals(game.gameName) && Objects.equals(developer, game.developer) && Objects.equals(characterList, game.characterList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gameName, developer, characterList);
    }


}
