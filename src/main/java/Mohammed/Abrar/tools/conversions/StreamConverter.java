package Mohammed.Abrar.tools.conversions;

import com.zipcodewilmington.streams.anthropoid.Person;
import com.zipcodewilmington.streams.anthropoid.PersonFactory;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by leon on 5/25/17.
 */
public final class StreamConverter extends PersonConversionAgent<Stream<Person>> {
    private final List<Person> personList;
    public StreamConverter(Stream<Person> people) {
        super(people);
        this.personList = super.objectSequence.collect(Collectors.toList());
    }

    public StreamConverter(int collectionSize) {
        this(PersonFactory.createPersonStream(collectionSize));
        /** Implementation of adapter pattern for testing purposes
         *  @param collectionSize  - count of Stream to be generated */
    }

    // TODO
    public List<Person> toList() {

        return personList.stream().collect(Collectors.toList());
    }

    // TODO
    public Stream<Person> toStream() {

        return toList().stream();
    }

    // TODO
    public Person[] toArray() {

        return toStream().toArray(Person[]::new);
    }
}
