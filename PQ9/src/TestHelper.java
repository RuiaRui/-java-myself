//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class TestHelper {
    public TestHelper() {
    }

    public static boolean equals(String var0, String var1) throws IOException, FileNotFoundException {
        BufferedReader var2 = new BufferedReader(new FileReader(var0));
        BufferedReader var3 = new BufferedReader(new FileReader(var1));
        String var4 = var2.readLine();

        String var5;
        for(var5 = var3.readLine(); var4 != null && var5 != null && var4.equals(var5); var5 = var3.readLine()) {
            var4 = var2.readLine();
        }

        var2.close();
        var3.close();
        return var4 == null && var5 == null;
    }

    public static <T> boolean equals(ArrayList<T> var0, ArrayList<T> var1) {
        Iterator var2 = var0.iterator();
        Iterator var3 = var1.iterator();

        while(var2.hasNext() && var3.hasNext()) {
            if (!var2.next().equals(var3.next())) {
                return false;
            }
        }

        return !var2.hasNext() && !var2.hasNext();
    }
}
