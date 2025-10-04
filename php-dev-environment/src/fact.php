<?php

function factMax($n)
{
 $a =0;
 $b = 1;
 $list = [];
 while($a<$n)
 {
	
	 $list[] = $a;
	 $temp = $a;
	 $a = $b;
	 $b = $temp + $b;
 }
 echo "<b> Fibonacci series upto {$n}th term: </b>";
echo implode(', ', $list);
 echo "<br>";
}

function factRange($n)
{
 $a =0;
 $b = 1;
 $list = [];
 for($i=1;$i<=$n;$i++)
 {
	 $list[] = $a;
	 $temp = $a;
	 $a = $b;
	 $b = $temp + $b;
 }
 echo "<b> Fibonacci series of {$n} terms: </b>";
 echo implode(', ',$list);
}
factMax(20);
 echo "<br>";
factRange(10);
?>