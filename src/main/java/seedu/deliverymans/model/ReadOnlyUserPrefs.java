package seedu.deliverymans.model;

import java.nio.file.Path;

import seedu.deliverymans.commons.core.GuiSettings;

/**
 * Unmodifiable view of user prefs.
 */
public interface ReadOnlyUserPrefs {

    GuiSettings getGuiSettings();

    Path getAddressBookFilePath();

    Path getCustomerDatabaseFilePath();

    Path getDeliverymenDatabaseFilePath();

    Path getRestaurantDatabaseFilePath();

    Path getOrderBookFilePath();

}
