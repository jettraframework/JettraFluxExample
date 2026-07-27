# Plugin Descriptor for MiPluginTest

## Restrictions & Menus
Menu definitions (WidgetLet) and layout restrictions should be defined here.

```java
        WidgetLet ecommMenuMiPluginTest = WidgetLet.of("E-Commerce").icon(Icon.HOME);
        ecommMenuMiPluginTest.add(WidgetLet.of("Dashboard").icon(Icon.CHART_LINE).url(JettraServer.resolvePath("/dashboard")));
        ecommMenuMiPluginTest.add(WidgetLet.of("Product Overview").icon(Icon.SEARCH).url(JettraServer.resolvePath("/product-overview")));
        ecommMenuMiPluginTest.add(WidgetLet.of("Product List").icon(Icon.LIST).url(JettraServer.resolvePath("/product-list")));
        ecommMenuMiPluginTest.add(WidgetLet.of("New Product").icon(Icon.PLUS).url(JettraServer.resolvePath("/new-product")));
        ecommMenuMiPluginTest.add(WidgetLet.of("Shopping Cart").icon(Icon.SHOPPING_CART).url(JettraServer.resolvePath("/shopping-cart")));
        ecommMenuMiPluginTest.add(WidgetLet.of("Checkout Form").icon(Icon.CHECK).url(JettraServer.resolvePath("/checkout-form")));
        ecommMenuMiPluginTest.add(WidgetLet.of("Order History").icon(Icon.HISTORY).url(JettraServer.resolvePath("/order-history")));
        ecommMenuMiPluginTest.add(WidgetLet.of("Order Summary").icon(Icon.RECEIPT).url(JettraServer.resolvePath("/order-summary")));
// Example
        WidgetLet exampleMenuMiPluginTest = WidgetLet.of("Example").icon(Icon.COG);
        exampleMenuMiPluginTest.add(WidgetLet.of("Person").icon(Icon.CHART_LINE).url(JettraServer.resolvePath("/person")));
        exampleMenuMiPluginTest.add(WidgetLet.of("Reglas").icon(Icon.RECEIPT).url(JettraServer.resolvePath("/reglas")));

        // Apps
        WidgetLet appsMenuMiPluginTest = WidgetLet.of("Apps").icon(Icon.TH_LARGE);
        appsMenuMiPluginTest.add(WidgetLet.of("Chat").icon(Icon.COMMENTS).url(JettraServer.resolvePath("/chat")));
        appsMenuMiPluginTest.add(WidgetLet.of("Mail Inbox").icon(Icon.ENVELOPE).url(JettraServer.resolvePath("/mail-inbox")));
        appsMenuMiPluginTest.add(WidgetLet.of("Task List").icon(Icon.CHECK).url(JettraServer.resolvePath("/tasklist")));
        appsMenuMiPluginTest.add(WidgetLet.of("Files").icon(Icon.FOLDER).url(JettraServer.resolvePath("/files")));
        appsMenuMiPluginTest.add(WidgetLet.of("File").icon(Icon.FILE).url(JettraServer.resolvePath("/file")));

        WidgetLet userManagementMenuMiPluginTest = WidgetLet.of("User Management").icon(Icon.USER);
        userManagementMenuMiPluginTest.add(WidgetLet.of("Profile List").icon(Icon.USERS).url(JettraServer.resolvePath("/profile-list")));
        userManagementMenuMiPluginTest.add(WidgetLet.of("Basic Information").icon(Icon.INFO_CIRCLE).url(JettraServer.resolvePath("/profile-basic-information")));

        WidgetLet uiKitMenuMiPluginTest = WidgetLet.of("UI Components").icon(Icon.LAYER_GROUP);
        uiKitMenuMiPluginTest.add(WidgetLet.of("Input").icon(Icon.EDIT).url(JettraServer.resolvePath("/input")));
        uiKitMenuMiPluginTest.add(WidgetLet.of("Forms").icon(Icon.ALIGN_JUSTIFY).url(JettraServer.resolvePath("/forms")));
        uiKitMenuMiPluginTest.add(WidgetLet.of("Icon").icon(Icon.ALIGN_JUSTIFY).url(JettraServer.resolvePath("/icon")));
        uiKitMenuMiPluginTest.add(WidgetLet.of("Button Demo").icon(Icon.MOUSE_POINTER).url(JettraServer.resolvePath("/button-demo")));
        uiKitMenuMiPluginTest.add(WidgetLet.of("Table").icon(Icon.CHART_BAR).url(JettraServer.resolvePath("/table")));
        uiKitMenuMiPluginTest.add(WidgetLet.of("DataView").icon(Icon.LIST).url(JettraServer.resolvePath("/dataview")));
        uiKitMenuMiPluginTest.add(WidgetLet.of("Tree").icon(Icon.SITEMAP).url(JettraServer.resolvePath("/tree")));
        uiKitMenuMiPluginTest.add(WidgetLet.of("Panel").icon(Icon.TH_LARGE).url(JettraServer.resolvePath("/panel")));
        uiKitMenuMiPluginTest.add(WidgetLet.of("Overlay").icon(Icon.CLONE).url(JettraServer.resolvePath("/overlay")));
        uiKitMenuMiPluginTest.add(WidgetLet.of("Media").icon(Icon.IMAGE).url(JettraServer.resolvePath("/media")));
        uiKitMenuMiPluginTest.add(WidgetLet.of("Menu").icon(Icon.BARS).url(JettraServer.resolvePath("/menu")));
        uiKitMenuMiPluginTest.add(WidgetLet.of("Message").icon(Icon.COMMENTS).url(JettraServer.resolvePath("/message")));
        uiKitMenuMiPluginTest.add(WidgetLet.of("Charts").icon(Icon.CHART_PIE).url(JettraServer.resolvePath("/charts")));
        uiKitMenuMiPluginTest.add(WidgetLet.of("Timeline").icon(Icon.CALENDAR_ALT).url(JettraServer.resolvePath("/timeline")));
        uiKitMenuMiPluginTest.add(WidgetLet.of("Misc").icon(Icon.CUBE).url(JettraServer.resolvePath("/misc")));

        WidgetLet uiLayoutMenuMiPluginTest = WidgetLet.of("Layout & Grid").icon(Icon.WINDOW_MAXIMIZE);
        uiLayoutMenuMiPluginTest.add(WidgetLet.of("Card Demo").icon(Icon.WINDOW_MAXIMIZE).url(JettraServer.resolvePath("/card-demo")));
        uiLayoutMenuMiPluginTest.add(WidgetLet.of("Grid Layout").icon(Icon.BORDER_ALL).url(JettraServer.resolvePath("/grid-demo")));

        WidgetLet rootUiKitMenuMiPluginTest = WidgetLet.of("UI Kit").icon(Icon.LAYER_GROUP);
        rootUiKitMenuMiPluginTest.add(uiKitMenuMiPluginTest);
        rootUiKitMenuMiPluginTest.add(uiLayoutMenuMiPluginTest);

        // --- Left Sidebar (Ocean Style) ---

/**
Start Plugin: MiPlugin
**/
        WidgetLet ecommMenuMiPluginMiPluginTest = WidgetLet.of("E-Commerce").icon(Icon.HOME);
        ecommMenuMiPluginMiPluginTest.add(WidgetLet.of("Dashboard").icon(Icon.CHART_LINE).url(JettraServer.resolvePath("/dashboard")));
        ecommMenuMiPluginMiPluginTest.add(WidgetLet.of("Product Overview").icon(Icon.SEARCH).url(JettraServer.resolvePath("/product-overview")));
        ecommMenuMiPluginMiPluginTest.add(WidgetLet.of("Product List").icon(Icon.LIST).url(JettraServer.resolvePath("/product-list")));
        ecommMenuMiPluginMiPluginTest.add(WidgetLet.of("New Product").icon(Icon.PLUS).url(JettraServer.resolvePath("/new-product")));
        ecommMenuMiPluginMiPluginTest.add(WidgetLet.of("Shopping Cart").icon(Icon.SHOPPING_CART).url(JettraServer.resolvePath("/shopping-cart")));
        ecommMenuMiPluginMiPluginTest.add(WidgetLet.of("Checkout Form").icon(Icon.CHECK).url(JettraServer.resolvePath("/checkout-form")));
        ecommMenuMiPluginMiPluginTest.add(WidgetLet.of("Order History").icon(Icon.HISTORY).url(JettraServer.resolvePath("/order-history")));
        ecommMenuMiPluginMiPluginTest.add(WidgetLet.of("Order Summary").icon(Icon.RECEIPT).url(JettraServer.resolvePath("/order-summary")));
// Example
        WidgetLet exampleMenuMiPluginMiPluginTest = WidgetLet.of("Example").icon(Icon.COG);
        exampleMenuMiPluginMiPluginTest.add(WidgetLet.of("Person").icon(Icon.CHART_LINE).url(JettraServer.resolvePath("/person")));
        exampleMenuMiPluginMiPluginTest.add(WidgetLet.of("Reglas").icon(Icon.RECEIPT).url(JettraServer.resolvePath("/reglas")));

        // Apps
        WidgetLet appsMenuMiPluginMiPluginTest = WidgetLet.of("Apps").icon(Icon.TH_LARGE);
        appsMenuMiPluginMiPluginTest.add(WidgetLet.of("Chat").icon(Icon.COMMENTS).url(JettraServer.resolvePath("/chat")));
        appsMenuMiPluginMiPluginTest.add(WidgetLet.of("Mail Inbox").icon(Icon.ENVELOPE).url(JettraServer.resolvePath("/mail-inbox")));
        appsMenuMiPluginMiPluginTest.add(WidgetLet.of("Task List").icon(Icon.CHECK).url(JettraServer.resolvePath("/tasklist")));
        appsMenuMiPluginMiPluginTest.add(WidgetLet.of("Files").icon(Icon.FOLDER).url(JettraServer.resolvePath("/files")));
        appsMenuMiPluginMiPluginTest.add(WidgetLet.of("File").icon(Icon.FILE).url(JettraServer.resolvePath("/file")));

        WidgetLet userManagementMenuMiPluginMiPluginTest = WidgetLet.of("User Management").icon(Icon.USER);
        userManagementMenuMiPluginMiPluginTest.add(WidgetLet.of("Profile List").icon(Icon.USERS).url(JettraServer.resolvePath("/profile-list")));
        userManagementMenuMiPluginMiPluginTest.add(WidgetLet.of("Basic Information").icon(Icon.INFO_CIRCLE).url(JettraServer.resolvePath("/profile-basic-information")));

        WidgetLet uiKitMenuMiPluginMiPluginTest = WidgetLet.of("UI Components").icon(Icon.LAYER_GROUP);
        uiKitMenuMiPluginMiPluginTest.add(WidgetLet.of("Input").icon(Icon.EDIT).url(JettraServer.resolvePath("/input")));
        uiKitMenuMiPluginMiPluginTest.add(WidgetLet.of("Forms").icon(Icon.ALIGN_JUSTIFY).url(JettraServer.resolvePath("/forms")));
        uiKitMenuMiPluginMiPluginTest.add(WidgetLet.of("Icon").icon(Icon.ALIGN_JUSTIFY).url(JettraServer.resolvePath("/icon")));
        uiKitMenuMiPluginMiPluginTest.add(WidgetLet.of("Button Demo").icon(Icon.MOUSE_POINTER).url(JettraServer.resolvePath("/button-demo")));
        uiKitMenuMiPluginMiPluginTest.add(WidgetLet.of("Table").icon(Icon.CHART_BAR).url(JettraServer.resolvePath("/table")));
        uiKitMenuMiPluginMiPluginTest.add(WidgetLet.of("DataView").icon(Icon.LIST).url(JettraServer.resolvePath("/dataview")));
        uiKitMenuMiPluginMiPluginTest.add(WidgetLet.of("Tree").icon(Icon.SITEMAP).url(JettraServer.resolvePath("/tree")));
        uiKitMenuMiPluginMiPluginTest.add(WidgetLet.of("Panel").icon(Icon.TH_LARGE).url(JettraServer.resolvePath("/panel")));
        uiKitMenuMiPluginMiPluginTest.add(WidgetLet.of("Overlay").icon(Icon.CLONE).url(JettraServer.resolvePath("/overlay")));
        uiKitMenuMiPluginMiPluginTest.add(WidgetLet.of("Media").icon(Icon.IMAGE).url(JettraServer.resolvePath("/media")));
        uiKitMenuMiPluginMiPluginTest.add(WidgetLet.of("Menu").icon(Icon.BARS).url(JettraServer.resolvePath("/menu")));
        uiKitMenuMiPluginMiPluginTest.add(WidgetLet.of("Message").icon(Icon.COMMENTS).url(JettraServer.resolvePath("/message")));
        uiKitMenuMiPluginMiPluginTest.add(WidgetLet.of("Charts").icon(Icon.CHART_PIE).url(JettraServer.resolvePath("/charts")));
        uiKitMenuMiPluginMiPluginTest.add(WidgetLet.of("Timeline").icon(Icon.CALENDAR_ALT).url(JettraServer.resolvePath("/timeline")));
        uiKitMenuMiPluginMiPluginTest.add(WidgetLet.of("Misc").icon(Icon.CUBE).url(JettraServer.resolvePath("/misc")));

        WidgetLet uiLayoutMenuMiPluginMiPluginTest = WidgetLet.of("Layout & Grid").icon(Icon.WINDOW_MAXIMIZE);
        uiLayoutMenuMiPluginMiPluginTest.add(WidgetLet.of("Card Demo").icon(Icon.WINDOW_MAXIMIZE).url(JettraServer.resolvePath("/card-demo")));
        uiLayoutMenuMiPluginMiPluginTest.add(WidgetLet.of("Grid Layout").icon(Icon.BORDER_ALL).url(JettraServer.resolvePath("/grid-demo")));

        WidgetLet rootUiKitMenuMiPluginMiPluginTest = WidgetLet.of("UI Kit").icon(Icon.LAYER_GROUP);
        rootUiKitMenuMiPluginMiPluginTest.add(uiKitMenuMiPluginMiPluginTest);
        rootUiKitMenuMiPluginMiPluginTest.add(uiLayoutMenuMiPluginMiPluginTest);

        // --- Left Sidebar (Ocean Style) ---

/**
End Plugin: MiPlugin
**/

```

## PageWidgetAll
role-plugin: ADMIN,   change-for:ADMIN
role-plugin: MANAGER,   change-for:MANAGER
role-plugin: USER,   change-for:USER

## ActionWidgetAllow
role-plugin: ADMIN,   change-for:ADMIN
role-plugin: MANAGER,   change-for:MANAGER
