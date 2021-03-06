package witherwar.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import witherwar.TEinTE;
import witherwar.hermetics.ElementalFluid;
import witherwar.tilelogic.ConduitTile;
import witherwar.tilelogic.RitualBlockTile;

public class ConduitBlock extends Block{

	public ConduitBlock() {
		super( Material.ROCK);
		setUnlocalizedName("conduit");
		setRegistryName("conduit");
		setCreativeTab( TEinTE.teinteTab);
	}
	
	
	@Override
	public void onBlockAdded( World world ,BlockPos pos ,IBlockState state) {
		TEinTE.instance.registerTileLogic( new ConduitTile( pos));
	}



}
