package com.github.coerschkes.ss_24_ke_vorgabe_diagramme_1_4.fxFactory;

import javafx.fxml.FXMLLoader;

import java.util.List;
import java.util.function.Consumer;

public interface FXFactory {
    String BASE_PATH = "/com/github/coerschkes/ss_24_ke_vorgabe_diagramme_1_4/";

    FXConfiguration configureFxComponents(final String title, final String fxml) throws Exception;

    List<Consumer<FXMLLoader>> getFxmlLoaderConsumers();
}
