public class Game {

    public static Map createMap(String mapType, int width, int height) {

        if (mapType.equalsIgnoreCase("city")) {
            return new CityMap(width, height);
        } else {
            return new WildernessMap(width, height);
        }
    }

    public static void main(String[] args) {

        System.out.println("RPG Map Generator");

        Map map = createMap("wilderness", 10, 5);

        map.display();
    }
}