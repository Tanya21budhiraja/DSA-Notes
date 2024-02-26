package SlidingWindow;

public class Basics {
    // consider we have a array

    // { 1 , 2 , 3 , 4 , 5 , 6};
    // Q = you have been asked to find subarray of length 3 which matches you target

    // FIRST APPROACH
    // you will use 2 for loops
    // one from index i to length , another index j =0 to length
    // { 1 + 2 + 3}
    // { 2 + 3 + 4}
    // { 3 + 4 + 5}

    // now you can see in above example that you are repetating {2 + 3} in 2 line
    // similarty in 3
    // SO, to avoid that you can can use SLIDING WINDOW CONCEPT

    // { 1 + 2 + 3} to { 2 + 3 + 4}
    // { -1 + 2 + 3 + 4} just remove one and add the next element

    // So, mostly this concept is used in

    // SUBARRAY PROBLEMS
    // SUBSTRING PROBLREMS ----- AS THEY ARE CONTINOUS

    // ******* BECAUSE YOU CAN NOT BREAK A WINDOW ********** // IMP

    // IT HAS TWO TYPES
    // 1) fix size window
    // 2) variable size window

}
