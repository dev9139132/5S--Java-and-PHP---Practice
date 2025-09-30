<?php
/*Area Calculation of Shapes

Write programs to find the area of:
Circle
Rectangle
Triangle
Square
Trapezoid
Parallelogram*/
function areaCircle($radius)
{
    return 3.14 * ($radius * $radius);
}

function areaRectangle($length, $width)
{
    return $length * $width;
}

function areaTriangle($base, $height)
{
    return ($base*$height)/2;
}

function areaSquare($side)
{
    return $side*$side;
}

function areaTrapezoid($base1, $base2, $height)
{
    return (($base1 + $base2)*$height)/2;
}

echo "Area of Circle with radius 2 is: ".areaCircle(2)."\n";

echo "Area of Rectangle with height 4 and width 3 is: ".areaRectangle(4,3)."\n";

echo "Area of Triangle is base 4 and height 3 is: ".areaTriangle(4,3)."\n";

echo "Area of Square with side 4 is: ".areaSquare(4)."\n";

echo "Area of Trapezoid with base1 4, base2 3, and height 3 is: ".areaTrapezoid(4,3,2)."\n";

function areaParallelogram($base,$height)
{
    return $base*$height;
}

echo "Area of Parallelogram with base 5 and height 3 is: ". areaParallelogram(5,3)."\n";

?>
