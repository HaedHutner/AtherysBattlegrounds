package com.atherys.battlegrounds.command;

import com.atherys.core.command.annotation.Aliases;
import com.atherys.core.command.annotation.Children;
import org.spongepowered.api.command.CommandException;
import org.spongepowered.api.command.CommandResult;
import org.spongepowered.api.command.CommandSource;
import org.spongepowered.api.command.args.CommandContext;
import org.spongepowered.api.command.spec.CommandExecutor;

@Aliases("team")
@Children({
        TeamJoinCommand.class,
        TeamLeaveCommand.class,
        TeamInfoCommand.class
})
public class TeamCommand implements CommandExecutor {
    @Override
    public CommandResult execute(CommandSource src, CommandContext args) throws CommandException {
        return CommandResult.empty();
    }
}
