package isaacutah1379.mods.oncomingstorm.api;

import java.lang.reflect.InvocationTargetException;

import isaacutah1379.mods.oncomingstorm.api.InternalMethods;

public class OncomingStormAPI {
    public static final String MOD_ID = "oncomingstorm";

    private static final InternalMethods __internalMethods;

    static {
        try {
            __internalMethods = (InternalMethods) Class.forName("isaacutah1379.mods.oncomingstorm.InternalMethodsImpl").getConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
