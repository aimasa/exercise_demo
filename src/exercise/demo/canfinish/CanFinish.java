package exercise.demo.canfinish;

import java.util.*;

public class CanFinish  {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List[] mapLists = new ArrayList[numCourses];
        int[] num = new int[numCourses];
        Queue<Integer> que = new LinkedList<>();
        for(int i = 0; i < prerequisites.length; i++){
            int lastCourse = prerequisites[i][0];
            int corCourse = prerequisites[i][1];
            if(mapLists[corCourse] == null){
                mapLists[corCourse] = new ArrayList<>();
            }
            num[corCourse] += 1;
            mapLists[corCourse].add(lastCourse);
        }
        for(int i = 0; i < numCourses; i++){
            if(num[i] == 0){
                que.add(i);
            }
        }
        if(que.isEmpty()){
            return true;
        }
        List<Integer> studiedCourse = new ArrayList<>();
        while(!que.isEmpty()){
            int cor = que.poll();
            if(studiedCourse.contains(cor)){
                continue;
            }
            if(mapLists[cor] != null){
                List<Integer> list = mapLists[cor];
                for(int tmp : list){
                    num[tmp] -= 1;
                    if(num[tmp] == 0) que.add(tmp);
                }
                studiedCourse.add(cor);
            }
        }
        for(int i = 0; i < num.length; i++){
            if(num[i] != 0){

                return false;
            }
        }


        return true;
    }
}