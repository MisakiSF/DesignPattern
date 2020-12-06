package TD1.exercice2.implementation;

import java.util.Arrays;

public class ImplTraitement2 implements ITraitement {
    @Override
    public long traiter(int[][] image) {
        System.out.println(" From : ImplTraitement2");
        System.out.println(Arrays.deepToString(image));
        long resultat=0;
        for (int i=0;i<image.length;i++){
            for (int j=0;j<image[i].length;j++){
                resultat+=image[i][j];
            }
        }
        char[] s=new char[50];
        Arrays.fill(s,'*');
        System.out.println(s);

        return resultat;
    }
}
