/*
 * All rights by DomeDD (2018)
 * You are allowed to modify this code
 * You are allowed to use this code in your plugins for private projects
 * You are allowed to publish your plugin including this code as long as your plugin is for free and as long as you mention me (DomeDD)
 * You are NOT allowed to claim this plugin (BetterNick) as your own
 * You are NOT allowed to publish this plugin (BetterNick) or your modified version of this plugin (BetterNick)
 *
 */
package com.nametagedit.plugin.packets;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.bukkit.Bukkit;

public class VersionChecker {

    private static final BukkitVersion bukkitVersion;

    static {
        final String version = Bukkit.getVersion();
        if (version.contains("(MC: 1.8)") || version.contains("(MC: 1.8.1)") || version.contains("(MC: 1.8.2)"))
            bukkitVersion = BukkitVersion.v1_8_R1;
        else if (version.contains("(MC: 1.8.3)"))
            bukkitVersion = BukkitVersion.v1_8_R2;
        else if (version.contains("(MC: 1.8.4)") || version.contains("(MC: 1.8.5)") || version.contains("(MC: 1.8.6)") || version.contains("(MC: 1.8.7)") || version.contains("(MC: 1.8.8)") || version.contains("(MC: 1.8.9)"))
            bukkitVersion = BukkitVersion.v1_8_R3;
        else if (version.contains("(MC: 1.9)") || version.contains("(MC: 1.9.1)") || version.contains("(MC: 1.9.2)") || version.contains("(MC: 1.9.3)"))
            bukkitVersion = BukkitVersion.v1_9_R1;
        else if (version.contains("(MC: 1.9.4)"))
            bukkitVersion = BukkitVersion.v1_9_R2;
        else if (version.contains("(MC: 1.10)") || version.contains("(MC: 1.10.1)") || version.contains("(MC: 1.10.2)"))
            bukkitVersion = BukkitVersion.v1_10_R1;
        else if (version.contains("(MC: 1.11)") || version.contains("(MC: 1.11.1)") || version.contains("(MC: 1.11.2)"))
            bukkitVersion = BukkitVersion.v1_11_R1;
        else if (version.contains("(MC: 1.12)") || version.contains("(MC: 1.12.1)") || version.contains("(MC: 1.12.2)"))
            bukkitVersion = BukkitVersion.v1_12_R1;
        else if (version.contains("(MC: 1.13)"))
            bukkitVersion = BukkitVersion.v1_13_R1;
        else if (version.contains("(MC: 1.13.1)") || version.contains("(MC: 1.13.2)"))
            bukkitVersion = BukkitVersion.v1_13_R2;
        else if (version.contains("(MC: 1.14)") || version.contains("(MC: 1.14.1)") || version.contains("(MC: 1.14.2)") || version.contains("(MC: 1.14.3)"))
            bukkitVersion = BukkitVersion.v1_14_R1;
        else if (version.contains("(MC: 1.14.4)"))
            bukkitVersion = BukkitVersion.v1_14_R2;
        else if (version.contains("(MC: 1.15)") || version.contains("(MC: 1.15.1)") || version.contains("(MC: 1.15.2)"))
            bukkitVersion = BukkitVersion.v1_15_R1;
        else if (version.contains("(MC: 1.16.1)"))
            bukkitVersion = BukkitVersion.v1_16_R1;
        else if (version.contains("(MC: 1.16.2)") || version.contains("(MC: 1.16.3)"))
            bukkitVersion = BukkitVersion.v1_16_R2;
        else if (version.contains("(MC: 1.16.4)") || version.contains("(MC: 1.16.5)"))
            bukkitVersion = BukkitVersion.v1_16_R3;
        else if (version.contains("(MC: 1.17)") || version.contains("(MC: 1.17.1)"))
            bukkitVersion = BukkitVersion.v1_17_R1;
        else if (version.contains("(MC: 1.18)") || version.contains("(MC: 1.18.1)") || version.contains("(MC: 1.18.2)"))
            bukkitVersion = BukkitVersion.v1_18_R1;
        else if (version.contains("(MC: 1.19)") || version.contains("(MC: 1.19.1)") || version.contains("(MC: 1.19.2)"))
            bukkitVersion = BukkitVersion.v1_19_R1;
        else if (version.contains("(MC: 1.19.3)"))
            bukkitVersion = BukkitVersion.v1_19_R2;
        else if (version.contains("(MC: 1.19.4)"))
            bukkitVersion = BukkitVersion.v1_19_R3;
        else if (version.contains("(MC: 1.20)") || version.contains("(MC: 1.20.1)"))
            bukkitVersion = BukkitVersion.v1_20_R1;
        else if (version.contains("(MC: 1.20.2)"))
            bukkitVersion = BukkitVersion.v1_20_R2;
        else if (version.contains("(MC: 1.20.3)") || version.contains("(MC: 1.20.4)"))
            bukkitVersion = BukkitVersion.v1_20_R3;
        else if (version.contains("(MC: 1.20.5)"))
            bukkitVersion = BukkitVersion.v1_20_5;
        else if (version.contains("(MC: 1.20.6)"))
            bukkitVersion = BukkitVersion.v1_20_6;
        else if (version.contains("(MC: 1.21)"))
            bukkitVersion = BukkitVersion.v1_21;
        else if (version.contains("(MC: 1.21.1)"))
            bukkitVersion = BukkitVersion.v1_21_1;
        else if (version.contains("(MC: 1.21.2)"))
            bukkitVersion = BukkitVersion.v1_21_2;
        else if (version.contains("(MC: 1.21.3)"))
            bukkitVersion = BukkitVersion.v1_21_3;
        else if (version.contains("(MC: 1.21.4)"))
            bukkitVersion = BukkitVersion.v1_21_4;
        else
            bukkitVersion = null;
    }

    public static BukkitVersion getBukkitVersion() {
        return bukkitVersion;
    }

    public static boolean canHex() {
        return PacketAccessor.MINOR_VERSION >= 16;
    }

    @Getter
    @AllArgsConstructor
    public enum BukkitVersion {
        v1_8_R1, v1_8_R2, v1_8_R3, v1_9_R1, v1_9_R2, v1_10_R1, v1_11_R1, v1_12_R1, v1_13_R1, v1_13_R2, v1_14_R1, v1_14_R2, v1_15_R1, v1_16_R1, v1_16_R2, v1_16_R3, v1_17_R1, v1_18_R1, v1_19_R1, v1_19_R2, v1_19_R3, v1_20_R1, v1_20_R2, v1_20_R3,
        v1_20_5(PacketData.v1_20_5), v1_20_6(PacketData.v1_20_5),
        v1_21(PacketData.v1_21), v1_21_1(PacketData.v1_21), v1_21_2(PacketData.v1_21), v1_21_3(PacketData.v1_21), v1_21_4(PacketData.v1_21);

        private final PacketData packetData;

        BukkitVersion() {
            PacketData currentVersion = null;

            for (PacketData packetData : PacketData.values()) {
                if (PacketAccessor.SPIGOT_MAPPED_CRAFT_BUKKIT_VERSION.contains(packetData.name())) {
                    currentVersion = packetData;
                }
            }

            this.packetData = currentVersion;
        }
    }

}
