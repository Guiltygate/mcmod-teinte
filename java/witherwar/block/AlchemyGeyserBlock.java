package witherwar.block;


import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import witherwar.TEinTE;
import witherwar.hermetics.Element;
import witherwar.hermetics.ElementalFluid;
import witherwar.hermetics.ElementalFluidContainer;
import witherwar.tilelogic.AlchemyGeyserTile;
import witherwar.tilelogic.RitualBlockTile;
import witherwar.tilelogic.TileLogic;




public class AlchemyGeyserBlock extends Block{

	
	public AlchemyGeyserBlock() {
		super(Material.ROCK);
		setUnlocalizedName("geyser");
		setRegistryName("geyser");
		setCreativeTab( TEinTE.teinteTab);
	}


	@Override
	public void onBlockAdded( World world ,BlockPos pos ,IBlockState state) {
		TEinTE.instance.registerTileLogic( new AlchemyGeyserTile( pos));
	}


}
