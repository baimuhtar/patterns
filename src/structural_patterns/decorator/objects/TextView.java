package structural_patterns.decorator.objects;

public class TextView implements Component{
    @Override
    public void draw() {
        System.out.println("draw textview");
    }
}
