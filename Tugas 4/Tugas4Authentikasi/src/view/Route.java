package view;

import view.page.Page;

import java.util.Map;

public class Route {
    private Map <String, Page> route;
    public Route() {
        this.route = new java.util.HashMap<>();
    }

    public Page getPage(String pageName) {
        return route.get(pageName);
    }

    public void addPage(String pageName, Page page) {
        route.put(pageName, page);
    }
}
