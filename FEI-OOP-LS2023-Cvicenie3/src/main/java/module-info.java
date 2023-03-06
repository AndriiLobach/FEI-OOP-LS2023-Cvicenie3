module sk.stuba.fei.oop.feioopls2023cvicenie3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens sk.stuba.fei.oop.feioopls2023cvicenie3 to javafx.fxml;
    exports sk.stuba.fei.oop.feioopls2023cvicenie3;
    exports sk.stuba.fei.oop.feioopls2023cvicenie3.Auto;
    opens sk.stuba.fei.oop.feioopls2023cvicenie3.Auto to javafx.fxml;
}