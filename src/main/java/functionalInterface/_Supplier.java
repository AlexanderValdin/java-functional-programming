package functionalInterface;

import java.util.function.Supplier;

public class _Supplier {

    public static void main(String[] args) {

        System.out.println(getDBConnectionUrl());
        System.out.println(getDBConnectionUrlSupplier.get());
    }

    static String getDBConnectionUrl() {
        return "jdbc://locahost:5432/users";
    }

    static Supplier<String> getDBConnectionUrlSupplier = ()
            -> "jdbc://locahost:5432/users";
}
