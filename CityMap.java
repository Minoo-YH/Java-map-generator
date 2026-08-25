import java.util.Random;

public class CityMap extends Map {

    public CityMap(int width, int height) {
        super(width, height);
    }

    @Override
    protected Tile createTile() {
        Random random = new Random();
        int randomNumber = random.nextInt(3);

        switch (randomNumber) {
            case 0:
                return new RoadTile();
            case 1:
                return new ForestTile();
            default:
                return new BuildingTile();
        }
    }
}