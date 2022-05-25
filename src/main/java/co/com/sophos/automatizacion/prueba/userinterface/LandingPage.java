package co.com.sophos.automatizacion.prueba.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LandingPage {
    public static final Target POP_UP = Target.the("Ventana emergente al abrir el sitio web")
            .located(By.id("sg-popup-content-wrapper-5998"));
    public static final Target OFF_THE_PAGE = Target.the("Presionar fuera de la ventana emergente")
            .located(By.xpath("//*[@id=\"content\"]/article/div/div/div/div/section[1]/div[2]"));
    public static final Target TRABAJO_BUTTON = Target.the("Boton de Trabaja con Nosotros")
            .located(By.xpath("//*[@id=\"mega-menu-item-1541\"]/a"));
}
