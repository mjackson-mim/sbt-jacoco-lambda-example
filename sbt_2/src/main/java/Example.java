import java.util.function.BooleanSupplier;

public class Example {

    public boolean method() {
        return ((BooleanSupplier) () -> {
            System.out.println("\n>>>>>> Called from the lambda body.\n");
            if (true) {
                return true;
            } else {
                return false;
            }
        }).getAsBoolean();
    }
}