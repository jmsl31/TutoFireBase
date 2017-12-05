package com.examples.meisslj1;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by johan on 05/12/2017.
 */

public class ListesOfficiel {

    List<Officiel> ListOfficiels;


    public ListesOfficiel() {

        ListOfficiels = new ArrayList<Officiel>();

    }

    private void addOfficiels(int id,String nom,String prenom,String mail,String telephone,String type,String  role,String sexe,int age){

        Officiel i = new Officiel(id,nom,prenom,mail,telephone,type,role,sexe,age);
        if ( !ListOfficiels.isEmpty())
                 ListOfficiels.add(i);
    }

        private void removeOfficiel(int item){

            ListOfficiels.remove(item);
        }

        private int count(){

            return ListOfficiels.size();
        }
}