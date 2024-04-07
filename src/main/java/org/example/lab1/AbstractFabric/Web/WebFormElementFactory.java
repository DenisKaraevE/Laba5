package org.example.lab1.AbstractFabric.Web;


import org.example.lab1.AbstractFabric.Button;
import org.example.lab1.AbstractFabric.Checkbox;
import org.example.lab1.AbstractFabric.FormElementFactory;
import org.example.lab1.AbstractFabric.Input;


public class WebFormElementFactory implements FormElementFactory {
    public Button createButton() {
        return new WebButton();
    }

    public Checkbox createCheckbox() {
        return new WebCheckbox();
    }

    public Input createInput() {
        return new WebInput();
    }
}
