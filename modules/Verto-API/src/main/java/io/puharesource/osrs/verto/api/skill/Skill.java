package io.puharesource.osrs.verto.api.skill;

import lombok.Getter;

public enum Skill {
    ATTACK(true),
    STRENGTH(true),
    DEFENCE(true),
    RANGED(true),
    PRAYER(true),
    MAGIC(true),
    RUNECRAFTING(true),
    HITPOINTS(true),
    CRAFTING(true),
    MINING(true),
    SMITHING(true),
    FISHING(true),
    COOKING(true),
    FIREMAKING(true),
    WOODCUTTING(true),

    AGILITY(false),
    HERBLORE(false),
    THIEVING(false),
    FLETCHING(false),
    SLAYER(false),
    FARMING(false),
    CONSTRUCTION(false),
    HUNTER(false);

    private final @Getter boolean f2p;

    Skill(final boolean f2p) {
        this.f2p = f2p;
    }
}
