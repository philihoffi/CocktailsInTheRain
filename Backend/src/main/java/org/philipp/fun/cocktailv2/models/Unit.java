package org.philipp.fun.cocktailv2.models;

public enum Unit {

    MILLILITER("Milliliter"),
    TEASPOON("Teaspoon"),
    TABLESPOON("Tablespoon"),
    GRAM("Gram");

    private final String displayName;

    Unit(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
