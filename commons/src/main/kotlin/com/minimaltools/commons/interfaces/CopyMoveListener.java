package com.minimaltools.commons.interfaces;

public interface CopyMoveListener {

    void copySucceeded(boolean copyOnly, boolean copiedAll, String destinationPath, boolean wasCopyingOneFileOnly);

    void copyFailed();
}
