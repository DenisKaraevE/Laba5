package org.example.lab1.AbstractFabric;

import org.example.lab1.AbstractFabric.Mob.MobFormElementFactory;
import org.example.lab1.AbstractFabric.Web.WebFormElementFactory;

public class AbstractFabricService {
    private FormElementFactory initFactory() {
        Configuration configuration = Configuration.initMob();

        FormElementFactory factory = null;
        switch(configuration.getPlatform()) {
            case (1):
                factory = new WebFormElementFactory();
                break;
            case (2):
                factory = new MobFormElementFactory();
                break;
            default:
                try {
                    throw new Exception("Не известный тип платформы");
                } catch (Exception e) {
                    
                }
               
                break;
        }

        return factory;
    }

    private void renderForm(FormElementFactory factory) {
        Input input = factory.createInput();
        Button button = factory.createButton();

        input.value("Тестовое значение поля ввода данных");
        input.render();
        button.render();
    }

    public void exec() {
        renderForm(
                initFactory()
        );
    }
}
