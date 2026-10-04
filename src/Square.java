public class Square extends Shape {
    private int side;

    // uses side 3
    public Square(String id, Renderer renderer, int side) {
        super(id, renderer);
        this.side = side;
    }

    @Override
    protected String draw() {
        return renderer.render("square", "side=" + side);
    }

    @Override
    public String getDomainData() {
        return "side=" + side;
    }
}