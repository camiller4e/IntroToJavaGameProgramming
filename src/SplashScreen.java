/**
 * Created by user on 05/11/2017.
 */
public class SplashScreen extends Sprite {



    public SplashScreen(int x, int y) {
        super(x, y);


        initSplashScreen();
    }

    private void initSplashScreen() {

        loadImage("/Users/user/Desktop/CX3_4/projects/java/CodeClanGame3/Resources/spacebastards.gif");
    }

    @Override
    public int getImageWidth(){
        return 800;
    }

    @Override
    public int getImageHeight(){
        return 600;
    }
    @Override
    protected void getImageDimensions() {

        this.width = 800;
        this.height = 600;
    }
}



