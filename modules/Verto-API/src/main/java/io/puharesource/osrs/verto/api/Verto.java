package io.puharesource.osrs.verto.api;

import com.google.common.collect.ImmutableSet;
import io.puharesource.osrs.verto.api.entity.player.Player;

import java.util.Set;

/**
 * This is a Singleton representation of the API, which handles core features.
 */
public final class Verto {
    private static Verto verto;

    public static void init(final Script script) {
        if (verto != null) throw new IllegalArgumentException();

        verto = new Verto(script);
    }

    public static Verto get() {
        return verto;
    }

    /* ================= OOP Below ================= */

    private final Script script;

    private Verto(final Script script) {
        this.script = script;
    }

    public Set<Player> getNearbyPlayers() {
        return ImmutableSet.copyOf(script.getNearbyPlayers());
    }

    public Player getThePlayer() {
        return script.getThePlayer();
    }
}
