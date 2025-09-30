<?php

// The function calculates the roots of the quadratic equation ax^2 + bx + c = 0
function roots($a, $b, $c)
{
    $d = ($b * $b) - 4 * $a * $c; // Discriminant calculation

    // Changed: Output formatting and minus sign usage for clarity and correctness
    if ($d >= 0) {
        // Real roots
        $root1 = ((-$b) - sqrt($d)) / (2 * $a);
        $root2 = ((-$b) + sqrt($d)) / (2 * $a);
        echo "Root 1: $root1, Root 2: $root2\n"; // Added newline for better readability
    } else {
        // Complex roots
        $real = (-$b) / (2 * $a);
        $imag = sqrt(-$d) / (2 * $a);

        // Changed: Removed special case for $imag == 1, always print value followed by 'i'
        // Changed: Used regular minus sign (-) for mathematical clarity
        echo "Root 1: $real - {$imag}i, Root 2: $real + {$imag}i\n"; // Added newline for readability
    }
}

// Example usage
roots(1, 4, 5);
roots(1, 5, 4);
?>
