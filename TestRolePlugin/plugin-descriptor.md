# Plugin Descriptor for TestRolePlugin

## Restrictions & Menus
Menu definitions (WidgetLet) and layout restrictions should be defined here.

```java
        WidgetLet ecommMenuTestRolePlugin = WidgetLet.of("E-Commerce").icon(Icon.HOME);
        ecommMenuTestRolePlugin.add(WidgetLet.of("Dashboard").icon(Icon.CHART_LINE).url(JettraServer.resolvePath("/dashboard")));
        ecommMenuTestRolePlugin.add(WidgetLet.of("Product Overview").icon(Icon.SEARCH).url(JettraServer.resolvePath("/product-overview")));
        ecommMenuTestRolePlugin.add(WidgetLet.of("Product List").icon(Icon.LIST).url(JettraServer.resolvePath("/product-list")));
        ecommMenuTestRolePlugin.add(WidgetLet.of("New Product").icon(Icon.PLUS).url(JettraServer.resolvePath("/new-product")));
        ecommMenuTestRolePlugin.add(WidgetLet.of("Shopping Cart").icon(Icon.SHOPPING_CART).url(JettraServer.resolvePath("/shopping-cart")));
        ecommMenuTestRolePlugin.add(WidgetLet.of("Checkout Form").icon(Icon.CHECK).url(JettraServer.resolvePath("/checkout-form")));
        ecommMenuTestRolePlugin.add(WidgetLet.of("Order History").icon(Icon.HISTORY).url(JettraServer.resolvePath("/order-history")));
        ecommMenuTestRolePlugin.add(WidgetLet.of("Order Summary").icon(Icon.RECEIPT).url(JettraServer.resolvePath("/order-summary")));
// Example
        WidgetLet exampleMenuTestRolePlugin = WidgetLet.of("Example").icon(Icon.COG);
        exampleMenuTestRolePlugin.add(WidgetLet.of("Person").icon(Icon.CHART_LINE).url(JettraServer.resolvePath("/person")));
        exampleMenuTestRolePlugin.add(WidgetLet.of("Reglas").icon(Icon.RECEIPT).url(JettraServer.resolvePath("/reglas")));

        // Apps
        WidgetLet appsMenuTestRolePlugin = WidgetLet.of("Apps").icon(Icon.TH_LARGE);
        appsMenuTestRolePlugin.add(WidgetLet.of("Chat").icon(Icon.COMMENTS).url(JettraServer.resolvePath("/chat")));
        appsMenuTestRolePlugin.add(WidgetLet.of("Mail Inbox").icon(Icon.ENVELOPE).url(JettraServer.resolvePath("/mail-inbox")));
        appsMenuTestRolePlugin.add(WidgetLet.of("Task List").icon(Icon.CHECK).url(JettraServer.resolvePath("/tasklist")));
        appsMenuTestRolePlugin.add(WidgetLet.of("Files").icon(Icon.FOLDER).url(JettraServer.resolvePath("/files")));
        appsMenuTestRolePlugin.add(WidgetLet.of("File").icon(Icon.FILE).url(JettraServer.resolvePath("/file")));

        WidgetLet userManagementMenuTestRolePlugin = WidgetLet.of("User Management").icon(Icon.USER);
        userManagementMenuTestRolePlugin.add(WidgetLet.of("Profile List").icon(Icon.USERS).url(JettraServer.resolvePath("/profile-list")));
        userManagementMenuTestRolePlugin.add(WidgetLet.of("Basic Information").icon(Icon.INFO_CIRCLE).url(JettraServer.resolvePath("/profile-basic-information")));

        WidgetLet uiKitMenuTestRolePlugin = WidgetLet.of("UI Components").icon(Icon.LAYER_GROUP);
        uiKitMenuTestRolePlugin.add(WidgetLet.of("Input").icon(Icon.EDIT).url(JettraServer.resolvePath("/input")));
        uiKitMenuTestRolePlugin.add(WidgetLet.of("Forms").icon(Icon.ALIGN_JUSTIFY).url(JettraServer.resolvePath("/forms")));
        uiKitMenuTestRolePlugin.add(WidgetLet.of("Icon").icon(Icon.ALIGN_JUSTIFY).url(JettraServer.resolvePath("/icon")));
        uiKitMenuTestRolePlugin.add(WidgetLet.of("Button Demo").icon(Icon.MOUSE_POINTER).url(JettraServer.resolvePath("/button-demo")));
        uiKitMenuTestRolePlugin.add(WidgetLet.of("Table").icon(Icon.CHART_BAR).url(JettraServer.resolvePath("/table")));
        uiKitMenuTestRolePlugin.add(WidgetLet.of("DataView").icon(Icon.LIST).url(JettraServer.resolvePath("/dataview")));
        uiKitMenuTestRolePlugin.add(WidgetLet.of("Tree").icon(Icon.SITEMAP).url(JettraServer.resolvePath("/tree")));
        uiKitMenuTestRolePlugin.add(WidgetLet.of("Panel").icon(Icon.TH_LARGE).url(JettraServer.resolvePath("/panel")));
        uiKitMenuTestRolePlugin.add(WidgetLet.of("Overlay").icon(Icon.CLONE).url(JettraServer.resolvePath("/overlay")));
        uiKitMenuTestRolePlugin.add(WidgetLet.of("Media").icon(Icon.IMAGE).url(JettraServer.resolvePath("/media")));
        uiKitMenuTestRolePlugin.add(WidgetLet.of("Menu").icon(Icon.BARS).url(JettraServer.resolvePath("/menu")));
        uiKitMenuTestRolePlugin.add(WidgetLet.of("Message").icon(Icon.COMMENTS).url(JettraServer.resolvePath("/message")));
        uiKitMenuTestRolePlugin.add(WidgetLet.of("Charts").icon(Icon.CHART_PIE).url(JettraServer.resolvePath("/charts")));
        uiKitMenuTestRolePlugin.add(WidgetLet.of("Timeline").icon(Icon.CALENDAR_ALT).url(JettraServer.resolvePath("/timeline")));
        uiKitMenuTestRolePlugin.add(WidgetLet.of("Misc").icon(Icon.CUBE).url(JettraServer.resolvePath("/misc")));

        WidgetLet uiLayoutMenuTestRolePlugin = WidgetLet.of("Layout & Grid").icon(Icon.WINDOW_MAXIMIZE);
        uiLayoutMenuTestRolePlugin.add(WidgetLet.of("Card Demo").icon(Icon.WINDOW_MAXIMIZE).url(JettraServer.resolvePath("/card-demo")));
        uiLayoutMenuTestRolePlugin.add(WidgetLet.of("Grid Layout").icon(Icon.BORDER_ALL).url(JettraServer.resolvePath("/grid-demo")));

        WidgetLet rootUiKitMenuTestRolePlugin = WidgetLet.of("UI Kit").icon(Icon.LAYER_GROUP);
        rootUiKitMenuTestRolePlugin.add(uiKitMenuTestRolePlugin);
        rootUiKitMenuTestRolePlugin.add(uiLayoutMenuTestRolePlugin);

        // --- Left Sidebar (Ocean Style) ---

/**
Start Plugin: MiPlugin
**/
        WidgetLet ecommMenuMiPluginTestRolePlugin = WidgetLet.of("E-Commerce").icon(Icon.HOME);
        ecommMenuMiPluginTestRolePlugin.add(WidgetLet.of("Dashboard").icon(Icon.CHART_LINE).url(JettraServer.resolvePath("/dashboard")));
        ecommMenuMiPluginTestRolePlugin.add(WidgetLet.of("Product Overview").icon(Icon.SEARCH).url(JettraServer.resolvePath("/product-overview")));
        ecommMenuMiPluginTestRolePlugin.add(WidgetLet.of("Product List").icon(Icon.LIST).url(JettraServer.resolvePath("/product-list")));
        ecommMenuMiPluginTestRolePlugin.add(WidgetLet.of("New Product").icon(Icon.PLUS).url(JettraServer.resolvePath("/new-product")));
        ecommMenuMiPluginTestRolePlugin.add(WidgetLet.of("Shopping Cart").icon(Icon.SHOPPING_CART).url(JettraServer.resolvePath("/shopping-cart")));
        ecommMenuMiPluginTestRolePlugin.add(WidgetLet.of("Checkout Form").icon(Icon.CHECK).url(JettraServer.resolvePath("/checkout-form")));
        ecommMenuMiPluginTestRolePlugin.add(WidgetLet.of("Order History").icon(Icon.HISTORY).url(JettraServer.resolvePath("/order-history")));
        ecommMenuMiPluginTestRolePlugin.add(WidgetLet.of("Order Summary").icon(Icon.RECEIPT).url(JettraServer.resolvePath("/order-summary")));
// Example
        WidgetLet exampleMenuMiPluginTestRolePlugin = WidgetLet.of("Example").icon(Icon.COG);
        exampleMenuMiPluginTestRolePlugin.add(WidgetLet.of("Person").icon(Icon.CHART_LINE).url(JettraServer.resolvePath("/person")));
        exampleMenuMiPluginTestRolePlugin.add(WidgetLet.of("Reglas").icon(Icon.RECEIPT).url(JettraServer.resolvePath("/reglas")));

        // Apps
        WidgetLet appsMenuMiPluginTestRolePlugin = WidgetLet.of("Apps").icon(Icon.TH_LARGE);
        appsMenuMiPluginTestRolePlugin.add(WidgetLet.of("Chat").icon(Icon.COMMENTS).url(JettraServer.resolvePath("/chat")));
        appsMenuMiPluginTestRolePlugin.add(WidgetLet.of("Mail Inbox").icon(Icon.ENVELOPE).url(JettraServer.resolvePath("/mail-inbox")));
        appsMenuMiPluginTestRolePlugin.add(WidgetLet.of("Task List").icon(Icon.CHECK).url(JettraServer.resolvePath("/tasklist")));
        appsMenuMiPluginTestRolePlugin.add(WidgetLet.of("Files").icon(Icon.FOLDER).url(JettraServer.resolvePath("/files")));
        appsMenuMiPluginTestRolePlugin.add(WidgetLet.of("File").icon(Icon.FILE).url(JettraServer.resolvePath("/file")));

        WidgetLet userManagementMenuMiPluginTestRolePlugin = WidgetLet.of("User Management").icon(Icon.USER);
        userManagementMenuMiPluginTestRolePlugin.add(WidgetLet.of("Profile List").icon(Icon.USERS).url(JettraServer.resolvePath("/profile-list")));
        userManagementMenuMiPluginTestRolePlugin.add(WidgetLet.of("Basic Information").icon(Icon.INFO_CIRCLE).url(JettraServer.resolvePath("/profile-basic-information")));

        WidgetLet uiKitMenuMiPluginTestRolePlugin = WidgetLet.of("UI Components").icon(Icon.LAYER_GROUP);
        uiKitMenuMiPluginTestRolePlugin.add(WidgetLet.of("Input").icon(Icon.EDIT).url(JettraServer.resolvePath("/input")));
        uiKitMenuMiPluginTestRolePlugin.add(WidgetLet.of("Forms").icon(Icon.ALIGN_JUSTIFY).url(JettraServer.resolvePath("/forms")));
        uiKitMenuMiPluginTestRolePlugin.add(WidgetLet.of("Icon").icon(Icon.ALIGN_JUSTIFY).url(JettraServer.resolvePath("/icon")));
        uiKitMenuMiPluginTestRolePlugin.add(WidgetLet.of("Button Demo").icon(Icon.MOUSE_POINTER).url(JettraServer.resolvePath("/button-demo")));
        uiKitMenuMiPluginTestRolePlugin.add(WidgetLet.of("Table").icon(Icon.CHART_BAR).url(JettraServer.resolvePath("/table")));
        uiKitMenuMiPluginTestRolePlugin.add(WidgetLet.of("DataView").icon(Icon.LIST).url(JettraServer.resolvePath("/dataview")));
        uiKitMenuMiPluginTestRolePlugin.add(WidgetLet.of("Tree").icon(Icon.SITEMAP).url(JettraServer.resolvePath("/tree")));
        uiKitMenuMiPluginTestRolePlugin.add(WidgetLet.of("Panel").icon(Icon.TH_LARGE).url(JettraServer.resolvePath("/panel")));
        uiKitMenuMiPluginTestRolePlugin.add(WidgetLet.of("Overlay").icon(Icon.CLONE).url(JettraServer.resolvePath("/overlay")));
        uiKitMenuMiPluginTestRolePlugin.add(WidgetLet.of("Media").icon(Icon.IMAGE).url(JettraServer.resolvePath("/media")));
        uiKitMenuMiPluginTestRolePlugin.add(WidgetLet.of("Menu").icon(Icon.BARS).url(JettraServer.resolvePath("/menu")));
        uiKitMenuMiPluginTestRolePlugin.add(WidgetLet.of("Message").icon(Icon.COMMENTS).url(JettraServer.resolvePath("/message")));
        uiKitMenuMiPluginTestRolePlugin.add(WidgetLet.of("Charts").icon(Icon.CHART_PIE).url(JettraServer.resolvePath("/charts")));
        uiKitMenuMiPluginTestRolePlugin.add(WidgetLet.of("Timeline").icon(Icon.CALENDAR_ALT).url(JettraServer.resolvePath("/timeline")));
        uiKitMenuMiPluginTestRolePlugin.add(WidgetLet.of("Misc").icon(Icon.CUBE).url(JettraServer.resolvePath("/misc")));

        WidgetLet uiLayoutMenuMiPluginTestRolePlugin = WidgetLet.of("Layout & Grid").icon(Icon.WINDOW_MAXIMIZE);
        uiLayoutMenuMiPluginTestRolePlugin.add(WidgetLet.of("Card Demo").icon(Icon.WINDOW_MAXIMIZE).url(JettraServer.resolvePath("/card-demo")));
        uiLayoutMenuMiPluginTestRolePlugin.add(WidgetLet.of("Grid Layout").icon(Icon.BORDER_ALL).url(JettraServer.resolvePath("/grid-demo")));

        WidgetLet rootUiKitMenuMiPluginTestRolePlugin = WidgetLet.of("UI Kit").icon(Icon.LAYER_GROUP);
        rootUiKitMenuMiPluginTestRolePlugin.add(uiKitMenuMiPluginTestRolePlugin);
        rootUiKitMenuMiPluginTestRolePlugin.add(uiLayoutMenuMiPluginTestRolePlugin);

        // --- Left Sidebar (Ocean Style) ---

/**
End Plugin: MiPlugin
**/

```

## PageWidgetAll
role: ADMIN,MANAGER,USER

## ActionWidgetAllow
role: ADMIN,MANAGER
