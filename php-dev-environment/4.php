<?php

function isIsoceles($a,$b,$c)
{
    if($a<$b+$c && $b<$a+$c && $c<$a+$b)
    {
        if($a==$b || $b == $c || $a  == $c)
        {
            echo "Triangle with sides $a,$b and $c is an isoleces triangle\n";
        }
        else
        {
              echo "Triangle with sides $a,$b and $c is not an isoleces triangle\n";

        }
    }
    else echo "Not a valid triangle\n";
}

isIsoceles(1,2,2);
isIsoceles(1,3,2);


?>
