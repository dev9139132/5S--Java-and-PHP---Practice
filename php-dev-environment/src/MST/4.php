<?php

function isIsosceles($a, $b, $c)
{
    if ($a < $b + $c && $b < $a + $c && $c < $a + $b) {
        if ($a == $b || $b == $c || $a == $c) {
            echo "Triangle with sides $a, $b and $c is an isosceles triangle\n";
        } else {
            echo "Triangle with sides $a, $b and $c is not an isosceles triangle\n";
        }
    } else {
        echo "Not a valid triangle\n";
    }
}

isIsosceles(1, 2, 2);
isIsosceles(1, 3, 2);

?>
