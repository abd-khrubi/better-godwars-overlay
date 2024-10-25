package com.BetterGodwarsOverlay;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import net.runelite.client.util.ImageUtil;

import java.awt.image.BufferedImage;


@Getter
@RequiredArgsConstructor
public enum BetterGodwarsOverlayGods {

	ARMADYL("Armadyl", BetterGodwarsOverlayVarbits.GWD_ARMADYL_KC,
			ImageUtil.loadImageResource(BetterGodwarsOverlayGods.class, "armadyl.png")),
	BANDOS("Bandos", BetterGodwarsOverlayVarbits.GWD_BANDOS_KC,
			ImageUtil.loadImageResource(BetterGodwarsOverlayGods.class, "bandos.png")),
	SARADOMIN("Saradomin", BetterGodwarsOverlayVarbits.GWD_SARADOMIN_KC,
			ImageUtil.loadImageResource(BetterGodwarsOverlayGods.class, "saradomin.png")),
	ZAMORAK("Zamorak", BetterGodwarsOverlayVarbits.GWD_ZAMORAK_KC,
			ImageUtil.loadImageResource(BetterGodwarsOverlayGods.class, "zamorak.png")),
	ZAROS("Ancient", BetterGodwarsOverlayVarbits.GWD_ZAROS_KC,
			ImageUtil.loadImageResource(BetterGodwarsOverlayGods.class, "zaros.png"));

	private final String name;

	private final BetterGodwarsOverlayVarbits killCountVarbit;

	private final BufferedImage icon;
}
