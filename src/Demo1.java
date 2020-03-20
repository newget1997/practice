import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;

public class Demo1 {

    public static void main(String[] a){
        BigDecimal c = new BigDecimal("0");
        Class b = c.getClass();
        /*Method[]m = b.getDeclaredMethods();
        for(Method me:m) {
            System.out.println(me.toString());
        }*/
        Field[] fields = b.getDeclaredFields();
        for(Field f :fields){
            System.out.println(f.toString());
        }
     /*   Constructor[] constructors = b.getDeclaredConstructors();
        for(Constructor con:constructors){
            System.out.println(con.toString());
        }*/
    }
}
