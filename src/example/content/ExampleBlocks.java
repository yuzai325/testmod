package example.content;

import mindustry.content.Bullets;
import mindustry.content.Fx;
import mindustry.content.Items;
import mindustry.content.UnitTypes;
import mindustry.core.*;
import mindustry.ctype.ContentList;
import mindustry.gen.Sounds;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.type.UnitType;
import mindustry.entities.Units;
import mindustry.world.Block;
import mindustry.world.blocks.power.Battery;
import mindustry.world.blocks.defense.turrets.ItemTurret;
import mindustry.world.blocks.defense.turrets.Turret;
import mindustry.world.blocks.storage.CoreBlock;
import mindustry.world.meta.BuildVisibility;
import mindustry.world.Tile;
import mindustry.world.Tiles;
import mindustry.game.Team;
import mindustry.Vars;
import example.ap.*;

import static mindustry.Vars.*;
import static mindustry.type.ItemStack.with;

public class ExampleBlocks implements ContentList {
    public static Block turretPoop, disposableBattery, icore;

    @Override
    public void load() {
        turretPoop = new ItemTurret("poopturret"){{
            requirements(Category.turret, with(Items.copper, 900, Items.graphite, 300, Items.surgeAlloy, 250, Items.plastanium, 175, Items.thorium, 250));
            ammo(
                    Items.graphite, Bullets.standardDenseBig,
                    Items.pyratite, Bullets.standardIncendiaryBig,
                    Items.thorium, Bullets.standardThoriumBig
            );
            reloadTime = 7f;
            range = 260f;
            inaccuracy = 3f;
            recoilAmount = 3f;
            spread = 8f;
            shootShake = 2f;
            shots = 2;
            size = 4;
            shootCone = 24f;
            shootSound = Sounds.shootBig;

            health = 160 * size * size;

            limitRange();
        }};
        
        disposableBattery = new DisposableBattery("disposable-battery"){{
			requirements(Category.power, BuildVisibility.shown, with(Items.titanium, 20, Items.lead, 40, Items.silicon, 20));
			size = 2;
			consumption = 8;
			consumes.powerBuffered(45000f);
			alwaysUnlocked = true;
		}};
		
		icore = new ICoreBlock("icore"){{
			requirements(Category.effect, BuildVisibility.shown, with(Items.copper, 0));
			size = 6;
			itemCapacity = 30000;
			health = 1;
			alwaysUnlocked = true;
		}};
    }
}
