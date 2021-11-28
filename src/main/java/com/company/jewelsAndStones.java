package com.company;

public class jewelsAndStones {
    public int numJewelsInStones(String jewels,String stones){
    int count=0;
        for (int i = 0; i < jewels.length(); i++) {
            for (int j = 0; j < stones.length(); j++) {
                if(jewels.charAt(i) == stones.charAt(j)){
                    count+=1;
                }
            }
            
        }
        return count;
    }

    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";

        jewelsAndStones sol = new jewelsAndStones();
        System.out.println(sol.numJewelsInStones(jewels,stones));
    }
}
