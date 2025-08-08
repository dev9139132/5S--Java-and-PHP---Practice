<?php
$a = $_POST['a'];
$b = $_POST['b'];
$sum = $a + $b;
$sub = $a - $b;
$mul = $a * $b;
$div = $a / $b;
$exp = $a ** $b;

echo "<h1>Sum: $sum</h1>";
echo "<h1>Subtraction: $sub</h1>";
echo "<h1>Multiplication: $mul</h1>";
echo "<h1>Division: $div</h1>";
echo "<h1>Exponentiation: $exp</h1>";
?>