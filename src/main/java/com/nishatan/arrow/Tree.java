package com.nishatan.arrow;

import java.util.ArrayList;
import java.util.List;

public class Tree {
    private Node root;
    private List<Node> list = new ArrayList<Node>();

    public Tree() {
        init();
    }

    //树的初始化:先从叶节点开始,由叶到根
    public void init() {
        Node x = new Node("X", null, null);
        Node y = new Node("Y", null, null);
        Node d = new Node("d", x, y);
        Node e = new Node("e", null, null);
        Node f = new Node("f", null, null);
        Node c = new Node("c", e, f);
        Node b = new Node("b", d, null);
        Node a = new Node("a", b, c);
        root = a;
    }

    public Node getRoot() {
        return root;
    }

    //定义节点类：
    class Node {
        private String data;
        private Node lchid;//定义指向左子树的指针
        private Node rchild;//定义指向右子树的指针

        public Node(String data, Node lchild, Node rchild) {
            this.data = data;
            this.lchid = lchild;
            this.rchild = rchild;
        }

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public Node getLchid() {
            return lchid;
        }

        public void setLchid(Node lchid) {
            this.lchid = lchid;
        }

        public Node getRchild() {
            return rchild;
        }

        public void setRchild(Node rchild) {
            this.rchild = rchild;
        }
    }
}