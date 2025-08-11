<?php
// Area of Circle, Triangle, Square, Rectangle, Parallelogram ...
// The formulas for calculating the area of the specified shapes are:
// Circle: Area = π * radius² (π * r²)
// Rectangle: Area = length * width (l * w)
// Triangle: Area = 0.5 * base * height (0.5 * b * h)
// Square: Area = side * side (s²)
// Trapezoid: Area = 0.5 * (base1 + base2) * height (0.5 * (b1 + b2) * h)
// Parallelogram: Area = base * height (b * h)
?>


<?php
// 1) Circle
$pie = M_PI;
$r = 2;

$area = $pie * ($r * $r);

printf("<h1>Area of Circle: %.2f </h1>",$area);

// 2) Triangle
$base = 4;
$height = 3;

$area = 0.5 * $base * $height;

printf("<h1>Area of Triangle: %.2f </h1>",$area);

//Rectangle
$width = 5;
$height = 10;

$area = $width * $height;

printf("<h1>Area of Rectangle: %.2f </h1>", $area);

// Square

$side = 4;
$side = 4;

$area = $side * $side;

printf("<h1>Area of Square: %.2f <h1>",$area);

?>