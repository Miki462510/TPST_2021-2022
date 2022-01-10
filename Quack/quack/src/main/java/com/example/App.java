package com.example;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public void whenJavaGotFromXmlFile_thenCorrect() throws IOException {
        File file = new File("/". classe.xml);
        XmlMapper xmlMapper = new XmlMapper();
        String xml = inputStreamToString(new FileInputStream(file));
        SimpleBean value = xmlMapper.readValue(xml, SimpleBean.class);
        assertTrue(value.getX() == 1 && value.getY() == 2);
    }
    public static void main( String[] args )
    {
      
    }
}
