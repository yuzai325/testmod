const core = extend(CoreBlock, "icore", {
    canBreak(tile) { return Vars.state.teams.cores(tile.team()).size > 1; },
    canReplace(other) { return other.alwaysReplace; },
    canPlaceOn(tile, team) { return true; },
    placeBegan(tile, previous) {},
    beforePlaceBegan(tile, previous) {},

    drawPlace(x, y, rotation, valid) {},
});
core.buildType = () => extend(CoreBlock.CoreBuild, core, {
	damage(damage) {  },
	handleDamage(tile, amount) { return 0; },
});
core.localizedName = "神秘核心";
//core.details = "";
//core.description = "";
core.unitType = UnitTypes.gamma;
core.size = 6;
core.health = 1;
core.unitCapModifier = 25;
core.itemCapacity = 200000;
//core.alwaysUnlocked = true;
core.category = Category.effect;
core.requirements = ItemStack.with(
    Items.copper, 0,
);
core.buildVisibility = BuildVisibility.shown;
exports.core = core;
