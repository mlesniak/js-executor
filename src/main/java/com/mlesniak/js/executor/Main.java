package com.mlesniak.js.executor;

import javax.script.*;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Execute a JS in Java.
 *
 * @author Michael Lesniak (mlesniak@micromata.de)
 */
public class Main {
    public static void main(String[] args) throws ScriptException {
        ScriptEngineManager factory = new ScriptEngineManager();
        ScriptEngine engine = factory.getEngineByName("JavaScript");

        InputStream inputStream = Main.class.getClassLoader().getResourceAsStream("example.js");
        InputStreamReader reader = new InputStreamReader(inputStream);
        engine.put("ext", new JSObject());
        engine.eval(reader);
    }
}
