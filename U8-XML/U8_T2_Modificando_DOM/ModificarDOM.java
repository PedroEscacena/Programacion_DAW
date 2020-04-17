package xml.dom;

import org.w3c.dom.*;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class ModificarDOM {
    public static void main(String[] args) {
        try {


            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("perrera.xml"));

            Node root = doc.getDocumentElement();

            Comment comentario = doc.createComment("COMENTARIO AÑADIDO DESDE DOM");

            NodeList nl = doc.getElementsByTagName("perro");
            Node node = nl.item(nl.getLength() - 1);
            Element personaClonada = (Element) node.cloneNode(true);

            for (int i = 0; i < nl.getLength(); i++) {

                Element perroActual = (Element) doc.getElementsByTagName("perro").item(i);
               // personaClonada.insertBefore(comentario, perroActual);
                root.insertBefore(comentario, perroActual).cloneNode(true);
            }

            Element addPerro = doc.createElement("perro");
            addPerro.setAttribute("id", "6");


            Element edad = doc.createElement("edad");
            edad.setTextContent("5");

            Element nombre = doc.createElement("nombre");
            nombre.setTextContent("Mochi");

            Element duenyo = doc.createElement("duenyo");
            duenyo.setTextContent("Juan Ramón");

            addPerro.appendChild(edad);
            addPerro.appendChild(nombre);
            addPerro.appendChild(duenyo);

            root.appendChild(addPerro);

            root.replaceChild(addPerro, (Element) doc.getElementsByTagName("perro").item(0));

            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
            transformer.setOutputProperty(OutputKeys.METHOD, "xml");
            transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

            DOMSource origenDOM = new DOMSource(root);

            File newPerrera = new File("dom_modificado.xml");
            StreamResult destino = new StreamResult(newPerrera);

            transformer.transform(origenDOM, destino);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
