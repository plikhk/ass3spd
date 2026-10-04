public class Circle extends Shape {
    private int radius;

    // uses radius 2
    public Circle(String id, Renderer renderer, int radius) {
        super(id, renderer);
        this.radius = radius;
    }

    @Override
    protected String draw() {
        return renderer.render("circle", "radius=" + radius);
    }

    @Override
    public String getDomainData() {
        return "radius=" + radius;
    }
}