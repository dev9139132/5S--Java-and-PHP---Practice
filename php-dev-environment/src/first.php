<?php
    // Check if the form fields are set
    if (isset($_POST['submitbtn'])){
        $a = $_POST['a'];
        $b = $_POST['b'];
        $sum = $a + $b;
        $sub = $a - $b;
        $mul = $a * $b;
        $div = $b != 0 ? $a / $b : 'Division by zero error';
        $exp = $a ** $b;

        echo "<h1>Results:</h1>";
        echo "<h2>Sum: $sum</h2>";
        echo "<h2>Subtraction: $sub</h2>";
        echo "<h2>Multiplication: $mul</h2>";
        echo "<h2>Division: $div</h2>";
        echo "<h2>Exponentiation: $exp</h2>";
    }
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>1st Instruction</title>
</head>
<body>
    <form method="POST">
        <label for="a">Enter 'a':</label>
        <input type="number" name="a" required>
        <label for="b">Enter 'b':</label>
        <input type="number" name="b" required>
        <input type="submit" name="submitbtn" value="value">
    </form>
</body>
</html>
    