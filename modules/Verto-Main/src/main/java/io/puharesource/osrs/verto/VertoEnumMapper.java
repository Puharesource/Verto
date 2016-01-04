package io.puharesource.osrs.verto;

import com.google.common.collect.Sets;
import io.puharesource.osrs.verto.api.magic.Spell;
import io.puharesource.osrs.verto.api.magic.SpellType;
import io.puharesource.osrs.verto.api.menu.MenuTab;
import io.puharesource.osrs.verto.api.menu.SettingsTab;
import io.puharesource.osrs.verto.api.prayer.Prayer;
import io.puharesource.osrs.verto.api.quest.Quest;
import io.puharesource.osrs.verto.api.skill.Skill;
import org.osbot.rs07.api.Quests;
import org.osbot.rs07.api.Settings;
import org.osbot.rs07.api.ui.PrayerButton;
import org.osbot.rs07.api.ui.Spells;
import org.osbot.rs07.api.ui.Tab;

import java.util.Collection;
import java.util.EnumMap;
import java.util.Map;
import java.util.stream.Collectors;

public final class VertoEnumMapper {
    private final static Map<MenuTab, Tab> MENU_TAB_MAP = new EnumMap<>(MenuTab.class);
    private final static Map<SettingsTab, Settings.SettingsTab> SETTINGS_TAB_MAP = new EnumMap<>(SettingsTab.class);
    private final static Map<Prayer, PrayerButton> PRAYER_MAP = new EnumMap<>(Prayer.class);
    private final static Map<Quest, Quests.Quest> QUEST_MAP = new EnumMap<>(Quest.class);
    private final static Map<Skill, org.osbot.rs07.api.ui.Skill> SKILL_MAP = new EnumMap<>(Skill.class);

    private final static Map<Spell, Spells.NormalSpells> NORMAL_SPELL_MAP = new EnumMap<>(Spell.class);
    private final static Map<Spell, Spells.AncientSpells> ANCIENT_SPELL_MAP = new EnumMap<>(Spell.class);
    private final static Map<Spell, Spells.LunarSpells> LUNAR_SPELL_MAP = new EnumMap<>(Spell.class);

    static {
        map(MENU_TAB_MAP, Tab.class, MenuTab.values());
        map(SETTINGS_TAB_MAP, Settings.SettingsTab.class, SettingsTab.values());
        map(PRAYER_MAP, PrayerButton.class, Prayer.values());
        map(QUEST_MAP, Quests.Quest.class, Quest.values());
        map(SKILL_MAP, org.osbot.rs07.api.ui.Skill.class, Skill.values());

        map(NORMAL_SPELL_MAP, Spells.NormalSpells.class,
                Sets.newHashSet(Spell.values()).stream()
                        .filter(spell -> spell.getType() == SpellType.NORMAL)
                        .collect(Collectors.toSet()));

        map(ANCIENT_SPELL_MAP, Spells.AncientSpells.class,
                Sets.newHashSet(Spell.values()).stream()
                        .filter(spell -> spell.getType() == SpellType.ANCIENT)
                        .collect(Collectors.toSet()));

        map(LUNAR_SPELL_MAP, Spells.LunarSpells.class,
                Sets.newHashSet(Spell.values()).stream()
                        .filter(spell -> spell.getType() == SpellType.LUNAR)
                        .collect(Collectors.toSet()));
    }

    public static <E extends Enum<E>> E valueOfEnum(final Class<E> clazz, final Enum<?> id) {
        try {
            return Enum.valueOf(clazz, id.name());
        } catch (IllegalArgumentException e) {
            return null;
        }
    }

    @SuppressWarnings("unchecked")
    private static void map(final Map map, final Class<? extends Enum<?>> osBotEnumClass, final Collection<Enum<?>> vertoEnums) {
        vertoEnums.forEach(e -> map.put(e, valueOfEnum(osBotEnumClass, e)));
    }

    @SuppressWarnings("unchecked")
    private static void map(final Map map, final Class<? extends Enum<?>> osBotEnumClass, final Enum<?>[] vertoEnums) {
        for (final Enum<?> e : vertoEnums) {
            map.put(e, valueOfEnum(osBotEnumClass, e));
        }
    }

    public static Tab getMenuTab(final MenuTab tab) {
        return MENU_TAB_MAP.get(tab);
    }

    public static Settings.SettingsTab getSettingsTab(final SettingsTab tab) {
        return SETTINGS_TAB_MAP.get(tab);
    }

    public static Spells.NormalSpells getNormalSpell(final Spell spell) {
        return NORMAL_SPELL_MAP.get(spell);
    }

    public static Spells.AncientSpells getAncientSpell(final Spell spell) {
        return ANCIENT_SPELL_MAP.get(spell);
    }

    public static Spells.LunarSpells getLunarSpell(final Spell spell) {
        return LUNAR_SPELL_MAP.get(spell);
    }

    public static PrayerButton getPrayer(final Prayer prayer) {
        return PRAYER_MAP.get(prayer);
    }

    public static Quests.Quest getQuest(final Quest quest) {
        return QUEST_MAP.get(quest);
    }

    public static org.osbot.rs07.api.ui.Skill getSkill(final Skill skill) {
        return SKILL_MAP.get(skill);
    }
}
