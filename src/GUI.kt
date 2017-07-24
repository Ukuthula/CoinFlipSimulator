/**
 * Created by Julian on 16.07.2017.
 */

import javafx.application.Application
import javafx.event.ActionEvent
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.layout.HBox
import javafx.scene.layout.StackPane
import javafx.scene.layout.VBox
import javafx.scene.paint.Color
import javafx.stage.Stage

open class GUI: Application(){

    override fun start(primaryStage: Stage?){
        val coin = FlipEngine()

        val btn: Button = Button("Flip Coin")
        val txt: Label = Label()
        val animation: Animation = Animation()
        btn.setOnAction { e: ActionEvent? ->
            run {
                var spin = coin.spinCoin()
                animation.start(spin)
                if ( spin == 0){
                    txt.text = "Head"
                }
                else{
                    txt.text = "Number"
                }
            }
        }

        val centerLayout: StackPane = StackPane()
        val rowLayout: VBox = VBox()
        rowLayout.children.add(btn)
        rowLayout.children.add(txt)
        val vSplit: HBox = HBox()
        vSplit.children.add(animation)
        vSplit.children.add(rowLayout)
        centerLayout.children.add(vSplit)


        //val scene: Scene = Scene(centerLayout, 400.0, 400.0, Color.ORANGE)
        val scene: Scene = Scene(centerLayout, 400.0, 400.0)

        primaryStage?.scene = scene
        primaryStage?.title = "Coin Flip Simulator"
        primaryStage?.show()
    }
}


