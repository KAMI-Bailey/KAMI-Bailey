package me.zeroeightsix.kami.module.modules.movement;

import me.zeroeightsix.kami.module.Module;

@Module.Info(
  name = "Boatfly",
  description = "Boat go zooom",
  category = Module.Category.MOVEMENT
)

public class Boatfly extends Module{
	
	public void onUpdate(){
		
		if(mc.player.getRidingEntity() != null){
			if(mc.gameSettings.keyBindJump.isKeyDown()){
				mc.player.getRidingEntity.motionY = 0.1;
		
	}
	
}
