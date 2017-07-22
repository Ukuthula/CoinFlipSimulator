/**
 * Created by Julian on 16.07.2017.
 */

import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.stage.Stage
import javafx.scene.layout.StackPane
import javafx.scene.paint.Color

open class GUI: Application(){

    override fun start(primaryStage: Stage?){
        val btn: Button = Button("Click Me !")

        val layoutTest: StackPane = StackPane()
        layoutTest.children.add(btn)

        val scene: Scene = Scene(layoutTest, 400.0, 400.0, Color.ORANGE)

        primaryStage?.scene = scene
        primaryStage?.title = "Coin Flip Simulator"
        primaryStage?.show()
    }
}


