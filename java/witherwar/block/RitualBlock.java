package witherwar.block;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import witherwar.TEinTE;
import witherwar.hermetics.ElementalFluid;
import witherwar.hermetics.ElementalFluidContainer;
import witherwar.tileentity.TileLogic;
import witherwar.tileentity.TileLogicContainer;
import witherwar.tileentity.RitualBlockTile;


public class RitualBlock extends DirectionalBlock{

	
	
	
	public RitualBlock() {
		super(Material.ROCK);
		setUnlocalizedName( "ritualblock");  // unlocalized name ties block to resources.lang file, I.e. "Serpentmind" or what have you
		setRegistryName( "ritualblock");		   //registry name ties block to the resources.blockstates json file. I.e. our blockstate json file is named after the registry name
		setCreativeTab( TEinTE.teinteTab);
	}

	
	
	
	@Override
	public void onBlockAdded( World world ,BlockPos pos ,IBlockState state) {
		TEinTE.instance.registerBlockEntity( new RitualBlockTile( pos ,world));
	}



}
