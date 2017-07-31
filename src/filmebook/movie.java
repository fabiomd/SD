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
public class movie {
    
    private String title;
    private String description;
    private watched watched;
    
    public movie(String title,String description){
        this.title = title;
        this.description = description;
        this.watched = new watched();
    }
    
    public void setTitle(String title){
        this.title = title;
    }
    
    public void setDescription(String description){
        this.description = description;
    }
    
    public String getTitle(){
        return this.title;
    }
    
    public String getDescription(){
        return this.description;
    }
    
    public watched getWatched(){
        return this.watched;
    }
}
