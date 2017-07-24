import javafx.geometry.Rectangle2D
import javafx.scene.image.Image
import javafx.scene.image.ImageView
import javafx.scene.layout.StackPane

/**
 * Created by Julian on 24.07.2017.
 */

class Animation: StackPane() {
    //image locations
    val flip = "/pictures/Wurf.jpg"
    val head = "/pictures/Kopf.jpg"
    val number = "/pictures/Zahl.jpg"

    val imgFlip = Image(flip)
    val imgHead = Image(head)
    val imgNumber = Image(number)

    //imageView
    var imgView = ImageView()
    init {
        imgView.image = imgFlip
        imgView.isCache = true
        imgView.fitWidth = 255.0
        imgView.isPreserveRatio = true
        super.getChildren().add(imgView)
        super.minWidth(255.0)
        super.minHeight(255.0)
    }

    fun start(x: Int){
        imgView.image = imgFlip
        Thread.sleep(1_000)
        if (x == 0){
            imgView.image = imgHead
        }
        else{
            imgView.image = imgNumber
        }
        Thread.sleep(1_000)
        imgView.image = imgFlip
    }
}