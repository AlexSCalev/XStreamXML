package dto;

import com.thoughtworks.xstream.XStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.io.xml.StaxDriver;

public class XStreamTester {
    public static void main(String[] args) {
        XStream xstream = new XStream(new StaxDriver());
//        Set Read anotation
        xstream.processAnnotations(ValCurs.class);
        try {
//            Generate File new file

//            ObjectOutputStream objectOutputStream = xstream.createObjectOutputStream(
//                  new FileOutputStream("tester.xml"));
//            objectOutputStream.writeObject(object1);
//            objectOutputStream.close();
            URL keks = new URL("http://bnm.md/en/official_exchange_rates?get_xml=1&date=13.02.2018");
//         or Read file exist file
//            ObjectInputStream objectInputStream = xstream.createObjectInputStream(keks.openStream());
            ValCurs object2 = (ValCurs) xstream.fromXML(keks.openStream());

//             Objecct date Print Date
            System.out.println(object2);

        } catch (IOException e) {
            e.printStackTrace();

        }
    }

}
