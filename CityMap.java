import java.util.Random;

public class CityMap extends Map {

    private Random random = new Random();

    public CityMap(int width, int height) {
        super(width, height);
    }

    @Override
    protected Tile createTile() {
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