package com.iesochoa.victorsanchez.ud5t4multidimensional;

import com.iesochoa.victorsanchez.ud5t4multidimensional.model.VentasSemanales;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class VentasController implements Initializable {

        private VentasSemanales ventasSemanales;

        @FXML
        private Label apInicio;

        @FXML
        private AnchorPane apPeriodicosIniciado;

        @FXML
        private Button btGuardar;

        @FXML
        private Button btIniciar;

        @FXML
        private Button btMediaSemana;

        @FXML
        private Button btReiniciar;

        @FXML
        private Button btTotalSemana;

        @FXML
        private Button btVerTodos;

        @FXML
        private ComboBox<Integer> cbDia;

        @FXML
        private ComboBox<Integer> cbSemana;

        @FXML
        private Label lbResultado;

        @FXML
        private TextField tfNumSemanas;

        @FXML
        private TextField tfPeriodicos;

        @FXML
        void onClickIniciar(ActionEvent event) {
            if(!tfNumSemanas.getText().isBlank()){
                    int totalSemanas = Integer.parseInt(tfNumSemanas.getText());
                    ventasSemanales = new VentasSemanales(totalSemanas);

                    apInicio.setVisible(false);
                    apInicio.setManaged(false);

                    apPeriodicosIniciado.setVisible(true);
                    apPeriodicosIniciado.setManaged(true);

                    lbResultado.setText(ventasSemanales.toString());
                    iniciarComboBox();
            }
        }
        @FXML
        void onClickGuardar(ActionEvent event) {
                if(!tfPeriodicos.getText().isBlank()){
                        int semana = cbSemana.getValue();
                        int dia = cbDia.getValue();
                        int totalPeriodicos = Integer.parseInt(tfPeriodicos.getText());

                        ventasSemanales.guardaVenta(semana, dia, totalPeriodicos);

                        lbResultado.setText(ventasSemanales.toString());
                }
        }

        @FXML
        void onClickMediaSemana(ActionEvent event) {
                if(!tfPeriodicos.getText().isBlank()){
                        lbResultado.setText(ventasSemanales.mediaSemana());
                }
        }

        @FXML
        void onClickReiniciar(ActionEvent event) {
                if(!tfNumSemanas.getText().isBlank()){
                        int totalSemanas = Integer.parseInt(tfNumSemanas.getText());
                        ventasSemanales = new VentasSemanales(totalSemanas);

                        apInicio.setVisible(false);
                        apInicio.setManaged(false);

                        apPeriodicosIniciado.setVisible(true);
                        apPeriodicosIniciado.setManaged(true);

                        lbResultado.setText(ventasSemanales.toString());
                        iniciarComboBox();
                }

        }

        @FXML
        void onClickTotalSemana(ActionEvent event) {
                if(!tfNumSemanas.getText().isBlank()){
                        lbResultado.setText(ventasSemanales.totalDiasSemana());
                }
        }

        @FXML
        void onClickVerTodos(ActionEvent event) {
                if(!tfNumSemanas.getText().isBlank()){
                        lbResultado.setText(ventasSemanales.toString());
                }

        }

        @Override
        public void initialize(URL url, ResourceBundle resourceBundle) {
                apPeriodicosIniciado.setVisible(false);
                apPeriodicosIniciado.setManaged(false);
        }

        private void iniciarComboBox(){
                for(int dia=0 ; dia < 7 ; dia++)
                        cbDia.getItems().add(dia);
                        cbDia.setValue(0);
                for(int semana = 0 ; semana < ventasSemanales.getNumSemanas(); semana++)
                        cbSemana.getItems().add(semana);
                        cbSemana.setValue(0);

        }
}

