package xml.Stax;

import java.util.ArrayList;
import javax.swing.text.Document;
import javax.xml.stream.*;
import javax.xml.stream.events.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class crearStaxCero {
    public static void main(String[] args) {
        ArrayList<Nike> array = new ArrayList<>(10);

        array.add(0, new Nike("Zoom 2k",120, "Sneaker",3000));
        array.add(1, new Nike("Guarache",120, "Sneaker",5000));
        array.add(2, new Nike("Nike MAG",40020, "Sneaker",7000));
        array.add(3, new Nike("Jordan1",220, "Sneaker",20000));
        array.add(4, new Nike("Jordan2",320, "Sneaker",200000));
        array.add(5, new Nike("Jordan3",420, "Camiseta",20010));
        array.add(6, new Nike("Jordan4",520, "Sneaker",20020));
        array.add(7, new Nike("Jordan5",220, "Sneaker",20060));
        array.add(8, new Nike("Jordan6",320, "Sneaker",20050));
        array.add(9, new Nike("Jordan7",120, "Sneaker",20));

        try {

            XMLOutputFactory xmlOutputFactory = XMLOutputFactory.newInstance();
            XMLEventWriter xmlWriter = xmlOutputFactory.createXMLEventWriter(new FileOutputStream("stax.xml"));

            XMLEventFactory eventFactory = XMLEventFactory.newInstance();

            StartDocument startDocument = eventFactory.createStartDocument();
            xmlWriter.add(startDocument);

            Characters saltoDeLinea = eventFactory.createCharacters("\n");
            Characters saltoDeLineaTab = eventFactory.createCharacters("\n\t");
            Characters tabulador = eventFactory.createCharacters("\t");
            xmlWriter.add(saltoDeLinea);



            StartElement NikeStartElement = eventFactory.createStartElement("","","SneakerShop");
            xmlWriter.add(NikeStartElement);
            xmlWriter.add(saltoDeLineaTab);

            //Recorro pedidos y voy creando las etiquetas (eventos) necesarias para cada uno de elllas

            //Esta variable la creo para controlar si es el último de los pedidos ya que querré diferente salida
            int longitud = 0;

            for (Nike zapatilla : array) {

                //Creo todas las etiquetas de apertura  que va a tener cada uno de los pedidos
                StartElement tipoStart = eventFactory.createStartElement("","","tipoProducto");
                StartElement nombreStart = eventFactory.createStartElement("","","nombre");
                StartElement precioStart = eventFactory.createStartElement("","","Precio");
                StartElement unidadesStart = eventFactory.createStartElement("","","Unidades");


                //Creo el atribudo id
                Attribute tipo = eventFactory.createAttribute("Tipo",(zapatilla.getTipoProducto()));


                //Creo todas las etiquetas de cierre que va a tener cada uno de los pedidos
                EndElement tipoEnd = eventFactory.createEndElement("","","tipoProducto");
                EndElement nombreEnd = eventFactory.createEndElement("","","nombre");
                EndElement precioEnd = eventFactory.createEndElement("","","Precio");
                EndElement unidadesEnd = eventFactory.createEndElement("","","Unidades");

                //Creo los contenidos
                Characters nombre = eventFactory.createCharacters(zapatilla.getNombre());
                Characters precio  = eventFactory.createCharacters(Integer.toString(zapatilla.getPrecio()));
                Characters unidades = eventFactory.createCharacters(Double.toString(zapatilla.getUnidades()));



                //Añado todos los elementos correspondientes a un pedido en el orden que es necesario
                xmlWriter.add(tipoStart);

                //Añado el atributo
                xmlWriter.add(tipo);

                xmlWriter.add(saltoDeLineaTab);
                xmlWriter.add(tabulador);

                //Lo hijos de cada pedido
                xmlWriter.add(nombreStart);
                xmlWriter.add(nombre);
                xmlWriter.add(nombreEnd);
                xmlWriter.add(saltoDeLineaTab);
                xmlWriter.add(tabulador);
                xmlWriter.add(precioStart);
                xmlWriter.add(precio);
                xmlWriter.add(precioEnd);
                xmlWriter.add(saltoDeLineaTab);
                xmlWriter.add(tabulador);
                xmlWriter.add(unidadesStart);
                xmlWriter.add(unidades);
                xmlWriter.add(unidadesEnd);
                xmlWriter.add(saltoDeLineaTab);

                //Cierro el pedido que estoy escribiendo
                xmlWriter.add(tipoEnd);

                //En el último quiero un tratamiendo diferente
                if (longitud == array.size() - 1) {
                    xmlWriter.add(saltoDeLinea);
                } else {
                    xmlWriter.add(saltoDeLineaTab);
                }
                longitud++;

            }



            //Creo el evento necesario para cerrar la etiqueta raíz pedidos
            EndElement pedidosEndElement = eventFactory.createEndElement("","","pedidos");
            xmlWriter.add(pedidosEndElement);
            xmlWriter.add(saltoDeLinea);



            //Creo el evento de finalización del documento y lo escribo con el objeto escritor
            EndDocument endDocument = eventFactory.createEndDocument();
            xmlWriter.add(endDocument);


        } catch (XMLStreamException | FileNotFoundException e) {
            System.out.println(e.getStackTrace());
        }




    }
}
