package io.puharesource.osrs.verto.api.entity.player;

import io.puharesource.osrs.verto.api.Location;
import io.puharesource.osrs.verto.api.entity.Entity;
import io.puharesource.osrs.verto.api.equipment.EquipmentSlot;
import io.puharesource.osrs.verto.api.item.Item;
import io.puharesource.osrs.verto.api.item.ItemAction;
import io.puharesource.osrs.verto.api.item.ItemType;
import io.puharesource.osrs.verto.api.magic.Spell;
import io.puharesource.osrs.verto.api.menu.MenuTab;
import io.puharesource.osrs.verto.api.menu.SettingsTab;
import io.puharesource.osrs.verto.api.prayer.Prayer;
import io.puharesource.osrs.verto.api.quest.Quest;
import io.puharesource.osrs.verto.api.skill.Skill;
import io.puharesource.osrs.verto.api.world.World;

public interface ThePlayer extends Player {
    /* ================= Menu related ================= */

    void openMenuTab(final MenuTab tab);
    void openSettingsTab(final SettingsTab tab);

    boolean isSkillGuideOpen();
    void closeSkillGuide();
    void openSkillGuide(final Skill skill);

    boolean isEquipmentStatsOpen();
    void closeEquipmentStats();

    /* ================= Skill related ================= */

    int getDynamicSkill(final Skill skill);
    int getExperience(final Skill skill);
    int getExperienceForLevel(int level);

    /* ================= Walking / Location related ================= */

    boolean canReach(final Location location);
    boolean isNearby(final Location location);
    void walk(final Location location);
    void walkRandomized(final Location location, int minRandom, int maxRandom);
    Location getLocation();

    /* ================= Settings related ================= */

    boolean isRunning();
    int getRunEnergy();
    void setRunning(final boolean run);

    boolean isAcceptAidEnabled();
    boolean isDataOrbsEnabled();

    void resetMouseZoom();
    int getBrightness();
    int getMouseButtons();

    /* ================= World related ================= */

    void hopToWorld(final World world);
    void hopToRandomP2PWorld();
    void hopToRandomF2PWorld();
    World getCurrentWorld();

    /* ================= Quest related ================= */

    int getQuestPoints();
    boolean isComplete(final Quest quest);

    /* ================= Prayer related ================= */

    boolean isPrayerActivated(final Prayer prayer);
    boolean isQuickPrayerActivated();
    void setPrayer(final boolean active);
    boolean hasLevelForPrayer(final Prayer prayer);
    void deactivateAllPrayers();

    /* ================= Magic related ================= */

    boolean canCastSpell(final Spell spell);
    boolean canCastSpell(final Spell spell, final boolean returnToTab);
    void castSpell(final Spell spell);
    void castSpellOnEntity(final Spell spell, final Entity entity);
    void deselectSpell();
    Spell getSelectedSpell();
    boolean isSpellSelected();
    void hoverSpell(final Spell spell);

    /* ================= Equipment related ================= */

    void tryEquipItem(final EquipmentSlot slot, final ItemType item);
    void tryEquipItem(final ItemType item);

    void equipItem(final EquipmentSlot slot, final Item item);
    void equipItem(final Item item);

    boolean isEquipped(final EquipmentSlot slot);
    boolean isEquipped(final ItemType item);

    void unequip(final EquipmentSlot slot);
    void unequip(final ItemType type);
    void unequip(final Item item);

    void interactItem(final EquipmentSlot slot, final ItemAction action);

    /* ================= Miscellaneous ================= */

    void logout();
}
