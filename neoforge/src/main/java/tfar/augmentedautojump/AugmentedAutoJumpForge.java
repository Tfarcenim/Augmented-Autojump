package tfar.augmentedautojump;


import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.common.Mod;

@Mod(value = Constants.MOD_ID,dist = Dist.CLIENT)
public class AugmentedAutoJumpForge {

    public AugmentedAutoJumpForge() {

        // This method is invoked by the NeoForge mod loader when it is ready
        // to load your mod. You can access NeoForge and Common code in this
        // project.

        // Use NeoForge to bootstrap the Common mod.
        CommonClass.init();

    }
}