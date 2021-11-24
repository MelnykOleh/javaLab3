package lab3;
import java.math.BigDecimal;
import java.util.*;
import java.util.stream.*;


public class GameStreamAPI {
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
        private GameStreamAPI newGame;

        public Builder() {
            newGame = new GameStreamAPI();
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

        public GameStreamAPI build(){
            return newGame;
        }

    }

    public List<Character> findByName(List<Character> list, String name){

        List<Character> res = list.stream().filter(n -> n.getName().equals(name)).collect(Collectors.toList());
        return res;
    }

    public List<Character> sortedByHealth(List<Character> list){

        return list.stream().sorted(Comparator.comparing(Character::getHealth)).collect(Collectors.toList());
    }


    public Optional<Character> MaxHealth(List<Character> list){

        return list.stream().max(Comparator.comparing(Character::getHealth));
    }


    @Override
    public String toString() {
        return "GameStreamAPI{" +
                "gameName='" + gameName + '\'' +
                ", developer='" + developer + '\'' +
                ", characterList=" + characterList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GameStreamAPI that = (GameStreamAPI) o;
        return Objects.equals(gameName, that.gameName) && Objects.equals(developer, that.developer) && Objects.equals(characterList, that.characterList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gameName, developer, characterList);
    }
}
