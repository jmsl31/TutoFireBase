package com.examples.meisslj1;

/**
 * Created by johan on 05/12/2017.
 */

public class Officiel {

    private int id_m;
    private String nom_m;
    private String prenom_m;
    private String mail_m ;
    private String telephone_m;
    private String type_m;
    private String  role_m;
    private String sexe_m;
    private int age_m;

    public Officiel() {
    }

    public Officiel(int id_m, String nom_m, String prenom_m, String mail_m, String telephone_m, String type_m, String role_m, String sexe_m, int age_m) {
        this.id_m = id_m;
        this.nom_m = nom_m;
        this.prenom_m = prenom_m;
        this.mail_m = mail_m;
        this.telephone_m = telephone_m;
        this.type_m = type_m;
        this.role_m = role_m;
        this.sexe_m = sexe_m;
        this.age_m = age_m;
    }

}
