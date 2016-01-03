package io.puharesource.osrs.verto.api.prayer;

import lombok.Getter;

public enum Prayer {
    THICK_SKIN(1),
    BURST_OF_STRENGTH(4),
    CLARITY_OF_THOUGHT(7),
    SHARP_EYE(8),
    MYSTIC_WILL(9),
    ROCK_SKIN(10),
    SUPERHUMAN_STRENGTH(13),
    IMPROVED_REFLEXES(16),
    RAPID_RESTORE(19),
    RAPID_HEAL(22),
    PROTECT_ITEM(25),
    HAWK_EYE(26),
    MYSTIC_LORE(27),
    STEEL_SKIN(28),
    ULTIMATE_STRENGTH(31),
    INCREDIBLE_REFLEXES(34),
    PROTECT_FROM_MAGIC(37),
    PROTECT_FROM_MISSILES(40),
    PROTECT_FROM_MELEE(43),
    EAGLE_EYE(44),
    MYSTIC_MIGHT(45),
    RETRIBUTION(46),
    REDEMPTION(49),
    SMITE(52),
    CHIVALRY(60),
    PIETY(70);

    private final @Getter int requiredLevel;

    Prayer(final int requiredLevel) {
        this.requiredLevel = requiredLevel;
    }
}
