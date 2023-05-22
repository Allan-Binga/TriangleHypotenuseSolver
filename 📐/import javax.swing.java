import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class HypotenuseCalculator extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hypotenuse Calculator");

        // Create a grid pane for the GUI layout
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        // Add labels, text fields, and a button to the grid pane
        Label side1Label = new Label("Side 1:");
        grid.add(side1Label, 0, 1);

        TextField side1Field = new TextField();
        grid.add(side1Field, 1, 1);

        Label side2Label = new Label("Side 2:");
        grid.add(side2Label, 0, 2);

        TextField side2Field = new TextField();
        grid.add(side2Field, 1, 2);

        Label resultLabel = new Label();
        grid.add(resultLabel, 1, 3);

        Button calculateButton = new Button("Calculate");
        calculateButton.setOnAction(event -> {
            try {
                double side1 = Double.parseDouble(side1Field.getText());
                double side2 = Double.parseDouble(side2Field.getText());
                double hypotenuse = Math.sqrt(side1 * side1 + side2 * side2);
                resultLabel.setText("Hypotenuse: " + hypotenuse);
            } catch (NumberFormatException e) {
                resultLabel.setText("Please enter valid numbers.");
            }
        });
        grid.add(calculateButton, 1, 4);

        // Create a scene for the grid pane and show the stage
        Scene scene = new Scene(grid, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
