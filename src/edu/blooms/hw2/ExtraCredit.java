package edu.blooms.hw2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

/**
 * This is a drawing of doraemon a famous japanese cat cartoon character
 *
 * @author joandy alejo garcia
 */
public class ExtraCredit extends Application {

    @Override
    public void start(Stage stage) {
        Pane root = new Pane();
        final int width = 300;
        final int height = 300;
        Scene scene = new Scene(root, width, height, Color.SKYBLUE);

        int centerX = width / 2;
        int centerY = height / 2;

        Ellipse head = new Ellipse();
        head.setFill(Color.rgb(87, 170, 242));
        head.setStroke(Color.BLACK);
        head.setStrokeWidth(1.2);
        head.setCenterX(centerX);
        head.setCenterY(centerY);
        head.setRadiusX(centerX / 1.46);
        head.setRadiusY(centerY / 1.49);

        Ellipse face = new Ellipse();
        face.setFill(Color.WHITE);
        face.setStroke(Color.BLACK);
        face.setStrokeWidth(1.2);
        face.setCenterX(centerX);
        face.setCenterY(centerY + 20.0);
        face.setRadiusX(92.0);
        face.setRadiusY(85.0);

        Circle nose = new Circle(centerX, centerY - 19.5 , 17.0);
        nose.setFill(Color.rgb(191,36,76));
        nose.setStroke(Color.BLACK);
        nose.setStrokeWidth(1.2);

        Line noseLine = new Line(centerX, centerY - 5.0, centerX, centerY + 15.0);
        noseLine.setStrokeWidth(1.5);

        Circle noseLight = new Circle(centerX + 6.0, centerY - 25.5 , 6.0);
        noseLight.setFill(Color.WHITE);

        Ellipse leftEye = new Ellipse();
        leftEye.setFill(Color.WHITE);
        leftEye.setStroke(Color.BLACK);
        leftEye.setStrokeWidth(1.2);
        leftEye.setCenterX(centerX - 27.3);
        leftEye.setCenterY(centerY / 1.6);
        leftEye.setRadiusX(centerX / 5.5);
        leftEye.setRadiusY(33.0);

        Ellipse leftEyePupil = new Ellipse();
        leftEyePupil.setFill(Color.BLACK);
        leftEyePupil.setCenterX(centerX - 15.3);
        leftEyePupil.setCenterY(centerY / 1.5);
        leftEyePupil.setRadiusX(centerX / 20.5);
        leftEyePupil.setRadiusY(9.0);

        Ellipse leftEyeLight = new Ellipse();
        leftEyeLight.setFill(Color.WHITE);
        leftEyeLight.setCenterX(centerX - 15.3);
        leftEyeLight.setCenterY(centerY / 1.48);
        leftEyeLight.setRadiusX(centerX / 80.5);
        leftEyeLight.setRadiusY(3.0);

        Ellipse rightEye = new Ellipse();
        rightEye.setFill(Color.WHITE);
        rightEye.setStroke(Color.BLACK);
        rightEye.setStrokeWidth(1.2);
        rightEye.setCenterX(centerX + 27.3);
        rightEye.setCenterY(centerY / 1.6);
        rightEye.setRadiusX(centerX / 5.5);
        rightEye.setRadiusY(33.0);

        Ellipse rightEyePupil = new Ellipse();
        rightEyePupil.setFill(Color.BLACK);
        rightEyePupil.setCenterX(centerX + 15.3);
        rightEyePupil.setCenterY(centerY / 1.5);
        rightEyePupil.setRadiusX(centerX / 20.5);
        rightEyePupil.setRadiusY(9.0);

        Ellipse rightEyeLight = new Ellipse();
        rightEyeLight.setFill(Color.WHITE);
        rightEyeLight.setCenterX(centerX + 15.3);
        rightEyeLight.setCenterY(centerY / 1.48);
        rightEyeLight.setRadiusX(centerX / 80.5);
        rightEyeLight.setRadiusY(3.0);

        Arc mouth = new Arc(centerX, centerY + 20.0, 75.0, 75.0, 175.0, 190.0);
        mouth.setType(ArcType.OPEN);
        mouth.setFill(Color.rgb(191,36,78));
        mouth.setStroke(Color.BLACK);
        mouth.setStrokeWidth(1.3);

        //*note* the left and right lip are used to create a 4° degree angle on the top of the mouth
        Rectangle rightLip = new Rectangle(centerX, centerY - 3.6, 77.0, 25.0);
        rightLip.setFill(Color.WHITE);
        rightLip.setRotate(4.0);

        Rectangle leftLip = new Rectangle(centerX - 76.0, centerY - 3.6, 77.0, 25.0);
        leftLip.setFill(Color.WHITE);
        leftLip.setRotate(-4.0);

        Circle leftLipEnd = new Circle(centerX - 75.0,centerY + 4.0 , 20);
        leftLipEnd.setFill(Color.WHITE);
        leftLipEnd.setStroke(Color.BLACK);
        leftLipEnd.setStrokeWidth(1.2);

        Circle rightLipEnd = new Circle(centerX + 75.0,centerY + 4.0 , 20);
        rightLipEnd.setFill(Color.WHITE);
        rightLipEnd.setStroke(Color.BLACK);
        rightLipEnd.setStrokeWidth(1.2);

        Line rightTWhisker = new Line(centerX + 15.0, centerY + 2.0, centerX + 80.0, centerY - 30.0);
        rightTWhisker.setStrokeWidth(1.2);

        Line rightWhisker = new Line(centerX + 20.0, centerY + 8.0, centerX + 85.0, centerY - 9.0);
        rightWhisker.setStrokeWidth(1.2);

        Line rightBWhisker = new Line(centerX + 25.0, centerY + 15.0, centerX + 85.0, centerY + 8.0);
        rightBWhisker.setStrokeWidth(1.2);

        Line leftTWhisker = new Line(centerX - 15.0, centerY + 2.0, centerX - 80.0, centerY - 30.0);
        leftTWhisker.setStrokeWidth(1.2);

        Line leftWhisker = new Line(centerX - 20.0, centerY + 8.0, centerX - 85.0, centerY - 9.0);
        leftWhisker.setStrokeWidth(1.2);

        Line leftBWhisker = new Line(centerX - 25.0, centerY + 15.0, centerX - 85.0, centerY + 8.0);
        leftBWhisker.setStrokeWidth(1.2);

        // the tongue is composed of 3 half circles 2 small ones on top left and right and 1 big one on the center
        // bottom with the same length of the 2  on top combined
        Arc leftTongue = new Arc(centerX - 10.0, centerY + 80.0, 15.0, 10.0, 0.0, 180.0);
        leftTongue.setFill(Color.rgb(140, 3, 28));

        Arc rightTongue = new Arc(centerX + 10.0, centerY + 80.0, 15.0, 10.0, 0.0, 180.0);
        rightTongue.setFill(Color.rgb(140, 3, 28));

        Arc bottomTongue = new Arc(centerX, centerY + 80.0, 25.0, 10.0, 175.0, 190.0);
        bottomTongue.setFill(Color.rgb(140, 3, 28));

        stage.setTitle("Doraemon");
        root.getChildren().addAll(head, face, leftEye ,leftEyePupil, rightEye, rightEyePupil,
                rightEyeLight, leftEyeLight, mouth,rightLipEnd, rightLip, leftLipEnd, leftLip,
                noseLine, nose, noseLight, rightBWhisker, rightWhisker, rightTWhisker, leftBWhisker,
                leftWhisker, leftTWhisker, leftTongue, rightTongue, bottomTongue);

        stage.setAlwaysOnTop(true);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
