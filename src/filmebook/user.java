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
public class user {
    
    private String CPF;
    
    public user(String CPF){
        this.CPF = CPF;
    }
    
    public String getCPF(){
        return this.CPF;
    }
}
