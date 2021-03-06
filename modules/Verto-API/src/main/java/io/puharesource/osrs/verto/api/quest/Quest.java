package io.puharesource.osrs.verto.api.quest;

import lombok.Getter;

public enum Quest {
    LUNAR_DIPLOMACY(false),
    ANIMAL_MAGNETISM(false),
    TROLL_STRONGHOLD(false),
    JUNGLE_POTION(false),
    SHILO_VILLAGE(false),
    ROYAL_TROUBLE(false),
    CREATURE_OF_FENKENSTRAIN(false),
    EADGARS_RUSE(false),
    WANTED(false),
    FAMILY_CREST(false),
    THE_DIGSITE(false),
    HOLY_GRAIL(false),
    ENLIGHTENED_JOURNEY(false),
    GARDEN_OF_TRANQUILLITY(false),
    WITCHS_POTION(true),
    LEGENDS_QUEST(false),
    RUNE_MYSTERIES(true),
    DESERT_TREASURE(false),
    SHADOW_OF_THE_STORM(false),
    CABIN_FEVER(false),
    DEATH_TO_THE_DORGESHUUN(false),
    TEMPLE_OF_IKOV(false),
    THE_GIANT_DWARF(false),
    CONTACT(false),
    WATERFALL_QUEST(false),
    THE_SLUG_MENACE(false),
    ERNEST_THE_CHICKEN(true),
    MONKEY_MADNESS(false),
    ICTHLARINS_LITTLE_HELPER(false),
    PRINCE_ALI_RESCUE(true),
    GHOSTS_AHOY(false),
    WITCHS_HOUSE(false),
    COOKS_ASSISTANT(true),
    TRIBAL_TOTEM(false),
    MONKS_FRIEND(false),
    THE_RESTLESS_GHOST(true),
    TAI_BWO_WANNAI_TRIO(false),
    VAMPIRE_SLAYER(true),
    MOURNINGS_ENDS_PART_I(false),
    ROVING_ELVES(false),
    ROMEO_JULIET(true),
    MOURNINGS_ENDS_PART_II(false),
    SHADES_OF_MORTTON(false),
    BIOHAZARD(false),
    GERTRUDES_CAT(false),
    DRAGON_SLAYER(true),
    FIGHT_ARENA(false),
    THE_EYES_OF_GLOUPHRIE(false),
    DREAM_MENTOR(false),
    RECIPE_FOR_DISASTER(false),
    THE_HAND_IN_THE_SAND(false),
    WHAT_LIES_BELOW(false),
    SWAN_SONG(false),
    CLOCK_TOWER(false),
    OBSERVATORY_QUEST(false),
    THE_TOURIST_TRAP(false),
    PIRATES_TREASURE(true),
    MERLINS_CRYSTAL(false),
    MURDER_MYSTERY(false),
    FAIRYTALE_I_GROWING_PAINS(false),
    MOUNTAIN_DAUGHTER(false),
    RAT_CATCHERS(false),
    HAZEEL_CULT(false),
    THE_FREMENNIK_ISLES(false),
    BETWEEN_A_ROCK(false),
    HEROES_QUEST(false),
    DEVIOUS_MINDS(false),
    BIG_CHOMPY_BIRD_HUNTING(false),
    COLD_WAR(false),
    PLAGUE_CITY(false),
    THE_FREMENNIK_TRIALS(false),
    HORROR_FROM_THE_DEEP(false),
    IMP_CATCHER(true),
    DWARF_CANNON(false),
    ANOTHER_SLICE_OF_HAM(false),
    TEARS_OF_GUTHIX(false),
    RUM_DEAL(false),
    KINGS_RANSOM(false),
    DRUIDIC_RITUAL(false),
    LOST_CITY(false),
    SHEEP_SHEARER(true),
    TREE_GNOME_VILLAGE(false),
    REGICIDE(false),
    NATURE_SPIRIT(false),
    BLACK_KNIGHTS_FORTRESS(true),
    A_TAIL_OF_TWO_CATS(false),
    ELEMENTAL_WORKSHOP_II(false),
    SHEEP_HERDER(false),
    MAKING_HISTORY(false),
    GRIM_TALES(false),
    ONE_SMALL_FAVOUR(false),
    OLAFS_QUEST(false),
    EAGLES_PEAK(false),
    DORICS_QUEST(true),
    MY_ARMS_BIG_ADVENTURE(false),
    THE_GRAND_TREE(false),
    THE_FEUD(false),
    SPIRITS_OF_THE_ELID(false),
    GOBLIN_DIPLOMACY(true),
    SEA_SLUG(false),
    RAG_AND_BONE_MAN(false),
    FORGETTABLE_TALE(false),
    TROLL_ROMANCE(false),
    ENAKHRAS_LAMENT(false),
    ELEMENTAL_WORKSHOP_I(false),
    THRONE_OF_MISCELLANIA(false),
    TOWER_OF_LIFE(false),
    WATCHTOWER(false),
    DARKNESS_OF_HALLOWVALE(false),
    RECRUITMENT_DRIVE(false),
    SHIELD_OF_ARRAV(true),
    A_SOULS_BANE(false),
    THE_KNIGHTS_SWORD(true),
    PRIEST_IN_PERIL(false),
    THE_GREAT_BRAIN_ROBBERY(false),
    UNDERGROUND_PASS(false),
    SCORPION_CATCHER(false),
    HAUNTED_MINE(false),
    FAIRYTALE_II_CURE_A_QUEEN(false),
    DEMON_SLAYER(true),
    THE_LOST_TRIBE(false),
    IN_AID_OF_THE_MYREQUE(false),
    THE_GOLEM(false),
    FISHING_CONTEST(false),
    DEATH_PLATEAU(false),
    IN_SEARCH_OF_THE_MYREQUE(false),
    ZOGRE_FLESH_EATERS(false);

    private final @Getter boolean f2p;

    Quest(final boolean f2p) {
        this.f2p = f2p;
    }
}
