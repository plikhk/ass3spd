public class VectorRenderer implements Renderer {
    @Override
    public String render(String shapeName, String dimension) {
        return "VECTOR " + shapeName + " " + dimension;
    }
}