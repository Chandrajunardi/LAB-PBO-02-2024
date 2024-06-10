/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package tugaspraktikum9;

import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        stage.setResizable(false);
        stage.setTitle("MASTERKOIN");
        Image imageIcon = new Image(getClass().getClassLoader().getResourceAsStream("images/Logo.png"));
        stage.getIcons().add(imageIcon);

        HomeScene homeScene = new HomeScene(stage);
        homeScene.show();
        // Regis regis = new Regis(stage);
        // regis.show();
    }

    public static void main(String[] args) {
        launch(args); // Memanggil metode launch dengan parameter args
    }
}
