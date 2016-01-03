package io.puharesource.osrs.verto.api.world;

import lombok.Getter;

import static io.puharesource.osrs.verto.api.world.WorldActivity.*;
import static io.puharesource.osrs.verto.api.world.WorldLocation.*;

public enum World {
    WORLD_1(true, UNITED_STATES, TRADE),
    WORLD_2(false, UNITED_KINGDOM, TRADE),
    WORLD_3(false, GERMANY),
    WORLD_4(false, GERMANY, TROUBLE_BREWING),
    WORLD_5(false, UNITED_STATES, FALADOR_PARTY_ROOM),
    WORLD_6(false, UNITED_STATES, BARBARIAN_ASSAULT),
    WORLD_8(true, UNITED_KINGDOM, WILDERNESS_PK),
    WORLD_9(false, UNITED_KINGDOM),
    WORLD_10(false, UNITED_KINGDOM),
    WORLD_11(false, GERMANY),
    WORLD_12(false, GERMANY),
    WORLD_13(false, UNITED_STATES),
    WORLD_14(false, UNITED_STATES, DORGESH_KAAN_AGILITY),
    WORLD_16(true, UNITED_KINGDOM, WILDERNESS_PK),
    WORLD_17(false, UNITED_KINGDOM),
    WORLD_18(false, UNITED_KINGDOM, BOUNTY_WORLD),
    WORLD_19(false, GERMANY, DEADMAN),
    WORLD_20(false, GERMANY),
    WORLD_21(false, UNITED_STATES),
    WORLD_22(false, UNITED_STATES, DUEL_ARENA),
    WORLD_25(false, UNITED_KINGDOM, PVP_WORLD),
    WORLD_26(true, UNITED_KINGDOM),
    WORLD_27(false, GERMANY),
    WORLD_28(false, GERMANY),
    WORLD_29(false, UNITED_STATES, CLAN_WARS),
    WORLD_30(false, UNITED_STATES, HOUSE_PARTY_GILDED_ALTAR),
    WORLD_33(false, UNITED_KINGDOM, GAMES_ROOM_ROUGES_DEN),
    WORLD_34(false, UNITED_KINGDOM, CASTLE_WARS_1),
    WORLD_35(true, GERMANY),
    WORLD_36(false, GERMANY, RUNNING_NATURE_RUNES),
    WORLD_37(false, UNITED_STATES, PVP_WORLD_HIGH_RISK),
    WORLD_38(false, UNITED_STATES),
    WORLD_41(false, UNITED_KINGDOM, RUNNING_LAW_RUNE),
    WORLD_42(false, UNITED_KINGDOM, ROLE_PLAYING),
    WORLD_43(false, GERMANY),
    WORLD_44(false, GERMANY, PEST_CONTROL),
    WORLD_45(false, UNITED_STATES, DEADMAN),
    WORLD_46(false, UNITED_STATES, AGILITY_TRAINING),
    WORLD_49(false, UNITED_KINGDOM),
    WORLD_50(false, UNITED_KINGDOM, TZHAAR_FIGHT_PIT),
    WORLD_51(false, GERMANY),
    WORLD_52(false, GERMANY, DEADMAN),
    WORLD_53(false, UNITED_STATES, SKILL_TOTAL_1250),
    WORLD_54(false, UNITED_STATES, CASTLE_WARS_2),
    WORLD_57(false, UNITED_KINGDOM, DEADMAN),
    WORLD_58(false, UNITED_KINGDOM, BLAST_FURNACE),
    WORLD_59(false, GERMANY),
    WORLD_60(false, GERMANY, DEADMAN),
    WORLD_61(false, UNITED_STATES, SKILL_TOTAL_2000),
    WORLD_62(false, UNITED_STATES, PYRAMID_PLUNDER),
    WORLD_65(false, UNITED_KINGDOM, HIGH_RISK_WORLD),
    WORLD_66(false, UNITED_KINGDOM, SKILL_TOTAL_1500),
    WORLD_67(false, GERMANY),
    WORLD_68(false, GERMANY),
    WORLD_69(false, UNITED_STATES, WILDERNESS_PK),
    WORLD_70(false, UNITED_STATES, FISHING_TRAWLER),
    WORLD_73(false, UNITED_KINGDOM, SKILL_TOTAL_1750),
    WORLD_74(false, UNITED_KINGDOM, DEADMAN),
    WORLD_75(false, GERMANY, BARBARIAN_FISHING),
    WORLD_76(false, GERMANY),
    WORLD_77(false, UNITED_STATES, MORTON_TEMPLE_RAT_PITS),
    WORLD_78(false, UNITED_STATES),
    WORLD_81(true, UNITED_KINGDOM),
    WORLD_82(true, UNITED_KINGDOM),
    WORLD_83(true, GERMANY),
    WORLD_84(true, GERMANY),
    WORLD_85(true, UNITED_STATES),
    WORLD_86(false, UNITED_STATES),
    WORLD_93(true, UNITED_STATES, CLAN_WARS),
    WORLD_94(true, UNITED_STATES);

    private final @Getter boolean f2p;
    private final @Getter WorldLocation location;
    private final @Getter WorldActivity activity;

    World(final boolean f2p, final WorldLocation location, final WorldActivity activity) {
        this.f2p = f2p;
        this.location = location;
        this.activity = activity;
    }

    World(final boolean f2p, final WorldLocation location) {
        this(f2p, location, NONE);
    }
}
