public class AsciiRenderer implements Renderer {
    @Override
    public String render(String shapeName, String dimension) {
        return "ASCII " + shapeName + " " + dimension;
    }
}