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
public class data {
    
    private ArrayList<movie> movies;
    private ArrayList<user> users;
    
    public data(){
        this.movies = new ArrayList<movie>();
        this.users = new ArrayList<user>();
    }
    
    public ArrayList<movie> getMovies(){
        return this.movies;
    }
    
    public ArrayList<user> getUsers(){
        return this.users;
    }
    
    public void addMovie(movie movie){
        this.movies.add(movie);
    }
    
    public void addUser(user user){
        this.users.add(user);
    }
    
    public ArrayList<movie> allWatched(ArrayList<user> usersGroup){
        
        ArrayList<movie> moviesInCommon = new ArrayList<movie>();
        if(usersGroup.size() == 0){
           return moviesInCommon;            
        }
        for(movie tempMovie : movies){
            if(tempMovie.getWatched().watchedByUser(usersGroup.get(0))){
                moviesInCommon.add(tempMovie);
            }
        }
        for(user tempUser : usersGroup){
            for(int i=moviesInCommon.size()-1; i>0 ; i--){
                if(!movies.contains(moviesInCommon.get(i))){
                    moviesInCommon.remove(i);
                }
            }
        }
        return moviesInCommon;
    }
}