package com.minimaltools.commons.views.bottomactionmenu;

public interface BottomActionMenuCallback {

    void onItemClicked(BottomActionMenuItem item);

    void onViewCreated(BottomActionMenuView view);

    void onViewDestroyed();
}
