package ru.netology;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class GameStoreTest {
    GameStore store = new GameStore();

    // блокер - тест не проходит из-за краша в методе containsGame
    @Test
    public void shouldAddGame() {
        Game game = store.publishGame("Нетология Баттл Онлайн", "Аркады");

        assertTrue(store.containsGame(game));
    }

    // блокер - тест не проходит из-за краша в методе containsGame
    @Test
    public void shouldBeOpportunityToAddManyGames() {
        Game game = store.publishGame("Титаны", "Хорроры");
        Game game1 = store.publishGame("Цивилизация", "Стратегии");
        Game game2 = store.publishGame("Ведьмак", "Ролевая игра");

        assertTrue(store.containsGame(game));
        assertTrue(store.containsGame(game1));
        assertTrue(store.containsGame(game2));
    }

    @Test
    public void shouldNotCrashSystemIfWeTryFindGameInEmptyRepo() {
        GameStore notForUse = new GameStore();
        Game gameError = new Game("Несохраненная игра", "Симулятор", notForUse);

        assertFalse(store.containsGame(gameError));
    }

    @Test
    public void shouldNotFindUnsavedGameInFullRepo() {
        Game game = store.publishGame("Титаны", "Хорроры");
        Game game1 = store.publishGame("Цивилизация", "Стратегии");
        Game game2 = store.publishGame("Ведьмак", "Ролевая игра");

        GameStore notForUse = new GameStore();
        Game gameError = new Game("Несохраненная игра", "Симулятор", notForUse);

        assertFalse(store.containsGame(gameError));
    }

    @Test
    public void shouldAddPlayTimeForNewGameWhenTimeIsMoreThanZero() {
        Game game = store.publishGame("Титаны", "Хорроры");
        store.addPlayTime("moon11", 5);

        String expected = "moon11";
        String actual = 
    }
}
