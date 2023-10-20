package com.slomaxonical.architectspalette.registry;

import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.client.particle.FlameParticle;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static com.slomaxonical.architectspalette.ArchitectsPalette.MOD_ID;

public class APParticles {
    public static final DefaultParticleType GREEN_FLAME = FabricParticleTypes.simple();
    public static final DefaultParticleType WIZARDLY_DEFENSE_BLAST = FabricParticleTypes.simple();

    public static void register(){
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(MOD_ID, "green_flame"), GREEN_FLAME);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(MOD_ID, "bounce"), WIZARDLY_DEFENSE_BLAST);
    }
    public static void clientReg() {
        ParticleFactoryRegistry.getInstance().register(APParticles.GREEN_FLAME, FlameParticle.Factory::new);
        //ParticleFactoryRegistry.getInstance().register(APParticles.WIZARDLY_DEFENSE_BLAST, WizardParticle.Factory::new);
    }
}
