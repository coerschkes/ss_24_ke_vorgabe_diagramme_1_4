package com.github.coerschkes.ss_24_ke_vorgabe_diagramme_1_4;

import com.github.coerschkes.ss_24_ke_vorgabe_diagramme_1_4.fxFactory.BasicFxFactory;
import com.github.coerschkes.ss_24_ke_vorgabe_diagramme_1_4.fxFactory.FXConfiguration;
import com.github.coerschkes.ss_24_ke_vorgabe_diagramme_1_4.fxFactory.FXFactory;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    private static final String TITLE = "Anwendersystem Diagramme";
    private static final String APPLICATION_FXML = "application/userSystemControlView.fxml";
    private static final String APPLICATION_CSS = "application/application.css";
    private static final FXFactory fxFactory = new BasicFxFactory();

    @Override
    public void start(Stage stage) throws Exception {
        final FXConfiguration fxConfiguration = fxFactory.configureFxComponents(TITLE, APPLICATION_FXML);
        fxConfiguration.scene().getStylesheets().add(getClass().getResource(APPLICATION_CSS).toExternalForm());
        stage = fxConfiguration.stage();

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
