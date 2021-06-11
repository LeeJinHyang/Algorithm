package int배열;

import sun.awt.image.ImageWatched;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

        
    }
}
