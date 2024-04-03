package com.github.coerschkes.ss_24_ke_vorgabe_diagramme_1_4.fxFactory;

import com.github.coerschkes.ss_24_ke_vorgabe_diagramme_1_4.Chart;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class DiagramFXFactory extends BaseFXFactory {
    private final List<String> values = new ArrayList<>();

    @Override
    public List<Consumer<FXMLLoader>> getFxmlLoaderConsumers() {
        return List.of(this::initDiagramValues);
    }

    @Override
    protected Scene buildScene(Parent root) {
        return new Scene(root, 450, 450);
    }

    public void updateValues(final List<String> list) {
        values.clear();
        values.addAll(list);
    }

    private void initDiagramValues(FXMLLoader loader) {
        final Chart controller = loader.getController();
        controller.initValues(values);
    }
}
