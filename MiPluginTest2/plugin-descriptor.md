# Plugin Descriptor for MiPluginTest2

## Restrictions & Menus
Menu definitions (WidgetLet) and layout restrictions should be defined here.

```java
        WidgetLet ecommMenuMiPluginTest2 = WidgetLet.of("E-Commerce").icon(Icon.HOME);
        ecommMenuMiPluginTest2.add(WidgetLet.of("Dashboard").icon(Icon.CHART_LINE).url(JettraServer.resolvePath("/dashboard")));
        ecommMenuMiPluginTest2.add(WidgetLet.of("Product Overview").icon(Icon.SEARCH).url(JettraServer.resolvePath("/product-overview")));
        ecommMenuMiPluginTest2.add(WidgetLet.of("Product List").icon(Icon.LIST).url(JettraServer.resolvePath("/product-list")));
        ecommMenuMiPluginTest2.add(WidgetLet.of("New Product").icon(Icon.PLUS).url(JettraServer.resolvePath("/new-product")));
        ecommMenuMiPluginTest2.add(WidgetLet.of("Shopping Cart").icon(Icon.SHOPPING_CART).url(JettraServer.resolvePath("/shopping-cart")));
        ecommMenuMiPluginTest2.add(WidgetLet.of("Checkout Form").icon(Icon.CHECK).url(JettraServer.resolvePath("/checkout-form")));
        ecommMenuMiPluginTest2.add(WidgetLet.of("Order History").icon(Icon.HISTORY).url(JettraServer.resolvePath("/order-history")));
        ecommMenuMiPluginTest2.add(WidgetLet.of("Order Summary").icon(Icon.RECEIPT).url(JettraServer.resolvePath("/order-summary")));
// Example
        WidgetLet exampleMenuMiPluginTest2 = WidgetLet.of("Example").icon(Icon.COG);
        exampleMenuMiPluginTest2.add(WidgetLet.of("Person").icon(Icon.CHART_LINE).url(JettraServer.resolvePath("/person")));
        exampleMenuMiPluginTest2.add(WidgetLet.of("Reglas").icon(Icon.RECEIPT).url(JettraServer.resolvePath("/reglas")));

        // Apps
        WidgetLet appsMenuMiPluginTest2 = WidgetLet.of("Apps").icon(Icon.TH_LARGE);
        appsMenuMiPluginTest2.add(WidgetLet.of("Chat").icon(Icon.COMMENTS).url(JettraServer.resolvePath("/chat")));
        appsMenuMiPluginTest2.add(WidgetLet.of("Mail Inbox").icon(Icon.ENVELOPE).url(JettraServer.resolvePath("/mail-inbox")));
        appsMenuMiPluginTest2.add(WidgetLet.of("Task List").icon(Icon.CHECK).url(JettraServer.resolvePath("/tasklist")));
        appsMenuMiPluginTest2.add(WidgetLet.of("Files").icon(Icon.FOLDER).url(JettraServer.resolvePath("/files")));
        appsMenuMiPluginTest2.add(WidgetLet.of("File").icon(Icon.FILE).url(JettraServer.resolvePath("/file")));

        WidgetLet userManagementMenuMiPluginTest2 = WidgetLet.of("User Management").icon(Icon.USER);
        userManagementMenuMiPluginTest2.add(WidgetLet.of("Profile List").icon(Icon.USERS).url(JettraServer.resolvePath("/profile-list")));
        userManagementMenuMiPluginTest2.add(WidgetLet.of("Basic Information").icon(Icon.INFO_CIRCLE).url(JettraServer.resolvePath("/profile-basic-information")));

        WidgetLet uiKitMenuMiPluginTest2 = WidgetLet.of("UI Components").icon(Icon.LAYER_GROUP);
        uiKitMenuMiPluginTest2.add(WidgetLet.of("Input").icon(Icon.EDIT).url(JettraServer.resolvePath("/input")));
        uiKitMenuMiPluginTest2.add(WidgetLet.of("Forms").icon(Icon.ALIGN_JUSTIFY).url(JettraServer.resolvePath("/forms")));
        uiKitMenuMiPluginTest2.add(WidgetLet.of("Icon").icon(Icon.ALIGN_JUSTIFY).url(JettraServer.resolvePath("/icon")));
        uiKitMenuMiPluginTest2.add(WidgetLet.of("Button Demo").icon(Icon.MOUSE_POINTER).url(JettraServer.resolvePath("/button-demo")));
        uiKitMenuMiPluginTest2.add(WidgetLet.of("Table").icon(Icon.CHART_BAR).url(JettraServer.resolvePath("/table")));
        uiKitMenuMiPluginTest2.add(WidgetLet.of("DataView").icon(Icon.LIST).url(JettraServer.resolvePath("/dataview")));
        uiKitMenuMiPluginTest2.add(WidgetLet.of("Tree").icon(Icon.SITEMAP).url(JettraServer.resolvePath("/tree")));
        uiKitMenuMiPluginTest2.add(WidgetLet.of("Panel").icon(Icon.TH_LARGE).url(JettraServer.resolvePath("/panel")));
        uiKitMenuMiPluginTest2.add(WidgetLet.of("Overlay").icon(Icon.CLONE).url(JettraServer.resolvePath("/overlay")));
        uiKitMenuMiPluginTest2.add(WidgetLet.of("Media").icon(Icon.IMAGE).url(JettraServer.resolvePath("/media")));
        uiKitMenuMiPluginTest2.add(WidgetLet.of("Menu").icon(Icon.BARS).url(JettraServer.resolvePath("/menu")));
        uiKitMenuMiPluginTest2.add(WidgetLet.of("Message").icon(Icon.COMMENTS).url(JettraServer.resolvePath("/message")));
        uiKitMenuMiPluginTest2.add(WidgetLet.of("Charts").icon(Icon.CHART_PIE).url(JettraServer.resolvePath("/charts")));
        uiKitMenuMiPluginTest2.add(WidgetLet.of("Timeline").icon(Icon.CALENDAR_ALT).url(JettraServer.resolvePath("/timeline")));
        uiKitMenuMiPluginTest2.add(WidgetLet.of("Misc").icon(Icon.CUBE).url(JettraServer.resolvePath("/misc")));

        WidgetLet uiLayoutMenuMiPluginTest2 = WidgetLet.of("Layout & Grid").icon(Icon.WINDOW_MAXIMIZE);
        uiLayoutMenuMiPluginTest2.add(WidgetLet.of("Card Demo").icon(Icon.WINDOW_MAXIMIZE).url(JettraServer.resolvePath("/card-demo")));
        uiLayoutMenuMiPluginTest2.add(WidgetLet.of("Grid Layout").icon(Icon.BORDER_ALL).url(JettraServer.resolvePath("/grid-demo")));

        WidgetLet rootUiKitMenuMiPluginTest2 = WidgetLet.of("UI Kit").icon(Icon.LAYER_GROUP);
        rootUiKitMenuMiPluginTest2.add(uiKitMenuMiPluginTest2);
        rootUiKitMenuMiPluginTest2.add(uiLayoutMenuMiPluginTest2);

        // --- Left Sidebar (Ocean Style) ---

/**
Start Plugin: MiPlugin
**/
        WidgetLet ecommMenuMiPluginMiPluginTest2 = WidgetLet.of("E-Commerce").icon(Icon.HOME);
        ecommMenuMiPluginMiPluginTest2.add(WidgetLet.of("Dashboard").icon(Icon.CHART_LINE).url(JettraServer.resolvePath("/dashboard")));
        ecommMenuMiPluginMiPluginTest2.add(WidgetLet.of("Product Overview").icon(Icon.SEARCH).url(JettraServer.resolvePath("/product-overview")));
        ecommMenuMiPluginMiPluginTest2.add(WidgetLet.of("Product List").icon(Icon.LIST).url(JettraServer.resolvePath("/product-list")));
        ecommMenuMiPluginMiPluginTest2.add(WidgetLet.of("New Product").icon(Icon.PLUS).url(JettraServer.resolvePath("/new-product")));
        ecommMenuMiPluginMiPluginTest2.add(WidgetLet.of("Shopping Cart").icon(Icon.SHOPPING_CART).url(JettraServer.resolvePath("/shopping-cart")));
        ecommMenuMiPluginMiPluginTest2.add(WidgetLet.of("Checkout Form").icon(Icon.CHECK).url(JettraServer.resolvePath("/checkout-form")));
        ecommMenuMiPluginMiPluginTest2.add(WidgetLet.of("Order History").icon(Icon.HISTORY).url(JettraServer.resolvePath("/order-history")));
        ecommMenuMiPluginMiPluginTest2.add(WidgetLet.of("Order Summary").icon(Icon.RECEIPT).url(JettraServer.resolvePath("/order-summary")));
// Example
        WidgetLet exampleMenuMiPluginMiPluginTest2 = WidgetLet.of("Example").icon(Icon.COG);
        exampleMenuMiPluginMiPluginTest2.add(WidgetLet.of("Person").icon(Icon.CHART_LINE).url(JettraServer.resolvePath("/person")));
        exampleMenuMiPluginMiPluginTest2.add(WidgetLet.of("Reglas").icon(Icon.RECEIPT).url(JettraServer.resolvePath("/reglas")));

        // Apps
        WidgetLet appsMenuMiPluginMiPluginTest2 = WidgetLet.of("Apps").icon(Icon.TH_LARGE);
        appsMenuMiPluginMiPluginTest2.add(WidgetLet.of("Chat").icon(Icon.COMMENTS).url(JettraServer.resolvePath("/chat")));
        appsMenuMiPluginMiPluginTest2.add(WidgetLet.of("Mail Inbox").icon(Icon.ENVELOPE).url(JettraServer.resolvePath("/mail-inbox")));
        appsMenuMiPluginMiPluginTest2.add(WidgetLet.of("Task List").icon(Icon.CHECK).url(JettraServer.resolvePath("/tasklist")));
        appsMenuMiPluginMiPluginTest2.add(WidgetLet.of("Files").icon(Icon.FOLDER).url(JettraServer.resolvePath("/files")));
        appsMenuMiPluginMiPluginTest2.add(WidgetLet.of("File").icon(Icon.FILE).url(JettraServer.resolvePath("/file")));

        WidgetLet userManagementMenuMiPluginMiPluginTest2 = WidgetLet.of("User Management").icon(Icon.USER);
        userManagementMenuMiPluginMiPluginTest2.add(WidgetLet.of("Profile List").icon(Icon.USERS).url(JettraServer.resolvePath("/profile-list")));
        userManagementMenuMiPluginMiPluginTest2.add(WidgetLet.of("Basic Information").icon(Icon.INFO_CIRCLE).url(JettraServer.resolvePath("/profile-basic-information")));

        WidgetLet uiKitMenuMiPluginMiPluginTest2 = WidgetLet.of("UI Components").icon(Icon.LAYER_GROUP);
        uiKitMenuMiPluginMiPluginTest2.add(WidgetLet.of("Input").icon(Icon.EDIT).url(JettraServer.resolvePath("/input")));
        uiKitMenuMiPluginMiPluginTest2.add(WidgetLet.of("Forms").icon(Icon.ALIGN_JUSTIFY).url(JettraServer.resolvePath("/forms")));
        uiKitMenuMiPluginMiPluginTest2.add(WidgetLet.of("Icon").icon(Icon.ALIGN_JUSTIFY).url(JettraServer.resolvePath("/icon")));
        uiKitMenuMiPluginMiPluginTest2.add(WidgetLet.of("Button Demo").icon(Icon.MOUSE_POINTER).url(JettraServer.resolvePath("/button-demo")));
        uiKitMenuMiPluginMiPluginTest2.add(WidgetLet.of("Table").icon(Icon.CHART_BAR).url(JettraServer.resolvePath("/table")));
        uiKitMenuMiPluginMiPluginTest2.add(WidgetLet.of("DataView").icon(Icon.LIST).url(JettraServer.resolvePath("/dataview")));
        uiKitMenuMiPluginMiPluginTest2.add(WidgetLet.of("Tree").icon(Icon.SITEMAP).url(JettraServer.resolvePath("/tree")));
        uiKitMenuMiPluginMiPluginTest2.add(WidgetLet.of("Panel").icon(Icon.TH_LARGE).url(JettraServer.resolvePath("/panel")));
        uiKitMenuMiPluginMiPluginTest2.add(WidgetLet.of("Overlay").icon(Icon.CLONE).url(JettraServer.resolvePath("/overlay")));
        uiKitMenuMiPluginMiPluginTest2.add(WidgetLet.of("Media").icon(Icon.IMAGE).url(JettraServer.resolvePath("/media")));
        uiKitMenuMiPluginMiPluginTest2.add(WidgetLet.of("Menu").icon(Icon.BARS).url(JettraServer.resolvePath("/menu")));
        uiKitMenuMiPluginMiPluginTest2.add(WidgetLet.of("Message").icon(Icon.COMMENTS).url(JettraServer.resolvePath("/message")));
        uiKitMenuMiPluginMiPluginTest2.add(WidgetLet.of("Charts").icon(Icon.CHART_PIE).url(JettraServer.resolvePath("/charts")));
        uiKitMenuMiPluginMiPluginTest2.add(WidgetLet.of("Timeline").icon(Icon.CALENDAR_ALT).url(JettraServer.resolvePath("/timeline")));
        uiKitMenuMiPluginMiPluginTest2.add(WidgetLet.of("Misc").icon(Icon.CUBE).url(JettraServer.resolvePath("/misc")));

        WidgetLet uiLayoutMenuMiPluginMiPluginTest2 = WidgetLet.of("Layout & Grid").icon(Icon.WINDOW_MAXIMIZE);
        uiLayoutMenuMiPluginMiPluginTest2.add(WidgetLet.of("Card Demo").icon(Icon.WINDOW_MAXIMIZE).url(JettraServer.resolvePath("/card-demo")));
        uiLayoutMenuMiPluginMiPluginTest2.add(WidgetLet.of("Grid Layout").icon(Icon.BORDER_ALL).url(JettraServer.resolvePath("/grid-demo")));

        WidgetLet rootUiKitMenuMiPluginMiPluginTest2 = WidgetLet.of("UI Kit").icon(Icon.LAYER_GROUP);
        rootUiKitMenuMiPluginMiPluginTest2.add(uiKitMenuMiPluginMiPluginTest2);
        rootUiKitMenuMiPluginMiPluginTest2.add(uiLayoutMenuMiPluginMiPluginTest2);

        // --- Left Sidebar (Ocean Style) ---

/**
End Plugin: MiPlugin
**/

```

## PageWidgetAll
role: ADMIN,MANAGER,USER

## ActionWidgetAllow
role: ADMIN,MANAGER
