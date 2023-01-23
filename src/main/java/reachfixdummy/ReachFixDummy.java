package reachfixdummy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = ReachFixDummy.MODID, name = ReachFixDummy.NAME, version = ReachFixDummy.VERSION)
public class ReachFixDummy
{
    public static final String MODID = "reachfix";
    public static final String NAME = "Dummy Reachfix";
    public static final String VERSION = "1.0.1";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info("making cqrepoured and astral work together ;)");
    }
}
