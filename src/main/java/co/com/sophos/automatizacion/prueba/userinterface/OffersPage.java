package co.com.sophos.automatizacion.prueba.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class OffersPage {
    public static final Target TODOS_BUTTON = Target.the("Boton de todos")
            .located(By.id("s"));
    public static final Target VERIFY = Target.the("Verifica la primera oferta para poder imprimir todas las siguientes")
            .located(By.xpath("//*[@id=\"content\"]/article/div/div/div/div/section[2]/div/div/div/div/div/div[2]/div/div[1]/div[2]/div[1]/div/div[2]/div[1]/div/h3/a"));
}
