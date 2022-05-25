package co.com.sophos.automatizacion.prueba.utils;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.io.IOException;

public class CaptureOffers {
    public static String byDOM(){
        try {
            Document doc = Jsoup.connect("https://www.sophossolutions.com/trabaja-con-nosotros/").get();
            Elements nombre = doc.select("div[class=premium-blog-entry-container]");
            Elements contenido = doc.select("div[class=premium-blog-post-content]");

            for (int i = 1; i <= contenido.size(); i++) {
                System.out.println("\nOferta " + i);
                System.out.println("Nombre | Fecha de publicacion\n" + nombre.get(i - 1).text());
                System.out.println("Contenido de la oferta: " + contenido.get(i - 1).ownText());
            }
        } catch (IOException e) {
            System.err.println("Se produjo un error de E/S");
        }
        return null;
    }
}
