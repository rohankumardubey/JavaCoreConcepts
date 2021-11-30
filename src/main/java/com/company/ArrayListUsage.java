package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListUsage {
    static class VideoGame {

        int id;
        String name;
        int[] parts;

        VideoGame(int id, String name, int[] parts) {
            this.id = id;
            this.name = name;
            this.parts = parts;
        }

        public String toString() {
            return "[" + this.id + "," + this.name + "," + Arrays.toString(this.parts) + "]";
        }
    }

    public static void main(String[] args) {

        ArrayList<VideoGame> Sample = new ArrayList<>();

        VideoGame game1 = new VideoGame(1, "god of war", new int[]{1, 2, 3});
        VideoGame game2 = new VideoGame(2, "prince of persia", new int[]{1, 2, 3, 4, 5, 6});
        VideoGame game3 = new VideoGame(3, "battle field", new int[]{1, 2, 3, 4});

        Sample.add(game1);
        Sample.add(game2);
        Sample.add(game3);

        for (VideoGame v : Sample) {
            System.out.println(v);
        }
        System.out.println();
    }
}
