import com.inc.StringCalc;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        StringCalc sc= new StringCalc();
        System.out.println(sc.add("1,2"));
        System.out.println(sc.add("1"));
        System.out.println(sc.add("1\n2,3"));
        System.out.println(sc.add("//;\n1;2"));
        System.out.println(sc.add("1,2,3"));
    }
}