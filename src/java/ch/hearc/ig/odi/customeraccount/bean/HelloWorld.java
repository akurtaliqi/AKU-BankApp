/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.customeraccount.bean;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author ajtene.kurtaliq
 */
@Named(value = "helloWorld")
@SessionScoped

public class HelloWorld implements Serializable {

    public HelloWorld() {
        
    }

    private String sentence = "Hello World!";

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String world) {
        this.sentence = world;
    }

}
