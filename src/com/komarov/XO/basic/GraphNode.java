package com.komarov.XO.basic;

import java.util.Set;

public class GraphNode {

    private final Field node;

    private final Set<GraphNode> children;

    public GraphNode(final Field node, Set <GraphNode> children){
        this.node = node;
        this.children = children;
    }

    public Field getNode(){
        return node;
    }

    public Set<GraphNode> getChildren(){
        return children;
    }

}
