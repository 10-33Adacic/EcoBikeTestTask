package com.msadovskiy.shell;

public enum PromptColor {
    BLACK(0),
    RED(1),
    GREEN(2),
    YELLOW(3),
    CIAN(4);

    private final int value;

    PromptColor(int value) {
        this.value = value;
    }

    public int toJlineAttributedStyle() {
        return this.value;
    }
}
