package com.github.coerschkes.ss_24_ke_vorgabe_diagramme_1_4.barChart;

import com.github.coerschkes.ss_24_ke_vorgabe_diagramme_1_4.Chart;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

import java.util.Arrays;
import java.util.List;

public class BarChartControl implements Chart {

    @FXML
    BarChart<String, Number> barChart;
    @FXML
    CategoryAxis categoryAxis;
    @FXML
    NumberAxis numberAxis;

    @Override

    public void initValues(List<String> values) {
        barChart.setTitle("Balkendiagramm");
        categoryAxis.setCategories(FXCollections.observableArrayList(Arrays.asList("vor 2000", "nach 2000")));
        categoryAxis.setLabel("Erläuterung");
        numberAxis.setLabel("Anzahl");

        barChart.getData().addAll(buildSeries(values));
    }

    private List<XYChart.Series<String, Number>> buildSeries(final List<String> values) {
        if (values.size() != 4 || values.contains("")) {
            throw new IllegalArgumentException();
        }
        XYChart.Series<String, Number> info = new XYChart.Series<>();
        info.setName("Informatik");
        info.getData().add(new XYChart.Data<>("vor 2000", Integer.valueOf(values.get(0))));
        info.getData().add(new XYChart.Data<>("nach 2000", Integer.valueOf(values.get(2))));
        XYChart.Series<String, Number> electric = new XYChart.Series<>();
        electric.setName("Elektrotechnik");
        electric.getData().add(new XYChart.Data<>("vor 2000", Integer.valueOf(values.get(1))));
        electric.getData().add(new XYChart.Data<>("nach 2000", Integer.valueOf(values.get(3))));

        return List.of(info, electric);
    }


}
