package elucent.simplytea;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public interface IModeledObject {
	@SideOnly(Side.CLIENT)
	public void initModel();
}