package shortestPath.dijkstra.xxx;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by tsuki on 2017/9/8.
 */

/**
 * Node对象用于封装节点信息，包括名字和子节点
 *
 */
public class Node {
    private String name;
    //Node为子节点，Integer是到此子节点的距离
    private Map<Node, Integer> child = new HashMap<Node, Integer>();

    public Node (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Node, Integer> getChild() {
        return child;
    }

    public void setChild(Map<Node, Integer> child) {
        this.child = child;
    }
}
