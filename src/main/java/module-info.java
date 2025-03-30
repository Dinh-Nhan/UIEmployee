module org.uiemployee {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.uiemployee to javafx.fxml;
    exports org.uiemployee;
}