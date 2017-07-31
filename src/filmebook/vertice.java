/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filmebook;

import java.util.ArrayList;

/**
 *
 * @author Fabio
 */
public class vertice {
    
    private data data;
    
    public vertice(data data){
        this.data = data;
    }
    
    public data getData(){
        return this.data;
    }
//    public ArrayList<movie> allWatched(ArrayList<user> usersGroup){
//        
//        ArrayList<movie> moviesInCommon = new ArrayList<movie>();
//        if(usersGroup.size() == 0){
//           return moviesInCommon;            
//        }
//        for(movie tempMovie : movies){
//            if(tempMovie.getWatched().watchedByUser(usersGroup.get(0))){
//                moviesInCommon.add(tempMovie);
//            }
//        }
//        for(user tempUser : usersGroup){
//            for(int i=moviesInCommon.size()-1; i>0 ; i--){
//                if(!movies.contains(moviesInCommon.get(i))){
//                    moviesInCommon.remove(i);
//                }
//            }
//        }
//        return moviesInCommon;
//    }
}
