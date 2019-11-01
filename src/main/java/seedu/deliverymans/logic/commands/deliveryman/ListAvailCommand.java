package seedu.deliverymans.logic.commands.deliveryman;

import static java.util.Objects.requireNonNull;

import seedu.deliverymans.logic.Logic;
import seedu.deliverymans.logic.commands.Command;
import seedu.deliverymans.logic.commands.CommandResult;
import seedu.deliverymans.logic.commands.exceptions.CommandException;
import seedu.deliverymans.logic.parser.universal.Context;
import seedu.deliverymans.model.Model;

/**
 * Lists all the available deliverymen.
 */
public class ListAvailCommand extends Command {

    public static final String COMMAND_WORD = "lista";

    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": Lists all the deliverymen who are currently available on the right panel.\n"
            + "Example: " + COMMAND_WORD;

    public static final String MESSAGE_LIST_AVAIL_SUCCESS = "Listed all currently available deliverymen.\n";

    @Override
    public CommandResult execute(Model model, Logic logic) throws CommandException {
        requireNonNull(model);

        model.showAvailableDeliverymen();
        return new CommandResult(MESSAGE_LIST_AVAIL_SUCCESS, ListAvailCommand.class);
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof ListAvailCommand); // instanceof handles nulls
    }
}
