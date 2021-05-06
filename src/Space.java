import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Space {
    private boolean bomb;
    private boolean flaged;
    private boolean cleared;
    private int bombNearBy;
    private BufferedImage image;

    public Space(boolean bomb )throws IOException {
        this.bomb = bomb;
        flaged = false;
        cleared = false;
        bombNearBy = 0;

        BufferedImage temp = ImageIO.read(new File("src/img/facingDown.png"));
        image = Game.resizeImage(temp, Game.WIDTH, Game.HEIGHT);
    }

    public void setFlaged(boolean f){
        flaged = f;
    }
    public void clear(){
        cleared = true;
    }
    public boolean hasBomb(){
        return bomb;
    }
    public boolean isCleared(){
        return cleared;
    }
    public boolean isFlaged(){
        return flaged;
    }
    public void setBombNearBy(int b) {
        bombNearBy = b;
    }
    public int getBombNearBy(){
        return bombNearBy;
    }
    public void setImage(String filename)throws IOException{
        BufferedImage temp = ImageIO.read(new File(filename));
        image = Game.resizeImage(temp, Game.WIDTH, Game.HEIGHT);
    }
    public BufferedImage getImage(){
        return image;
    }
}
