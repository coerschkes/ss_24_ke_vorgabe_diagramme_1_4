package com.github.coerschkes.ss_24_ke_vorgabe_diagramme_1_4.fxFactory;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.util.List;
import java.util.function.Consumer;

public class BasicFxFactory extends BaseFXFactory {
    @Override
    public List<Consumer<FXMLLoader>> getFxmlLoaderConsumers() {
        return List.of();
    }

    @Override
    public Scene buildScene(Parent root) {
        return new Scene(root, 300, 380);
    }
}
