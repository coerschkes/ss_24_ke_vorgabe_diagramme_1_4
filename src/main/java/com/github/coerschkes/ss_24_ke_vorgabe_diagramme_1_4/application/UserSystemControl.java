package com.github.coerschkes.ss_24_ke_vorgabe_diagramme_1_4.application;

import com.github.coerschkes.ss_24_ke_vorgabe_diagramme_1_4.fxFactory.DiagramFXFactory;
import com.github.coerschkes.ss_24_ke_vorgabe_diagramme_1_4.fxFactory.FXConfiguration;
import com.github.coerschkes.ss_24_ke_vorgabe_diagramme_1_4.fxFactory.FXFactory;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class UserSystemControl {
    private static final String CURVE_DIAGRAM_STAGE_TITLE = "Kurvendiagramm";
    private static final String BAR_GRAPH_STAGE_TITLE = "Balkendiagramm";
    private static final String CURVE_DIAGRAM_FXML = "curveDiagram/curveDiagramView.fxml";
    private static final String BAR_GRAPH_FXML = "barGraph/barGraphView.fxml";
    private static final FXFactory fxFactory = new DiagramFXFactory();
    @FXML
    private TextField value1;
    @FXML
    private TextField value2;
    @FXML
    private TextField value3;
    @FXML
    private TextField value4;

    @FXML
    private void drawCurveDiagram() throws Exception {
        final FXConfiguration fxConfiguration = fxFactory.configureFxComponents(CURVE_DIAGRAM_STAGE_TITLE, CURVE_DIAGRAM_FXML);
        fxConfiguration.stage().showAndWait();
    }

    @FXML
    private void drawBarGraph() throws Exception {
        final FXConfiguration fxConfiguration = fxFactory.configureFxComponents(BAR_GRAPH_STAGE_TITLE, BAR_GRAPH_FXML);
        fxConfiguration.stage().showAndWait();
    }
}
