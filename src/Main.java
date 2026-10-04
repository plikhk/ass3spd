public class Main {
    public static void main(String[] args) {
        // runs t1 t7 tests
        int passed = 0;
        int total = 7;

        // t1 a1 with i1
        Renderer vector = new VectorRenderer();
        Shape circle = new Circle("c1", vector, 2);
        String res1 = circle.execute();
        boolean pass1 = res1.equals("VECTOR circle radius=2");
        if(pass1) passed++;
        System.out.println("T1 " + (pass1 ? "PASS" : "FAIL") + " | Circle + VectorRenderer | result=" + res1);

        // t2 a1 with i2
        Renderer raster = new RasterRenderer();
        Shape circle2 = new Circle("c2", raster, 2);
        String res2 = circle2.execute();
        boolean pass2 = res2.equals("RASTER circle radius=2");
        if(pass2) passed++;
        System.out.println("T2 " + (pass2 ? "PASS" : "FAIL") + " | Circle + RasterRenderer | result=" + res2);

        // t3 a2 with i1
        Shape square = new Square("s1", vector, 3);
        String res3 = square.execute();
        boolean pass3 = res3.equals("VECTOR square side=3");
        if(pass3) passed++;
        System.out.println("T3 " + (pass3 ? "PASS" : "FAIL") + " | Square + VectorRenderer | result=" + res3);

        // t4 a2 with i2
        Shape square2 = new Square("s2", raster, 3);
        String res4 = square2.execute();
        boolean pass4 = res4.equals("RASTER square side=3");
        if(pass4) passed++;
        System.out.println("T4 " + (pass4 ? "PASS" : "FAIL") + " | Square + RasterRenderer | result=" + res4);

        // t5 runtime switch
        Shape switchShape = new Circle("c3", vector, 2);
        Shape origRef = switchShape;
        String beforeId = switchShape.getId();
        String beforeData = switchShape.getDomainData();
        String resBefore = switchShape.execute();

        switchShape.setImplementation(raster);
        String resAfter = switchShape.execute();

        boolean sameObj = (switchShape == origRef);
        boolean stateUnchanged = beforeId.equals(switchShape.getId()) && beforeData.equals(switchShape.getDomainData());
        boolean resChangedCorrectly = resBefore.equals("VECTOR circle radius=2") && resAfter.equals("RASTER circle radius=2");
        boolean pass5 = sameObj && stateUnchanged && resChangedCorrectly;
        if(pass5) passed++;

        System.out.println("T5 " + (pass5 ? "PASS" : "FAIL") + " sameObject=" + sameObj + " | stateUnchanged=" + stateUnchanged);
        System.out.println("before=" + resBefore + " | after=" + resAfter);

        // t6 a1 with i3
        Renderer ascii = new AsciiRenderer();
        Shape circle3 = new Circle("c4", ascii, 2);
        String res6 = circle3.execute();
        boolean pass6 = res6.equals("ASCII circle radius=2");
        if(pass6) passed++;
        System.out.println("T6 " + (pass6 ? "PASS" : "FAIL") + " | Circle + AsciiRenderer | result=" + res6);

        // t7 a2 with i3
        Shape square3 = new Square("s3", ascii, 3);
        String res7 = square3.execute();
        boolean pass7 = res7.equals("ASCII square side=3");
        if(pass7) passed++;
        System.out.println("T7 " + (pass7 ? "PASS" : "FAIL") + " | Square + AsciiRenderer | result=" + res7);

        System.out.println("SUMMARY: " + passed + "/" + total + " PASS");
    }
}