import javafx.*;

public class gui
{
    public void start(Stage primaryStage)
    {
            Label label = new Label("Hola Mundo");
            Scene scene = new Scene(label, 300, 200);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Hola Mundo");
            primaryStage.show();

    }

    public static void main(String[] args)
    {
        launch(args);
    }
}