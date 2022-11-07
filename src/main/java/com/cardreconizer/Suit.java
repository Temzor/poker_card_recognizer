package com.cardreconizer;

public enum Suit {
    Hearts,
    Diamonds,
    Clubs,
    Spades;

    public String getValue() {
        return switch (this) {
            case Hearts -> "h";
            case Diamonds -> "d";
            case Clubs -> "c";
            case Spades -> "s";
        };
    }
}
