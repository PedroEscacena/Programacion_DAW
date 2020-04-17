package xml.Stax;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class mostrarStax {
    public static void main(String[] args) {
        ArrayList<Nike> nike = new ArrayList<>();
        Nike nikeActual = null;
        String tagActual = "";


        try {
            XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
            XMLEventReader xmlReader = xmlInputFactory.createXMLEventReader(new FileInputStream("Nike.xml"));

            while (xmlReader.hasNext()) {

                XMLEvent xmlEvent = xmlReader.nextEvent();

                if (xmlEvent.isStartElement()) {
                    StartElement startTag = xmlEvent.asStartElement();

                    System.out.print(" <" + startTag.getName().getLocalPart());

                    String tagName = startTag.getName().getLocalPart();
                    switch (tagName) {
                        case "Nike":
                            nikeActual = new Nike();
                            tagActual = "Nike";
                            Attribute tipoProducto = startTag.getAttributeByName(new QName("Sneaker"));

                            nikeActual.setTipoProducto(tipoProducto.getValue());

                            System.out.print(" " + tipoProducto.getName() + "=\"" + tipoProducto.getValue() + "\"");
                            break;

                        case "nombre":
                            tagActual = "nombre";
                            break;

                        case "Precio":
                            tagActual = "Precio";
                            break;

                        case "Unidades":
                            tagActual = "Unidades";
                            break;
                    }
                    System.out.print(">");

                } else if (xmlEvent.isEndElement()) {

                    EndElement endtag = xmlEvent.asEndElement();
                    System.out.println("<\\" + endtag.getName().getLocalPart() + ">");

                    if (endtag.getName().getLocalPart().equals("Nike")) {
                        nike.add(nikeActual);
                    }

                    tagActual = "";

                } else if (xmlEvent.isStartDocument()) {
                    System.out.println("Comienzo del parseado del documento");

                } else if (xmlEvent.isEndDocument()) {
                    System.out.println("Fin del parseado del documento");

                } else if (xmlEvent.isCharacters()) {

                    Characters texto = xmlEvent.asCharacters();

                    if (!texto.getData().contains("\n")) {
                        System.out.print(" " +texto.getData()+" ");
                    }

                    if (!tagActual.equals("")) {
                        switch (tagActual) {
                            case "nombre":
                                nikeActual.setNombre(texto.getData());
                                break;
                            case "Precio":

                                nikeActual.setPrecio(Integer.valueOf(texto.getData()));
                                break;
                            case "Unidades":
                                nikeActual.setUnidades(Integer.valueOf(texto.getData()));
                                break;
                        }
                    }
                }

            }
        } catch (FileNotFoundException | XMLStreamException e) {
            System.out.println(e.getMessage());
        }
    }
}
