/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstpackage;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;

/**
 *
 * @author tkint
 */
@Named(value = "firstManagedBean")
@SessionScoped
public class FirstManagedBean implements Serializable {

    private List<Personne> liste;
    private Personne personne;

    /**
     * Creates a new instance of FirstManagedBean
     */
    public FirstManagedBean() {
    }

    @PostConstruct
    public void init() {
       this.liste = new ArrayList<>();
       this.personne = new Personne();
    }

    public List<Personne> getListe() {
        return liste;
    }

    public void setListe(List<Personne> liste) {
        this.liste = liste;
    }

    public Personne getPersonne() {
        return personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }

    public String ajoutPersonne() {
        liste.add(personne);
        personne = new Personne();
        return "index";
    }
}
