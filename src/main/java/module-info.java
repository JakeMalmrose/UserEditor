module csc180.malmrose.jake.usereditor2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens csc180.malmrose.jake.usereditor2 to javafx.fxml;
    exports csc180.malmrose.jake.usereditor2;
}