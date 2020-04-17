package xml.dom;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.ArrayList;

public class DomDesdeCero {
    public static void main(String[] args) {
        ArrayList<Cancion> array = new ArrayList<>(10);

        array.add(0, new Cancion("BUTTERFLY EFFECT", "Travis Scott", 3.11));
        array.add(1, new Cancion("STARGAZING", "Travis Scott", 3.00));
        array.add(2, new Cancion("CAROUSEL", "Travis Scott", 5.13));
        array.add(3, new Cancion("SICKO MODE", "Travis Scott ft. Drake", 2.31));
        array.add(4, new Cancion("STOP TRYING TO BE GOD", "Travis Scott ft. Tyga", 4.00));
        array.add(5, new Cancion("NO BYSTANDERS", "Travis Scott", 5.13));
        array.add(6, new Cancion("SKELETONS", "Travis Scott ft. Lil Baby", 4.31));
        array.add(7, new Cancion("WAKE UP", "Travis Scott", 5.13));
        array.add(8, new Cancion("ASTROTHUNDER", "Travis Scott", 4.31));
        array.add(9, new Cancion("YOSEMITE", "Travis Scott & ", 4.31));



        try {

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();

            Document doc = db.newDocument();

            Element root = doc.createElement("Disco");

            doc.appendChild(root);

            for (int i = 0; i < array.size(); i++) {

                Element songTag = doc.createElement("Cancion");
                songTag.setAttribute("Artista",array.get(i).getArtista());

                Element titulo = doc.createElement("Título");
                titulo.setTextContent(array.get(i).getTitulo());

                Element duracion = doc.createElement("Duración");
                duracion.setTextContent(Double.toString(array.get(i).getDuracion()));

                songTag.appendChild(titulo);
                songTag.appendChild(duracion);

                root.appendChild(songTag);
            }



            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();

            transformer.setOutputProperty( OutputKeys.INDENT, "yes" );
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformer.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "no" );
            transformer.setOutputProperty( OutputKeys.METHOD, "xml" );
            transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

            DOMSource origenDOM = new DOMSource(root);

            File nuevoPersonas = new File("cero.xml");
            StreamResult destino = new StreamResult(nuevoPersonas);

            transformer.transform(origenDOM,destino);


        } catch (Exception e ) {
            e.printStackTrace();
        }

    }
}
