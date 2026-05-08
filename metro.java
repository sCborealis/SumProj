//use a map
import java.io.*;
import java.util.*;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Edge{
    String to;
    int time;
    String line;

    public Edge(String to, int time, String line){
        this.to = to;
        this.time =time;
        this.line = line;
    }
}

public class metro {
    public static void main(String[] args){
        String metroData = "Metrolink_times_linecolour(in).csv";
        String line;
        Map<String, List<Edge>> graph = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(metroData))){
            br.readLine();
            
            while((line = br.readLine()) != null){
                String[] data = line.split(",");

                if (data.length>=3){
                    String from = data[0].trim();
                    String to = data[1].trim();
                    graph.computeIfAbsent(from, k-> new ArrayList<>()).add(new Edge(to, time));
                    graph.computeIfAbsent(to, k-> new ArrayList<>()).add(new Edge(from, time));
                    
                }
            }
            printGraph(graph);

        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void printGraph(Map<String, List<Edge>> graph) {
        for (String station : graph.keySet()) {
            System.out.print(station + " -> ");
            for (Edge edge : graph.get(station)) {
                System.out.print("[" + edge.to + " | " + edge.time + " mins] ");
            }
            System.out.println();
        }
    }
}