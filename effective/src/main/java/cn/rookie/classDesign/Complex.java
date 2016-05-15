package cn.rookie.classDesign;

/**
 * Created by Rookie on 2016/5/15.
 * Package_name is cn.rookie.classDesign
 * Description: 复数 具有实部和虚部
 */

/**
 * 1. 不提供任何修改参数的方法
 * 2. 保证类不会被扩展
 * 3. 使所有的域都是final的
 * 4. 所有的域都是私有的
 * 5. 确保对于任何组件的互斥访问
 */
public class Complex {
    private final double re;
    private final double im;

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double realPart() {
        return re;
    }

    public double imaginarypart() {
        return im;
    }

    public Complex add(Complex c) {
        return new Complex(re + c.re, im + c.im);
    }
    public Complex sub(Complex c) {
        return new Complex(re - c.re, im - c.im);
    }
    public Complex multiply(Complex c) {
        return new Complex(re * c.re, im * c.im);
    }
    public Complex divide(Complex c) {
        double tmp = c.re * c.re + c.im * c.im;
        return new Complex((re * c.re + im * c.im) / tmp,
                           (re  * c.re - im * c.im) / tmp);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Complex)) {
            return false;
        }
        Complex c = (Complex) obj;
        return Double.compare(re, c.re) == 0 && Double.compare(im, c.im) == 0;
    }

    @Override
    public int hashCode() {
        int result = 17 + hashDouble(re);
        result = 31 * result + hashDouble(im);
        return result;
    }

    private int hashDouble(double val) {
        long longBits = Double.doubleToLongBits(re);
        return (int) (longBits ^ (longBits >> 32));
    }
}
