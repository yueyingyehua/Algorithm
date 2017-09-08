package shortestPath.dijkstra.xxx;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by tsuki on 2017/9/8.
 */
public class Dijkstra {

    public Set<Node> open = new HashSet<Node>();
    public Set<Node> close = new HashSet<Node>();
    //路径距离
//    Map<String, Integer> path = new HashMap<String, Integer>();
//    //路径信息
//    Map<String, String> pathInfo = new HashMap<String, String>();

//    public Node init() {
//        path.put("B", 1);
//        pathInfo.put("B", "A->B");
//        path.put("C", 1);
//        pathInfo.put("C", "A->C");
//        path.put("D", 4);
//        pathInfo.put("D", "A->D");
//        path.put("E", Integer.MAX_VALUE);
//        pathInfo.put("E", "A");
//        path.put("F", 2);
//        pathInfo.put("F", "A->F");
//        path.put("G", 5);
//        pathInfo.put("G", "A->G");
//        path.put("H", Integer.MAX_VALUE);
//        pathInfo.put("H", "A");
//    }

    public Node startA = new MapBuilder().build(open, close);

    private Node getShortPath(Node node) {
        Node res = null;
        int minDis = Integer.MAX_VALUE;
        Map<Node, Integer> childs = node.getChild();
        for (Node child : childs.keySet()) {
            if (open.contains(child)) {
                int distance = childs.get(child);
                if (distance < minDis) {
                    minDis = distance;
                    res = child;
                }
            }
        }
        return res;
    }

}
