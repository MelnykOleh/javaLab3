package lab3;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String args[]) {

        Character character_1 = new Character();

        character_1.setName("character_1");
        character_1.setHealth(27);
        character_1.setAttack(5);

        Character character_2 = new Character();

        character_2.setName("character_2");
        character_2.setHealth(56);
        character_2.setAttack(16);

        Character character_3 = new Character();

        character_3.setName("character_3");
        character_3.setHealth(17);
        character_3.setAttack(12);

        Character character_4 = new Character();

        character_4.setName("character_4");
        character_4.setHealth(86);
        character_4.setAttack(7);

        Character character_5 = new Character();

        character_5.setName("character_5");
        character_5.setHealth(45);
        character_5.setAttack(9);

        Character character_6 = new Character();

        character_6.setName("character_6");
        character_6.setHealth(23);
        character_6.setAttack(5);

        Character character_7 = new Character();

        character_7.setName("character_7");
        character_7.setHealth(77);
        character_7.setAttack(17);

        Game game = new Game();
        game.setGameName("Game_1");
        game.setDeveloper("developer_1");
        List<Character> list =new ArrayList<Character>();
        game.setCharacterList(list);
        //List<Character> list =new ArrayList<Character>();

        list.add(character_1);
        list.add(character_2);
        list.add(character_3);
        list.add(character_4);
        list.add(character_5);
        list.add(character_6);
        list.add(character_7);

        System.out.println(game);
        game.sortByHealth(list);
        System.out.println(game);

        List<Character> test_list= new ArrayList<Character>();
        test_list=game.findByName(game.getCharacterList(), "character_2");
        System.out.println(test_list);

        Character character_test=game.MaxHealth(list);
        System.out.println(character_test);

        GameStreamAPI game_api = new GameStreamAPI();
        game_api.setGameName("Game_2");
        game_api.setDeveloper("developer_2");
        List<Character> list_api =new ArrayList<Character>();
        game_api.setCharacterList(list_api);

        list_api.add(character_1);
        list_api.add(character_2);
        list_api.add(character_3);
        list_api.add(character_4);
        list_api.add(character_5);
        list_api.add(character_6);
        list_api.add(character_7);
        System.out.println("------------------------------------------------------");
        System.out.println(game_api);
        game_api.setCharacterList(game_api.sortedByHealth(list_api));
        System.out.println(game_api);
        System.out.println(game_api.findByName(list_api, "character_2"));
        System.out.println(game_api.MaxHealth(list_api));

    }
}
