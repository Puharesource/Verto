package io.puharesource.osrs.verto.api;

import io.puharesource.osrs.verto.api.entity.player.Player;

import java.util.Set;

public interface Script {
    Set<Player> getNearbyPlayers();

    Player getThePlayer();
}
