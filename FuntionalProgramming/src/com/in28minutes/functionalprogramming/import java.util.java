import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
public class FunctionalProgrammingMagic {

    /**
     * This method filters out the odd numbers from a given list of integers.
     * @param numbers This is the list of integers from which odd numbers are to be filtered out.
     * @return List<Integer> This returns a list of odd integers.
     */
    public static List<Integer> filterOddNumbers(List<Integer> numbers) {
        
        return numbers.stream().filter( e-> if((e%2==1) ||( e%2 == -1)){return e;}}).collect(Collectors.toList());
        
    }
}