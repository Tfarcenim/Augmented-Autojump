package tfar.augmentedautojump.mixin;

import net.minecraft.client.player.LocalPlayer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import tfar.augmentedautojump.AugmentedAutojump;

@Mixin(LocalPlayer.class)
public abstract class ClientPlayerEntityMixin {
    @Shadow
    private int autoJumpTime;

    @Shadow
    protected abstract boolean canAutoJump();

    @Overwrite
    public void updateAutoJump(float dx, float dz) {
        if (canAutoJump()) autoJumpTime = AugmentedAutojump.autojumpPlayer((LocalPlayer)(Object)this, dx, dz) ? 1 : 0;
    }
}
