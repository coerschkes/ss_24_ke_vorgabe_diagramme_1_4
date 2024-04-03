package com.github.coerschkes.ss_24_ke_vorgabe_diagramme_1_4.fxFactory;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

public abstract class BaseFXFactory implements FXFactory {

    //    /com/github/coerschkes/ss_24_ke_vorgabe_diagramme_1_4/application/userSystemControlView.fxml
    @Override
    public FXConfiguration configureFxComponents(final String title, final String fxml) throws Exception {
        final Stage stage = this.createStage(title);
        final Parent root = this.buildParent(fxml);
        final Scene scene = this.buildScene(root);
        stage.setScene(scene);
        return new FXConfiguration(stage, root, scene);
    }

    private Parent buildParent(String resource) throws Exception {
        final FXMLLoader loader = buildLoader(resource);
        final Parent root = loader.load();
        getFxmlLoaderConsumers().forEach(consumer -> consumer.accept(loader));
        return root;
    }

    private FXMLLoader buildLoader(final String resource) {
        final FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(FXFactory.BASE_PATH + resource));
        return loader;
    }

    private Stage createStage(final String title) {
        final Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle(title);
        return stage;
    }

    protected abstract Scene buildScene(Parent root);
}
