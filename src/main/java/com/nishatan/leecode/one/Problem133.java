package com.nishatan.leecode.one;

import java.util.*;

public class Problem133 {
    public static void main(String[] args) {

    }

    public Node cloneGraph(Node node) {
        if (node==null){
            return null;
        }
        LinkedList<Node> queue = new LinkedList<>();
        HashMap<Node, Node> map =  new HashMap<>();
        queue.add(node);
        Node res = new Node(node.val, new ArrayList<>(node.neighbors));
        map.put(node, res);
        while (!queue.isEmpty()){
            Node poll = queue.poll();
            for (Node neighbor : poll.neighbors) {
                if (!map.containsKey(neighbor)){
                    map.put(neighbor, new Node(neighbor.val, (ArrayList<Node>) neighbor.neighbors));
                    queue.add(neighbor);
                }
            }
        }

        for (Map.Entry<Node, Node> entry : map.entrySet()) {
            List<Node> nodes = new ArrayList<>();
            for (Node neighbor : entry.getValue().neighbors) {
                nodes.add(map.get(neighbor));
            }
            entry.getValue().neighbors=nodes;
        }
        return  res;
    }




}
