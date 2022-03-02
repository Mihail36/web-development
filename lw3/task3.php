<?php
$text=$_GET['password'];
$reliability=0;
$numbers=0;
$uppers=0;
$lowers=0;
$len=strlen($text);
$chars=str_split($text);
$repeaters=0;
foreach (count_chars($text) as $val) {
  if ($val > 1) {
    $repeaters+=$val;
  }
 
}
foreach ($chars as $char){
  if (is_numeric($char)){
    $numbers+=1;
  } else {
      if (ctype_upper($char)){
        $uppers+=1;
      } else {
          if (ctype_lower($char)){
	    $lowers+=1;
          }
      }
  }
}
if ($uppers <> 0) {
  $reliability+=($len-$uppers)*2;
}
if ($lowers <> 0) {
  $reliability+=($len-$lowers)*2;
}
if (is_numeric($text)){
  $reliability-=$len;
} else {
    if (ctype_alpha($text)){
      $reliability-=$len;
    }
}
$reliability+=4*$len + 4*$numbers-$repeaters;
echo 'Надёжность вашего пароля составляет: ', $reliability;

  
