public abstract class Shape {
    protected String id;
    protected Renderer renderer;

    // base class constructor takes renderer interface
    public Shape(String id, Renderer renderer) {
        this.id = id;
        this.renderer = renderer;
    }

    // exposes public execute method
    public String execute() {
        return draw();
    }

    // replaces implementor at runtime
    public void setImplementation(Renderer renderer) {
        this.renderer = renderer;
    }

    public String getId() {
        return id;
    }

    protected abstract String draw();

    public abstract String getDomainData();
}