package com.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class XMLHelper {

    private Root c;

    public XMLHelper(Root c) {
        this.c = c;
    }

    public void SerlalizeXML_Into_String(Root c) throws IOException {
        XmlMapper xmlmapper = new XmlMapper();
        String xml = xmlmapper.writeValueAsString(c);
    }

    public void SerlalizeXML_File() throws IOException {
        XmlMapper xmlmapper = new XmlMapper();
        xmlmapper.writeValue(new File("./Quack/quack/classe.xml"), this.c);
        File file = new File("./Quack/quack/classe.xml");
    }

    public void DeserializeXML_Into_String() throws IOException {
        XmlMapper xmlmapper = new XmlMapper();
        Root value = xmlmapper.readValue("./Quack/quack/classe.xml", this.c);
    }

    public void DeserlalizeXML_File() throws IOException {
        XmlMapper xmlmapper = new XmlMapper();
        File file = new File("./Quack/quack/classe.xml");
        String xml = inputStreamToString(new FileInputStream(file));
        Root value = xmlmapper.readValue(xml, this.c);
    }

    public String inputStreamToString(InputStream is) throws IOException {
        StringBuilder sb = new StringBuilder();
        String line;
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        while ((line = br.readLine()) != null) {
            sb.append(line);
        }
        br.close();
        return sb.toString();
    }
}
