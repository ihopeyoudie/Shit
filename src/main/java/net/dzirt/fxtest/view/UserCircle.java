package net.dzirt.fxtest.view;

import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;


/**
 * Created by Андрей on 06.04.2017.
 */
public class UserCircle {
    Circle circle;
    Text text;

    public UserCircle(Pane parent, double centerX, double centerY, double radius, int number) {
        circle = new Circle(centerX, centerY, radius);
        text = new Text(Integer.toString(number));

        circle.setFill(Color.GREEN);
        circle.setStroke(Color.BLACK);

        text.setTranslateX(centerX - 5);
        text.setTranslateY(centerY + 5);

        parent.getChildren().addAll(circle,text);

        circle.setOnMouseDragged(event -> {
            circle.setCenterX(event.getSceneX());
            circle.setCenterY(event.getSceneY());

            text.setTranslateX(event.getSceneX() - 5);
            text.setTranslateY(event.getSceneY() + 5);
        });
    }

}
