package example.ap;

import arc.Core;
import arc.*;
import arc.func.*;
import arc.graphics.g2d.*;
import arc.math.*;
import arc.math.geom.*;
import arc.struct.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.core.*;
import mindustry.entities.*;
import mindustry.game.EventType.*;
import mindustry.game.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.logic.*;
import mindustry.type.*;
import mindustry.ui.*;
import mindustry.world.*;
import mindustry.world.meta.*;
import mindustry.world.modules.*;
import mindustry.world.blocks.storage.CoreBlock;
import mindustry.world.meta.BlockStatus;
import mindustry.world.meta.Stat;
import mindustry.world.meta.StatUnit;

import static mindustry.Vars.*;

public class ICoreBlock extends CoreBlock{
	
	public ICoreBlock(String name){
		super(name);
		unitType = UnitTypes.gamma;
		unitCapModifier = 25;
	}
	
	@Override
    public boolean canBreak(Tile tile){
        //return Vars.state.teams.cores(tile.team()).size > 1;
        return true;
    }
    
    @Override
    public boolean canReplace(Block other){
		return other.alwaysReplace;
		//return true;
    }
    
    //@Override
    public boolean canPlaceOn(Tile tile, Team team, int rotation){
		return true;
    }
    
    @Override
    public void placeBegan(Tile tile, Block previous){ }
    
    @Override
    public void beforePlaceBegan(Tile tile, Block previous){ }
    
    @Override
    public void drawPlace(int x, int y, int rotation, boolean valid){ }
    
    public class ICoreBuild extends CoreBuild{
		
		@Override
        public void damage(float damage){ }
        
        //@Override
        public float handleDamage(Tile tile, float amount){
			return 0;
        }
    }
}