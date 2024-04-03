package com.github.coerschkes.ss_24_ke_vorgabe_diagramme_1_4.lineChart;

import com.github.coerschkes.ss_24_ke_vorgabe_diagramme_1_4.Diagram;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

import java.util.List;

public class LineChartControl implements Diagram {

    @FXML
    LineChart<Integer, Integer> lineChart;
    @FXML
    NumberAxis xAxis;
    @FXML
    NumberAxis yAxis;

    @Override
    public void initValues(final List<String> values) {
        final XYChart.Series<Integer, Integer> series = buildSeries(values);
        series.setName("kurve");
        lineChart.getData().add(series);
    }

    private XYChart.Series<Integer, Integer> buildSeries(final List<String> values) {
        final XYChart.Series<Integer, Integer> series = new XYChart.Series<>();
        for (int i = 0; i < values.size(); i++) {
            if (values.get(i).isEmpty()) {
                continue;
            }
            series.getData().add(new XYChart.Data<>(i, Integer.valueOf(values.get(i))));
        }
        return series;
    }
}

