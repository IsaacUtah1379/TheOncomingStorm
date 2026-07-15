package isaacutah1379.mods.oncomingstorm.api.client;

import java.lang.reflect.InvocationTargetException;

import isaacutah1379.mods.oncomingstorm.api.client.InternalClientMethods;

public class YourModClientAPI {

    private static final InternalClientMethods __internalMethods;

    static {
        try {
            __internalMethods = (InternalClientMethods) Class.forName("yourname.mods.yourmod.client.InternalClientMethodsImpl").getConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
