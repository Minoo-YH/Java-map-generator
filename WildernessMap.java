import java.util.Random;

public class WildernessMap extends Map {

    public WildernessMap(int width, int height) {
        super(width, height);
    }

    @Override
    protected Tile createTile() {
        Random random = new Random();
        int randomNumber = random.nextInt(3);

        switch (randomNumber) {
            case 0:
                return new SwampTile();
            case 1:
                return new WaterTile();
            default:
                return new ForestTile();
        }
    }
}