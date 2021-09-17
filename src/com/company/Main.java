package com.company;

import static java.lang.Math.sqrt;

public class Main {

    public static void main(String[] args) {
        double v_n, p_n, i_n, p1k, u1k, i1k, u20, i2k, z_k, r_k, x_k, r1, x1, u1__, p2, cos1, cos2, sin1, sin2, sign;
        sign = 1;
        cos1 = 0.9;
        v_n = 220;
        p_n = 78.7;
        i_n = p_n/v_n;
        System.out.println(i_n);

        p1k = 6.65;
        u1k = 27.61;
        i1k = 0.346;
        i2k = 0.62;

        z_k = u1k/i1k;
        r_k = p1k/(i1k*i1k);
        x_k = sqrt(z_k*z_k - r_k*r_k);


        u20 = 120.81;

        cos2 = p1k/(i1k*u1k);
        sin1 = sqrt(1-cos1*cos1);
        sin2 = sqrt(1 - cos2*cos2);
        sin2 = sign*sin2;

        double result = u20 - u1k*(cos1*cos2 + sin1*sin2)/(((i2k/i1k)+(v_n/u20))/2);

        System.out.println(result);
        System.out.println();
        //System.out.println(r1 + "xuy" + x1);


    }
}
