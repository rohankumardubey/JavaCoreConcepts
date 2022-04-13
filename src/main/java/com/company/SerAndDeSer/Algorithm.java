package com.company.SerAndDeSer;

import java.util.*;

public class Algorithm {
    public static class TreeNode{
        int val;
        TreeNode right;
        TreeNode left;
        TreeNode(int val){
            this.val=val;
        }
    }

    public static String serialize(TreeNode node){
        if(node==null){
            return "N";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(node.val);
        sb.append(",");
        sb.append(serialize(node.left));
        sb.append(",");
        sb.append(serialize(node.right));

        return sb.toString();
    }

    public static TreeNode deserialize(String data){
        Queue<String> q = new LinkedList<>(new ArrayList<>(Arrays.asList(data.split(","))));
        return uniq(q);
    }

    public static TreeNode uniq(Queue<String> queue){
        String str = queue.poll();
        if(str.equals("N")){return null;}
        TreeNode node = new TreeNode(Integer.parseInt(str));
        node.left = uniq(queue);
        node.right = uniq(queue);
        return node;
    }


    public static void main(String[] args) {

        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);

        System.out.println(serialize(node));
        System.out.println(deserialize(serialize(node)));

    }
}