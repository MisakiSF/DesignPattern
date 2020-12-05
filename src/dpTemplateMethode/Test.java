package dpTemplateMethode;

import dpTemplateMethode.Template.Template;
import dpTemplateMethode.Template.Template1;
import dpTemplateMethode.Template.Template2;

public class Test {
    public static void main(String[] args) {
        Template template=new Template1();
        System.out.println(template.computeTemplate(6,90));

        template =new Template2();
        System.out.println(template.computeTemplate(6,90));
    }
}
