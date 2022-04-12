package testmod.content;

import arc.graphics.*;
import arc.math.*;
import arc.struct.*;
import mindustry.*;
import mindustry.ctype.*;
import mindustry.entities.*;
import mindustry.entities.bullet.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.blocks.*;
import mindustry.world.blocks.campaign.*;
import mindustry.world.blocks.defense.*;
import mindustry.world.blocks.defense.turrets.*;
import mindustry.world.blocks.distribution.*;
import mindustry.world.blocks.environment.*;
import mindustry.world.blocks.legacy.*;
import mindustry.world.blocks.liquid.*;
import mindustry.world.blocks.logic.*;
import mindustry.world.blocks.payloads.*;
import mindustry.world.blocks.power.*;
import mindustry.world.blocks.production.*;
import mindustry.world.blocks.sandbox.*;
import mindustry.world.blocks.storage.*;
import mindustry.world.blocks.units.*;
import mindustry.world.consumers.*;
import mindustry.world.draw.*;
import mindustry.world.meta.*;
import testmod.Testmod;
import testmod.ap.*;

import static mindustry.type.ItemStack.with;

public class Blocks implements ContentList{
    public static Block
		//Powers
		disposableBattery
		;
	
	@Override
    public void load(){
		disposableBattery = new DisposableBattery("disposable-battery"){{
			requirements(Category.power, BuildVisibility.shown, with(Items.titanium, 20, Items.lead, 40, Items.silicon, 20));
			size = 2;
			consumption = 8;
			consumes.powerBuffered(45000f);
		}};
    }
}