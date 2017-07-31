/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filmebook;

/**
 *
 * @author Fabio
 */
public class filmeBook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        data c1 = new data();
        
        c1.addMovie(new movie("Harry Potter","Menino vira bruxo"));
        c1.addUser(new user("123456789"));
        
        movie temp = c1.getMovies().get(0);
        temp.addWatchedByUser(c1.getUsers().get(0), 10f);
    }
    
}
