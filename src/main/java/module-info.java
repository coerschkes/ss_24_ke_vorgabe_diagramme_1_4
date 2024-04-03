module com.github.coerschkes.ss_24_ke_vorgabe_diagramme {
    requires javafx.controls;
    requires javafx.fxml;

    exports com.github.coerschkes.ss_24_ke_vorgabe_diagramme_1_4;
    exports com.github.coerschkes.ss_24_ke_vorgabe_diagramme_1_4.fxFactory;
    exports com.github.coerschkes.ss_24_ke_vorgabe_diagramme_1_4.application;
    exports com.github.coerschkes.ss_24_ke_vorgabe_diagramme_1_4.barChart;
    exports com.github.coerschkes.ss_24_ke_vorgabe_diagramme_1_4.lineChart;
    opens com.github.coerschkes.ss_24_ke_vorgabe_diagramme_1_4 to javafx.fxml;
    opens com.github.coerschkes.ss_24_ke_vorgabe_diagramme_1_4.application to javafx.fxml;
    opens com.github.coerschkes.ss_24_ke_vorgabe_diagramme_1_4.barChart to javafx.fxml;
    opens com.github.coerschkes.ss_24_ke_vorgabe_diagramme_1_4.lineChart to javafx.fxml;
    opens com.github.coerschkes.ss_24_ke_vorgabe_diagramme_1_4.fxFactory to javafx.fxml;
}