package com.company;

import static java.lang.Math.sqrt;

public class Main {

    public static void main(String[] args) {
        double v_n, p_n, i_n, p1, u1, i1, u2, i2, z_k, r_k, x_k, r1, x1, u1__, p2, cos1, cos2, sin1, sin2, sign;
        sign = 1;
        cos1 = 0.7;
        v_n = 220;
        p_n = 93.3;
        i_n = p_n/v_n;

        p1 = 7.75;
        u1 = 29.76;
        i1 = i_n;

        z_k = u1/i1;
        r_k = p1/(i1*i1);
        x_k = sqrt(z_k*z_k - r_k*r_k);

        r1 = r_k/2;
        x1 = x_k/2;

        u1__ = 220.45;
        p2 = 3.45;
        i2 = 0.048;
        u2 = 115.56;

        cos2 = p1/(i1*u1);
        sin1 = sqrt(1-cos1*cos1);
        sin2 = sqrt(1 - cos2*cos2);
        sin2 = sign*sin2;

        double result = u2 - u1*(cos1*cos2 + sin1*sin2);

        System.out.println(result);
        System.out.println(r1 + "xuy" + x1);


    }
}
