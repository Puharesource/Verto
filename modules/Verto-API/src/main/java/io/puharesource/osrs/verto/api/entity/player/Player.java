package io.puharesource.osrs.verto.api.entity.player;

import io.puharesource.osrs.verto.api.skill.Skill;

public interface Player {
    int getSkill(final Skill skill);
    int getCombatLevel();
}
