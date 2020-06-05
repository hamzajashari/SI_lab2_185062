import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    SILab2 siLab2 = new SILab2();

    private List<String> createList(String... elems){
        return new ArrayList<>(Arrays.asList(elems));
    }
    @Test
    void Everypath(){
        List<String> input= new ArrayList<>();
        input.add("1");input.add("2");input.add("0");
        List<String> output=new ArrayList<>();
        output.add("0");
        output.add("0");
        output.add("0");
        assertThrows(IllegalArgumentException.class,() -> siLab2.function((createList())));
        assertEquals(siLab2.function(input),output);
        output.clear();
        input.clear();
        input.add("0");
        input.add("#");
        output.add("1");
        output.add("#");
        assertEquals(siLab2.function(input),output);
        output.clear();
        input.clear();
        input.add("#");
        input.add("0");
        output.add("#");
        output.add("1");
        assertEquals(siLab2.function(input),output);
        output.clear();
        input.clear();
        input.add("#");
        input.add("0");
        input.add("#");
        input.add("0");
        output.add("#");
        output.add("2");
        output.add("#");
        output.add("1");
        assertEquals(siLab2.function(input),output);

    }
    @Test
    void Multiple(){
        List<String> input= new ArrayList<>();
        List<String> output=new ArrayList<>();
        output.clear();
        input.clear();
        input.add("#");
        input.add("0");
        input.add("#");
        input.add("0");
        output.add("#");
        output.add("2");
        output.add("#");
        output.add("1");
        // TT
        assertEquals(siLab2.function(input),output);
        output.clear();
        input.clear();
        input.add("0");
        input.add("0");
        input.add("0");
        input.add("0");
        output.add("0");
        output.add("0");
        output.add("0");
        output.add("0");
        //TF
        assertEquals(siLab2.function(input),output);
        output.clear();
        input.clear();
        input.add("0");
        output.add("0");
        //FX
        assertEquals(siLab2.function(input),output);
     //------------------------------------------------------------------------------
        output.clear();
        input.clear();
        input.add("0");
        input.add("#");
        input.add("0");
        input.add("#");
        output.add("1");
        output.add("#");
        output.add("2");
        output.add("#");
        // TT
        assertEquals(siLab2.function(input),output);
        output.clear();
        input.clear();
        input.add("0");
        input.add("0");
        input.add("0");
        input.add("0");
        output.add("0");
        output.add("0");
        output.add("0");
        output.add("0");
        //TF
        assertEquals(siLab2.function(input),output);
        output.clear();
        input.clear();
        input.add("0");
        output.add("0");
        //FX
        assertEquals(siLab2.function(input),output);
    }
}
