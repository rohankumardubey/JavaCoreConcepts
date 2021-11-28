package com.company;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

public class VectorUsage {
        static class VideoGame{
        String name;
        int id;
        String[] GameNames;

        VideoGame(String name, int id, String[] GameNames) {
            this.name = name;
            this.id = id;
            this.GameNames = GameNames;

        }

        public String toString() {
            return "[" + this.name + "," + this.id + "," + Arrays.toString(this.GameNames) + "]";
        }


        }


    public static void main(String[] args){

            VideoGame game1 = new VideoGame("far cry",1,new String[]{"ios","andriod","windows"});
            VideoGame game2 = new VideoGame("dota ",2,new String[]{"ios","windows"});

            Vector<VideoGame> games = new Vector<VideoGame>();
            games.add(game1);
            games.add(game2);

            Iterator<VideoGame> itr = games.iterator();

            while(itr.hasNext()){
                System.out.println(itr.next());
            }




    }
}
