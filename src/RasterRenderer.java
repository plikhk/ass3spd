public class RasterRenderer implements Renderer {
    @Override
    public String render(String shapeName, String dimension) {
        return "RASTER " + shapeName + " " + dimension;
    }
}