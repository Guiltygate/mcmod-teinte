package witherwar.entity;

import javax.annotation.Nullable;

import net.minecraft.entity.EntityFlying;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraft.world.storage.loot.LootTableList;
import witherwar.faction2.Faction2;




public class FactionDroneEntity extends FactionEntityFlying{
	
//	private AIFactionHarvest harvestTask;
	
	public int innerRotation = 1;
	

	public FactionDroneEntity(World world ,Faction2 faction) {
		super(world ,faction);
        this.setSize(1.0F, 1.0F);
        this.isImmuneToFire = true;
        this.experienceValue = 5;
        this.enablePersistence();
        this.moveHelper = new MoveHelperBigFloat( this);
	}
	
	public FactionDroneEntity(World world) { //for FORGE only!
		this( world ,null);
	}
	
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(10.0D);
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(100.0D);
    }
    
    
    @Override
    protected void initEntityAI() {
//    	this.tasks.addTask( 7 ,new AIBigHeadLookIdle(this));
//        this.tasks.addTask(5, new AIRandomFly(this));
//        AIFactionHarvest harvestTask = new AIFactionHarvest( new BlockPos(0,0,0));
//        harvestTask.setEntity(this);
//        this.tasks.addTask( 1 ,harvestTask);
    }
    
    
//    public void setHarvestActive( boolean active) {
//    	this.harvestTask.setActive( active);
//    }
    
    
    

    
    
    public float getEyeHeight()
    {
        return 0.8F;
    }
    
    public SoundCategory getSoundCategory()
    {
        return SoundCategory.HOSTILE;
    }

    protected SoundEvent getAmbientSound()
    {
        return SoundEvents.ENTITY_GHAST_AMBIENT;
    }

    protected SoundEvent getHurtSound(DamageSource damageSourceIn)
    {
        return SoundEvents.ENTITY_GHAST_HURT;
    }

    protected SoundEvent getDeathSound()
    {
        return SoundEvents.ENTITY_GHAST_DEATH;
    }

    @Nullable
    protected ResourceLocation getLootTable()
    {
        return LootTableList.ENTITIES_GHAST;
    }
    
    
    protected float getSoundVolume()
    {
        return 10.0F;
    }

    /**
     * Checks if the entity's current position is a valid location to spawn this entity.
     */
    public boolean getCanSpawnHere()
    {
        return this.rand.nextInt(20) == 0 && super.getCanSpawnHere() && this.world.getDifficulty() != EnumDifficulty.PEACEFUL;
    }
	

}


