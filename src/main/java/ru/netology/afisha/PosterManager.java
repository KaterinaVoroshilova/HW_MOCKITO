package ru.netology.afisha;

public class PosterManager {

    private Poster[] poster = new Poster[0];
    private int limit = 5;

    public PosterManager(int limit) {
        this.limit = limit;
    }

    public PosterManager() {
    }

    public void add(Poster item) {
        Poster[] tmp = new Poster[poster.length + 1];
        for (int i = 0; i < poster.length; i++) {
            tmp[i] = poster[i];
        }
        tmp[tmp.length - 1] = item;
        poster = tmp;
    }

    public Poster[] findAll() {
        return poster;
    }

    public Poster[] findLast() {
        Poster[] reversed = new Poster[poster.length];
        int resultLength;

        if (limit < poster.length) {
            resultLength = limit;
        } else {
            resultLength = poster.length;
        }

        Poster[] result = new Poster[resultLength];

        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = poster[poster.length - 1 - i];
        }
        for (int i = 0; i < resultLength; i++) {
            result[i] = reversed[i];
        }
        return result;
    }

}
