package seedu.deliverymans.model.addressbook.util;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import seedu.deliverymans.model.addressbook.AddressBook;
import seedu.deliverymans.model.addressbook.ReadOnlyAddressBook;
import seedu.deliverymans.model.addressbook.person.Remark;
import seedu.deliverymans.model.addressbook.person.Email;
import seedu.deliverymans.model.addressbook.person.Name;
import seedu.deliverymans.model.addressbook.person.Person;
import seedu.deliverymans.model.addressbook.person.Phone;
import seedu.deliverymans.model.addressbook.tag.Tag;

/**
 * Contains utility methods for populating {@code AddressBook} with sample data.
 */
public class SampleDataUtil {
    public static final Remark EMPTY_REMARK = new Remark("");

    public static Person[] getSamplePersons() {
        return new Person[]{
                new Person(new Name("Alex Yeoh"), new Phone("87438807"), new Email("alexyeoh@example.com"),
                        EMPTY_REMARK, getTagSet("friends")),
                new Person(new Name("Bernice Yu"), new Phone("99272758"), new Email("berniceyu@example.com"),
                        EMPTY_REMARK, getTagSet("colleagues", "friends")),
                new Person(new Name("Charlotte Oliveiro"), new Phone("93210283"), new Email("charlotte@example.com"),
                        EMPTY_REMARK, getTagSet("neighbours")),
                new Person(new Name("David Li"), new Phone("91031282"), new Email("lidavid@example.com"),
                        EMPTY_REMARK, getTagSet("family")),
                new Person(new Name("Irfan Ibrahim"), new Phone("92492021"), new Email("irfan@example.com"),
                        EMPTY_REMARK, getTagSet("classmates")),
                new Person(new Name("Roy Balakrishnan"), new Phone("92624417"), new Email("royb@example.com"),
                        EMPTY_REMARK, getTagSet("colleagues"))
        };
    }

    public static ReadOnlyAddressBook getSampleAddressBook() {
        AddressBook sampleAb = new AddressBook();
        for (Person samplePerson : getSamplePersons()) {
            sampleAb.addPerson(samplePerson);
        }
        return sampleAb;
    }

    /**
     * Returns a tag set containing the list of strings given.
     */
    public static Set<Tag> getTagSet(String... strings) {
        return Arrays.stream(strings)
                .map(Tag::new)
                .collect(Collectors.toSet());
    }
}