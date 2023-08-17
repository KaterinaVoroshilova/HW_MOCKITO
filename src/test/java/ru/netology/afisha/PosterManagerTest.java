package ru.netology.afisha;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {

    Poster poster1 = new Poster(1, "Бладшот", "боевик");
    Poster poster2 = new Poster(2, "Вперед", "мультфильм");
    Poster poster3 = new Poster(3, "Отель Белград", "комедия");
    Poster poster4 = new Poster(4, "Джентельмены", "боевик");
    Poster poster5 = new Poster(5, "Человек-невидимка", "ужасы");
    Poster poster6 = new Poster(6, "Тролли. Мировой тур", "мультфильм");
    Poster poster7 = new Poster(7, "Номер один", "комедия");


    @Test
    public void shouldAddPoster() {
        PosterManager afisha = new PosterManager();
        afisha.add(poster1);
        afisha.add(poster2);
        afisha.add(poster3);

        Poster[] expected = {poster1, poster2, poster3};
        Poster[] actual = afisha.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast5() {
        PosterManager afisha = new PosterManager();
        afisha.add(poster1);
        afisha.add(poster2);
        afisha.add(poster3);
        afisha.add(poster4);
        afisha.add(poster5);
        afisha.add(poster6);
        afisha.add(poster7);

        Poster[] expected = {poster7, poster6, poster5, poster4, poster3};
        Poster[] actual = afisha.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast5AboveLength() {
        PosterManager afisha = new PosterManager();
        afisha.add(poster1);
        afisha.add(poster2);
        afisha.add(poster3);

        afisha.findLast();
        Poster[] expected = {poster3, poster2, poster1};
        Poster[] actual = afisha.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastLimit() {
        PosterManager afisha = new PosterManager(4);
        afisha.add(poster1);
        afisha.add(poster2);
        afisha.add(poster3);
        afisha.add(poster4);
        afisha.add(poster5);
        afisha.add(poster6);
        afisha.add(poster7);

        afisha.findLast();
        Poster[] expected = {poster7, poster6, poster5, poster4};
        Poster[] actual = afisha.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastLimitAboveLength() {
        PosterManager afisha = new PosterManager(8);
        afisha.add(poster1);
        afisha.add(poster2);
        afisha.add(poster3);
        afisha.add(poster4);
        afisha.add(poster5);
        afisha.add(poster6);
        afisha.add(poster7);

        afisha.findLast();
        Poster[] expected = {poster7, poster6, poster5, poster4, poster3, poster2, poster1};
        Poster[] actual = afisha.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }


}
