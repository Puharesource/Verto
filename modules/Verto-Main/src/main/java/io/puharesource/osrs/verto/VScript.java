package io.puharesource.osrs.verto;

import io.puharesource.osrs.verto.api.Script;
import io.puharesource.osrs.verto.api.entity.player.Player;

import java.util.Set;

public final class VScript implements Script {
    @Override
    public Set<Player> getNearbyPlayers() {
        return null;
    }

    @Override
    public Player getThePlayer() {
        return null;
    }
}
