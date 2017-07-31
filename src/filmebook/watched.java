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
public class watched {
    
    private ArrayList<user> watchedBy;
    private ArrayList<Float> grade;
    
    public watched(){
        this.watchedBy = new ArrayList<user>();
        this.grade = new ArrayList<Float>();
    }
    
    public void addWatched(user user,Float grade){
        this.watchedBy.add(user);
        this.grade.add(grade);
    }
    
    public ArrayList<user> getWatched(){
        return this.watchedBy;
    }
    
    public Boolean watchedByUser(user user){
        for(user tempUser : watchedBy){
            if(tempUser.getCPF().equals(user.getCPF())){
                return true;
            }
        }
        return false;
    }
}
