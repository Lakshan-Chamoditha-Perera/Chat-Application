package com.example.chatapplication.controller;

import com.example.chatapplication.server.ClientHandler;
import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class ChatFormController {

    @FXML
    private JFXButton btnSend;

    @FXML
    private TextField txtMessage;

    @FXML
    private VBox vBox;

    @FXML
    void btnAddClientOnAction(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/ClientRegistrationForm.fxml"))));
        stage.setAlwaysOnTop(true);
        stage.showAndWait();
    }

    @FXML
    void btnSendOnAction(ActionEvent event) throws IOException {
        String text = txtMessage.getText();
        if (!text.equals(null)) {
            ClientHandler.broadcast(text);
            HBox hBox = new HBox();
            hBox.setStyle("-fx-alignment: center-right;-fx-fill-height: true;-fx-min-height: 50;-fx-pref-width: 520;-fx-max-width: 520;-fx-padding: 10");
            Label messageLbl = new Label(text);
            messageLbl.setStyle("-fx-background-color:  #27ae60;-fx-background-radius:15;-fx-font-size: 18;-fx-font-weight: normal;-fx-text-fill: white;-fx-wrap-text: true;-fx-alignment: center-left;-fx-content-display: left;-fx-padding: 10;-fx-max-width: 350;");
            hBox.getChildren().add(messageLbl);
            vBox.getChildren().add(hBox);
        }

    }

    public void txtMessageOnAction(ActionEvent actionEvent) {
//        btnSendOnAction(actionEvent);
    }

  /*  public void setMessage(String message) {
        System.out.println(message);
        HBox hBox = new HBox();
        hBox.setStyle("-fx-alignment: center-right;-fx-fill-height: true;-fx-min-height: 50;-fx-pref-width: 520;-fx-max-width: 520;-fx-padding: 10");
        Label messageLbl = new Label(message);
        messageLbl.setStyle("-fx-background-color:  purple;-fx-background-radius:15;-fx-font-size: 18;-fx-font-weight: normal;-fx-text-fill: white;-fx-wrap-text: true;-fx-alignment: center-left;-fx-content-display: left;-fx-padding: 10;-fx-max-width: 350;");
        hBox.getChildren().add(messageLbl);
        vBox.getChildren().add(hBox);
    }*/

}
