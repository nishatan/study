package com.nishatan.arrow;

public class PrintTree {
    public static void main(String[] args) {
        Tree tree = new Tree();
        Tree.Node root = tree.getRoot();
        postPrint(root);
    }

    public static void prePrint(Tree.Node tree) {
        System.out.println(tree.getData());
        if (tree.getLchid()!=null){
            prePrint(tree.getLchid());
        }
        if (tree.getRchild()!=null){
            prePrint(tree.getRchild());
        }
    }

    public static void midPrint(Tree.Node tree) {
        if (tree.getLchid()!=null){
            midPrint(tree.getLchid());
        }
        System.out.println(tree.getData());
        if (tree.getRchild()!=null){
            midPrint(tree.getRchild());
        }
    }

    public static void postPrint(Tree.Node tree) {
        if (tree.getLchid()!=null){
            postPrint(tree.getLchid());
        }
        if (tree.getRchild()!=null){
            postPrint(tree.getRchild());
        }
        System.out.println(tree.getData());
    }
}
