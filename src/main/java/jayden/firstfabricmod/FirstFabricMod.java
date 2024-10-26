package jayden.firstfabricmod;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FirstFabricMod implements ModInitializer {
	public static final String MOD_ID = "first-fabric-mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world! and I hate monkeys");
	}
}