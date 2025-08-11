<?php

    function roots($a, $b, $c)
    {
    
    if($a==0){
        echo "<h1>Value of 'a' is 0. Can't divide by 0</h1>";
        return;
    }    
    $d = ($b*$b)-(4*$a*$c);
    if($d>=0)
    {
        $root1 = (-$b-sqrt($d))/(2*$a);
        $root2 = (-$b+sqrt($d))/(2*$a);
        echo "<h1>Root 1: $root1, Root 2: $root2</h1>";
    }
    else
    {
        $real = -$b/(2*$a);
        $imag = (sqrt(-($d)))/(2*$a);
        echo "<h1>Root 1: $real - $imag</h1>";
        echo "<h1>Root 2: $real + $imag</h1>";
    }

   
}

 roots(1,4,5);
?>
