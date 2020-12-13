package javaExe.kyu8;

import java.text.DecimalFormat;

public class LocalizeTheBarycenterOfTriangle {
    public static double[] barTriang(double[] vertice1, double[] vertice2, double[] vertice3) {
        double xVertice1 = vertice1[0];
        double xVertice2 = vertice2[0];
        double xVertice3 = vertice3[0];

        double yVertice1 = vertice1[1];
        double yVertice2 = vertice2[1];
        double yVertice3 = vertice3[1];

        double xBarycenter = (xVertice1 + xVertice2 + xVertice3) / 3;
        xBarycenter = Math.round(xBarycenter * 10000.0) / 10000.0;
        double yBarycenter = (yVertice1 + yVertice2 + yVertice3) / 3;
        yBarycenter = Math.round(yBarycenter * 10000.0) / 10000.0;

        return new double[]{xBarycenter, yBarycenter};
    }

    // SECOND OPTION
    public static double[] barTriang2(double[] x, double[] y, double[] z)
    {
        double[] coordinates = new double[2];

        for(int i=0;i<2;i++){
            coordinates[i] = Double.parseDouble(new DecimalFormat("##.####").format((x[i]+y[i]+z[i])/3));
        }

        return coordinates;
    }

    // THIRD OPTION
    public static double[] barTriang3(double[] x, double[] y, double[] z)
    {
        double[] res = new double[2];
        res[0] = (double)((int)Math.round((x[0]+y[0]+z[0])/3*10000))/10000;
        res[1] = (double)((int)Math.round((x[1]+y[1]+z[1])/3*10000))/10000;
        return res;
    }
}
