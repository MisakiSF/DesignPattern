package dpTemplateMethode.Template;
public class Template1 extends Template {

    @Override
    protected int detail1(double input) {
        return (int)(Math.sqrt(input));
    }

    @Override
    protected double detail2(double x, double y, int param) {
        double w=x/y;
        return w*param;
    }
}
