package Lecture13;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Stack;

public class BreadthFirstSearch {
    public boolean BFS(int src, int dst){ 
    LinkedList<Integer> qq= new LinkedList<>(); 
    HashSet<Integer> visited= new HashSet<>(); 
    qq.add(src); 
    while(!qq.isEmpty()){ 
        //remove  
        int r= qq.remove(); 
        //ignore if already visited 
        if(visited.contains(r)) 
            continue; 

        //mark visited 
        visited.add(r); 
        if(r==dst) 
            return true; 
        for(int nbrs: map.get(r).keySet()){ 
            if(!visited.contains(nbrs)) 
                qq.add(nbrs); 
            } 
    } 
    return false; 
    } 

    public boolean DFS(int src, int dst){
        Stack<Integer> stk = new Stack<>();
        HashSet<Integer> visited = new HashSet<>();
        stk.push(src);
        while(!stk.isEmpty()){
            //remove
            int r = stk.pop();
            //Ignore if visited
            if(visited.contains(r))
                continue;
            //visited Mark
            visited.add(r);
            if(r==dst)
                return true;
            for(int nbrs: map.get(r).keySet()){
                if(!visited.contains(nbrs))
                    stk.push(nbrs);
            }
        }
        return false;
    }
}
