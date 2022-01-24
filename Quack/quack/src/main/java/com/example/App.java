package com.example;

import java.io.IOException;

public class App {
    public static void main(String[] args) {
        Root c1 = new Root(2018, 3, "IA");
        Aula a1 = new Aula("13CE", 20);
        Studente s1 = new Studente(2003, "Adrian", "Cimara");
        Studente s2 = new Studente(2003, "Lorenzo", "Bencini");
        Studente s3 = new Studente(2003, "Filippo", "Gigli");
        Root c2 = new Root(2018, a1, 3, "AI");

        XMLHelper xmll = new XMLHelper(c2);

        xmll.SerlalizeXML_Into_String(c2);
        xmll.SerlalizeXML_File();
        System.out.println(xmll.DeserializeXML_Into_String());
        xmll.DeserlalizeXML_File();
    }
}
