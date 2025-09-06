<?php
// Print the multiplication table of a number input by the user.
$n = 5;
echo "<ul>";
for($i = 1;$i<=10;$i++)
{   $mul = $n*$i;
    echo "<li>$n x $i = $mul</li><br>";
}
echo "</ul>";
?>