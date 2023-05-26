package ru.netology.MockitoGioeva;

public class PosterManager {
    private Poster[] posters = new Poster[0];
    private int limit;

    public PosterManager(int limit) {
        this.limit = limit;

    }

    public PosterManager() {
        this.limit = 5;

    }

    public void add(Poster poster) {
        Poster[] tmp = new Poster[posters.length + 1];
        for (int i = 0; i < posters.length; i++) {
            tmp[i] = posters[i];
        }
        tmp[tmp.length - 1] = poster;
        posters = tmp;
    }

    public Poster[] findAll() {
        return posters;
    }

    public Poster[] findLast() {
        int resultLength;
        if (posters.length < 5) {
            resultLength = posters.length;
        } else {
            resultLength = 5;
        }
        Poster[] result = new Poster[resultLength];

        for (int i = 0; i < result.length; i++) {
            result[i] = posters[resultLength - 1 - i];
        }
        return result;

    }
}
