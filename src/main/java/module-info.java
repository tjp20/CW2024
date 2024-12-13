module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demo to javafx.fxml;
    exports com.example.demo.controller;
    opens com.example.demo.LevelOne to javafx.fxml;
    opens com.example.demo.LevelTwo to javafx.fxml;
    opens com.example.demo.LevelThree to javafx.fxml;
    opens com.example.demo.Boss to javafx.fxml;
    opens com.example.demo.Actor to javafx.fxml;
    opens com.example.demo.Levels to javafx.fxml;
    opens com.example.demo.User to javafx.fxml;
    opens com.example.demo.Enemy to javafx.fxml;
}