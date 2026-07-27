package io.jettraflux.miplugintest2;

import io.jettra.core.inject.annotation.InjectProperties;
import io.jettra.core.server.Page;
import io.jettra.flux.pages.FluxBaseHandler;
import io.jettra.flux.core.Widget;
import io.jettra.flux.widgets.Text;
import com.sun.net.httpserver.HttpExchange;
import java.util.Map;
import java.util.Properties;

@Page(path = "/miplugintest2")
public class MainMiPluginTest2Page extends FluxBaseHandler {

    @InjectProperties(name = "messages-MiPluginTest2")
    private Properties msg;

    @Override
    protected Widget buildUI(HttpExchange exchange, Map<String, String> params, String currentTheme) {
        String text = msg != null ? msg.getProperty("greeting", "Welcome") : "Welcome";
        return Text.of(text);
    }
}
