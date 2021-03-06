package me.zeroeightsix.kami.command.commands;

import me.zeroeightsix.kami.KamiMod;
import me.zeroeightsix.kami.command.Command;
import me.zeroeightsix.kami.command.syntax.ChunkBuilder;
import me.zeroeightsix.kami.module.modules.hidden.FixGui;

/**
 * @author S-B99
 */
public class FixGuiCommand extends Command {
    public FixGuiCommand() {
        super("fixgui", new ChunkBuilder().build());
        setDescription("Allows you to disable the automatic gui positioning");
    }

    @Override
    public void call(String[] args) {
        FixGui fixGui = (FixGui) KamiMod.MODULE_MANAGER.getModule(FixGui.class);
        if (fixGui.isEnabled()) {
            fixGui.disable();
            Command.sendChatMessage("[" + getLabel() + "] Disabled");
        }
        else {
            fixGui.enable();
            Command.sendChatMessage("[" + getLabel() + "] Enabled");
        }
    }
}
