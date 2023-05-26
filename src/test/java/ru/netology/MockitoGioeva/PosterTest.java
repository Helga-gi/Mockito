package ru.netology.MockitoGioeva;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterTest {

    PosterManager manager = new PosterManager();

    Poster film1 = new Poster(1, "Бладшот", "боевик");
    Poster film2 = new Poster(2, "Вперед", "мультфильм");
    Poster film3 = new Poster(3, "Отель <Белград>", "комедия");
    Poster film4 = new Poster(4, "Джентельмены", "боевик");
    Poster film5 = new Poster(5, "Человек-невидимка", "ужасы");


    @Test
    public void shouldAddPoster() {
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);


        Poster[] expected = {film1, film2, film3, film4, film5};
        Poster[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldNothingAdd() {
        Poster[] expected = {};
        Poster[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAdd1Film() {
        manager.add(film1);

        Poster[] expected = {film1};
        Poster[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast() {
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);

        Poster[] expected = {film5, film4, film3, film2, film1};
        Poster[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}


