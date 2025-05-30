/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinal3;
import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
/**
 *
 * @author fernada
 */
public class LeecturaUsuarios {
    public static void guardarUsuario(List<Usuario> usuarios, File archivo) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.newDocument();

            Element root = doc.createElement("usuarios");
            doc.appendChild(root);

            for (Usuario u : usuarios) {
                Element usuarioElem = doc.createElement("usuario");

                Element nombre = doc.createElement("nombre");
                nombre.appendChild(doc.createTextNode(u.getNombre()));
                usuarioElem.appendChild(nombre);

                // Cambié la etiqueta a nombreUsuario para evitar confusión
                Element user = doc.createElement("nombreUsuario");
                user.appendChild(doc.createTextNode(u.getUsuario()));
                usuarioElem.appendChild(user);

                Element pass = doc.createElement("password");
                pass.appendChild(doc.createTextNode(u.getPassword()));
                usuarioElem.appendChild(pass);

                Element rol = doc.createElement("rol");
                rol.appendChild(doc.createTextNode(String.valueOf(u.getRol())));
                usuarioElem.appendChild(rol);

                root.appendChild(usuarioElem);
            }

            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty("indent", "yes"); // formato bonito
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(archivo);
            transformer.transform(source, result);

            System.out.println("Usuarios guardados correctamente.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<Usuario> leecturaUsuarios(File archivo) {
        List<Usuario> listaUsuarios = new ArrayList<>();
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(archivo);
            doc.getDocumentElement().normalize();

            NodeList nodeList = doc.getElementsByTagName("usuario");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);

                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;

                    String nombre = getTagValue("nombre", element);
                    String usuario = getTagValue("nombreUsuario", element);  // cambio aquí también
                    String password = getTagValue("password", element);
                    String rolStr = getTagValue("rol", element);

                    if (nombre != null && usuario != null && password != null && rolStr != null) {
                        int rol = Integer.parseInt(rolStr);
                        Usuario u = new Usuario(nombre, usuario, password, rol);
                        listaUsuarios.add(u);
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaUsuarios;
    }

    private static String getTagValue(String tag, Element element) {
        NodeList nodeList = element.getElementsByTagName(tag);
        if (nodeList != null && nodeList.getLength() > 0) {
            Node node = nodeList.item(0);
            if (node != null) {
                return node.getTextContent();
            }
        }
        return null;
    }

}
