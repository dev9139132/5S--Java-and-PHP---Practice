<?php


function roots($a,$b,$c)
{
    $d = ($b*$b) - 4*$a*$c;
   if($d>=0)
   {
       $root1 = ((-$b) - sqrt($d))/(2*$a);
       $root2 = ((-$b)+sqrt($d))/(2*$a);
       echo "Root 1: $root1, Root 2: $root2";
   }
   else
   {
       $real = (-$b)/(2*$a);
       $imag = sqrt(-$d)/(2*$a);
       
       $imag = $imag==1?"i":($imag."i");
       echo "Root 1: $real – $imag, Root 2: $real + $imag";
   }
}

roots(1,4,5);
echo "\n";
roots(1,5,4);
?>
